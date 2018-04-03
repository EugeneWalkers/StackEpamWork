public class Main {

    public static void main(String[] args){
//        CustomStackArray<Integer> stack = new CustomStackArray<>();
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        System.out.println(stack.pop());
//        System.out.println("size = " + stack.size());
//        System.out.println(stack.pull());
//        stack.pop();
//        System.out.println(stack.pop());

        CustomStackNode<Integer> stack2 = new CustomStackNode<>();
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        System.out.println(stack2.pop());
        //System.out.println("size = " + stack2.size());
        System.out.println(stack2.pull());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}
