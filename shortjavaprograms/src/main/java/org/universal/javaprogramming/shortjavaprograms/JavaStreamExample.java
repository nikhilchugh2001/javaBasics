package org.universal.javaprogramming.shortjavaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	public static void printTable(int n) {
		Stream.iterate(1, element ->element+1)
		.filter(element->element%n==0)
		.limit(10)
		.forEach(System.out::println);
		
		//limit would return a stream of first n elements
		//filter used to filter stream and return a stream of elements
	}
	
	public static void streamIterate() {
		Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
	}
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        //System.out.println(productPriceList);   // displaying data  
        
        List productList2 = productsList.stream()
        		.filter(p->p.price>3000)
        		.map(p->p.price)
        		.collect(Collectors.toList());
        
        //System.out.println(productList2);
        
        JavaStreamExample.streamIterate();
        JavaStreamExample.printTable(10);
        
    }  
}  