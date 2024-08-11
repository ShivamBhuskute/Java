// import java.util.*;


// class Person {
//     String name;
//     int age;

//     // Constructor
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Override toString() method to print Person details
//     @Override
//     public String toString() {
//         return "Name: " + name + ", Age: " + age;
//     }
// }


// public class demo {
//     public static void main(String[] args) {
//         Vector vec = new Vector();
//         vec.add(new Person("Amit", 16));
//         vec.add(new Person("Sumit", 18));
//         vec.add(new Person("Gopal", 12));
//         vec.add(new Person("Raja", 15));
//         vec.add(new Person("Mohan", 20));
//         for (int i = 0; i < vec.size(); i++)
//             System.out.println(vec.get(i));
//     }
// }


// import java.util.*;
// public class demo
// {
//   public static void main(String[] args) 
//   {
//     Vector vec=new Vector();
//     vec.add(2);    
//     vec.add(4);    
//     vec.add(8);    
//     vec.add(12);    
//     vec.add(24);    
//     vec.add(50);
//     System.out.println(vec);    
//   }
// }

import java.util.*;
public class demo
 {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) 
  {
    Vector vec=new Vector();
    vec.add(2.5);    
    vec.add(4.2);    
    vec.add(8.6);    
    vec.add(12.4);    
    vec.add(24.9);    
    vec.add(50.8);
    double s=0;
    for(int i=0;i<vec.size();i++)
      s=s+(double)vec.get(i);
    System.out.println("Sum is "+s);    
  }
 }