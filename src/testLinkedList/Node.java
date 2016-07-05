package testLinkedList;
// 用来表示一个节点
public class Node {
	 Node previous;  //上一个节点
	 Object obj;
	 Node next;    //下一个节点
	
	public Node() {
		
	}
	
	/**
	 * @param previous
	 * @param obj
	 * @param next
	 */
	public Node(Node previous, Object obj, Node next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	public Object getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	

}
