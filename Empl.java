class Employee{
    int salary;
    int id;
    int age;
    int role;
    void work(){
        System.out.println("Employee is working");
    }
void displayInfo(){
    System.out.println("Salary:"+salary);;
    System.out.println("id:"+id);
    System.out.println("age:"+age);
    System.out.println("role:"+role);
}
}
class Manager extends Employee{
    void manage(){
        System.out.println("Manager is managing");
    }
}
public class Empl {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();    
        m.manage();  
        m.salary=67000;
        m.id=124;
        m.age=45;
        m.role=1;
        m.displayInfo();
    }
}