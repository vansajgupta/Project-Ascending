import java.util.Scanner;

public class SortData {
	Scanner sc=new Scanner(System.in);
	int n;
	int arr[];
	
	void getData() {
		System.out.print("enter the no of array u want to arrange;-");
		n=sc.nextInt();
		arr= new int[n];
		System.out.println("enter the value   ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
			
		}
		 void putData() {
			 System.out.println("array element are   ");
			 for(int i=0;i<n;i++) {
				 System.out.println(arr[i]+  " ");
			 }
		
	}
		 
		 void asc() {
			 for(int i=0;i<n;i++) {
				 for(int j=i+1;j<n;j++) {
					 if(arr[i]>arr[j]) {
						int temp =arr[i];
						       arr[i]=arr[j];
						       arr[j]=temp;
						 
					 }
				 }
			 }
			 System.out.println("Ascending no are -  ");
			 for(int i=0;i<n;i++) {
				 System.out.println(arr[i]+  " ");
			 }
		 }
		 
		 void desc() {
			 for(int i=0;i<n;i++) {
				 for(int j=i+1;j<n;j++) {
					 if(arr[i]<arr[j]) {
						int temp =arr[i];
						       arr[i]=arr[j];
						       arr[j]=temp;
						 
					 }
				 }
			 }   
			  
			 System.out.println("Descending no are -  ");
			 for(int i=0;i<n;i++) {
				 System.out.println(arr[i]+" ");
			 }
		 }
		 
		 public static void main(String[] args) {
			SortData ob=new SortData();
			ob.getData();
			ob.putData();
			ob.asc();
			ob.desc();
		}

}
