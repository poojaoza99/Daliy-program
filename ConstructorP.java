// Java Program for Parameterized Constructor
import java.io.*;
class Parameterized
{
    // data members of the class.
    String name;
    int id;
   Parameterized (String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
class ConstructorP 
{
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Parameterized geek1 = new Parameterized ("neha", 68);
        System.out.println("ParameterizedName :" + geek1.name
                           + " and ParameterizedId :" + geek1.id);
    }
}