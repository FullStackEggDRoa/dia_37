Algoritmo sin_titulo
////	Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
////	tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////Por ejemplo:
////	2 7 6
////	9 5 1
////	4 3 8
////	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
////	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
////			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
////			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
	////			matriz que no debe superar orden igual a 10.
	Definir matriz, i, j, x, n como entero
	Escribir "Ingrese tamaño de la matriz"
	Leer n
	Si n>=1 Y n<=9 Entonces
	Dimension matriz(n,n)
	FinSi
	x=0
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta n-1 Hacer
				Escribir "Ingrese valor"
				Leer x
				Si x>=1 Y x<=9 Entonces
					matriz(i,j)=x
				FinSi
		FinPara
	FinPara
	
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta n-1 Hacer
			Escribir sin saltar matriz(i,j),"/"
		FinPara
		Escribir ""
	FinPara

FinAlgoritmo
