public class InsertionSort {
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 4, 8, 6, 9, 2};
        insertionSort(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i] + " ");
		}
    }
}
