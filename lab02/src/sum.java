package Test.lab02;

public class sum {
	public static int sumEl(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
		
	}
	
	public static void main(String[] args){
		int[] elems = {3, 5, 10, 15};
		int sum = sumEl(elems);
		System.out.println(sum);
	}
}
