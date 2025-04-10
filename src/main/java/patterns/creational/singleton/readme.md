The simplest implementation of Singleton is to use the EagerLoad which provides thread safety without the complexity of managing it with synchronized, etc.  
It's a good idea to start with this for simplicity and only switch to lazy load if the overhead of init is a problem.

If using Spring, consider marking the class as @Component to achieve singleton that way.



