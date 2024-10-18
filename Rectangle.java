public class Rectangle {
    double x1, y1;
    Rectangle(double n1, double n2)
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

class exRectangle
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);

        System.out.println("Area = " + r1.getArea()+"\n Peremeter = " + r1.getPerimeter());
        System.out.println("Area = " + r2.getArea()+"\n Peremeter = " + r2.getPerimeter());
    }
    
}