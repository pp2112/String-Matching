This code was written in Java using the Eclipse IDE.

To run the Demo file, navigate to the bin folder and run "java demo.Demo" in terminal. 
The code is structured into several packages as mentioned below:

-The "interfaces" package consists of the API method signatures as defined in the spec.
-The "concrete_implementation" package consists of the interface implementation of the StringMatcher 
-The "data_structures package" consists of the data structure implementations used for this task.
-The "demo" package consists of the Demo.java file which consists of the test runs provided at the end of the task.
-The "tests" package consists of some JUnit tests which test the correctness of the basic functionality.


Design Choices:

The way I approached this problem by essentially maintaning two similar but slightly differently structured data structures (HashMap). 
I implemented my own version of a hashmap and used a different hash function for either one of them. 

Essentially the StringMatcher implementation consists of a private instance of each of the two HashMap implementations (One being the ExactHashMap and the other being the PrefixHashMap). It first searches through the ExactHashMap instance to see if there is any match on a given lookup and if there isn't one, it checks in the PrefixHashMap. The reason for choosing a HashMap data structure for this problem is because it is very quick to index to a given "bucket" and find the correct key value pair provided the hashing function is "good" enough. For the PrefixHashMap implementation, I used the ASCII value of the first character in the key and use that as an index to find the correct prefix match. In the ExactHashMap implementation, I considered the relative possitioning of each character by multiplying the character index with the character ASCII value and summed this to generate the hashcode. For example "www.abc.com" and "www.bac.com" would have different hash codes.

One way of improving the code in terms of the layout would be to remove the duplication in ExactHashMap and PrefixHashMap would be by making the PrefixHashMap class a subclass of ExactHashMap and overriding the functions. However, in this context it doesn't make sense to subclass the PrefixHashMap because they are used for two different things. Another way to remove duplication would be by making another higher level class which both the ExactHashMap and the PrefixHashMap extend from.

 
