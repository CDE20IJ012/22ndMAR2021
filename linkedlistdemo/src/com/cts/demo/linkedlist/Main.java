package com.cts.demo.linkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		UserDefinedLinkedList list=new UserDefinedLinkedList();
		while(true)
		{
			  System.out.println("1) ADD DATA");
			  System.out.println("2) DISPLAY DATA");
			  System.out.println("3) DELETE DATA");
			  System.out.println("4) UPDATA DATA");
			  System.out.println("5) EXIT");
			  System.out.println("Enter the your choice");
			  choice=scanner.nextInt();
			  switch(choice)
			  {
			  case 1 :    Node newNode=new Node();
			              System.out.println("Enter the node data");
			              newNode.setData(scanner.next());
			              //node.setNext(null);
			              list.addNode(newNode);
			              break;
			  case 2 :    System.out.println("The nodes======>");
			              list.displayNode();
			              break;
			  case 3 :    System.out.println("Enter the name to be deleted !!!!!");
			              String nameToDelete=scanner.next();
			              list.deleteNode(nameToDelete);
			              break;
			  case 5 : System.exit(0);
			  
			  } // end of switch case
			
			
			
		}  // end of while true
		
 
	}  // end of main
 
}   // end of class
