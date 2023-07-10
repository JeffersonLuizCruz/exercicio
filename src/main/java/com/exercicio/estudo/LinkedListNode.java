package com.exercicio.estudo;

public class LinkedListNode {
	   int data;
	    LinkedListNode next;

	    public  LinkedListNode(int data) {
	        this.data = data;
	        this.next = null;
	    }
	public static class BinaryToDecimal{
	    public static int convertBinaryToDecimal(LinkedListNode head) {
	        int decimal = 0;
	        int power = 0;

	        LinkedListNode current = head;
	        while (current != null) {
	            decimal += current.data * Math.pow(2, power);
	            power++;
	            current = current.next;
	        }

	        return decimal;
	    }
	}
	
    public static void main(String[] args) {
        // Exemplo de lista encadeada representando o número binário 1011
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(0);
        LinkedListNode node3 = new LinkedListNode(0);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        int decimal = BinaryToDecimal.convertBinaryToDecimal(head);
        System.out.println("Número decimal: " + decimal);
    }
}
