//WAP to accept a choice from the user and accordingly display the output
//1:Accept no anc check it is prime no or Not
//2:Accept no and find out the SUM OF DIGIT (123 =1+2+3 =6)
//3:Accept a no from the user and  display the fibonacci series(0 1 1 2 3 5 .....)
//4:Accept no from user and check it is armstrong or not
//5: Accept 5 no and find out the greatest
//6:Accept a no from the user and display the month name
//7:Accept choice from user and create CALC
import java.util.Scanner;
public class lab_thuesday 
	{

	public static void main(String[] args) 
	{
		int choice;// used for switch 
		int prime,ch='n',i;//case 1 variable 
		int num1,rem,sum=0;//case 2 variable
		int sum5,count,i1=1,ft=0,st=1;//variablr for case 3
		int num2,rem1,sum1=0,t;//case 4 varibles
		int numb1,numb2,numb3,numb4,numb5;//case 5 variables
		int month;//case 6 variable
		int num3,num4,operation;//case 7 variable
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("1:Accept no anc check it is prime no or Not\r\n"
				+ "2:Accept no and find out the SUM OF DIGIT \r\n"
				+ "3:Accept a no from the user and  display the fibonacci series\r\n"
				+ "4:Accept no from user and check it is armstrong or not\r\n"
				+ "5: Accept 5 no and find out the greatest\r\n"
				+ "6:Accept a no from the user and display the month name\r\n"
				+ "7:Accept choice from user and create CALC");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
			{
			case 1: //case to Find Prime No
			{
			System.out.println("Enter Your no");
			prime=sc.nextInt();
			for(i=2;i<=prime;i++)
			{
				if(prime%i==0)
						{
						ch='y';
						}
			}
			if(ch=='y')
				{
				System.out.println("Its Not Prime Number");
				}
			else
				{
				System.out.println("Its a prime Number");
				}
			break;
			}
			case 2: //Case for Find the sum of number
			{
				System.out.println("Enter your three digit Number");
				num1=sc.nextInt();
				while(num1>0)
				{
					rem=num1%10;
					sum=sum+rem;
					num1=num1/10;
				}
				System.out.println("the Sum of digit is"+sum);
				break;
				}
			case 3: // case for fibonacci series
			{
				System.out.println("Enter the count");
				count=sc.nextInt();
				while(i1<=count)
					{
					sum5=ft+st;
					System.out.println(sum5);
					ft=st;
					st=sum5;
					i1++;
					}
				break;
			}
			case 4:// case for armstrong or not
			{
			System.out.println("Enter the Three digit Number");
			num2=sc.nextInt();
			t=num2;
			while(num2>0)
				{
				rem1=num2%10;
				sum1=sum1+(rem1*rem1*rem1);
				num2=num2/10;
				}
			
			if(t==sum1)
				{
				System.out.println("Its an amstrng Number");
				}
			else
				{
				System.out.println("Its not an amstrng Number");
				}
			break;
			}
			
			case 5:// case for greastest of five number
			{
				System.out.println("Enter the five numbers");
				numb1=sc.nextInt();
				numb2=sc.nextInt();
				numb3=sc.nextInt();
				numb4=sc.nextInt();
				numb5=sc.nextInt();
				if(numb1>numb2 && numb1>numb3 && numb1>numb4 && numb1>numb5)
					{
					System.out.println("Number one is greater");
					}
				else if(numb2>numb1 && numb2>numb3 && numb2>numb4 && numb2>numb5)
				{
				System.out.println("Number two is greater");
				}
				else if(numb3>numb1 && numb3>numb2 && numb3>numb4 && numb3>numb5)
				{
				System.out.println("Number three is greater");
				}
				else if(numb4>numb1 && numb4>numb2 && numb4>numb3 && numb4>5)
				{
				System.out.println("Number four is greater");
				}
				else if(numb5>numb1 && numb5>numb2 && numb5>numb3 && numb5>numb4)
				{
				System.out.println("Number four is greater");
				}
				else
				{
					System.out.println("Invalid Input");
				}
				break;
			}
			case 6://case for display the month name
				System.out.println("Enter the month");
				month=sc.nextInt();
				switch(month)
				{
					case 1:
					{
						System.out.println("January");
						break;
					}
					case 2:
					{
						System.out.println("February");
						break;
					}
					case 3:
					{
						System.out.println("March");
						break;
					}
					case 4:
					{
						System.out.println("April");
						break;
					}
					case 5:
					{
						System.out.println("May");
						break;
					}
					case 6:
					{
						System.out.println("June");
						break;
					}
					case 7:
					{
						System.out.println("July");
					}
					case 8:
					{
						System.out.println("August");
						break;
					}
					case 9:
					{
						System.out.println("September");
						break;
					}
					case 10:
					{
						System.out.println("October");
						break;
					}
					case 11:
					{
						System.out.println("November");
						break;
					}
					case 12:
					{
						System.out.println("December");
						break;
					}
				default:
					System.out.println("invalid month");
					break;
					}
				break;
				
			case 7://case for Accept choice from user and create CALC
				{
				System.out.println("Enter two Numbers");
				num3=sc.nextInt();
				num4=sc.nextInt();
				System.out.println("1:Addition\n"+"2:Substraction\n"+"3:Multiplication\n"+"4:Division");
				System.out.println("Enter Operation:");
				operation=sc.nextInt();
				switch(operation)
				{
					case 1:
						{
						System.out.println("The Addition is="+num3+num4);
						break;
						}
					case 2:
						{
							System.out.println("The substraction is="+(num3-num4));
							break;
						}
					case 3:
						{
						System.out.println("The Multiplication is="+num3*num4);
						break;
						}
					case 4:
						{
						System.out.println("The Division is="+num3/num4);
						break;
						}
					default:
						{
						System.out.println("invalid Choice");
						break;
						}
				}
				}
						
				default:
					{
					System.out.println("Invalid choice");
					break;
					}
				}
					System.out.println("Do you want to perform any other program Y/N");
					ans=sc.next().charAt(0);
		}while(ans=='Y'||ans=='y');
	}	
	}

	


