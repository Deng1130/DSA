public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(14);


        //System.out.println("Lab 1 - Part 1");
        //System.out.println("Inserted '25' using insertAtStart method:");
        list.insertAtStart(25);
        list.insertAt(2,55);
        //list.show();



        //System.out.println("ƒLab 1 - Part 2");
        //System.out.println("Inserted '22' at index 1 using insertAt method:");
        list.insertAt(1,22);
        //list.show();

        //System.out.println("Lab 1 - Part 3");
        //System.out.println("Inserted '99' at index 0 using insertAt method:");
        list.insertAt(0,99);
        list.show();
    }
}
