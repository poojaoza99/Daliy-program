import java.util.*;
class Switch_demo
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter your choice number \n1 : even or add \n2: Grades \n3: find Cube \n4:Greatest number");

		int choice = sc.nextInt();

		switch (choice) {

		case 1: 
		System.out.println("Enter number");

		int num = sc.nextInt();

		if (num % 2 == 0)

		{
			System.out.println("Number is Even");
		 }

		else 
		{
			System.out.println (" Number is odd");

		}
		break;



		case 2:
		 System.out.println("enter computer marks");
        	int com=sc.nextInt();
 		System.out.println("enter math marks");
        	int math=sc.nextInt();
		System.out.println("enter science marks");
        	int sci=sc.nextInt();
 		System.out.println("enter electronics marks"); 
        	int elc=sc.nextInt();
		System.out.println("enter web tech marks");
        	int wt=sc.nextInt();
        	double per,total;
  		total=(com+math+sci+elc+wt);
   		per=total/5;
 		System.out.println("total marks:\t"+total);
      		if(per>=70)
        	System.out.println("Grade:A");
       		 else if(per>=60)
        	System.out.println("Grade:B");
        	else if(per>=50)
       		 System.out.println("Grade: C");
        	else if(per>=40)
        	System.out.println("Grade:Pass");
       		 else
       		 System.out.println("Grade:Fail");
  
		break;
		 case 3:
     		 int res=0;
        	System.out.println("enter number");
        	int n=sc.nextInt();
        	if(n%5==0)
        	{
            	{
            	res=n*n*n;
        	}
        		System.out.println("cube is:"+res);
            
        	}
        	else
        	{
            		System.out.println("The number is not divisible by 5");
        	}
   		 break;
 		 case 4:
		int n1, n2, n3;

                System.out.println("Enter the value of n1:");
            	n1 = sc.nextInt();
                System.out.println("Enter the value of n2:");
           	 n2 = sc.nextInt();
                System.out.println("Enter the value of n3:");
             	n3 = sc.nextInt();

     		if (n1 > n2 && n1 > n3) 
		{
                    System.out.println("n1 is greater");
       		} 
		else if (n2 > n1 && n2 > n3) 
		{
                    System.out.println("n2 is greater");

    		 } 
		else if (n3 > n1 && n3 > n2) 
		{
                    System.out.println("n3 is greater");
       		} 
		else {
                    System.out.println("Invalid number");
                }
		break;
		default:
		System.out.println("Invalid choice");
		break; 
		}
	}
}
