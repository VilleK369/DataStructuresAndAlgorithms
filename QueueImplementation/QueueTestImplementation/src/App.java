public class App {
    public static void main(String[] args) throws Exception {
       QueueAlgorithms queue = new QueueAlgorithms();
       queue.enqueue(8000);
       queue.enqueue(20);
       queue.enqueue(6675);
       queue.enqueue(6675);
       queue.enqueue(64567);
       queue.enqueue(1);
       queue.enqueue(8000);
       queue.enqueue(20);
       queue.enqueue(6675);
       queue.enqueue(6675);
       queue.enqueue(64567);
       queue.enqueue(1);
       queue.enqueue(8000);
       queue.enqueue(20);
       queue.enqueue(6675);
       queue.enqueue(6675);
       queue.enqueue(64567);
       queue.enqueue(1);
       queue.enqueue(8000);
       queue.enqueue(20);
       queue.enqueue(6675);
       queue.enqueue(6675);
       queue.enqueue(64567);
       queue.enqueue(1);
       
       //queue.clear();
       System.out.println("Deququed item: "+ queue.dequeue());
       System.out.println("Deququed item: "+ queue.dequeue());
       System.out.println("Deququed item: "+ queue.dequeue());

       System.out.println("First item is: " + queue.peek());
       System.out.println("Is the Queue empty: " + queue.isEmpty());

    }
}
