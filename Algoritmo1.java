package Algoritmo1;
/*Algoritmo che Dato in InPut un Array di Dimensione N (Max 100), Calcola: Numero di Elementi Pari e Dispari; Somma degli Elementi, degli Elementi Pari e Dispari; 
Media Aritmetica degli Elementi, degli Elementi Pari e Dispari; Valore Maggiore e Minore.*/
import java.util.*;
public class Agloritmo1 {
	public static void main(String[] args) {
		int N,i,CP=0,CD=0,S=0,SP=0,SD=0,Max,Min;
		double Med,MedP,MedD;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Dichiarare il Numero di Valori da Inserire:  \t\t  ");
			N=input.nextInt();
			System.out.prinln(" \n ");
		}while(N<=0||N>100);
		System.out.println("\nInserire i Valori: \n");
		int V[] = new int[N];
		for(i=0;i<N;i++){
					System.out.println("%d",&V[i]);
					if(V[i]%2==0){
							CP++;
							SP+=V[i];
					}else{
							CD++;
							SD+=V[i];}
					S+=V[i];
					System.out.println("\n");}
		System.out.println("\n\nNumero di Elementi Pari: \t\t%d",CP);
		System.out.println("\n\nLa Somma dei Valori Inseriti e': \t\t%d",S);
		Med=(float)S/(float)N;
		System.out.println("\n\nLa Media Aritmetica tra i Valori Inseriti e': \t\t%f",Med);
		System.out.println("\n\nLa Somma dei Valori Pari Inseriti e': \t\t%d",SP);
		MedP=(float)SP/(float)CP;
		printf("\n\nLa Media Aritmetica tra i Valori Pari Inseriti e': \t\t%f",MedP);
		printf("\n\nNumero di Elementi Dispari: \t\t%d",CD);
		printf("\n\nLa Somma dei Valori Dispari Inseriti e': \t\t%d",SD);
		MedD=(float)SD/(float)CD;
		printf("\n\nLa Media Aritmetica tra i Valori Dispari Inseriti e': \t\t%f",MedD);
		Max=V[0];
		Min=V[0];
		for(i=1;i<N;i++){
					if(V[i]>Max){
							Max=V[i];}
					if(V[i]<Min){
							Min=V[i];}}
		printf("\n\nIl Valore Maggiore e': \t\t%d",Max);
		printf("\n\nIl Valore Minore e': \t\t%d",Min);
		printf("\n");
	}
}
/*Data:06-12-2018
Classe: 4^Finf.
Alunni: Bucchianico Enrico Ruggiero; De Rosa Raffaele; Truglio Andrea.*/