
public class PesquisaBinaria {

	int[] vetor;

	/**
	 * Solução do exercício...
	 * 
	 * @param vet
	 * @param valor
	 * @return
	 */
	public int pesqDireta(int[] vet, int valor) {
		int res = -1;
		vetor = vet;
		for (int i = 0; (i < vet.length) && (vet[i] != valor); i++) {
			if (i < vet.length) {
				res = i;
			}
		}
		return res;
	}

	/**
	 * Solução Miguel...
	 * 
	 * @param vet
	 * @param valor
	 * @return
	 */
	public int pesqDireta2(int[] vet, int valor) {
		int res = -1;
		vetor = vet;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == valor) {
				res = i + 1;
			}
		}
		return res;
	}

	/**
	 * 
	 * @param v
	 * @param value
	 * @return
	 */
	public int binarySearch(int[] v, int value) {
		int low = 0;
		int high = v.length - 1;
		int p = low + ((high - low) / 2);

		while (low <= high) {
			if (v[p] > value)
				high = p - 1;
			else if (v[p] < value)
				low = p + 1;
			else
				return p;
			p = low + ((high - low) / 2);
		}
		return -1;
	}

	
	/**
	 * Melhor implementação...
	 * @param array
	 * @param valor
	 * @return
	 */
	public int buscaBinaria(int[] array, int valor) {
		int inicio = 0;
		int fim = array.length - 1;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			System.out.println("posição meio do array ="+meio);
			System.out.println("valor do meio do array="+array[meio]);
			
			if (array[meio] == valor) {
				return meio;
			}

			if (valor > array[meio]) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return -1;
	}

	/**
	 * ToString refeito...
	 */
	public String toString() {
		String str = "";
		for (int i : vetor) {
			str = str + i + " ";
		}
		return str;
	}
}
