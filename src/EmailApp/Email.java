package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength=10;
	private int mailBoxCapacity=10;
	private String email;
	private String companySuffix="company.com";	
	private String alternateEmail;
	
	
	//generate email syntax: firstname.lastname@department.company.com
	public Email() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first name: ");
		firstName=s.nextLine();
		System.out.print("Enter last name: ");
		lastName=s.nextLine();
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department();
		this.password=randomPassword(defaultPasswordLength);
		this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
		//System.out.println(email);
		}
	
	
	//get department sales or development or accounting or none DONE
	private String department(){
		System.out.println("Hi "+ firstName+".");
		System.out.println("DEPARTMENTS: \n1. Sales\n2. Development \n3. Accounting\n4. None ");
		Scanner scn=new Scanner(System.in);
		System.out.print("Choose your department: ");
		int dep=scn.nextInt();
		if(dep==1){return "Sales";}
		else if(dep==2){return "Development";}
		else if(dep==3){return "Accounting";}
		else {return "";}
	}	

	
	//generate random password 
	private String randomPassword(int j){
		//ran=this.defaultPasswordLength;
		String keyset="abcdefghijklmnopqrstuvwxyz1234567890.@#";
		char[] pass=new char[j];
		for(int i=0;i<j;i++){
			int k=(int) (Math.random()*keyset.length());
			pass[i]=keyset.charAt(k);}
		String str=new String(pass);
		return str;
	}
	
	
	//setters to change password, mailbox capacity and alternate email 
	public void setPassword(String password){this.password=password;}
	public void setMailBoxCapacity(int mailBoxCapacity){this.mailBoxCapacity=mailBoxCapacity;}
	public void setAlternateEmail(String alternateEmail){this.alternateEmail=alternateEmail;}
	
	
	//have get methods to display name, email, mailbox capacity 
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public int getMailBoxCapacity() {
		System.out.print("MAIL BOX CAPACITY:");
		return mailBoxCapacity;}
	public String getEmail() {return "EMAIL:" +email;}
	public String getPassword() {return "PASSWORD:" + password;}


}