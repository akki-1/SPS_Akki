package classes;

import java.util.*;
public class ALLArrayList extends Thread {
	//Sort,Shuffle,Reverse,Max Value

	public static void main(String[] args) throws InterruptedException {
		Scanner z=new Scanner(System.in);
		ArrayList<Integer> h=new ArrayList<>();
		h.add(23);
		h.add(5);
		h.add(85);
		h.add(66);
		h.add(2);
		h.add(52);
		h.add(6);
		System.out.println("This is ArrayList :");
			System.out.println(h);
		System.out.println("*********************************************************");
		while(true) {
			System.out.println("Enter\n1 for Iterate ArrayList\n2 for Reverse\n3 for Sort\n4 for Shuffle\n5 for Converting to Array\n6 getting max value of ArrayList\n7 for Exit");
			int d=z.nextInt();	//we can also handle IOException here
			if(d==1) {
				System.out.println("Iterating ArrayList :");
				for(Object list:h){
					System.out.println(list);
				}
			}
			if(d==3) {
				Collections.sort(h);
				System.out.print("Iterating ArrayList.");
				for(int i=0;i<5;i++) {
					Thread.sleep(450);
					System.out.print(".");
				}
				System.out.println();
				System.out.print("Now Sorting ");
				for(int i=0;i<5;i++) {
					Thread.sleep(450);
					System.out.print("> ");
				}
				Thread.sleep(450);
				System.out.println("Completed");
				Thread.sleep(450);
				for(Object list:h){
					System.out.println(list);
				}
				System.out.println("*********************************************************");
			}
			else if(d==4) {
				Collections.shuffle(h);
				System.out.print("Iterating ArrayList ");
				for(int i=0;i<5;i++) {
					Thread.sleep(450);
					System.out.print(".");
				}
				System.out.println();
				System.out.print("Now Shuffling");
				for(int i=0;i<5;i++) {
					Thread.sleep(400);
					System.out.print("> ");
					Thread.sleep(400);
					System.out.print("< ");
				}
				Thread.sleep(450);
				System.out.println("Completed");
				for(Object list:h){
					System.out.println(list);
				}
				System.out.println("*********************************************************");
			}
			else if(d==2) {
				System.out.println("Reversing ArrayList");
				for(int i=h.size()-1;i>=0;i--) {
					System.out.println(h.get(i));
				}
				System.out.println("*********************************************************");
			}
			else if(d==5) {
				System.out.println("Cpnverting to Array\n.");
				for(int i=0;i<5;i++) {
					Thread.sleep(450);
					System.out.println(".");
				}
				Thread.sleep(450);
				System.out.print("Completed,Your Array = ");
				int g[]=new int [h.size()];
				for(int i=0;i<h.size();i++) {
					g[i]=h.get(i);
					System.out.print(g[i]+" ");
				}
				System.out.println();
				System.out.println("*********************************************************");
			}
			else if(d==7) {
				System.out.println("*********************************************************");
				System.out.println("Thanks for using my programme.");
				System.out.println("*********************************************************");
				break;
			}
			else if(d==6) {
				System.out.println("Max value of given ArrayList is "+Collections.max(h));
				System.out.println("*********************************************************");
			}
			else {
				System.out.println("Invalid input,try again");
				System.out.println("*********************************************************");

			}

		}

		z.close();}

}
