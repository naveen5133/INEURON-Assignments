package in.ineuron.main;

public class AssignmentIneuron {

	public static void main(String[] args) {
		//First question from assignment
		int n=10;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2 ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
			}
			System.out.print(" ");
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i==(n-1)/2 || i==n-1 ) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");	
					}
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) {
					if(j==0 && i!=n-1  || j==n-1 && i!=n-1 || i==n-1 && j!=0 && j!= n-1 ) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");	
					}
				}
				
				System.out.print(" ");
				for(int j=0;j<n;j++) {
					if(i==0 && j!=n-1 || j==0 || j==n-1 && i!=0 && i!=(n-1)/2 || i==(n-1)/2 && j!=n-1 ) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");	
					}
				}
				
				System.out.print(" ");
				for(int j=0;j<n;j++) {
					if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1 ||
							j==n-1 && i!=0 && i!=n-1) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");	
					}
				}
				
				System.out.print(" ");
				
				for(int j=0;j<n;j++) {
					if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");	
					}
				}
			
			System.out.println("");
			
		}
		
		//Second question from assignment
		/*int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}*/
		
		//Third question from assignment
		/*int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0|| i==n-1|| j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}*/
		
		//Fourth question from assignment
		
		/*int n=14;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1 || i==n-2 || j==0 && i>=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i-j>=(n-1)/2 || i+j>=n+(n-3)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}*/
		
		//Fifth question from assignment
		
		/*int n=11;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0|| i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}*/
	}

}
