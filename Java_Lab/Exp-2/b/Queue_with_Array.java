public class Queue_with_Array{
    int front;
    int rear;
    int capacity = 10;
    int[] object;
    Queue_with_Array(){
        front = -1;
        rear = -1;
        object = new int[capacity];
    }
    boolean isEmpty(){
        return rear<=front;
    }
    int enqueue(int data){
        return object[++rear] = data;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        if(rear>=front){
            return object[++front];
        }
        return (Integer)null;
    } 
    int size(){
    return rear-front;
    }

    public static void main(String[] args) {
        Queue_with_Array q = new Queue_with_Array();
        System.out.println(q.isEmpty());
        System.out.println(q.enqueue(12));
        q.enqueue(32);
        q.enqueue(45);
        q.enqueue(90);
        q.enqueue(56);
        q.enqueue(67);
        q.enqueue(689);
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.size());

    }
}

