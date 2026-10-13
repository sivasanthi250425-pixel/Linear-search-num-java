package userinut;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 int target=sc.nextInt();
		 boolean isfound=false;
		 int[] num= {1,3,5,6};
		 for(int i=0;i<num.length;i++) {
			 if(target==num[i]) {
		        System.out.println("index:"+i);
		        isfound=true;
		        break;
		 }
		 }
			 if(!isfound) {
				 System.out.println("not found");
			 }
		 
		 
	 }
}
