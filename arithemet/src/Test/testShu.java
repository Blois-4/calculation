package Test;

import java.util.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import arithemet.shu;
import junit.framework.Assert;

public class testShu {

	shu Shu1;
	shu Shu2;

	@BeforeClass
    public static void bc(){
    	System.out.println("beforeClass");
    }
	
	
	@Before
	public void tbefore()
	{  
	   Shu1=new shu();
	   Shu2=new shu();
	   System.out.println("before");
	
		
	}
	
	
	
	
	@Test
	public void tisEqual(){
		
		//Shu1:2/5,Shu2:2/5;return true  ok
		//Shu1:2/7,Shu2:2/9;return false  ok
		//Shu1:2,Shu2:2; return true 
		//Shu1.setFenMu(5);
		Shu1.setFenZi(2);
		//Shu2.setFenMu(9);
		Shu2.setFenZi(2);
		Assert.assertEquals(true,Shu1.isEqual(Shu2));
		
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
