/*Set 1
1. 
    1
   212
  32123
 4321234
  32123
   212
    1
*/
public class  DiamondPattern {

  public static void main(String[] args) {
    for (int i = 0; i <= n; i++)
        {
            int n = 1;
 
            for (int j = 0; j <= n - i; j++)
            {
                System.out.print("*");
            }
            for (int k = i; k <= 1; k++)
            {
              System.out.print("*");
            }
            for (int l = 2; l <= i; l++)
            {
              System.out.print("*");
            }
 
            System.out.println();
        }
 
        for (int i = 3; i >= 1; i--)
        {
            int n = 3;
 
            for (int j = 0; j <= n - i; j++)
            {
              System.out.print("*");
            }
            for (int k = i; k >= 1; k--)
            {
              System.out.print("*");
            }
            for (int l = 2; l <= i; l++)
            {
              System.out.print("*");
            }
 
            System.out.println();
        }
   
  }
}