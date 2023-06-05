package org.universal.javaprogramming.oldJavaCode;

public class RemoveElement {
	public static void main(String[] args) {
	int a[] = {1,6,9,2,3,16};
	int removeElement= 2;
	
	int b[] = new int[a.length -1 ];
	
	//loop to go ober elements
	// till no match send to b
	//when match skip to to send
	//end loop
	//sys ot b
	
	
	
	int index = FindIndex.findIndex(a, removeElement);
	if (index!= -1) {
	
	for(int i =0, k=0;i <a.length;i++ ) {
		if (a[i] == removeElement) {
			
		}
		else {
			
			
			b[k++]= a[i];
		}
		
	}
	
	}
	
	
	
	for(int y =0;y <b.length;y++ ) {
		System.out.println(b[y]);
	}
	
	}

}
