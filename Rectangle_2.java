import java.util.Scanner;
public class Rectangle_2 {
    double x1, y1;
    Rectangle_2(double n1, double n2)
    {
        x1=n1;
        y1=n2;
    }

    double getArea()
    {
        double area;
        area=x1*y1;
        return area;
    }
    double getPerimeter()
    {
        double per;
        per=2*(x1+y1);
        return per;
    }
}

class exRectangle_2
{
    public static void main(String[] args)
    {
        double v1,v2;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the length and breadth of the rectangle");
            v1=sc.nextDouble();
            v2=sc.nextDouble();
            Rectangle r1 = new Rectangle(v1,v2);

            System.out.println("Area = " + r1.getArea()+"\n Peremeter = " + r1.getPerimeter());
        }
    }
    
}