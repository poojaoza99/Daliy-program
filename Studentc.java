
class Studentc
{
	int id;
	String name;
	int age;
	Studentc(int i,String n)
	{
	id = i;
	name = n;
	}
	Studentc(int i,String n,int a)
	{
	id = i;
	name = n;
	age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
public static void main(String args[])
{
Studentc s1 = new Studentc(20,"Alex");
Studentc s2 = new Studentc(21,"Bill",50);
s1.display();
s2.display();
}
}
