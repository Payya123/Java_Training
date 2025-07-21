public class circularqueue 
private int[] queue;
private int front;
private int rear;
private int size;
private int capacity;

public circularqueue(int capacity) {
    this.capacity = capacity;
    queue = new int[capacity];
    front = -1;
    rear = -1;
    size = 0;
}

public boolean isEmpty() {
    return size == 0;
}

public boolean isFull() {
    return size == capacity;
}

public void enqueue(int data) {
    if (isFull()) {
        System.out.println("Queue is full");
        return;
    }
    if (front == -1) {
        front = 0;
    }
    rear = (rear + 1) % capacity;
    queue[rear] = data;
    size++;
}

public int dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
    int data = queue[front];
    front = (front + 1) % capacity;
    size--;
    if (size == 0) {
        front = -1;
        rear = -1;
    }
    return data;
}

public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    int i = front;
    for (int count = 0; count < size; count++) {
        System.out.print(queue[i] + " ");
        i = (i + 1) % capacity;
    }
    System.out.println();
}
