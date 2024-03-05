import java.util.LinkedList;
class LinkedList1  
{
    public static void main(String[] args)
    {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Accessing elements
        System.out.println("Elements in the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Adding an element at the beginning
        linkedList.addFirst("Mango");

        // Adding an element at the end
        linkedList.addLast("Grapes");

        // Removing an element from the LinkedList
        linkedList.remove("Banana");

        // Size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());
    }
}
