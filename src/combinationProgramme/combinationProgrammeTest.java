package combinationProgramme;

import java.util.Scanner;

public class combinationProgrammeTest {

	public static void main(String[] args) {
		
		int n, r;
		int carpim1 = 1;
		int carpim2 = 1;
		int carpim3 = 1;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kümenin eleman sayısını giriniz: " );
		n = input.nextInt();
		
		System.out.print("Oluşturmak isterdiğiniz alt kümenin eleman sayısını giriniz:  ");
		r = input.nextInt();
		
		for (int i =1; i <= n; i++) {
			carpim1 *= i ;
			}
		
		for (int i = 1; i <= r; i++) {
			carpim2 *= i ;
		}
		
		for (int i = 1; i <= (n - r); i++) {
			carpim3 *= i;
			
		}
		System.out.println( n + " elemanlı bir kümenin " + r + "elemanlı alt kümelerinin sayısı: " + carpim1 /(carpim2 * carpim3));
		
				
		

	}

}
