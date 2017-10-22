public class Rotation{
	private static void rotateRight(int[] a, int pos){
		if (a == null || a.length <= 1)
			return;
		int N = a.length;
		pos = pos % N;
		//pasul 1 cream tmp si aducem elementelea 
		int[] tmp = new int[pos];
		for (int i = 0; i < pos; i++) {
			tmp[i] = a[N - pos + i];
		}
		//pasul 2 mutam N-pos, doua pozitii din fata in spate
		for (int i = 0; i < N - pos; i++){
			a[i + pos] = a[i];
		}
		//pasul 3 mutam tmp de 3 elemente in stanga
		for (int i = 0; i < pos; i++) {
			a[i] = tmp[i];
		}
	}
	
	private static void display(int[] x){
		for (int e : x){
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] y = {5, 30, 10, 4, 7};
		display(y);
		rotateRight(y, 3);
		display(y);
	}
}