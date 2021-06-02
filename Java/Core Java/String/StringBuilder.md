# Java StringBuilder class

- StringBuilder is identical to StringBuffer except for one important difference that it is not synchronized, which means it is not thread safe.

- StringBuilder also used for creating string object that is mutable and non synchronized.

- The StringBuilder class provides no guarantee of synchronization.

- StringBuffer and StringBuilder both are mutable but if synchronization is not required then it is recommend to use StringBuilder class.

- StringBuilder Constructors
  - StringBuilder ():
    - creates an empty StringBuilder and reserves room for 16 characters.
  - StringBuilder (int size):
    - create an empty string and takes an integer argument to set capacity of the buffer.
  - StringBuilder (String str):
    - create a StringBuilder object and initialize it with string str.
  - StringBuilder (CharSequence seq):
    - It creates stringbuilder object by using CharSequence object.
