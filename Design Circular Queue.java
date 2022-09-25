class MyCircularQueue {

    int arr[];
    int size;
    int front;
    int rear;
    public MyCircularQueue(int k) {
        arr=new int[k];
        size=front=rear=0;
        Arrays.fill(arr,-1);
    }
    
    public boolean enQueue(int value) {
        
        if(isFull()) return false;
        if(isEmpty()){
            front=rear=0;
            arr[rear]=value;
            size++;
            return true;
        }
        rear++;
        rear=rear%arr.length;
        size++;
        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        arr[front]=-1;
        size--;
        front++;
        front=front%arr.length;
        return true;
    }
    
    public int Front() {
        return arr[front];
    }
    
    public int Rear() {
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(size==arr.length) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
