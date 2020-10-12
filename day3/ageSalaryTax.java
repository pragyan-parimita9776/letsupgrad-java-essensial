import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class ageSalaryTax{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the name: ");
String name=scan.nextLine();
System.out.println("please enter the date of birth in YYYY-MM-DD:");
String dateofBirth=scan.nextLine();
LocalDate dob=LocalDate.parse(dateofBirth);
System.out.println("enter your monthly salary:");
float monthSalary=scan.nextFloat();
float annualSalary= monthSalary*12;
float tax;

System.out.println("your name is: "+name);
System.out.println("your annual salary is: "+annualSalary);
System.out.println("age is: "+getAge(dob));
if(annualSalary>=500000){
tax=annualSalary*20/100;
System.out.println("Tax is "+tax);
}
else if(annualSalary>=40000 && annualSalary<500000){
tax=annualSalary*15/100;
System.out.println("Tax is "+tax);
}
else if(annualSalary>=300000 && annualSalary<400000){
tax=annualSalary*10/100;
System.out.println("Tax is "+tax);
}
else if(annualSalary>=500000 && annualSalary<300000){
tax=annualSalary*5/100;
System.out.println("Tax is "+tax);
}
}
public static int getAge(LocalDate dob){
LocalDate currentDate = LocalDate.now();
return Period.between(dob,currentDate).getYears();
}
}