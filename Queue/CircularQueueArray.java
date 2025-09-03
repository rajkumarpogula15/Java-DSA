public class CircularQueueArray {
    static class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return front == -1;
        }

        // isFull
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) { // first element
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) { // queue becomes empty
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // size
        public int size() {
            if (isEmpty()) return 0;
            if (rear >= front) {
                return rear - front + 1;
            } else {
                return size - (front - rear - 1);
            }
        }

        // print queue elements
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Queue elements:");
        q.printQueue();
        System.out.println("Size: " + q.size());
        System.out.println("Queue is full: " + q.isFull());

        q.add(5);
        q.add(6); // should show "Queue is full"

        System.out.println("Queue elements:");
        q.printQueue();
        System.out.println("Size: " + q.size());
        System.out.println("Queue is full: " + q.isFull());

        System.out.print("Removing element: ");
        System.out.println(q.remove());
        System.out.println("Size: " + q.size());
        System.out.println("Peek: " + q.peek());

        q.add(6); // now it should fit due to circular behavior
        System.out.println("Queue elements after adding 6:");
        q.printQueue();
    }
}
