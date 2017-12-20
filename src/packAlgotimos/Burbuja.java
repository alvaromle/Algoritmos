package packAlgotimos;

public class Burbuja {

	public static void burbuja(int[] A) {
		int i, j, aux;
		for (i = 0; i < A.length - 1; i++)
			for (j = 0; j < A.length - i - 1; j++)
				if (A[j + 1] < A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
	}
	
	public static void main(String[] args) {
		int[] matriz = {4,5,2,78,12,35,56,21,33,25,67,87,11,56,9,1};
		
		/* Matriz sin ordenar */
		for (int num : matriz)
			System.out.print(num + " ");
		
		System.out.println();
		
		burbuja(matriz);
		/* Matriz ordenada */
		for (int num : matriz)
			System.out.print(num + " ");
	}
}
