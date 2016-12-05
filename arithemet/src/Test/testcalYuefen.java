package Test;

import java.util.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import arithemet.caculeResult;
import junit.framework.Assert;

public class testcalYuefen {

	//此处记得定义
	caculeResult cale;
	@BeforeClass
    public static void bc(){
    	System.out.println("beforeClass");
    }
	
	
	@Before
	public void tbefore()
	{  
		//before是用来初始化
	    cale=new caculeResult();
		
		System.out.println("before");
		
		
	}
	
	
	
	
	@Test
	public void tyuefen(){
		//test 是相当于把你要做的放在里面
		//有返回值的可以用下面的判断返回值是不是和预期一样，比如10和5公约数2
	//	System.out.println( cale.yuefen(10,5));
	//	Assert.assertEquals(5, cale.yuefen(10,5));
		

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
