package arithemet;

import java.util.Scanner;
import java.util.Stack;

public class arithemet {

	public int n;
	public shu result[];
	public shu userResult[];
	public Stack<shu> numStack;
	public Stack signStack;
	public caculeResult cc;
	public geneQuestion gg;
	public pritfResult pp;
    public Scanner scanner;
	
    
    
    
    public static void main(String[] args) {
		
    	// TODO Auto-generated method stub
		
		String answer[]=new String[100];
		arithemet aa =new arithemet();
		System.out.println("�����������������أ�n=");
		aa.n=aa.scanner.nextInt();
	
		//���������Ŀ��������ȷ���
		
		for(int i=0;i<aa.n;i++)
		{
			aa.numStack.clear();
			aa.signStack.clear();
	        aa.gg.genequestion(aa.numStack, aa.signStack);
			aa.result[i]=aa.cc.cacul(aa.numStack, aa.signStack);
		}
		
		System.out.println("��������Ĵ𰸣�");
		
		//�����û���
		
	    aa.scanner.nextLine();
		for(int i=0;i<aa.n;i++){
			
			System.out.println("��"+(i+1)+"��ش�");
			answer[i]=aa.scanner.nextLine();
		//	System.out.println(answer[i]);
		}
		
		//���û���ת��shu����
		aa.parseShu(aa, answer);
		
		//������
	    aa.pp.printt(aa.result, aa.userResult,aa.n);
	
	}
		

    
	
	
	public arithemet()
	{
		cc=new caculeResult();
		gg=new geneQuestion();
		pp=new pritfResult();
		scanner=new Scanner(System.in);
		numStack=new Stack<shu>();
		signStack=new Stack();
		result=new shu[100];
	    userResult=new shu[100];
	}
	
	
	public void parseShu(arithemet aa,String []answer)
	{
		int fenzi1;
		int fenmu1;
		int length;
		int flag = 0;
		char c;
		String fenzi=null;
	    String  fenmu=null;
		
		for(int i=0;i<aa.n;i++){
			
			fenzi=null;
			fenmu=null;
			flag=0;
			length=answer[i].length();
		
			for(int j=0;j<length;j++)
			{
				
				
				c=answer[i].charAt(j);
				if(c!='/'&&flag==0)
				{
					fenzi=fenzi+c;
				}
				else if	(answer[i].charAt(j)=='/')
				{
					flag=1;
				
				}
				else if(c!='/'&&flag==1)
				{
				  fenmu=fenmu+c;
				}
			}
			
			
			
				fenzi=fenzi.substring(4, fenzi.length());
			    fenzi1=Integer.parseInt(fenzi);
			    aa.userResult[i]=new shu();
			    aa.userResult[i].setFenZi(fenzi1);
				//System.out.println(fenzi1);
			    if(flag==1)
			  {
				  fenmu=fenmu.substring(4,fenmu.length());
				  fenmu1=Integer.parseInt(fenmu);
				  aa.userResult[i].setFenMu(fenmu1);
				//  System.out.println(fenmu1);
			   }
			  
		}
			
	}
}
