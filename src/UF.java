
public class UF {
	private int id[];
	public UF(int n)
	{
		id = new int[n];
		for(int i=0;i<n;i++)
		{
			id[i] = i;
		}
	}
	
	private int root(int i)
	{
		while(i!=id[i])
		{
			i = id[i];
		}
		return i;
	}
	
	boolean isConnectedTree(int p, int q)
	{
		if(root(p)==root(q))
		{
			return true;
		}
		return false;
	}
	
	void unionTree(int p,int q)
	{
		int i = root(p);
		int j = root(q);
		id[i]=j;
	}
	
	void union(int p,int q)
	{
		int pid = id[p];
		int qid = id[q];
		for(int i=0;i<id.length;i++)
		{
			if(id[i]==pid)
			{
				id[i]=qid;
			}
		}
	}
	
	boolean isConnected(int p,int q)
	{
		if(id[p]==id[q])
		{
			return true;
		}
		return false;
	}
	
	void print()
	{
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
	}
}
