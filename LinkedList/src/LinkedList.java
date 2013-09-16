public class LinkedList implements LinkedListInterface {

	public LinkedListNode list;

	public LinkedList() {
		list = null;
	}

	@Override
	public void add(Object element) {
		// add first element
		LinkedListNode newNode = new LinkedListNode(element, list);
		list = newNode;
	}

	@Override
	public Object remove(Object elememt) {

		return null;
	}

	public Object pop() {
		Object temp = list;
		list = list.getLink();
		return temp;
	}

	@Override
	public boolean contains(Object element) {
		LinkedListNode current = list;
		if (!isEmpty()) {
			while (current != null) {
				if (current.getElement().equals(element))
					return true;
				current = current.getLink();
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (list == null)
			return true;
		else
			return false;
	}

	public String toString() {
		String out = "";
		LinkedListNode temp;
		temp = list;
		while (temp != null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}

}
