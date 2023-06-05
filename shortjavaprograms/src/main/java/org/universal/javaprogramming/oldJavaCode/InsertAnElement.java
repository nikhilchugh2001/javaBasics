package org.universal.javaprogramming.oldJavaCode;

public class InsertAnElement {
	public static void main(String[] args) {
	int a[] = {1,6,9,2,3,16,78,89};
	int addElement= 2;
	
	int b[] = new int[a.length + 1 ];
	
	//loop to go ober elements
	// till no match send to b
	//when match skip to to send
	//end loop
	//sys ot b
	
	
	
	int index = 4;

	
	for (int i = 0, k =0; i< index-1; i++)
	{
		b[k++]=a[i];
	}
	
	//System.out.println(b[0]+"he;");
	
	b[index-1]= addElement;
	for (int j = index, k= index-1;j< b.length;j++) {
		b[j]=a[k++];
		
	}
	
	
	
	
	
	
	for (int j=0;j<b.length;j++) {
		System.out.println(b[j]);
	}
	
	}


}
