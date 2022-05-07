class MyCircularQueue {
    int[] cir_queue;
    int front = 0, rear = 0, size = 0;

    public MyCircularQueue(int k) {
        cir_queue = new int[k];
        Arrays.fill(cir_queue, -1);
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = rear = 0;
            cir_queue[front] = value;
            size++;
            return true;
        }
        // rear++;
        size++;
        rear = (rear+1) % cir_queue.length;
        cir_queue[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        cir_queue[front] = -1;
        size--;
        // front++;
        front = (front+1) % cir_queue.length;
        return true;
    }

    public int Front() {
        return cir_queue[front];
    }

    public int Rear() {
        return cir_queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == cir_queue.length;
    }
}
