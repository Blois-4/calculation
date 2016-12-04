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
				numStack.push(c);
				break;
			case '/':
				a=numStack.pop();
				b=numStack.pop();
				c=div(a,b);
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
					 numStack.push(c);
					 break;
				 case '-':
					 a=numStack.pop();
					 b=numStack.pop();
					 c=sub(a,b);
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
		return y!=0 ? gys(y,x%y):x;
	}
	
	public int gbs(int x,int y)
	{
		return x/gys(x,y)*y;
	}
	
	public int yuefen(int x,int y)
	{
		int s = gys(x,y);
		x/=s;
		y/=s;
		return s;
		
		
	}
	
	public shu add(shu a,shu b)//加
	{

		
		shu c = new shu(1,1);
		int afm,afz,bfm,bfz,cfm,cfz;
		afm = a.getFenMu();//取出a的分母
		afz = a.getFenZi();//取出a的分子
		bfm = b.getFenMu();//取出b的分母
		bfz = b.getFenZi();//取出b的分子
		if(afm==bfm)
		{
			cfz=bfz+afz;
			
		}
		else
		{
			
		}
		return c;
	}
	public shu sub(shu a,shu b)//减
	{
		shu c = new shu(1,1);
		return c;
	}
	public shu mul(shu a,shu b)//乘
	{
		shu c = new shu(1,1);
		return c;
	}
	public shu div(shu a,shu b)//除
	{
		shu c = new shu(1,1);
		return c;
	}


	
}
