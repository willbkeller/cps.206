# cps.206 Notes

##Advanced Java Construct Concepts
1. Exception

2. Generic
```java
import java.util.*;

public class GenericExample{

    public static void main(String... args){
    
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("William");
        System.out.println(list.size());
        list.add(0, "Keller");
        System.out.println(list);
        String ln = "Keller";
        System.out.println(list.contains("Kulis"));
        System.out.println(list.contains(ln));
        String firstName = list.get(1);
        System.out.println(firstName);
    }
}
```
##Feb 1, 2017
1. 2-d ArrayList
```java
ArrayList<ArrayList<String>> list = new ArrayList<>();

list.get(0); // null
list.add(new ArrayList<>());
list.size();// 1 (the empty array list)
// whole idea, you don’t want a 2-d array list
```
2. Alternative
   make an array of ArrayList
```java
ArrayList<String>[] list = new ArrayList[100]
list.length; //100
```

###Hashing
hash - 
tag - search

