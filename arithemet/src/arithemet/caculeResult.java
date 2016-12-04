package arithemet;

import java.util.Stack;

public class caculeResult {

	public caculeResult()
	{
		
	}
	
	
	public shu cacul(Stack<shu> numStack,Stack signStack)
	{
		
		Stack <shu> fnumStack=new Stack<shu>();
		Stack fsignStack =new Stack();
		char sign;
		shu fzhu;
		shu a,b,c;
		
		shu result;
		
		//判断是否有乘除,并处理乘除
		while (!signStack.isEmpty())
		{
			sign=(char) signStack.pop();
			switch(sign)
			{
			case '+':
				
				fzhu=numStack.pop();
				fnumStack.push(fzhu);
				fsignStack.push(sign);
				break;
			case '-':
				fzhu=numStack.pop();
				fnumStack.push(fzhu);
				fsignStack.push(sign);
				break;
			case '*':
				
				a=numStack.pop();
				b=numStack.pop();
				c=mul(a,b);
				//System.out.println(a.getFenZi()+"/"+a.getFenMu());
				//System.out.println(b.getFenZi()+"/"+b.getFenMu());
				//System.out.println(sign);
				numStack.push(c);
				break;
			case '/':
				a=numStack.pop();
				b=numStack.pop();
				c=div(a,b);
				//System.out.println(a.getFenZi()+"/"+a.getFenMu());
				//System.out.println(b.getFenZi()+"/"+b.getFenMu());
				//System.out.println(sign);
				numStack.push(c);
				break;
				
			}
		}
		
		
		//将暂存栈的内容弹出存在主栈里
		while(!fsignStack.isEmpty())
		{
			sign=(char) fsignStack.pop();
			signStack.push(sign);
			a=fnumStack.pop();
			numStack.push(a);
		}
		
		//处理加减
		if(!signStack.isEmpty())
		{
			while (!signStack.isEmpty())
			{
				sign=(char) signStack.pop();
				switch(sign)
				{
				 case '+':
					 a=numStack.pop();
					 b=numStack.pop();
					 c=add(a,b);
					// System.out.println(a.getFenZi()+"/"+a.getFenMu());
						//System.out.println(b.getFenZi()+"/"+b.getFenMu());
						//System.out.println(sign);
					 numStack.push(c);
					 break;
				 case '-':
					 a=numStack.pop();
					 b=numStack.pop();
					 c=sub(a,b);
					// System.out.println(a.getFenZi()+"/"+a.getFenMu());
						//System.out.println(b.getFenZi()+"/"+b.getFenMu());
						//System.out.println(sign);
					 numStack.push(c);
					break;
				
					
				}
			}
		}
		
		result=numStack.pop();
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
	
	public shu add(shu a,shu b)//加
	{
  		int afm,afz,bfm,bfz;
 	    int fm,fz;
 		afm = a.getFenMu();
 		afz = a.getFenZi();
 		bfm = b.getFenMu();
 	    bfz = b.getFenZi();
 		fm = gbs(afm,bfm);
 		fz = fm/afm*afz + fm/bfm*bfz;
 		shu c = new shu();
 		c.setFenMu(fm);
 		c.setFenZi(fz);
 		c=yuefen(c);
  		return c;
	}
	public shu sub(shu a,shu b)//减
	{
  		int afm,afz,bfm,bfz;
 	    int fm,fz;
 		afm = a.getFenMu();
 		afz = a.getFenZi();
 		bfm = b.getFenMu();
 	    bfz = b.getFenZi();
 		fm = gbs(afm,bfm);
 		fz = fm/afm*afz - fm/bfm*bfz;
 		shu c = new shu();
 		c.setFenMu(fm);
 		c.setFenZi(fz);
 		c=yuefen(c);
  		return c;
	}
	public shu mul(shu a,shu b)//乘
	{   
		int afm,afz,bfm,bfz;
		int fm,fz;
		afm = a.getFenMu();
		afz = a.getFenZi();
		bfm = b.getFenMu();
		bfz = b.getFenZi();
		fm = afm*bfm;
		fz = afz*bfz;
		shu c = new shu();
		c.setFenZi(fz);
		c.setFenMu(fm);
		c = yuefen(c);
		return c;
	}
	public shu div(shu a,shu b)//除
	{
		int afm,afz,bfm,bfz;
		int fm,fz;
		afm = a.getFenMu();
		afz = a.getFenZi();
		bfm = b.getFenMu();
		bfz = b.getFenZi();
		fm = afm*bfz;
		fz = afz*bfm;
		shu c = new shu();
		c.setFenZi(fz);
		c.setFenMu(fm);
		c = yuefen(c);
		return c;
	}


	
}
