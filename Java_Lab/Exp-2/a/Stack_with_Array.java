public class Stack_with_Array{
    int top;
    int capacity;
    int[] stack;
    Stack_with_Array(){
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty(){
        return top ==-1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }

    public int push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        return stack[++top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }

    public void display(){
        for(int i:stack){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Stack_with_Array st = new Stack_with_Array();
        st.push(34);
        st.push(21);
        st.push(14);
        st.push(33);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.capacity);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
    }
}
