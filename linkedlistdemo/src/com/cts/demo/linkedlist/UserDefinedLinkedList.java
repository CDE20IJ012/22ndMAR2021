package com.cts.demo.linkedlist;

public class UserDefinedLinkedList {

	private Node head; // This will point to the first node
    private Node currentNode; // pointing to the current node to be displayed or deleted
	private Node previousNode; // pointing to the previous node of the current node ( usually we will use in 
	 // in delete method )
	public void addNode(Node newNode)
	{
		// If the head node is empty i.e. its not pointing to any node then it should point to 
		// the newly created node
		if(head==null)
		{
			head=newNode;
		}
		// otherwise let us add the newly created node at the end of the list
		else
		{
			for(currentNode=head;currentNode.getNext()!=null;currentNode=currentNode.getNext());
			currentNode.setNext(newNode);
			
		}
	}   // end of addNode
   
	public void displayNode()
	{
		for(currentNode=head;currentNode!=null;currentNode=currentNode.getNext())
		{
			System.out.println(currentNode.getData());
		}
		
		
	} // end of displayNode

	
	public void deleteNode(String nameToDelete)
	{
	for(currentNode=previousNode=head;currentNode!=null;previousNode=currentNode,currentNode=currentNode.getNext())
	{
	     // Let us check whether the data got matched  
	      if(currentNode.getData().equalsIgnoreCase(nameToDelete))
	    		  {
	    	        // 1) Are we deleting the first node
	    	           if(currentNode==head)
	    	           {
	    	        	   head=currentNode.getNext();
	    	        	   currentNode=null;
	    	        	   break;
	    	           }
	    	  
	    	       // 2) Are we deleting a node from the middle 
	    	  
	    	       // 3) Are we deleting a node from the end
	    	           // So for that the previous node's next 
	    	         
	    	           else
	    	           {
	    	        	   previousNode.setNext(currentNode.getNext());
	    	        	   currentNode=null;
	    	        	   break;
	    	           }
	    	  
	    		  }
		
	}
		
		
		
	}
	
	


}  // end of UserDefinedLinkedList
