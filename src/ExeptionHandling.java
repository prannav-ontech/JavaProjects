class Employees
{
    String name;
    int id;
    int age ;

     void Employee()
    {
        System.out.println("Welcome to Employee class...");
    }

    public void insert(String name, int id, int age )
    {
        try{
        this.name=name;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

       try{ this.id=id;}
       catch(Exception e) {
           System.out.println("Employee already exists");
       }
        this.age=age;
    }

}




public class ExeptionHandling {
    public static void main(String[] args) {

        Employees emp=new Employees();
        emp.insert("John",1234,30);
    }
}
