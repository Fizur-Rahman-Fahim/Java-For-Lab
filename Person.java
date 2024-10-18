// Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class.
// Set their attributes using the constructor.
// And print their name and age.



public class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("\nName: " + name + "\nAge: " + age);
    }
}

class exPerson
{
    public static void main(String[] args)
    {
        Person p = new Person("Fahim", 25);
        Person p2 = new Person("Kafi", 25);

        p.display();
        p2.display();
    }
}
