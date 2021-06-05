# Introduction to Multithreading in Java

- Multithreading is a concept of running multiple threads simultaneously.

- A program can be divided into a number of small processes. Each small process can be addressed as a single thread (a lightweight process).

- Multithreaded programs contain two or more threads that can run concurrently and each thread defines a separate path of execution.

- An instance of Thread class is just an object, like any other object in java.

- But a thread of execution means an individual "lightweight" process that has its own call stack. In java each thread has its own call stack.

> ### Why Multithreading ?

- Thread has many advantages over the process to perform multitasking.

- Process is heavy weight, takes more memory and occupy CPU for longer time that may lead to performance issue with the system.

- To overcome these issue process is broken into small unit of independent sub-process.

- These sub-process are called threads that can perform independent task efficiently.

> ### How to Create Thread ?

- Java provides a class Thread and an interface Runnable both are located into java.lang package.

- We can create thread either by extending Thread class or implementing Runnable interface. Both includes a run method that must be override to provide thread implementation.

> ### The main thread

- When we run any java program, the program begins to execute its code starting from the main method.

- Therefore, the JVM creates a thread to start executing the code present in main method.

- This thread is called as main thread. Although the main thread is automatically created, you can control it by obtaining a reference to it by calling currentThread() method.

- It is the thread from which other threads will be produced.

- It must be always the last thread to finish execution.

> ### Life cycle of a Thread

- **_New:_**

  - A thread begins its life cycle in the new state.
  - It remains in this state until the start() method is called on it.

- **_Runnable:_**

  - After invocation of start() method on new thread, the thread becomes runnable.

- **_Running:_**

  - A thread is in running state if the thread scheduler has selected it.

- **_Waiting:_**

  - A thread is in waiting state if it waits for another thread to perform a task. In this stage the thread is still alive.

- **_Terminated:_**
  - A thread enter the terminated state when it complete its task.

> ### Daemon Thread

- Daemon threads is a low priority thread that provide supports to user threads.

- These threads can be user defined and system defined as well.

- Garbage collection thread is one of the system generated daemon thread that runs in background.

- Daemon thread does allow JVM from existing until all the threads finish their execution.

- When a JVM founds daemon threads it terminates the thread and then shutdown itself, it does not care Daemon thread whether it is running or not.

> ### Thread Pool

- In Java, is used for reusing the threads which were created previously for executing the current task.

- It also provides the solution if any problem occurs in the thread cycle or in resource thrashing.

- In Java Thread pool a group of threads are created, one thread is selected and assigned job and after completion of job, it is sent back in the group.

> ### Thread Priorities

- In Java, when we create a thread, always a priority is assigned to it. In a Multithreading environment, the processor assigns a priority to a thread scheduler.

- The priority is given by the JVM or by the programmer itself explicitly. The range of the priority is between 1 to 10 and there are three variables which are static to define priority in a Thread Class.

- Thread priorities cannot guarantee that a higher priority thread will always be executed first than the lower priority thread. The selection of the threads for execution depends upon the thread scheduler which is platform dependent.
