/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsqueue;

/**
 *
 * @author Ke Zhang
 */
public class Queue {
    int front, 
        rear, 
        size,
        capacity;
    int array[];
    
    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    
    boolean isFull(Queue queue) {
        return (queue.size==queue.capacity);
    }
    
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }
    
    void enqueue(int item) {
        if(isFull(this)) {
            return;
        } else {
            this.rear = (this.rear + 1)%this.capacity;
            this.array[this.rear] = item;
            this.size += 1;
            System.out.println(item+" enqueued to queue");
        }
    }
    
    int front() {
        if(isEmpty(this)) 
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }
    
    int rear() {
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }
    
    int dequeue() {
        if(isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1;
        System.out.println(item+" dequeued from queue");
        return item;
    }
    
    void printArray() {
        if(this.array.length == 0) {
            System.out.println("Empty queue!");
        } else {
            for(int i = 0; i < this.array.length; i++) {
                System.out.print(this.array[i]+",");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Queue queue = new Queue(3);
           
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);

        System.out.println("Front item is " + queue.front() + ", locate at " + queue.front);
        System.out.println("Rear item is " + queue.rear() + ", locate at " + queue.rear);
        queue.printArray();
    }
}
