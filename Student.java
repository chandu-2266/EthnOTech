class Student
{
    private int id;
    public void setId(int id)
    {
        this.id = id;
        
    }
    public int getId()
    {
        return id;
    }
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.setId(101);
        System.out.println("Student id is: " + s1.getId()); 
    }
}