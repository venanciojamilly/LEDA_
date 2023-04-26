package provas;

import java.util.Arrays;

public class selection {
	
	
	public static void sort(int[] array,int left, int right) {
		if (array != null && right > left && left >=0 && right < array.length) {
			int i_minimo = left;
			for(int i = left + 1;i < array.length; i++) {
				if(array[i] > array[i_minimo]) {
					i_minimo = i;
				}swap(array,i_minimo,i);
			} sort(array,left + 1, right);
		}
	}
	public static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 0, 1, 9, 7, 1, 2, 3, 4 };
		sort(array,0,array.length - 1);
		System.out.println(Arrays.toString(array));


	}

}
