package Test.lab02;

public class avg {
	public static float average(int[] num){
		int sum = 0;
		for(int i = 0; i < num.length; i++){
		sum += num[i];
		}
		float averageNum1 = sum / num.length;
		return averageNum1;
		}
	
public static void main(String[] args){
	int[] elems = {3, 7, 10, 1};
	float sum = average(elems);
	System.out.println(sum);
}
}