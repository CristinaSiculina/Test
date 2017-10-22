package Test.lab02;

public class min {
	public static int minEl(int[] val){
		int minimum = Integer.MAX_VALUE;
		for(int i = 0; i < val.length; i++){
			if (minimum > val[i]){
				minimum = val[i];
			}
		}
		return minimum;
		
	}
	public static void main(String[] args){
		int[] elems = {5, 7, 1, 10};
		int minimum = minEl(elems);
		System.out.println(minimum);
	}

}
