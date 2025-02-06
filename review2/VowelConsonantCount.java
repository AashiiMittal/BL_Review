import java.util.*;
public class VowelConsonantCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.next();
		int vowelCount = 0;
		int consonantCount = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' ||ch== 'u'){
				vowelCount++;
			}else{
				consonantCount++;
			}
		}
		System.out.println("Total number of vowels in the string " + str + "is: " + vowelCount);
		System.out.println("Total number of consonants in the string " + str + "is: " + consonantCount);
	}
}