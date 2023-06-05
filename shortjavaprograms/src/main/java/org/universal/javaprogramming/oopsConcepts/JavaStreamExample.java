package org.universal.javaprogramming.oopsConcepts;

import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  


public class JavaStreamExample { 
	public static Map<Integer, String> getListAsMap(List<Product> list){
		Map<Integer,String> productPriceMap =   
	            list.stream().filter(p -> p.price > 30000f)  
	                        .collect(Collectors.toMap(p->p.id, p->p.name));  
	              
	        return productPriceMap;
		
	}
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",48000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        productsList.stream()  
                    .filter(p ->p.price> 30000)   // filtering price  
                    .map(pm ->pm.price)          // fetching price  
                    .forEach(System.out::println);  // iterating price  
        
     
        Map<Integer,String> productPriceMap =   
	            productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
        
        System.out.println(getListAsMap(productsList));
        
     // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);
      
        // demonstration of map method
        System.out.println("showcase square of an element in array");
        List<Integer> square = number.stream().map(x -> x*x).
                               collect(Collectors.toList());
        System.out.println(square);
      
        // create a list of String
        System.out.println("showcase filter method");
        List<String> names =
                    Arrays.asList("Reflection","Collection","Stream");
      
        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                              collect(Collectors.toList());
        System.out.println(result);
      
        // demonstration of sorted method
        System.out.println("showcase sort method");
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
      
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
      
        // collect method returns a set
        System.out.println("showcase sqaure set");
        Set<Integer> squareSet =
             numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);
      
        // demonstration of forEach method
        System.out.println("showcase for each method");
        number.stream().map(x->x*x).forEach(y->System.out.println(y));
      
        // demonstration of reduce method
        System.out.println("showcase reduce method");
        int even =
           number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
      
        System.out.println(even);
    }  
}  