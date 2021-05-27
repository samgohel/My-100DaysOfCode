# JVM, JDK And JRE Basics

### JDK Basics

- The Java Development Kit (JDK) is a software development environment that offers a collection of tools and libraries necessary for developing Java applications.

* JDK contains tools required to write Java programs

* The JDK includes the Java Runtime Environment (JRE), an interpreter (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc), and some other development tools.

- JDK that are targeted for different types of development. The available packages are Java Enterprise Edition (Java EE), Java Standard Edition (Java SE), and Java Mobile Edition (Java ME).

* Java Bigger Picture
  ![The Bigger Picture](../../javaPicture.png)
  [Reference](https://docs.oracle.com/javase/8/docs/)

---

### JRE Basics

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

### JVM Basics

- Java Virtual Machine (JVM) is a engine that provides runtime environment to drive the Java Code or applications. It converts Java bytecode into machines language. JVM is a part of Java Run Environment (JRE).

- In other programming languages, the compiler produces machine code for a particular system. However, Java compiler produces code for a Virtual Machine known as Java Virtual Machine.

* JVM is a virtual machine or a program that provides a run-time environment in which java byte-code can be executed.

* JVMs are available for many hardware and software platforms.

* Java is platform-independent but JVM, JRE, and JDK are platform dependent because the configuration of each OS differs.

---

### JVM Architecture

- JVM Contain Following Components
  ![JVM Bigger Picture](../../JVM.png)
  [Reference](https://www.freecodecamp.org/news/jvm-tutorial-java-virtual-machine-architecture-explained-for-beginners/)

- JVM is divided into three main subsystems
  1. ClassLoader Subsystem
  1. Runtime Data Area
  1. Execution Engine

---

### Class Loader

---

### Runtime Data Area (JVM Memory Model).

---

### Execution Engine (Java Compiler & InterPreter).

---

### Evolution of the Java Memory Architecture

---
