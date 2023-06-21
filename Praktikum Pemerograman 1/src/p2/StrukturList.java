package p2;

public class StrukturList {
    private Node head = null;
    
    public boolean isEmpty() {
    	return (head == null);
    }
    
    void addHead(int data) {
    	Node newNode = new Node(data);
    	newNode.setNext(head);
    	head = newNode;
    }
    
    void addTail(int data) {
        Node newNode = new Node(data);
        Node posNode = null;
        Node curNode = null;
        
        if (isEmpty()) {
            head = newNode;
        } else {
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
    
    void displayElement() {
    	Node curNode = head;
    	while (curNode != null) {
    		System.out.print(curNode.getData() + " ");
    		curNode = curNode.getNext();
    	}
    }
    
    public static void main(String[] args) {
        StrukturList LL = new StrukturList();
        
        LL.addTail(2);
        LL.addTail(1);
        LL.addTail(7);
        LL.addHead(3);
        LL.displayElement();
    }
}
