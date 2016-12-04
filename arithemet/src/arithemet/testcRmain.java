package arithemet;

import java.util.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class testcRmain {

	caculeResult cale;
	@BeforeClass
    public static void bc(){
    	System.out.println("beforeClass");
    }
	
	
	@Before
	public void tbefore()
	{  
	    cale=new caculeResult();
		System.out.println("before");
		System.out.println("before");
		
		
	}
	
	
	
	
	@Test
	public void tcacul(){
		
		shu a=new shu(5,5);
		char sign='+';
		Stack <shu>num=new Stack();
		for (int i=0;i<4;i++){
			num.push(a);
			
		}
		Stack s=new Stack();
		for (int i=0;i<3;i++){
			s.push(sign);
			
		}
		
		
		for (int i=0;i<5;i++){
			num.push(a);
			
		}
		Assert.assertEquals(1, cale.cacul(num,s).getFenZi());
		
	}

	
	@After
	public void tafter()
	{  
		
		System.out.println("after");
		
	}
	
	 @AfterClass
	    public static  void ac(){
	    	System.out.println("afterClass");
	    }
 


	
	
}
