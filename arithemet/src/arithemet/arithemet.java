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
		System.out.println("请问你想做几道题呢？n=");
		aa.n=aa.scanner.nextInt();
	
		
	
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
}
