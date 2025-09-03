public class QueueUsingArray {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return rear == front;
        }

        // isFull
        public boolean isFull() {
            return rear == size - 1;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            return arr[front];
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front + 1];
        }

        // size
        public int size() {
            return rear - front;
        }

        // print queue elements
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(arr[i] + " ");
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
        q.add(6);

        System.out.println("Queue elements:");
        q.printQueue();
        System.out.println("Size: " + q.size());
        System.out.println("Queue is full: " + q.isFull());

        System.out.print("Removing element: ");
        System.out.println(q.remove());
        System.out.println("Size: " + q.size());
        System.out.println("Peek: " + q.peek());
    }
}
