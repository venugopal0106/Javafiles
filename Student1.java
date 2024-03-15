//Java Program to illustrate how to define a class and fields 
 //Defining a Student class. 
 import java.util.Scanner;
 class Student1{ 
 //defining fields 
 usn;
 String name; 
 String branch;
 String pnum;

 //creating main method inside the Student class 
 public static void main(String args[]){ 
 //Creating an object or instance 
 Student s1=new Student();
Student s2=new Student();
 Student s3=new Student();
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the details of three students : usno.,Name, Branch and phone number");
 s1.usn=sc.nextInt();
s1.name=sc.nextLine();
s1.branch=sc.nextLine();
s1.pnum=sc.nextLine();

 s2.usn=sc.nextInt();
s2.name=sc.nextLine();
s2.branch=sc.nextLine();
s2.pnum=sc.nextLine();

 s2.usn=sc.nextInt();
s2.name=sc.nextLine();
s2.branch=sc.nextLine();
s2.pnum=sc.nextLine();

 s3.usn=sc.nextInt();
s3.name=sc.nextLine();
s3.branch=sc.nextLine();
s3.pnum=sc.nextLine();
System.out.println("three student details are as follows:");
 System.out.println(s1.usn);//accessing member through reference variable 
 System.out.println(s1.name); 
 System.out.println(s1.branch);
 System.out.println(s1.pnum);
 System.out.println(s2.usn);//accessing member through reference variable 
 System.out.println(s2.name); 
 System.out.println(s2.branch);
 System.out.println(s2.pnum);
 System.out.println(s3.usn);//accessing member through reference variable 
 System.out.println(s3.name); 
 System.out.println(s3.branch);
 System.out.println(s3.pnum);

 } 
}