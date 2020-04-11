public class Node<E>{
	private E data;
	private Node<E> left;
    private Node<E> right;
    private Node<E> parent;
	
	public Node(E data){
		this.data = data;
	}
	
	public E get(){
		return data;
	}
	
	public Node<E> getLeft(){
		return left;
	}
	
	public Node<E> getRight(){
		return right;
    }
    
    public Node<E> getParent(){
        return parent;
    }

    public void setParent(Node<E> node){
        parent = node;
    }
	
	public void setLeft(Node<E> node){
		left = node;
	}
	
	public void setRight(Node<E> node){
		right = node;
	}
}