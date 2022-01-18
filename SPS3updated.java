package myOwnPractice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class SPS3updated {
	static String l;
	SPS3updated(){
		System.out.println("$********************************$");
		System.out.println("$******This is Akki's Game*******$");
		System.out.println("$********************************$");
	}
	SPS3updated(int a){
		System.out.println("Thanks for Playing Again");
	}
	static int st;
	static String s1;
	static void m2() {
		SPS3updated h=new SPS3updated();
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		while(true) {
			while(true) {
				System.out.println("Select Your Choice\n0 for Stone\n1 for Scissor\n2 for Paper");
				try {st=sc.nextInt();}
				catch(InputMismatchException e) {
					System.out.println("invalid input,please run the program again");
					System.exit(st);
				}
				if(st==0) {
					System.out.println("u selected >>>Stone<<<");break;
				}else if(st==1) {
					System.out.println("u selected >>>Scissor<<<");break;
				}else if(st==2) {
					System.out.println("u selected >>>Paper<<<");break;
				}
				else {
					System.out.println("Invalid input,try again");
				}
			} 
			System.out.println("Now computer's turn");
			int a=ra.nextInt(3);
			if(a==0) 	   {
				System.out.println("Computer selected >>>Stone<<<\n");
			}else if(a==1) {
				System.out.println("Computer  selected >>>Scissor<<<\n");
			}else if(a==2) {
				System.out.println("Computer  selected >>>Paper<<<\n");
			}
			if(st==a){
				System.out.println("$$$$$$<>  Its DRAW  <>$$$$$$\n");
			}else if(st==0&&a==2||st==1&a==0||st==2&&a==1) {
				System.out.println("$$$$$$<>  Computer Wins  <>$$$$$$\n");
			}else {
				System.out.println("$$$$$$<>  You Wins  <>$$$$$$\n");
			}
			System.out.println("**********************************");
			while(true) {
				System.out.println("wanna try again??(Y/N)");
				s1=sc.next();
				if(s1.equalsIgnoreCase("n")) {System.out.println("Thanks for playing");break;}
				else if(s1.equalsIgnoreCase("y")) {m2();}
				else {
					System.out.println("Invalid input,please try again");}
			}
			break;
				}
			}
	public static void main(String[] args) {
		m2();
		}
		}
