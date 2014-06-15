import java.util.Scanner;
public class main {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		UF uf = new UF(N);
		while(N>0)
		{
			int p = input.nextInt();
			int q = input.nextInt();
			if(!uf.isConnected(p,q))
			{
				uf.union(p,q);
				System.out.println(p + " "+ q);
			}
			N--;
		}
		uf.print();
	}
}
