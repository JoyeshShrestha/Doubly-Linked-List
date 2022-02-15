import java.util.Scanner;
public class DLLMain {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		System.out.println("Doubly Linked List Test");
		char ch;
		do {
			System.out.println("DoublyLinkedList operations");
			System.out.println("1. Enter at Beginning");

			System.out.println("2. Enter at End");

			System.out.println("3. Enter at Specific");

			System.out.println("4. Display from head to tail");
			
			int data;
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the element to insert at the begining");
				data=input.nextInt();
				list.insertAtBegin(data);
				break;
			
			case 2:
				System.out.println("Enter the element to insert at the end");
				data=input.nextInt();
				list.insertAtEnd(data);
				break;
			 
			case 3:
				System.out.println("Enter the integer element to insert at the specific position");
				int num=input.nextInt();
				System.out.println("Enter position");
				int pos=input.nextInt();
				list.insert(num,pos);
				break;
			
			case 4:
				list.displayForward();
				break;
			
			default:
				System.out.println("Wrong entry\n");
				break;
			}
				System.out.println("\n DO you want to continue(y/n)");
				ch=input.next().charAt(0);
				
			
			
		}while (ch == 'Y' || ch == 'y');
		input.close();
		}	
	
}
