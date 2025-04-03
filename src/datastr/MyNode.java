package datastr;

public class MyNode<Ttype> {

	private Ttype element;
	private MyNode<Ttype> leftChildNode = null;
	private MyNode<Ttype> rightChildNode = null;
	private MyNode<Ttype> parent = null;
	public Ttype getElement() {
		return element;
	}
	public void setElement(Ttype inputElement) {


		if(inputElement != null)
		{
			element = inputElement;
		}
		else
		{
			element = (Ttype) new Object();
		}
	}
	
	public MyNode<Ttype> getLeftChildNode() {
		return leftChildNode;
	}
	public void setLeftChildNode(MyNode<Ttype> leftChildNode) {
		this.leftChildNode = leftChildNode;
	}
	public MyNode<Ttype> getRightChildNode() {
		return rightChildNode;
	}
	public void setRightChildNode(MyNode<Ttype> rightChildNode) {
		this.rightChildNode = rightChildNode;
	}
	public MyNode<Ttype> getParent() {
		return parent;
	}
	public void setParent(MyNode<Ttype> parent) {
		this.parent = parent;
	}
	public String toString() {
		return element + "";
	}
	
	
}
