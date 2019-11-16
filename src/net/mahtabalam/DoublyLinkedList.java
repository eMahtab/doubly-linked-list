package net.mahtabalam;

public class DoublyLinkedList {
	
	public Node head;
    public Node tail;
    
    public boolean contains(int value) {
        Node node = head;
        while(node != null) {
        	if(node.value == value) {
        		return true;
        	}
        	node = node.next;
        }
        return false;
    }
    
    public void insertBeforeNode(Node node, Node nodeToInsert) {
    	// If head or tail is null, then it means linked list is empty
    	// So add the node as the first Node
    	if(head == null || tail == null) {
    		nodeToInsert.next = null;
    		nodeToInsert.prev = null;
    		head = node;
    		tail = node;
    	} else {
    		// If we are inserting before head
    		if(node == head) {
    			head = nodeToInsert;
    		} else {
    			node.prev.next = nodeToInsert;
    			nodeToInsert.prev = node.prev;
    		}
    		node.prev = nodeToInsert;
			nodeToInsert.next = node;
    	}
    }
    
    public void insertAfterNode(Node node, Node nodeToInsert) {
    	// If head or tail is null, then it means linked list is empty
    	// So add the node as the first Node
    	if(head == null || tail == null) {
    		nodeToInsert.next = null;
    		nodeToInsert.prev = null;
    		head = node;
    		tail = node;
    	} else {
    		// If we are inserting after tail
    		if(node == tail) {
    			tail = nodeToInsert;
    		} else {
    			nodeToInsert.next = node.next;
    			node.next.prev = nodeToInsert;
    		}
    		node.next = nodeToInsert;
			nodeToInsert.prev = node;
			
    	}
    	
    }
    
    public void removeNodesWithValue(int value) {
    	Node node = head;
    	while(node != null) {
    		Node nodeToBeDeleted = node;
    		// For Next Iteration
    		node = node.next;
    		if(nodeToBeDeleted.value == value) {
    			removeNode(nodeToBeDeleted);
    		} 
    	}
    }
	
	public void add(Node newNode) {
	        /* 1. This new node is going to be the last node, so make next of it as NULL*/
	        newNode.next = null; 
	        
	        /* 2. If the Linked List is empty, then make the new node as head */
	        if (head == null) { 
	        	newNode.prev = null; 
	            head = newNode; 
	            return; 
	        } 
	  
	        Node node = head; 
	        /* 3. Else traverse till the last node */
	        while (node.next != null) 
	        	node = node.next; 
	  
	        /* 4. Change the next of last node */
	        node.next = newNode; 
	  
	        /* 5. Make last node as previous of new node */
	        newNode.prev = node; 
	        // Update tail to point to the last node
	        tail = newNode;
	}
	
	public void removeNode(Node node) {
		
		if (node == head) head = node.next;
		if (node == tail) tail = node.prev;
		
		if (node.prev != null) 
			node.prev.next = node.next;
		if (node.next != null)
			node.next.prev = node.prev;
		
		node.next = null;
		node.prev = null;
				
	}
	
	public void printLinkedList() {
		Node node = head;
		while(node != null) {
			System.out.print(" "+ node.value+ "   ");
			node = node.next;
		}
		System.out.println();
	}
	

}
