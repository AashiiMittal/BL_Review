import java. util.Scanner;
public class Sum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows in arrays: ");
	int n = sc.nextInt();
	System.out.println("Enter number of columns in arrays: ");
	int m = sc.nextInt();
	int[][] arr1 = new int[n][m]; 
	int[][] arr2 = new int[n][m];
	System.out.println("Enter elements in array1: ");
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
			arr1[i][j]= sc.nextInt();
		}
	}
	System.out.println("Enter elements in array2: ");
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
			arr2[i][j]= sc.nextInt();
		}
	}
	int sum=0;
	int[][] result = new int[n][m];
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
			result[i][j]= arr1[i][j] +arr2[i][j];
			
		}
	}
	System.out.println("Resulting array after addition: ");
	for(int i=0; i<n;i++){
		for(int j=0;j<m;j++){
			System.out.print(result[i][j] + " "	);
			sum+=result[i][j];
		}
		System.out.println("");
	}
	System.out.println("The sum of all elements of result array is :" + sum);
	}
}	