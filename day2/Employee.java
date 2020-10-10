public class Employee{
public String name,city;
public int age;
public void display(){
System.out.println("the name is "+name);
System.out.println("the name is "+city);
System.out.println("the age is "+age);
}

public static void main(String[] args){
Employee e1=new Employee();
e1.name="pragyan";
e1.city="khurdha";
e1.age=21;
e1.display();
Employee e2=new Employee();
e2.name="Biswa";
e2.city="kalahandi";
e2.age=23;
e2.display();
}
}
