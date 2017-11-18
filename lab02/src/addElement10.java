
public class addElement10 {
	public static int[] addElement(int[] a) {
		for (int i = 0; i < a.length; i++){
			a[i] = a[i] + 10;
			
		}
		return a;
		}
	
	public static void printArr(int[] args){
		for (int i : args){
			System.out.print(i + ", ");
		}
	}

	public static void main(String[] args){
		int[] x = {3, 7, 10, 15, 33};
		int[] elements = addElement(x);
		printArr(elements);
		}
}

