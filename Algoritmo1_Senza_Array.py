'''Algoritmo che Dato in InPut una Lista di Dimensione N (Max 100), Calcola: Numero di Elementi Pari e Dispari; Somma degli Elementi, degli Elementi Pari e Dispari; 
Media Aritmetica degli Elementi, degli Elementi Pari e Dispari; Valore Maggiore e Minore.'''
N=-1
while N<=0 or N>100:
	N=input("Dichiarare il Numero di Valori da Inserire: ")
	N=int(N)
CP=0
CD=0
SP=0
SD=0
Max=0
Min=0
print("Inserire il Primo Valore: ")
Valori=input(" \n ")
Valori=int(Valori)
S=Valori
Max=Valori
Min=Valori
if Valori %2 == 0:
		CP+=1
		SP+=Valori
else:
		CD+=1
		SD+=Valori
print("Inserire i Valori: ")
i=1
for i in range (N-1):
	Valori=input(" \n ")
	Valori=int(Valori)
	if Valori %2 == 0:
		CP+=1
		SP+=Valori
	else:
		CD+=1
		SD+=Valori
	if Valori > Max:
		Max=Valori
	if Valori < Min:
		Min=Valori
S=SD+SP        
print("\n\nNumero di Elementi Pari: ",CP)
print("\n\nLa Somma dei Valori Inseriti e': ",S)
Med=S/N
print("\n\nLa Media Aritmetica tra i Valori Inseriti e': ",Med)
print("\n\nLa Somma dei Valori Pari Inseriti e': ",SP)
MedP=SP/CP
print("\n\nLa Media Aritmetica tra i Valori Pari Inseriti e': ",MedP)
print("\n\nNumero di Elementi Dispari: ",CD)
print("\n\nLa Somma dei Valori Dispari Inseriti e': ",SD)
MedD=SD/CD
print("\n\nLa Media Aritmetica tra i Valori Dispari Inseriti e': ",MedD)
print("\n\nIl Valore Maggiore e': ",Max)
print("\n\nIl Valore Minore e': ",Min)
'''
Data:13-12-2018
Classe: 4^Finf.
Alunni: Bucchianico Enrico Ruggiero; De Rosa Raffaele; Truglio Andrea.
'''
