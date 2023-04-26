package provas;

public class BuscaBinaria {
	
	
	public static int BuscaBin(int[] numbers, int n, int left , int right) {
		int result = -1;
		if (right >= left) {
		int middle = (left + right)/2;
		if (middle != 0 && numbers[middle - 1]== n)return middle - 1;
		else if (numbers[middle] == n) return middle;
		else if(numbers[middle] > n) result = BuscaBin(numbers,n,left,middle-1);
		else result = BuscaBin(numbers,n,middle +1, right);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] n = new int[] {0, 0, 1 , 40};
		System.out.println(BuscaBin(n,0,0,3));
	}

}
