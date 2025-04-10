# java-patterns

Some examples of basic pattern implementations


## Creational patterns

### Singleton
- Ensures one instance of the class within the scope of the JVM.  Useful for things like loggers.  When using lazy initialization take note to ensure thread safety

### Factory
- Decouples class instantiation from the code that uses them.  Useful when there are many kinds of the same type of object and instead of instantiating each one the factory can be called to create it for you

### Abstract Factory 
- Similar to the Factor pattern except it creates a factory of factories.  The factory it creates encapsulates the creation of a family of other related objects

### Builder
- Provides a a nice way to construct objects that have a lot of parameters and it enforces how the objects are created.  Doesn't expose setter methods on the returned object so it is immutable