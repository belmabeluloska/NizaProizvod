import java.util.Scanner;
public class ProizvodNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Presmetaj go i ispecati go proizvodot na clenovite vo nizata");

		System.out.print("Vcitaj broj na clenovi vo niza ");
		int n = input.nextInt();
		int niza[] = new int[n];
		System.out.println("Vcitaj clenovi vo niza:");
		for (int i = 0; i < niza.length; i++) {
		System.out.print(i + "-->");
		niza[i] = input.nextInt(); // Vcitaj niza[i] - i-ti clen na niza
		}
		double p=1;
		for(int i=0;i < niza.length;i++){
		p=p*niza[i];
		}
		System.out.println("p="+p);
	}

}
