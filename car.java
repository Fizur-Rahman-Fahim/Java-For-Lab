class car {
    public
    String brand;
    String colour;
    String model;

    void display()
    {
        System.out.println("model: " +model);
        System.out.println("Brend: " + colour);
    }

}

class Examplecar
{
    public static void main(String[] args)
    {
        car c = new car();
        c.colour = "Blue";
        c.brand = "BMW";
        c.model = "X5";
        c.display();
    }
}
