# ThreadPool in Java

- A server that creates a new thread for every request would spend more time and consume more system resources in creating and destroying threads than processing actual requests.

- Since active threads consume system resources, a JVM creating too many threads at the same time can cause the system to run out of memory. This necessitates the need to limit the number of threads being created.

> ### What is ThreadPool in Java?

- A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing.

- Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

- Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.

- In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, thread is contained in the thread pool again.

> ### Executors, Executor and ExecutorService

- The Executors helper class contains several methods for the creation of pre-configured thread pool instances for us.

- The Executor and ExecutorService interfaces are used to work with different thread pool implementations in Java.

- The Executor interface has a single execute method to submit Runnable instances for execution.

```java
Executor executor = Executors.newSingleThreadExecutor();
executor.execute(() -> System.out.println("Hello World"));
```

- The ExecutorService interface contains a large number of methods for controlling the progress of the tasks and managing the termination of the service.

```java
ExecutorService executorService = Executors.newFixedThreadPool(10);
Future<String> future = executorService.submit(() -> "Hello World");
// some operations
String result = future.get();
```

- The submit method is overloaded to take either Runnable or Callable both of which are functional interfaces and can be passed as lambdas (starting with Java 8).

- Runnable‘s single method does not throw an exception and does not return a value. The Callable interface may be more convenient, as it allows us to throw an exception and return a value.

> ### ThreadPoolExecutor

- The ThreadPoolExecutor is an extensible thread pool implementation with lots of parameters and hooks for fine-tuning.

- The pool consists of a fixed number of core threads that are kept inside all the time, and some excessive threads that may be spawned and then terminated when they are not needed anymore.

- The corePoolSize parameter is the number of core threads that will be instantiated and kept in the pool. When a new task comes in, if all core threads are busy and the internal queue is full, then the pool is allowed to grow up to maximumPoolSize.

- The keepAliveTime parameter is the interval of time for which the excessive threads (instantiated in excess of the corePoolSize) are allowed to exist in the idle state. By default, the ThreadPoolExecutor only considers non-core threads for removal. In order to apply the same removal policy to core threads, we can use the allowCoreThreadTimeOut(true) method.

- newFixedThreadPool method creates a ThreadPoolExecutor with equal corePoolSize and maximumPoolSize parameter values and a zero keepAliveTime. This means that the number of threads in this thread pool is always the same:

- Another pre-configured ThreadPoolExecutor can be created with the Executors.newCachedThreadPool() method. This method does not receive a number of threads at all. The corePoolSize is actually set to 0, and the maximumPoolSize is set to Integer.MAX_VALUE for this instance. The keepAliveTime is 60 seconds for this one.

- These parameter values mean that the cached thread pool may grow without bounds to accommodate any number of submitted tasks. But when the threads are not needed anymore, they will be disposed of after 60 seconds of inactivity. A typical use case is when you have a lot of short-living tasks in your application.

> ### ScheduledThreadPoolExecutor

- The ScheduledThreadPoolExecutor extends the ThreadPoolExecutor class and also implements the ScheduledExecutorService interface with several additional methods

- schedule method allows to execute a task once after a specified delay.

- scheduleAtFixedRate method allows to execute a task after a specified initial delay and then execute it repeatedly with a certain period; the period argument is the time measured between the starting times of the tasks, so the execution rate is fixed;

- scheduleWithFixedDelay method is similar to scheduleAtFixedRate in that it repeatedly executes the given task, but the specified delay is measured between the end of the previous task and the start of the next; the execution rate may vary depending on the time it takes to execute any given task.

- The Executors.newScheduledThreadPool() method is typically used to create a ScheduledThreadPoolExecutor with a given corePoolSize, unbounded maximumPoolSize and zero keepAliveTime.

```java
ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
executor.schedule(() -> {
    System.out.println("Hello World");
}, 500, TimeUnit.MILLISECONDS);
```

- The following code shows how to execute a task after 500 milliseconds delay and then repeat it every 100 milliseconds. After scheduling the task, we wait until it fires three times using the CountDownLatch lock, then cancel it using the Future.cancel() method.

```java
CountDownLatch lock = new CountDownLatch(3);

ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
    System.out.println("Hello World");
    lock.countDown();
}, 500, 100, TimeUnit.MILLISECONDS);

lock.await(1000, TimeUnit.MILLISECONDS);
future.cancel(true);
```

> ### ForkJoinPool

- ForkJoinPool is the central part of the fork/join framework introduced in Java 7.

- It solves a common problem of spawning multiple tasks in recursive algorithms. Using a simple ThreadPoolExecutor, we will run out of threads quickly, as every task or subtask requires its own thread to run.

- In a fork/join framework, any task can spawn (fork) a number of subtasks and wait for their completion using the join method.

- The benefit of the fork/join framework is that it does not create a new thread for each task or subtask, implementing the Work Stealing algorithm instead

> ### Direct Executor and Direct Executor Service

- Sometimes we want to execute the task either in the current thread or in a thread pool, depending on some conditions.

- You would prefer to use a single Executor interface and just switch the implementation. Although it is not so hard to come up with an implementation of Executor or ExecutorService that executes the tasks in the current thread, it still requires writing some boilerplate code.

- Guava provides predefined instances for us.

- demonstrates the execution of a task in the same thread. Although the provided task sleeps for 500 milliseconds, it blocks the current thread, and the result is available immediately after the execute call is finished:

```java
Executor executor = MoreExecutors.directExecutor();

AtomicBoolean executed = new AtomicBoolean();

executor.execute(() -> {
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    executed.set(true);
});

assertTrue(executed.get());
```

- The instance returned by the directExecutor() method is actually a static singleton, so using this method does not provide any overhead on object creation at all.

> ### Exiting Executor Services

- Another common problem is shutting down the virtual machine while a thread pool is still running its tasks.

- Even with a cancellation mechanism in place, there is no guarantee that the tasks will behave nicely and stop their work when the executor service shuts down. This may cause JVM to hang indefinitely while the tasks keep doing their work.

- To solve this problem, Guava introduces a family of exiting executor services. They are based on daemon threads that terminate together with the JVM.

- These services also add a shutdown hook with the Runtime.getRuntime().addShutdownHook() method and prevent the VM from terminating for a configured amount of time before giving up on hung tasks.

> ### Risks in using Thread Pools

- Deadlock
- Thread Leakage
- Resource Thrashing
