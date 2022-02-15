
public class DoublyLinkedList {
	public DLLNode head = null;
	public DLLNode tail = null;
	private int length = 0;
	
	//insert at beginning
	public void insertAtBegin(int data) {
		DLLNode newNode = new DLLNode(data);
		if(length ==0) {
			head = newNode;
			tail=newNode;
		}
		else {
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
			
				
		}
	length +=1;	
	}

	//Insert at the end
	
	public void insertAtEnd(int data) {
		if(length == 0) {
			insertAtBegin(data);
			
		}
		else {
			DLLNode newNode =new DLLNode(data);
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		
		}
		length+=1;
	}
	
	//Insert at the specific position
	public void insert(int data,int position) {
		if(position<0) {
			System.out.println("invalid");
		}
		if(position==0) {
			insertAtBegin(data);
			
		}
		else if (position >length) {
			insertAtEnd(data);
			
		}
		else {
			DLLNode temp=head;
			for(int i=1;i<position - 1;i++) {
				temp=temp.getNext();
			}
			DLLNode newNode =new DLLNode(data);
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);
			temp.setNext(newNode);
			temp.getNext().setPrev(newNode)
			;
		}
	length +=1;
	}
	
	public void displayForward() {
		DLLNode temp = head;
		if(length<=0) {
			System.out.println("Empty");
		}
		else {
			do {
				System.out.println(" "+temp.getData());
				temp=temp.getNext();
				
			}while(temp!=null);
		}
		System.out.println();
	}
}
