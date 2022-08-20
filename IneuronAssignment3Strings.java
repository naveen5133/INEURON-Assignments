package in.ineuron.main;

import java.util.Scanner;

/*1. WAP to reverse a String.
Input: “iNeuron”
Output: “norueNi”*/

/*public class IneuronAssignment3Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next(); //output:norueNi
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
        System.out.println(s2);*/
		
		/*String s1="Think Twice";
		String s2="";
		
		String s3[]=s1.split(" ");
		for(int i=s3.length-1;i>=0;i--) {
			s2=s2+s3[i]+" ";
		}
		System.out.println(s2);*/

//************************************************************************************

//WAP to check if the String is Anagram or not.
/*public class IneuronAssignment3Strings {

     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str1="naveen";
		String str2="avenne";
		
		str a= new str();
		
		String str3=a.Strtochar(str1);
		String str4=a.Strtochar(str2);
		
		if(str3.equals(str4)) {
			System.out.println("it is Anagram");
		}
		else {
			System.out.println("It is not Anagram");
		}
		
	}
}
			

class str{
	
	public String Strtochar(String str1) {
		
		char c[]=str1.toCharArray();
		
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(c[i]>c[j]) {
					char temp= c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		String str = String.valueOf(c);
		
		str = new String(c);

		return str;
	}
}*/

//************************************************************************************

//WAP to sort a String Alphabetically.
/*public class IneuronAssignment3Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String a="asjjdhfbvncioieurythdbnweeldfd";
		char c[] = a.toCharArray();
		
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				if(c[i]>c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(c);
				
	}
}*/

//********************************************************************************

//WAP to count the number of Vowels and Consonants of a String value.
/*public class IneuronAssignment3Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int vowels=0;
		int consonants=0;
		String s1="Animals";
		
		String s2=s1.toLowerCase();
		
		char c[] = s2.toCharArray();
		
		for(int i=0;i<s2.length();i++) {
			if(c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u') {
				vowels++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("The no vowels is " + vowels + " and no of consonants is " +consonants);
			
	}
}*/

//********************************************************************************

//WAP to count number of special characters.
/*public class IneuronAssignment3Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int Specialchar=0;
		
		String s1 ="@#4%4#kk#hh892u0-40..,/";
		
		char c[] = s1.toCharArray();
		
		for(char i=0;i<s1.length();i++) {
			if(c[i]>=33 && c[i]<=47 || c[i]>=58 && c[i] <=64 || c[i]>=91 &&c[i]<=96 || c[i]>=123 && c[i]<=126  ) {
				Specialchar++;
			}
		}
		System.out.println(Specialchar);
				
	}
}*/

//****************************************************************************

//WAP to print repeatedly occurring characters in the given String.

public class IneuronAssignment3Strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str="naveennnee";
		
		
		char c[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			
			if(count>1) {
				System.out.println(c[i]);
			}
		}
	}
}
