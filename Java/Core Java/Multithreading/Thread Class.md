# Java Thread Class

- Thread class, along with its companion interface Runnable will be used to create and run threads for utilizing Multithreading feature of Java.

> ### Signature of Thread class

```java
public class Thread extends Object implements Runnable
```

> ### Thread Class Priority Constants

| Field         | Description                                             |
| ------------- | ------------------------------------------------------- |
| MAX_PRIORITY  | Represents the maximum priority that a thread can have. |
| MIN_PRIORITY  | Represents the minimum priority that a thread can have. |
| NORM_PRIORITY | Represents the default priority that a thread can have. |

> ### Constructors of Thread class

1. **_Thread()_**
1. **_Thread(String str)_**
1. **_Thread(Runnable r)_**
1. **_Thread(Runnable r, String str)_**
1. **_Thread(ThreadGroup group, Runnable target)_**
1. **_Thread(ThreadGroup group, Runnable target, String name)_**
1. **_Thread(ThreadGroup group, Runnable target, String name, long stackSize)_**
1. **_Thread(ThreadGroup group, String name)_**

> ### Thread Class Methods
>
> | Method                       | Description                                                                                                 |
> | ---------------------------- | ----------------------------------------------------------------------------------------------------------- |
> | setName()                    | give thread a name                                                                                          |
> | getName()                    | return thread's name                                                                                        |
> | getPriority()                | return thread's priority                                                                                    |
> | isAlive()                    | checks if thread is still running or not                                                                    |
> | join()                       | Wait for a thread to end                                                                                    |
> | run()                        | Entry point for a thread                                                                                    |
> | sleep()                      | suspend thread for a specified time                                                                         |
> | start()                      | start a thread by calling run() method                                                                      |
> | activeCount()                | Returns an estimate of the number of active threads in the current thread's thread group and its subgroups. |
> | checkAccess()                | Determines if the currently running thread has permission to modify this thread.                            |
> | currentThread()              | Returns a reference to the currently executing thread object.                                               |
> | dumpStack()                  | Prints a stack trace of the current thread to the standard error stream.                                    |
> | getId()                      | Returns the identifier of this Thread.                                                                      |
> | getState()                   | Returns the state of this thread.                                                                           |
> | getThreadGroup()             | Returns the thread group to which this thread belongs.                                                      |
> | interrupt()                  | Interrupts this thread.                                                                                     |
> | interrupted()                | Tests whether the current thread has been interrupted.                                                      |
> | isAlive()                    | Tests if this thread is alive.                                                                              |
> | isDaemon()                   | Tests if this thread is a daemon thread.                                                                    |
> | isInterrupted()              | Tests whether this thread has been interrupted.                                                             |
> | setDaemon(boolean on)        | Marks this thread as either a daemon thread or a user thread.                                               |
> | setPriority(int newPriority) | Changes the priority of this thread.                                                                        |
> | yield()                      | A hint to the scheduler that the current thread is willing to yield its current use of a processor.         |

- When we extend Thread class, we cannot override setName() and getName() functions, because they are declared final in Thread class.

> ### Shutdown hook

- In Java, Shutdown hook is used to clean-up all the resource, it means closing all the files, sending alerts etc.

- We can also save the state when the JVM shuts down.

- Shutdown hook mostly used when any code is to be executed before any JVM shuts down.

- **_addShutdownHook(Thread hook)_**
  - The addShutdownHook(Thread hook) method is used to register the thread with the virtual machine.

```java
 class Demo extends Thread {
    public void run()
	{
	    System.out.println("Shutdown hook task is Now completed...");
	}
}

public class ShutdownDemo
{
	public static void main(String[] args)throws Exception
	{

		Runtime obj=Runtime.getRuntime();
		obj.addShutdownHook(new Demo());
		System.out.println("Now main method is sleeping... For Exit press ctrl+c");
		try
		{
			Thread.sleep(4000);
		}
		catch (Exception e) {}
	}
}
```
