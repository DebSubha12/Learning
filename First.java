class Node {
    int data;
    Node next;
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class definition
class myQueue {
    private Node front;
    private Node rear;

    public myQueue() {
        front = rear = null;
    }
};