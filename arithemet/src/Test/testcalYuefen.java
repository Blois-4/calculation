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

	//�˴��ǵö���
	caculeResult cale;
	@BeforeClass
    public static void bc(){
    	System.out.println("beforeClass");
    }
	
	
	@Before
	public void tbefore()
	{  
		//before��������ʼ��
	    cale=new caculeResult();
		
		System.out.println("before");
		
		
	}
	
	
	
	
	@Test
	public void tyuefen(){
		//test ���൱�ڰ���Ҫ���ķ�������
		//�з���ֵ�Ŀ�����������жϷ���ֵ�ǲ��Ǻ�Ԥ��һ��������10��5��Լ��2
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
