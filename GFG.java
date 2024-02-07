import java.util.Arrays;
import java.util.List;

class GFG{
	public static void main(String[] args)
	{
		List<Character> str=Arrays.asList('G','o','o','d');
		System.out.println("List-"+str);
		StringBuilder sb = new StringBuilder();
		for(Character ch:str)
	{
		sb.append(ch);
	}
	String string =sb.toString();
	System.out.println("String-"+string);	
}
}