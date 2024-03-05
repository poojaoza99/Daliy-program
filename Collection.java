import java.util.ArrayList;
class Collection 
{
    public static void main(String[] args) 
    {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Accessing elements
        System.out.println("Elements in the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Removing an element
        list.remove("Banana");

        // Size of the list
        System.out.println("Size of the list: " + list.size());
    }
}
