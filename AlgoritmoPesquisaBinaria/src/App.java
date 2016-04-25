
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43, 35 };
		int[] saida;
		
		String str="";

		saida = new int[inputArr.length];

		PesquisaBinaria pes = new PesquisaBinaria();

		// // System.out.println(pes.pesqDireta(inputArr, 77));
		// System.out.println(pes.binarySearch(inputArr, 77));
		// System.out.println(pes.toString());
		//

		saida = bubble_sort_v2(inputArr);

		System.out.println("length do inputArr: " + inputArr.length);
		System.out.println("length do saida   : " + saida.length);

		for (int i = 0; i < saida.length; i++) {
			str = str + saida[i]+" ";
			//System.out.println(saida[i]);
		}	
		System.out.println(str);

		
		int num=77;
		System.out.println("Pesquisar por   : "+num);
		System.out.println("Pesquisa binária: "+pes.pesqDireta(inputArr, num));
		System.out.println("Pesquisa binária: "+pes.buscaBinaria(inputArr, num));

	}

	public static int[] bubble_sort_v2(int[] vet) {

		// mostra o vetor original...
		int aux = 0;
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}

		return vet;
	}

}
