package exceptionHandling;

public class Unchecked {

	public static void main(String[] args) {
		
		int i,j,k=0;
		int a[] = new int[4];
		i=2;
		j=0;
		
		try {
			k=i/j;
			for(int c=0; c<=4; c++) {
				a[c] = c*c;
			}
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		
	}

}
