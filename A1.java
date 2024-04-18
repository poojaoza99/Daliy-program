
class A1
{
	public static void main(String[] args)
	{
		int n = 7;
		char currentChar = 'A';
		for(int i = 1; i <= n; i++)
		{
		for(int j =1; j <= n - i; j++)
		{
		System.out.print(" ");
		}
		System.out.print(currentChar);
		for(int j = 1; j <= 2 * i - 2; j++)
		{
			System.out.print(i == 1 ? "" : "-");
		}
		if(i > 1)
		{
			System.out.print(currentChar);
		}
		System.out.println();
		currentChar++;
		}
	}
}	