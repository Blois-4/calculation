package arithemet;

import java.util.Stack;

public class caculeResult {

	public caculeResult()
	{
		
	}
	
	
	public int cacul(Stack<shu> numStack,Stack signStack,int num,shu []resultArray)
	{
		
		int result = 0;
		return result;
	}
	
	public int gys(int x,int y)
	{
		return y?gys(y,x%y):x;
	}
	
	public int gbs(int x,int y)
	{
		return x/gys(x,y)*y;
	}
	
	public int yuefen(in x,int y)
	{
		int s = gys(x,y);
		x/=s;
		y/=s;
	}
	
	public shu add(shu a,shu b)//¼Ó
	{
		int afm,afz,bfm,bfz;
		afm = a.getFenMu;
		afz = a.getFenZi;
		bfm = b.getFenMu;
		bfz = b.getFenZi;
		shu c = null;
		return c;
	}
	public shu sub(shu a,shu b)//¼õ
	{
		shu c = null;
		return c;
	}
	public shu mul(shu a,shu b)//³Ë
	{
		shu c = null;
		return c;
	}
	public shu div(shu a,shu b)//³ý
	{
		shu c = null;
		return c;
	}
	
}
