
public class DLLNode {
		private int data;
		public DLLNode prev;
		public DLLNode next;
		public DLLNode(int data) {
			this.data = data;
			prev = null;
			next = null;
			
		}
		public int getData() {
			return data;
			
		}
		public DLLNode getPrev() {
			return prev;
			
		}
		public  DLLNode getNext() {
			return next;
		}
		public void setPrev(DLLNode prevpointer) {
			prev = prevpointer;
		}
		public void setNext(DLLNode nextpointer) {
			next = nextpointer;
		}


}


