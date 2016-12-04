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
		return (y!=0)?gys(y,x%y):x;
	}
	
	public int gbs(int x,int y)
	{
		return x/gys(x,y)*y;
	}
	
	public shu yuefen(shu c)
	{
		int x=c.getFenZi();
		int y=c.getFenMu();
		int s = gys(x,y);
		x/=s;
		c.setFenZi(x);
		y/=s;	
		c.setFenMu(y);
		return c;
	}
	
	public shu add(shu a,shu b)//¼Ó
	{
		int afm,afz,bfm,bfz;
		int fm,fz;
		afm = a.getFenMu();
		afz = a.getFenZi();
		bfm = b.getFenMu();
		bfz = b.getFenZi();
		fm = gbs(afm,bfm);
		fz = fm/afm*afz + fm/bfm*bfz;
		shu c=null;
		c.setFenMu(fm);
		c.setFenZi(fz);
		c=yuefen(c);
		return c;
	}
	public shu sub(shu a,shu b)//¼õ
	{
		shu c = null;
		return c;
	}
	public shu mul(shu a,shu b)//³Ë
	{   
		int afm,afz,bfm,bfz;
		int fm,fz;
		afm = a.getFenMu();
		afz = a.getFenZi();
		bfm = b.getFenMu();
		bfz = b.getFenZi();
		fm = afm*bfm;
		fz = afz*bfz;
		shu c = null;
		c.setFenZi(fz);
		c.setFenMu(fm);
		c = yuefen(c);
		return c;
	}
	public shu div(shu a,shu b)//³ý
	{
		int afm,afz,bfm,bfz;
		int fm,fz;
		afm = a.getFenMu();
		afz = a.getFenZi();
		bfm = b.getFenMu();
		bfz = b.getFenZi();
		fm = afm*bfz;
		fz = afz*bfm;
		shu c = null;
		c.setFenZi(fz);
		c.setFenMu(fm);
		c = yuefen(c);
		return c;
	}
	
}
