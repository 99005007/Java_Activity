package ltts.com;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Employee e=new Employee();
		System.out.println("Enter the name:");
		e.setName(sc.next());
		System.out.println("Enter the Address:");
		e.setAddress(sc.next());
		System.out.println("Enter Mobile:");
		e.setMobile(sc.next());
		System.out.println("Employee Details");
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Mobile: "+e.getMobile());
		while(true) {
			System.out.println("verify and update the details:");
			System.out.println("Menu");
			System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4.All");
			int a=sc.nextInt();
			
			if(a==1) {
				System.out.println("Current name is: "+e.getName());
				System.out.println("Enter the name");
				e.setName(sc.next());
				
			}
			else if(a==2) {
				System.out.println("Current Address is: "+e.getAddress());
				System.out.println("Enter the name");
				e.setAddress(sc.next());
				
			}
			else if(a==3) {
				System.out.println("Current Mobile number is: "+e.getMobile());
				System.out.println("Enter the name");
				e.setMobile(sc.next());
				
			}
			else if(a==4) {
				System.out.println("The details are:");
				System.out.println("Name: "+e.getName());
				System.out.println("Address: "+e.getAddress());
				System.out.println("Mobile: "+e.getMobile());
				break;
				
				
			}
			
		}
		
		
		
	    
	}

}
