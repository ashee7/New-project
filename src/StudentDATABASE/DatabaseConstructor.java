package StudentDATABASE;

import java.util.Scanner;

public class DatabaseConstructor {
	private String firstName;
	private String lastName;
	private int idsuffix=1000;
	private String ID;
	private String courses;
	private int courseFee=600;
	private int noOfCourse=0;
	private int tuitionFee=0;
	private int payFees;

	public DatabaseConstructor(){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstName=scn.nextLine();
		System.out.print("Enter last name: ");
		this.lastName=scn.nextLine();
		this.ID=id();
		this.courses=courses();
		this.tuitionFee=tuitionFee();
	}
	
	private int gradeLevel(){
		//returns grade year
		Scanner s=new Scanner(System.in);
		System.out.println("Grade Year:\n1. First Year\n2. Second Year \n3. Third Year \n4. Fourth Year");
		System.out.print("Enter your Grade year:");
		int gradYear=s.nextInt();
		return gradYear;
	}
	
	private String id(){
		//returns Student ID
		idsuffix++;
		ID=Integer.toString(gradeLevel())+idsuffix;
		return ID;		
	}
	
	private String courses(){
		Scanner s=new Scanner(System.in);
		String course="";
		System.out.println("Courses:\n 1. Mathematics 101 \n 2. History 101\n 3. English 101\n 4. Chemistry 101 \n 5. Computer Science 101");
		
		do{
			System.out.print("Enter your course(0 to quit)");
			int k=s.nextInt();
			if(k!=0){
				switch(k){
					case 1: {
						course= course + " Mathematics 101 \n";
						noOfCourse+=1;
						break;}
					case 2: {
						course=course + " History 101 \n";
						noOfCourse+=1;
						break;}
					case 3: {
						course=course + " English 101 \n";
						noOfCourse+=1;
						break;}
					case 4: {
						course=course + " Chemistry 101 \n";
						noOfCourse+=1;
						break;}
					case 5: {
						course=course + " Computer Science 101 \n";
						noOfCourse+=1;
						break;}
					//case 0: break;
					default:{
						System.out.println("Enter valid Number");
						break;}
				}
			}
			else break;
		}while(1!=0);
		
		return course;
	}
	
	private int tuitionFee(){
		//returns tuitionFee
		return this.noOfCourse*600;
	}
	
	public void payFees(){
		Scanner s=new Scanner(System.in);
		System.out.println("Tuition Fee: $"+tuitionFee);
		System.out.print("Enter fees to pay: $");
		this.payFees=s.nextInt();
		tuitionFee=tuitionFee-payFees;

		}
	public void balance(){
		System.out.println("Tuition Fee: $"+tuitionFee);
	}
	
	public void showInfo(){
		System.out.println("NAME: " + firstName+ lastName);
		System.out.println("STUDENT ID: "+ID);
		System.out.print("COURSES: \n" + courses);
		System.out.println("Tuition Fee: $"+tuitionFee);
	}
	//get grad level DONE
	//each student should have unique ID first no. is their grad level DONE
	//student can enroll in courses: history 101,mathematics, english, chemistry, computer science DONE
	//each course is $600 DONE
	//methods to view balance and pay tuition fee DONE
	// method of showInfo  with name, ID, courses and balance DONE
}
