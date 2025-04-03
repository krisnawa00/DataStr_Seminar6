package datastr;

public class MyBST<Ttype> {

	private MyNode<Ttype> root = null;
	private int counter = 0;

	// neveidošu beazrgumenta konstruktoru, jo tas ir jau no Object klases pieejams

	public boolean isFull()// koks būs pilns, ja RAM atmiņā nebūs vietas
	{
		try {
			MyNode<Integer> newNode = new MyNode<Integer>(4);
			return false;

		} catch (OutOfMemoryError e) {
			return true;
		}
	}

	public boolean isEmpty() {
		return (counter == 0);
	}

	public int howManyElements() {
		return counter;
	}

	public void add(Ttype element) throws Exception {

		if (element == null) {
			throw new Exception("Padotais elem nedrikst but ka null");
		}

		if (isFull()) {
			throw new Exception("BST ir pilns un nevar pievienot jaunu elementu");
		}

		if (isEmpty()) {
			MyNode<Ttype> newNode = new MyNode<Ttype>(element);
			root = newNode;
			counter++;
		} else// nav labi
		{

			addHelper(root, element);
			counter++;

		}
	}

	private void addHelper(MyNode<Ttype> currentNode, Ttype newElement) {
		if( ((Comparable)newElement).compareTo(currentNode.getElement()) == 1) {
		
			if(currentNode.getRightChildNode() == null) {
				
				MyNode <Ttype> newNode = new MyNode <Ttype> (newElement);
				
			
				currentNode.setRightChildNode(newNode);
				newNode.setParent(currentNode);
						
			}	
			else 
			{
				addHelper(currentNode.getRightChildNode(), newElement);
			}
			
		}
		else if ( ((Comparable)newElement).compareTo(currentNode.getElement()) == -1) {
			if(currentNode.getLeftChildNode() == null) {
				
				MyNode <Ttype> newNode = new MyNode <Ttype> (newElement);
				
			
				currentNode.setLeftChildNode(newNode);
				newNode.setParent(currentNode);
						
			}	
			else 
			{
				addHelper(currentNode.getLeftChildNode(), newElement);
			}
			
		}
	}
}