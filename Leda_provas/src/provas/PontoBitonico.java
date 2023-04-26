package provas;

public class PontoBitonico {
	
	
	public static int PontoBit(int[]array, int left, int right) {
		int result = -1;
        if (left <= right) {
            int mid = (left + right) / 2;
            if (mid + 1 < array.length && array[mid + 1] > array[mid]) {
                result = PontoBit(array, mid + 1, right);
            } else if (mid - 1 >= 0 && array[mid - 1] > array[mid]) {
                result = PontoBit(array, left, mid - 1);
            } else {
                result = array[mid];
            }
        }
        return result;
    }
	
	
	public static void main(String[] args) {
		int[] n = new int[] {0, 1, 2,2,2, 1,0};
		System.out.println(PontoBit(n,0,n.length - 1));
	}

}
