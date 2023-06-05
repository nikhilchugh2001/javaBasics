package org.universal.javaprogramming.dataStructures;

public class ArrayImplementQueueUpdated {
	 int capacity;
	    int queueArr[];
	    int front;
	    int rear;
	   // int currentSize;
	//FIFO -- First in first out
	    //front -- is used to remove the data
	    //rear -- is used to add the data

	public ArrayImplementQueueUpdated(int sizeOfQueue){
	    this.capacity = sizeOfQueue;
	    front = -1;
	    rear = -1;
	    queueArr = new int[this.capacity];
	}

	    /**
	     * this method is used to add element in the queue
	     * @param data
	     */
	    public void enqueue(int data){
	    if(isFull()){
	        System.out.println("hey, queue is full, can not insert the data");
	    }
	    else{
	        rear++;
	        if(front == -1){
	            front = 0;
	        }
	        queueArr[rear] = data;
	      
	        System.out.println(data + "added to the queue");
	    }
	}

	    /**
	     * this method is used to remove the element from the front of the queue
	     */
	    public void dequeue(){
	        if(isEmpty() || front>rear){
	            System.out.println("Hey, queue is empty, can not delete element");
	        }
	        else{
	        	
	        	 System.out.println(queueArr[front] + " removed from the queue");
	            front++;
	            
	            
	        }



	    }




	public boolean isFull(){
	    if(rear== capacity-1){
	        return true;
	    }
	    return false;
	}

	public boolean isEmpty(){
	        if(rear==-1){
	            return true;
	        }
	        return false;
	}


	public void queueDisplay()
	{
	    int i;
	    if (isEmpty() || front >rear) {
	        System.out.printf("\nQueue is Empty\n");
	        return;
	    }

	    // traverse front to rear and print elements
	    for (i = front; i <= rear; i++) {
	        System.out.printf(" %d <-- ", queueArr[i]);
	    }
	    return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayImplementQueueUpdated obj = new ArrayImplementQueueUpdated(6);
	        obj.enqueue(10);
	        obj.enqueue(20);
	        obj.enqueue(30);

	        obj.dequeue();
	        obj.enqueue(40);
	        obj.dequeue();

	        obj.enqueue(50);
	        obj.dequeue();
	        obj.dequeue();
	        obj.dequeue();
	        obj.dequeue();
			/*
			 * obj.enqueue(60); //obj.dequeue();
			 * 
			 * obj.enqueue(70); obj.enqueue(80);
			 * 
			 * //obj.dequeue();
			 * 
			 * obj.enqueue(750); obj.enqueue(830);
			 */
	        //obj.dequeue();
	        //obj.dequeue();


			/*
			 * for(int i=obj.front; i<= obj.rear; i++) System.out.println(obj.queueArr[i]);
			 */
		
	        obj.queueDisplay();
	}

}
