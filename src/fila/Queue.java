/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Osiris
 */
public class Queue <T>{
    private Node<T> front;
    private Node<T> rear;
    private int size;
    
    Queue(){
        front = rear = null;
        size = 0;
    }
    
    Queue(T d){
        Node <T> n = new Node<T> (d);
        front = rear = n;
        size = 1;
    }
    
    public void enqueue (T d){
        Node <T> n = new Node<T> (d);
        if (isEmpty()){
            front = rear = n;
        } else {
            n.next = rear;
            rear = n;
        }
        size++;
    }
    
    public T dequeue(){
        if(!isEmpty()){
            Node<T> n = front;
            if (size == 1){
                clearQueue();
            } else {
                front.next = front;
                size--;
            }
            return n.data;
        }
        return null;
    }
    
    public T getFront(){
        return front.data;
    }
   
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void clearQueue(){
        front = rear = null;
        size = 0;
    }
    
    public void showQueue() {
        Node<T> pointer = front;
        for (int i = 0; i < size; i++){
            System.out.print("["+pointer.data.toString()+"]");
            if (pointer.next != null){
                System.out.println("<-");
            }
            pointer = pointer.next;
        }
    }
}
