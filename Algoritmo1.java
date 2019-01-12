/*Algoritmo che Dato in InPut un Array di Dimensione N (Max 100), Calcola: Numero di Elementi Pari e Dispari; Somma degli Elementi, degli Elementi Pari e Dispari; 
Media Aritmetica degli Elementi, degli Elementi Pari e Dispari; Valore Maggiore e Minore.*/
import java.util.*;
class Algoritmo1 {
	public static void main(String[] args) {
		int N,i,CP=0,CD=0,S=0,SP=0,SD=0,Max,Min;
		double Med,MedP,MedD;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Dichiarare il Numero di Valori da Inserire:\t\t");
			N=input.nextInt();
		}while(N<=0||N>100);
		System.out.println("\n\nInserire i Valori:\n");
		int V[] = new int[N];
		for(i=0;i<N;i++){
					V[i]=input.nextInt();
					if(V[i]%2==0){
							CP++;
							SP+=V[i];
					}else{
							CD++;
							SD+=V[i];}
					S+=V[i];
					}
		System.out.println("\n\nNumero di Elementi Pari:\t\t"+CP);
		System.out.println("\n\nLa Somma dei Valori Inseriti e':\t\t"+S);
		Med=(float)S/(float)N;
		System.out.println("\n\nLa Media Aritmetica tra i Valori Inseriti e':\t\t"+Med);
		System.out.println("\n\nLa Somma dei Valori Pari Inseriti e':\t\t"+SP);
		MedP=(float)SP/(float)CP;
		System.out.println("\n\nLa Media Aritmetica tra i Valori Pari Inseriti e':\t\t"+MedP);
		System.out.println("\n\nNumero di Elementi Dispari:\t\t"+CD);
		System.out.println("\n\nLa Somma dei Valori Dispari Inseriti e':\t\t"+SD);
		MedD=(float)SD/(float)CD;
		System.out.println("\n\nLa Media Aritmetica tra i Valori Dispari Inseriti e':\t\t"+MedD);
		Max=V[0];
		Min=V[0];
		for(i=1;i<N;i++){
					if(V[i]>Max){
							Max=V[i];}
					if(V[i]<Min){
							Min=V[i];}}
		System.out.println("\n\nIl Valore Maggiore e'\t\t"+Max);
		System.out.println("\n\nIl Valore Minore e':\t\t"+Min);
	}
}
/*Data:12-01-2019
Classe: 4^Finf.
Alunni: Bucchianico Enrico Ruggiero; De Rosa Raffaele; Truglio Andrea.*/