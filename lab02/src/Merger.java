
public class Merger {

	public static void main(String[] args) {
		int[] b1 = {10, 30, 50};
		int[] b2 = {0, 15,31,55};
		int[] b = merge(b1, b2);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	public static int[] merge(int[] a1, int[] a2) {
		int i1 = 0;
		int i2 = 0;
		int i = 0;
		int[] a = new int[a1.length + a2.length];
		for (/*i = 0*/; i < a.length; i++) {
			if (i1 == a1.length){
				a[i] = a2[i2++];
				//i2 = i2 + 1;
			} else if (i2 == a2.length){
				a[i] = a1[i1++];
				//i1 = i1 + 1;
			} else if (a1[i1] < a2[i2]) {
				a[i] = a1[i1++];
				//i1 = i1 + 1; //i1 = i1++
			} else /*if (a1[i1] > a2[i2])*/ {
				a[i] = a2[i2++];
				//i2 = i2 + 1;
			}
		}
		return a;
	}
}

class test{
	private static void testMerger() {
		int[] b1 = {10, 30, 50};
		int[] b2 = {0, 15,31,55};
		Merger.merge(b1, b2); //Merger -numele clase si apoi merge methoda
	}
}