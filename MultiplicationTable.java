import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;

        System.out.print("How wide do we want the multiplication table? ");
        int width = sc.nextInt();
        System.out.print("How high do we want the multiplication table? ");
        int length = sc.nextInt();
        
        System.out.printf("%5s", "x|");
        for (i = 0; i < width; i++) 
            System.out.printf("%5s", i+1); //+1
        System.out.println(); 
        for(i = 0; i < width+1; i++)
            System.out.printf("-----");
        System.out.println();

            for(i = 0; i < length; i++)
            {
                System.out.printf("%5s", (i+1) + "|");
                for (j=0; j<width; j++)
                {
                    System.out.printf("%5s", (i+1)*(j+1));
                }
                System.out.println();//Go to the next line
        }
    }
}
