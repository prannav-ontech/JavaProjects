package AamirSirClass;

import java.util.LinkedList;
import java.util.Queue;


class CustomerRequest {
    private String Name;
    private int Id;
    private String issue;

    public CustomerRequest(String Name, int Id, String issue) {
        this.Name = Name;
        this.Id = Id;
        this.issue = issue;
    }

    public String toString() {
        return "ID: " + Id + ", Customer: " + Name + ", Issue: " + issue;
    }
}

class CustomerServiceQueue {
    private Queue<CustomerRequest> queue;

    public CustomerServiceQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(CustomerRequest request) {
        queue.offer(request);
        System.out.println("Added to queue: " + request);
    }

    public void dequeue() {
        if (!queue.isEmpty()) {
            CustomerRequest processedRequest = queue.poll();
            System.out.println("Processing request: " + processedRequest);
        } else {
            System.out.println("Queue is empty. No requests to process.");
        }
    }

    public void peek() {
        if (!queue.isEmpty()) {
            System.out.println("Next request to process: " + queue.peek());
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void displayQueue() {
        if (!queue.isEmpty()) {
            System.out.println("Current queue: \n");
            for (CustomerRequest request : queue) {
                System.out.println(request);
            }
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class cho9_question {
    public static void main(String[] args) {
        System.out.println("Name: Nikhil Rollno: 2410987090 ");
        CustomerServiceQueue serviceQueue = new CustomerServiceQueue();

        serviceQueue.enqueue(new CustomerRequest("A", 101, "Internet  issue"));
        serviceQueue.enqueue(new CustomerRequest("B", 102, "Billing issue"));
        serviceQueue.enqueue(new CustomerRequest("C", 103, "Technical issue"));

        // Viewing the next request without removing
        serviceQueue.peek();

        // Processing requests
        serviceQueue.dequeue();
        serviceQueue.dequeue();

        // Display remaining queue
        serviceQueue.displayQueue();

        System.out.println("Is the queue empty? " + serviceQueue.isEmpty());
    }
}