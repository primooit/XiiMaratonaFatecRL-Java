package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os pontos de início e términa da casa");
		int i = sc.nextInt();
		int f = sc.nextInt();

		System.out.println("Digite as posições das árvores");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Número de maçãs e laranjas");
		int m = sc.nextInt();
		int n = sc.nextInt();

		System.out.println("Distâncias que cada maçã caiu da árvore");
		int[] dM = new int[m];
		for (int x = 0; x < m; x++) {
			dM[x] = sc.nextInt();
		}

		System.out.println("Distâncias que cada laranja caiu da árvore");
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
		System.out.println("Caíram na casa de pedrinho: " + sumM + " maçãs");
		
		for (int x = 0; x < n; x++) {
			if (i <=(b+ dL[x]) && (b+dL[x]) <= f) {
				sumN++;
			}
		}
		System.out.println("Caíram na casa de pedrinho: " + sumN + " laranjas");

		sc.close();
	}

}
