public class App {
    public static void main(String[] args) {
        StackAlgorithms stack = new StackAlgorithms(3);
        
        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);
        stack.push(55);  // Triggers reallocation
        
        System.out.println(stack);  // Stack (top to bottom): [20, 40, 10, 30]
        System.out.println("Size: " + stack.size());  // 4
        System.out.println("Capacity: " + stack.capacity());  // 6 (after reallocation)
        stack.contains(55);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.contains(55);
        System.out.println(stack);
    }
}