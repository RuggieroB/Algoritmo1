#include <stdio.h>
#include <stdlib.h>
#include <float.h>
#define L 100
/*Algoritmo che Dato in InPut un Array di Dimensione N (Max 100), Calcola: Numero di Elementi Pari e Dispari; Somma degli Elementi, degli Elementi Pari e Dispari; 
Media Aritmetica degli Elementi, degli Elementi Pari e Dispari; Valore Maggiore e Minore.*/
int main(void){
	int N,i,CP=0,CD=0,S=0,SP=0,SD=0,Max,Min;
	double Med,MedP,MedD;
	int V[L];
	do{
		printf("Dichiarare il Numero di Valori da Inserire: \t\t");
		scanf("%d",&N);
		printf("\n");
	}while(N<=0||N>100);
	printf("\nInserire i Valori: \n");
	for(i=0;i<N;i++){
				scanf("%d",&V[i]);
				if(V[i]%2==0){
						CP++;
						SP+=V[i];
				}else{
						CD++;
						SD+=V[i];}
				S+=V[i];
				printf("\n");}
	printf("\n\nNumero di Elementi Pari: \t\t%d",CP);
	printf("\n\nLa Somma dei Valori Inseriti e': \t\t%d",S);
	Med=(float)S/(float)N;
	printf("\n\nLa Media Aritmetica tra i Valori Inseriti e': \t\t%f",Med);
	printf("\n\nLa Somma dei Valori Pari Inseriti e': \t\t%d",SP);
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
return 0;}
/*Data:06-12-2018
Classe: 4^Finf.
Alunni: Bucchianico Enrico Ruggiero; De Rosa Raffaele.*/