package arithemet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testpritfR {
	//此处记得定义
		pritfResult pf;
		
		@BeforeClass
	    public static void bc(){
	    	System.out.println("beforeClass");
	    }
		
		
		@Before
		public void tbefore()
		{  
			//before是用来初始化
		    pf=new pritfResult();
			System.out.println("before");
			
			
		}
		
		
		
		
		@Test
		public void tpritf(){
			//test 是相当于把你要做的放在里面
			//有返回值的可以用下面的判断返回值是不是和预期一样，比如10和5公约数2
		
			shu s;
			shu []result=new shu[10];
			shu []userresult=new shu[10];
			
			s=new shu(2,1);
			result[0]=s;
			s=new shu(3,1);
			result[1]=s;
			s=new shu(4,1);
			result[2]=s;
			
			s=new shu(2,1);
			userresult[0]=s;
			s=new shu(4,1);
			userresult[1]=s;
			s=new shu(4,1);
			userresult[2]=s;
			
			pf.printt(result, userresult, 3);

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
