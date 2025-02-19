class Node{
	int data;
	Node next, prev;
	public Node(int data){
		this.data = data;
		this.next =null;
		this.prev = null;
	}
}
class DoublyLinkedList{
	Node head;
	public void insert(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			newNode.prev = null;
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	public void deleteNode(int key) {
		if (head == null) return;
		Node temp = head;
		while (temp!= null) {
			if (temp.data == key) {
				if (temp == head) {
					head = temp.next;
					if (head != null) {
						head.prev = null;
					}
					return;
				}
				if (temp.next == null) {
					temp.prev.next = null;
					return;
				}
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				return;
			}
			temp = temp.next;
		}
		 System.out.println("Key not found in the list.");
	}
	public void display(){
		Node temp = head;
		System.out.print("null <-");
		while(temp.next!=null){
			System.out.print(temp.data + " <-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
public class ReviewThree{
	public static void main(String[] args){
		DoublyLinkedList l = new DoublyLinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.display();
		l.deleteNode(10);
		l.display();
	}
}