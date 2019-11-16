package net.mahtabalam;

public class App {
		public static void main(String[] args) {
			DoublyLinkedList dll = new DoublyLinkedList();
			Node head = new Node(1);
			Node two = new Node(2);
			Node three = new Node(3);
			Node four = new Node(4);
			Node one = new Node(1);
			Node six = new Node(6);
//			dll.add(head);
			dll.add(head); dll.add(two); dll.add(three); dll.add(four);
			dll.add(one); dll.add(six);
//			dll.printLinkedList();
//			System.out.println("Conatins 1 "+ dll.contains(1));
//			System.out.println("Conatins 10 "+ dll.contains(10));
//			dll.removeNode(head);
//			dll.printLinkedList();
//			System.out.println("Head : " + dll.head);
//			System.out.println("Tail : " + dll.tail);
			dll.removeNodesWithValue(1);
			
			dll.removeNodesWithValue(6);
			dll.printLinkedList();
			System.out.println("Head : " + dll.head);
			System.out.println("Tail : " + dll.tail);
		}
}
