package com.bobocode;

/**
 * {@link LinkedQueue} implements FIFO {@link Queue}, using singly linked nodes. Nodes are stores in instances of nested
 * class Node. In order to perform operations {@link LinkedQueue#add(Object)} and {@link LinkedQueue#poll()}
 * in a constant time, it keeps to references to the head and tail of the queue.
 *
 * @param <T> a generic parameter
 */

public class LinkedQueue<T> implements Queue<T> {
	class Node{
		Node next;
		Node prev;
		T item;

		Node(T element){
			item = element;
	        next = null;
	        prev = null;
		}
	}
	private Node firstNode;
	private Node lastNode;

    /**
     * Adds an element to the end of the queue.
     *
     * @param element the element to add
     */
    public void add(T element) {
        //throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
        Node newNode = new Node(element);
        
        //first element
        if ((lastNode == null) && (firstNode == null)){
        	lastNode = newNode;
        	firstNode = newNode;
        	return;
        }
        
    	lastNode.next = newNode;
    	newNode.prev = lastNode;
        
        lastNode = newNode;        
    }

    /**
     * Retrieves and removes queue head.
     *
     * @return an element that was retrieved from the head or null if queue is empty
     */
    public T poll() {
        //throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    	if (isEmpty())
    		return null;
    	
    	Node node = firstNode;
    	firstNode = node.next;
    			
    	return node.item;
    }

    /**
     * Returns a size of the queue.
     *
     * @return an integer value that is a size of queue
     */
    public int size() {
        //throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    	int size = 0;
    	Node element = firstNode;
    	while (element != null) {
    		element = element.next;
    		size++;
    	}
    	return size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, returns {@code false} if it's not
     */
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    	if (firstNode == null) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
