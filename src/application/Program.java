package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os pontos de in�cio e t�rmina da casa");
		int i = sc.nextInt();
		int f = sc.nextInt();

		System.out.println("Digite as posi��es das �rvores");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("N�mero de ma��s e laranjas");
		int m = sc.nextInt();
		int n = sc.nextInt();

		System.out.println("Dist�ncias que cada ma�� caiu da �rvore");
		int[] dM = new int[m];
		for (int x = 0; x < m; x++) {
			dM[x] = sc.nextInt();
		}

		System.out.println("Dist�ncias que cada laranja caiu da �rvore");
		int[] dL = new int[n];
		for (int x = 0; x < n; x++) {
			dL[x] = sc.nextInt();

		}

		int sumM = 0;
		int sumN = 0;

		for (int x = 0; x < m; x++) {
			if (i <= (dM[x] + a) && (dM[x] +a)<= f) {
				sumM++;
			}
		}
		System.out.println("Ca�ram na casa de pedrinho: " + sumM + " ma��s");
		
		for (int x = 0; x < n; x++) {
			if (i <=(b+ dL[x]) && (b+dL[x]) <= f) {
				sumN++;
			}
		}
		System.out.println("Ca�ram na casa de pedrinho: " + sumN + " laranjas");

		sc.close();
	}

}
