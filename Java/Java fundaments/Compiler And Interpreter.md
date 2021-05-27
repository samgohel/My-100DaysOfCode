# Java Compiler And Interpreter

### Java Compiler

- javac: Java Compiler

---

### Java Interpreter

- Java interpreter converts the bytecode into the machine-understandable format i.e. machine code
- The Java programming language compiler, javac, reads source files written in the Java programming language, and compiles them into bytecode class files.
- Optionally, the compiler can also process annotations found in source and class files using the Pluggable Annotation Processing API.
- Machine code interacts with the operating system.
- The compiler accepts source code defined by the Java Language Specification (JLS) and produces class files defined by the Java Virtual Machine Specification (JVMS).
- This lists the APIs introduced in the javac tool:

  - javax.annotation.processing - Annotation processing
  - javax.lang.model - Language model used in annotation processing and Compiler Tree API
    - javax.lang.model.element - Language elements
    - javax.lang.model.type - Types
    - javax.lang.model.util - Language model utilities
  - javax.tools - Java Compiler API
  - com.sun.source.\* - Provides read-only acccess to abstract syntax trees that the javac tool uses

---
