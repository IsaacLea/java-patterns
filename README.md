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


## Behavioral patterns

### Observer
- Useful when various client instances need to be made aware of property changes from a main source (pub/sub).  Clients register as observers.  Note to take care of cleanup of clients (ubsubscribe) no longer need to observe to avoid memory leaks.

### Strategy
- Useful for when there are many implementations of similar things (many different payment methods for example).  Abstracts the concrete implementation away from the calling class.


## Structural patterns

### Decorator
- Decorators have creation methods or constructors that accept objects of the same class or interface as a current class.  Can instantiate an object decorated with implementations of many things, then call its public method to execute code in sequence on all those things.