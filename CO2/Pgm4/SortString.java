import java.util.*;
class SortString{
	public static void main(String[] args){
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of word:");
		int n=s.nextInt();
		
		String word[] = new String[n];
		s.nextLine();
		for(i=0;i<n;i++){
			System.out.print("Enter a word: ");
			word[i]=s.nextLine();
		}
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				if(word[i].compareTo(word[j])>0){
					String temp=word[i];
					word[i]=word[j];
					word[j]=temp;
				}
			}
		}
		System.out.println("Sorted Strings using compareTo Function");
		System.out.println("Sorted array in ascending order  : "+Arrays.toString(word));
	}
}
