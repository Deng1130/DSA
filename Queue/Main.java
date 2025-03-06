public class Main {
    public static void main(String[] args) {
        Queue num = new Queue();

        num.enQueue(7);
        num.enQueue(3);
        num.enQueue(9);
        num.enQueue(1);
        System.out.println("Size is: " + num.getSize());
        num.show();

        num.enQueue(99);
        num.enQueue(391);

        num.deQueue();
        num.deQueue();
        num.deQueue();
        num.deQueue();
        num.deQueue();
        num.deQueue();

        System.out.println("Check if the queue is empty = " + num.isEmpty());
        System.out.println("Check if the queue is full = " + num.isFull());
        System.out.println("Size = " + num.getSize());

    }
}
