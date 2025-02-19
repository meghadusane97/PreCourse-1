// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    Node head; // head of list
    int data;
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            //Write your code here
            data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty, assign new node as head
        if(list.head == null){
            // then make the new node as head
            list.head = node;
        }
        // Else traverse till the last node
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            // and insert the new_node there
            last.next = node;
        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.println("LinkedList: ");

        // Traverse through the LinkedList
        while(currNode != null){
            // Print the data at current node
            System.out.println(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}