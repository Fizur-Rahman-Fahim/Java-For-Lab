import java.util.*;
public class Average 
{
    int num1,num2,num3;
    Average(int n1,int n2,int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    int avg()
    {
        return (num1 + num2 + num3)/3;
    }
}

class exAverage
{
    public static void main(String[] args) 
    {
        int num1,num2,num3;
        System.out.print("Enter 3 numbers: ");
        try(Scanner sc = new Scanner(System.in))
        {
            num1 = sc.nextInt();        
            num2 = sc.nextInt();        
            num3 = sc.nextInt();        
        }
        Average av = new Average(num1,num2,num3);

        System.out.println( "Average is -> "+av.avg());
    
    }
    

}
