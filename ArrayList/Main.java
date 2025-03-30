public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.insert(10); list.insert(20); list.insert(30);
        list.display(); // [10, 20, 30]
        list.insertAt(1, 15);
        list.display(); // [10, 15, 20, 30]
        list.remove();
        list.display(); // [10, 15, 20]
        list.removeElement(15);
        list.display(); // [10, 20]
        System.out.println("Find 20: " + list.find(20)); // 1
        System.out.println("Contains 10? " + list.contains(10)); // true
        System.out.println("Size: " + list.size()); // 2
        System.out.println(list.get(1)); // 20
        list.set(1, 50);
        list.display(); // [10, 50]
        System.out.println("Empty?: " + list.isEmpty()); //false
    }
}