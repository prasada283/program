class Student{
private String name;
public void setName(String name){this.name=name;}
public String getName(){return name;}
}
class BCA{
public static void main(String args[])
{
Student ob=new Student();
ob.setName("prasad");
System.out.println("Name:"+ob.getName());
}}