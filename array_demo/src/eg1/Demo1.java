package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		int ar[]= {12,2,3,45,6,6,6};
		System.out.println("With for loop");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("\nWith for-each loop");
		for(int x:ar) {
			System.out.print(x+" ");
		}
		
		int ar1[]=new int[10];
		ar1[0]=99;
		ar1[1]=100;
		ar1[2]=77;
		ar1[3]=11;
		System.out.println("\nprinting ar1 With for-each loop");
		for(int x:ar1) {
			System.out.print(x+" ");
		}	
		
		int newele=0;
		int pos=4;
		int n=4;
		for(int i=n; i>=pos ; i--) {
			ar1[i]=ar1[i-1];
		}
		
		ar1[pos-1]=newele;
		n++;
		
		System.out.println("\nprinting ar1 With for-each loop after insertion");
		for(int x:ar1) {
			System.out.print(x+" ");
		}	
		System.out.println("\nWith for loop for ar1");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		pos=5;
		
		for(int i=pos-1;i<n;i++) {
			ar1[i]=ar1[i+1];
		}
		n--;
		System.out.println("\nWith for loop for ar1 after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
	}

}