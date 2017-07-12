public class star {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		for (int i=1; i<=size; i++)
		{
			for (int j=(5-i); j>0; j--)
			{
		
				System.out.print(" ");
			}
			
			
			for (int j=1; j<=(2*i-1); j++)
			{
		
				System.out.print("*");
			}
			System.out.print("\n");
		}
		// new

	}

}
