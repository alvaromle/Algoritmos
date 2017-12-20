package packAlgotimos;

public class MergeSort {

	public static void mergesort(int A[], int izq, int der) {
		if (izq < der) {
			int m = (izq + der) / 2;
			mergesort(A, izq, m);
			mergesort(A, m + 1, der);
			merge(A, izq, m, der);
		}
	}

	public static void merge(int A[], int izq, int m, int der) {
		int i, j, k;
		int[] B = new int[A.length]; // array auxiliar
		for (i = izq; i <= der; i++) // copia ambas mitades en el array auxiliar
			B[i] = A[i];

		i = izq;
		j = m + 1;
		k = izq;
		while (i <= m && j <= der) // copia el siguiente elemento más grande
			if (B[i] <= B[j])
				A[k++] = B[i++];
			else
				A[k++] = B[j++];
		while (i <= m) // copia los elementos que quedan de la
			A[k++] = B[i++]; // primera mitad (si los hay)
	}
	
	public static void main(String[] args) {
		int[] matriz = {90,85,23,45,56,12,78,92,22,1,46,79};
		int izq = 0;
		int der = 11;
		
		/* Matriz sin ordenar */
		for (int num : matriz)
			System.out.print(num + " ");
		
		System.out.println();
		mergesort(matriz, izq, der);
		/* Matriz ordenada */
		for (int num : matriz)
			System.out.print(num + " ");
	}
}
