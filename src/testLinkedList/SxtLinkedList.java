package testLinkedList;

public class SxtLinkedList {
	
	private Node firse;
	private Node last;
	private int size;
	

	private void add(Object  obj) {
		
		Node n = new Node();
		
		if (firse==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			firse = n;
			last = n;
			
		}else {
			//直接往last节点后增加新节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	
	public void add(int index,Object obj){
		Node temp = node(index);
		
		Node newNode = new Node();
		
		newNode.obj = obj;
		
		
		if (temp!=null) {
			Node up = temp.previous;
			up.next = newNode;
			newNode.previous = up;
			newNode.next = temp;
			temp.previous=newNode;
			
			size++;
		}
	}
	
	
	public int size(){
		return size;
	}
	
	public void RangeCheck(int index) {
		if (index<0 || index>size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Node node(int index){
		Node temp = null;
		if (firse!=null) {
			temp = firse;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			
		}return temp;
	}
	
	public Object get(int index){
		RangeCheck(index);
		
		Node temp = node(index);
		if (temp!=null) {			
			return temp.obj;
		}
		return null;
	}
	
	
	public void remove(int index){
		Node temp =node(index);
		
		if (temp!=null){
			 Node up = temp.previous;
			 Node down = temp.next;
			 up.next = down;
			 down.previous = up;
		}
		
		size--;
	}
	
	public static void main(String[] args) {
		SxtLinkedList list = new SxtLinkedList();
		
		list.add("aaaa");
		list.add("CCCC");
		list.add("bbbb");
		list.add("cccc");
		System.out.println(list.size());
		list.add(1, "BBBB");
		

//		list.remove(1);
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
		
	}


}
