class Icard
{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private String aadhar_no;

public void setCollege_name(String college_name){this.college_name=college_name;}
public void setCollege_address(String college_address){this.college_address=college_address;}
public void setay_start(int ay_start){this.ay_start=ay_start;}
public void setay_end(int ay_end){this.ay_end=ay_end;}
public void setid(int id){this.id=id;}
public void setstudent_name(String student_name){this.student_name=student_name;}
public void setcourse_name(String course_name){this.course_name=course_name;}
public void setaadhar_no(String aadhar_no){this.aadhar_no=aadhar_no;}

public String getCollege_name(){return college_name;}
public String getcollege_address(){return college_address;}
public int getay_start(){return ay_start;}
public int getay_end(){return ay_end;}
public int getid(){return id;}
public String getstudent_name(){return student_name;}
public String getcourse_name(){return course_name;}
public String getaadhar_no(){return aadhar_no;}
}
class BCA
{
public static void main(String args[])
{
Icard ob=new Icard();
ob.setCollege_name("mtiet");
ob.setCollege_address("plmnr");
ob.setay_start(2022);
ob.setay_end(2026);
ob.setid(69);
ob.setStudent_name("prasad");
ob.setCourse_name("ECE");
ob.setaadhar_no("697669699696969668696");

System.out.println(ob.getCollege_name());
System.out.println(ob.getCollege_address());
System.out.println("A.Y"+ob.getAy_start()+"-"+ob.getAy_end());
System.out.println("ID."+ob.getId());
System.out.println(ob.getStudent_name());
System.out.println(ob.getCourse_name());
System.out.println(ob.getaadhar_no());
}}








 








