# Java Working And fundaments

---

1. Basics Of Java, JVM, and JDK

- JDK contains tools required to write Java programs, and JRE to execute them.
- JDK includes a compiler, Java application launcher, Appletviewer, etc.
- JVMs are available for many hardware and software platforms.
- java is platform-independent but JVM, JRE, and JDK are platform dependent because the configuration of each OS differs.
- JVM is a virtual machine or a program that provides a run-time environment in which java byte code can be executed.
- Java compiler compiles the source code into the Java bytecode.
- Java interpreter converts the bytecode into the machine-understandable format i.e. machine code
- Machine code interacts with the operating system.

* Java Bigger Picture
  ![The Bigger Picture](../../javaPicture.png)
  [Check Out Resource](https://docs.oracle.com/javase/8/docs/)

---

2. Java Internal Working

- java: Java Runtime Launcher

* Launches a Java application.

  - Steps:
    - Start Java Runtime Environment (JRE).
    - Load Defined Class (bootstrap class path, installed extensions, and user's class path).
    - Calls Main Method.
    - java command starts a Java application.

* java commands
  ```bash
  java [options] classname [args]
  java [options] -jar filename [args]
  javaw [options] classname [args]
  javaw [options] -jar filename [args]
  ```
* Various Types Of Options

  - Standard Options
  - Non-Standard Options
  - Advanced Runtime Options
  - Advanced JIT Compiler Options
  - Advanced Serviceability Options
  - Advanced Garbage Collection Options

* Some Most Used Options

```bash
java -Xms256m
java -Xmx1024m
java -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
java -XX:+UseG1GC
java -XX:-UseParallelGC
java -XX:+UseConcMarkSweepGC
```

- There are many more options related to garbage collection, meta-space size, thread, class-loading, cache, compiler, and heap we can consider checking it while performance tuning and find memory leak of application.

- Tip: We can combine more than one options, we can set options as default if needed.

* javac: Java Compiler
* The Java programming language compiler, javac, reads source files written in the Java programming language, and compiles them into bytecode class files.
* Optionally, the compiler can also process annotations found in source and class files using the Pluggable Annotation Processing API.
* The compiler accepts source code defined by the Java Language Specification (JLS) and produces class files defined by the Java Virtual Machine Specification (JVMS).
* This lists the APIs introduced in the javac tool:

  - javax.annotation.processing - Annotation processing
  - javax.lang.model - Language model used in annotation processing and Compiler Tree API
    - javax.lang.model.element - Language elements
    - javax.lang.model.type - Types
    - javax.lang.model.util - Language model utilities
  - javax.tools - Java Compiler API
  - com.sun.source.\* - Provides read-only acccess to abstract syntax trees that the javac tool uses

---
