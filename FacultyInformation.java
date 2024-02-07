class Employee 
{
    // Class variables
    String name;
    int employeeId;

    // Parameterized constructor
    public Employee(String name, int employeeId) 
    {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Display method to print employee information
    public void display() 
   {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("--------------------");
    }
}

class Faculty extends Employee 
{
    // Additional class variable for Faculty
    String department;

    // Parameterized constructor for Faculty
    public Faculty(String name, int employeeId, String department)
   {
        super(name, employeeId); // Call the constructor of the superclass
        this.department = department;
    }

    // Overridden display method to include department information
    @Override
    public void display() 
   {
        super.display(); // Call the display method of the superclass
        System.out.println("Department: " + department);
        System.out.println("--------------------");
    }
}

public class FacultyInformation
{
    public static void main(String[] args) 
    {
        // Creating an object for Faculty
        Faculty faculty = new Faculty("Dr. Smith", 101, "Computer Science");

        // Displaying information for the faculty
        faculty.display();
    }
}
