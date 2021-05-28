# JVM, JDK And JRE Basics

> ### JDK Basics

- The Java Development Kit (JDK) is a software development environment that offers a collection of tools and libraries necessary for developing Java applications.

* JDK contains tools required to write Java programs

* The JDK includes the Java Runtime Environment (JRE), an interpreter (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc), and some other development tools.

- JDK that are targeted for different types of development. The available packages are Java Enterprise Edition (Java EE), Java Standard Edition (Java SE), and Java Mobile Edition (Java ME).

* Java Bigger Picture
  ![The Bigger Picture](https://github.com/samgohel/My-100DaysOfCode/blob/main/JavaPicture.PNG)
  [Reference](https://docs.oracle.com/javase/8/docs/)

---

> ### JRE Basics

- Java Run-time Environment (JRE) is the part of the Java Development Kit (JDK). It is a freely available software distribution which has Java Class Library, specific tools, and a stand-alone JVM.

- The source Java code gets compiled and converted to Java bytecode. If we wish to run this bytecode on any platform, we need to have JRE.

- The JRE loads classes, verify access to memory, and retrieves the system resources. JRE acts as a layer on the top of the operating system.

- It also includes:

  - Technologies which get used for deployment such as Java Web Start.
  - Toolkits for user interface like Java 2D.
  - Integration libraries like Java Database Connectivity (JDBC) and Java Naming and Directory Interface (JNDI).
  - Libraries such as Lang and util.
  - base libraries like Java Management Extensions (JMX), Java Native Interface (JNI) and Java for XML Processing (JAX-WS).

- What does JRE consist of?

  - **_Deployment technologies_** such as deployment, Java plug-in, and Java Web Start.

  - **_User interface toolkits_**, including Abstract Window Toolkit (AWT), Swing, Java 2D, Accessibility, Image I/O, Print Service, Sound, drag, and drop (DnD) and input methods.

  - **_Integration libraries_** including Interface Definition Language (IDL), Java Database Connectivity (JDBC), Java Naming and Directory Interface (JNDI), Remote Method Invocation (RMI), Remote Method Invocation Over Internet Inter-Orb Protocol (RMI-IIOP) and scripting.

  - **_Lang and util base libraries_**, including lang and util, zip, Java Archive (JAR), instrument, reflection, Collections, Concurrency Utilities, management, versioning, Logging, Preferences API, Ref Objects and Regular Expressions.

  - **_Other base libraries_**, including international support, input/output (I/O), extension mechanism, Beans, Java Management Extensions (JMX), Java Native Interface (JNI), Math, Networking, Override Mechanism, Security, Serialization and Java for XML Processing (XML JAXP).

  - **_Java Virtual Machine (JVM)_**, which comprise of Server Virtual Machine and Java HotSpot Client.

---

> ### JVM Basics

- Java Virtual Machine (JVM) is a engine that provides runtime environment to drive the Java Code or applications. It converts Java bytecode into machines language. JVM is a part of Java Run Environment (JRE).

- In other programming languages, the compiler produces machine code for a particular system. However, Java compiler produces code for a Virtual Machine known as Java Virtual Machine.

* JVM is a virtual machine or a program that provides a run-time environment in which java byte-code can be executed.

* JVMs are available for many hardware and software platforms.

* Java is platform-independent but JVM, JRE, and JDK are platform dependent because the configuration of each OS differs.

---

> ### JVM Architecture

- JVM Contain Following Components
  ![JVM Bigger Picture](https://github.com/samgohel/My-100DaysOfCode/blob/main/JVM.PNG)
  [Reference](https://www.freecodecamp.org/news/jvm-tutorial-java-virtual-machine-architecture-explained-for-beginners/)

- JVM is divided into three main subsystems
  1. ClassLoader Subsystem
  1. Runtime Data Area
  1. Execution Engine

---

> ### Class Loader

- The Java Class Loader is a part of the JRE that dynamically loads Java classes into the Java Virtual Machine.

- JVM doesn't need to know about the underlying files or file systems in order to run Java programs thanks to class loaders.

- The class loader subsystem is responsible for more than just locating and importing the binary data for classes, its also responsible for locating resources.

- A resource is some data (a ".class" file, configuration data, or an image for example) that is identified with an abstract '/'-separated path name.

- It must also verify the correctness of imported classes, allocate and initialize memory for class variables, and assist in the resolution of symbolic references. These activities are performed in a strict order.

- operations perform by class loader

  - Loading

    - Finding and importing the binary data for a type with a particular name and creating a class or interface from that binary representation.

  - Linking

    - Performing verification, preparation, and (optionally) resolution.

  - Verification

    - Ensuring the correctness of the imported type.

  - Preparation

    - Allocating memory for class variables and initializing the memory to default values.

  - Resolution

    - Transforming symbolic references from the type into direct references.

  - Initialization
    - Invoking Java code that initializes class variables to their proper starting values.

- **_Loading_**

- Handles the loading of the .class files from the hardware system into the JVM memory and stores the binary data (such as fully qualified class-name, immediate parent class-name, information about methods, variables, constructors etc.) in the method areas.

- For every loaded .class file, JVM immediately creates an object on the heap memory of type java.lang.class.

* Class-loader in Java works in three principles i.e. Delegation, Visibility, and Uniqueness.

* **Delegation**

- Class loaders follow the **delegation** model where on request to find a class or resource, a ClassLoader instance will delegate the search of the class or resource to the parent class loader.

- When loading a class, a class loader first "delegates" the search for the class to its parent class loader before attempting to find the class itself.

- The class loader delegation model is the graph of class loaders that pass loading requests to each other.

- The bootstrap class loader is at the root of this graph.

- Class loaders are created with a single delegation parent and look for a class in the following places:

  - Cache
  - Parent
  - Self

- A class loader first determines if it has been asked to load this same class in the past. If so, it returns the same class it returned last time (that is, the class stored in the cache).If not, it gives its parent a chance to load the class.

* **Visibility**
* Children class loaders are visible to classes loaded by its parent class loaders.

* Application class-loader has a visibility to see the classes loaded by the parent class-loaders but vice-versa is not true.

* - i.e. If a class is loaded by the system class-loader and later again trying to explicitly load the same class using the extension class-loader will throw a ClassNotFoundException at runtime.

* For instance, classes loaded by the system class loader have visibility into classes loaded by the extension and Bootstrap class loaders but not vice-versa.

* if Class A is loaded by an application class loader and class B is loaded by the extensions class loader, then both A and B classes are visible as far as other classes loaded by Application class loader are concerned.

* Class B, nonetheless, is the only class visible as far as other classes loaded by the extension class loader are concerned.

* **Uniqueness**
* Class loaded by the parent class-loader should not be again loaded by the child class-loader.

* As a consequence of the delegation model, it's easy to ensure unique classes as we always try to delegate upwards.

* If the parent class loader isn't able to find the class, only then the current instance would attempt to do so itself.

- There are three main types of class-loader:

  - Bootstrap or Primordial ClassLoader

    - responsible for loading the internal core java classes (rt.jar, java.lang package classes).
    - by-default available with every JVM written in native C/C++ languages.
    - This class loader has no parents and if developers call the String.class.getClassLoader(), it will return null and any code based on that will throw the NullPointerException in Java.

  - Extension ClassLoader

    - Child class of Primordial class-loader and is responsible for loading the classes from the extension class-path (i.e. jdk\jre\lib\ext).
    - It is written in Java language and the corresponding .class file is sun.misc.Launcher$ExtClassLoder.class.

  - Application or System ClassLoader
    - child class of Extension class-loader and is responsible for loading the classes from the system class-path.
    - It internally uses the ‘CLASSPATH‘ environment variable and is written in Java language.
    - System class-loader in JVM is implemented by sun.misc.Launcher$AppClassLoader.class

* How classes are loaded in Java?
* Class-loaders are hierarchical. The very first class in an application is specifically loaded with the help of static main() method.

* All the subsequent classes are either loaded by the Static or the Dynamic class loading techniques.

  - Static class loading

    - classes are statically loaded via the new operator

  - Dynamic class loading
    - classes are programmatically loaded by using the Class.forName() or the loadClass() method.

* The difference between the two is that the former one initializes the object after loading it while the latter one only loads the class but doesn’t initialize the object

- **_Linking_**

* Performs the linking of a class or an interface.
* component involves the allocation of new data structures, it may throw the OutOfMemoryError and performs the three important activities:

  - Verification

    - It is a process of checking the binary representation of a class and validating whether the generated .class file is valid or not.
    - This process is performed by the Byte-code verifier and if the generated .class file is not valid, a VerifyError is thrown.

  - Preparation

    - It is a process of assigning the memory for the class level or interface level static variables and assigns the default values.

  - Resolution
    - It is a process of changing the symbolic references with the original memory references from the method area.

- **_Initialization_**

* performs the final phase of the class loading where all the static variables are assigned the original values and the static blocks are executed from the parent to the child class.

* This process requires careful synchronization as JVM is multi-threaded and some threads may try to initialize the same class or interface at the same time.

---

### Runtime Data Area (JVM Memory Model).

- Runtime Data Area subsystem is divided into five major components.

- **Method Area**

  - Holds the class level data of each .class file such as metadata, constant runtime pool, static variables, the code for the methods etc.

  - There is only one method area per JVM and is shared among all the classes.

  - The memory allocated to this area is by-default allocated by the JVM or can be increased as per the computation needs.

  - If the method area is not available to satisfy a memory allocation request, the JVM throws an OutOfMemory error.

- **Heap Area**

  - Part of JVM memory where all the objects and its corresponding instance variables and arrays are stored.

  - This memory area is created on the JVM start-up and there is only one heap area shared across multiple threads as the data stored in this area is not thread-safe.

  - If the objects stored in the heap memory have no reference, memory for that object is reclaimed by the garbage collector.

  - Objects in this area are never explicitly de-allocated.

  - If the computation requires more heap area than the available, JVM throws an OutOfMemory error.

- **Stack Area**

  - Part of JVM memory where all the temporary variables are stored.

  - This area has stack frames and allocates one frame for each thread.

  - Once the thread execution is completed, this frame also gets destroyed.

  - The stack area is thread-safe as it is not a shared resource and is divided into three sub-entities such as:

    - Local variable array: These local variables are used by the virtual machine to pass the parameters upon the method invocation.

    - Operand Stack: This place is the actual place to perform operations during a method execution. The virtual machine takes the operand from the stack, operates on them, and pushes the result back onto the operand stack. This stack also prepares the arguments to be passed to a method and even to receive the method results.

    - Frame data.

  - If the thread processing requires the virtual machine stack than its permissible limit, the JVM throws a StackOverflow error.

  - If the virtual machine stack is insufficiently expanded, the JVM throws a OutOfMemory error.

- **PC (Program Counter) Registers**

  - Holds the address of the JVM instruction which is currently executing.

  - Each thread in Java has its own PC register to hold the address of the currently executing instruction.

- **Native Method Stacks**

  - This component is written in a different language and holds the native method information.

  - Every thread in Java has a separate native method stack.

  - If the thread processing requires the native stack than its permissible limit, the JVM throws a StackOverflow error.

  - If the native method stack is insufficiently expanded, the JVM throws a OutOfMemory error.

* Stack Memory VS. Heap Memory

| Stack Area                                                                               | Heap Area                                                                                                                           |
| ---------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| Used in parts (One at a time during execution of thread).                                | Shared Space (entire application uses heap space during runtime).                                                                   |
| Thread safe because each thread operates in its own stack.                               | Not thread safe needs to be guarded by properly synchronization the code.                                                           |
| Limited size depending upon OS, usually smaller than heap.                               | User defined or default, no size limit from OS.                                                                                     |
| Only Primitive variables and references to object that are created in heap.              | All newly created object.                                                                                                           |
| Accessed using LIFO memory allocation technique.                                         | Accessed via complex memory management technique that include young generation, old or tenured generation and permanent generation. |
| Exists as long as current method is running.                                             | Exists as long the application run.                                                                                                 |
| Comparatively much faster to allocate when compared to heap.                             | Slower to allocate when compared to stack.                                                                                          |
| Allocated and deallocated automatically when method is called and returned respectively. | Allocated when new object is created and deallocated by GC when no longer reference.                                                |

---

### Execution Engine (Java Compiler & Interpreter).

---

### Evolution of the Java Memory Architecture

---
