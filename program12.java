class Employee{
int id;
String name;
void insertRecord(int i,String n){
id=i;
name=n;
}
void displayInformation(){System.out.println(id+" "+name);}
}

class TestEmployee4{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(69,"prasad");
e2.insertRecord(68,"praree");
e3.insertRecord(67,"jaysad");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}