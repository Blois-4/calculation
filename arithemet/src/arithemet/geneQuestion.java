package arithemet;

import java.util.Random;
import java.util.Stack;

public class geneQuestion {
	
	public Random r;

	public Stack<shu> fnum;
	public Stack fsign;
	public geneQuestion()
	{
		r=new Random(System.currentTimeMillis());
		
		fnum=new Stack<shu>();
		fsign=new Stack();
	}
	
	
	public int num()
	{
		int i=r.nextInt(1000)%11;
		return i;
	}
	
	public int num_not_0()//生成非0数
	{
		int i=r.nextInt(1000)%10+1;
		return i;
	}
	
	public shu fenshu()//生成分数
	{
		shu fenshu=new shu();
		
		int zi;
		int mu;
	    zi=num_not_0();
	    mu=num_not_0();
	    if(mu==1)
	    {
	    	mu+=1;
	    }
		fenshu.setFenMu(mu);
		fenshu.setFenZi(zi);
		return fenshu;
	}
	
	
	public shu zhengshu(boolean zero)//生成整数
	{
		shu zhengshu=new shu();
		int zi;
		if(zero==false)
        zi=num_not_0();
		else zi=num();
		zhengshu.setFenZi(zi);
		
		return zhengshu;
	}
	
	public boolean isFenshu()//决定生成分数还是整数
	{
		int i=r.nextInt(1000)%2;
		if(i==0)
		{
			return false;//不是分数返回false
		}
		else return true;//是分数返回true
	}
	
	public char sign()//生成运算符
	{
		int i=r.nextInt(1000)%4;
		if(i==0)return '+';
		else if(i==1)return '-';
		else if (i==2)return '*';
		else return '/';
	}
	
	
	public void genequestion(Stack<shu> numStack,Stack signStack)
	{
	
		     boolean zero;
		     boolean isFenshuOrnot;
		     shu Shu;
			int l=r.nextInt(1000)%2+2;//随机生成运算符数 
			char temp='+';
			for(int i=0;i<l;i++){
				
				 Shu=new shu();
				int j = 0;
				if(temp!='/'){
					zero=true;
					isFenshuOrnot=isFenshu();
					if(isFenshuOrnot)
					{
						Shu=fenshu();
						System.out.print("("+Shu.getFenZi()+"/"+Shu.getFenMu()+")"+" ");
					}
					else
					{
						Shu=zhengshu(zero);
						 System.out.print(Shu.getFenZi()+" ");
					}
					 
				}
				else {
					
					zero=false;
					isFenshuOrnot=isFenshu();
					if(isFenshuOrnot)
					{
						Shu=fenshu();
						System.out.print("("+Shu.getFenZi()+"/"+Shu.getFenMu()+")"+" ");
					}
					else
					{
						Shu=zhengshu(zero);
						 System.out.print(Shu.getFenZi()+" ");
					}
					
					  
				}
				char s=sign();
				temp=s;
				System.out.print(s+" ");
				fnum.push(Shu);
				fsign.push(s);
			}
		
			if(temp!='/'){
				zero=true;
				isFenshuOrnot=isFenshu();
				if(isFenshuOrnot)
				{
					Shu=fenshu();
					System.out.println("("+Shu.getFenZi()+"/"+Shu.getFenMu()+")");
				}
				else
				{
					Shu=zhengshu(zero);
					 System.out.println(Shu.getFenZi());
				}
				 
				}
				else {
					zero=false;
					isFenshuOrnot=isFenshu();
					if(isFenshuOrnot)
					{
						Shu=fenshu();
						System.out.println("("+Shu.getFenZi()+"/"+Shu.getFenMu()+")");
					}
					else
					{
						Shu=zhengshu(zero);
						 System.out.println(Shu.getFenZi());
					}
				}
			    fnum.push(Shu);
			
			   // System.out.println(fnum.size());
				//System.out.println(fsign.size());
				while(!fnum.isEmpty())
				{	
					
					shu shu1=new shu();
					shu1=fnum.pop();
					//System.out.println("("+shu1.getFenZi()+"/"+shu1.getFenMu()+")");
					numStack.push(shu1);
				}
				while(!fsign.isEmpty()){
					
					char c=(char) fsign.pop();
					signStack.push(c);
				}
				//System.out.println(numStack.size());
				//System.out.println(signStack.size());
		}
	
	   
		
}
