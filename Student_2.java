// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.



public class Student_2 
{
    String name;
    int roll_no;
    
    Student_2(String name, int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }
    
    void display()
    {
        System.out.println("\nName: " + name + "\nRoll No: " + roll_no);
    }
}

class exStudent_2
{
    public static void main(String[] args)
    {
        Student_2 st = new Student_2("John", 2);
        st.display();
    }
}
