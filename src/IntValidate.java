import java.util.Scanner;

public class IntValidate
{
    public static void main (String[] args)
    {
        System.out.println("Please Put a Number");
        intVal();
    }

    public static void intVal()
    {
        boolean looping = true;
        int validate;

        while(looping)
        {
            Scanner scan = new Scanner(System.in);
            validate = scan.nextInt();

            if(validate <= 10)
            {
                System.out.println("Not Greater Than 10");
            }
            else
            {
                System.out.println("Greater Than 10!");
                looping = false;
            }
        }
    }
}