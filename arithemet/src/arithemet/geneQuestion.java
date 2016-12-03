package arithemet;

import java.util.Random;
import java.util.Stack;

public class geneQuestion {
	
	public Random r;

	public geneQuestion()
	{
		r=new Random(100);
	}
	public int num()
	{
		int i=r.nextInt()%11;
		return i;
	}
	public int num_not_0()
	{
		int i=r.nextInt()%10+1;
		return i;
	}
	public char sign()
	{
		int i=r.nextInt()%4;
		if(i==0)return '+';
		else if(i==1)return '-';
		else if (i==2)return '*';
		else return '/';
	}
	public void genequestion(Stack numStack,Stack signStack)
	{
	
		
			int l=r.nextInt()%2+2;//随机生成运算符数 
			char temp='+';
			for(int i=0;i<l;i++){
				int j = 0;
				if(temp!='/'){
					
					j=num();
					 System.out.print(j+" ");
				}
				else {
					j=num_not_0();
					  System.out.print(j+" ");
				}
				char s=sign();
				temp=s;
				 System.out.print(s+" ");
				numStack.push(j);
				signStack.push(s);
			}
			int k=num();
			if(temp!='/'){
					 k=num();
					 System.out.print(k+" ");
				}
				else {
					 k=num_not_0();
					 System.out.print(k+" ");
				}
				numStack.push(k);
		}
		
}
