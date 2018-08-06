package DS;

public class LinkedList {
	
	Node head;

	Node tail;
	
	
	private void add(int value) {
		Node newNode=new Node(value);
		
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			
			while (temp!=null && temp.getNext()!=null) {
				temp=temp.getNext();
				
			}
			temp.setNext(newNode);
			
			
				
		}

	}
	
private void print() {

	Node node=head;
	
	while (node!=null) {
		System.out.println(node.getValue());
		node=node.getNext();
		
	}
}
	
	public static void main(String[] args) {
		
		LinkedList name = new LinkedList();
		name.add(24);
		name.add(26);
		name.add(28);
		name.add(23);
		
		name.print();
		
		
	}
	
	
}
