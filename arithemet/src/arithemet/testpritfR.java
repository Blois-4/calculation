package arithemet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testpritfR {
	//�˴��ǵö���
		pritfResult pf;
		
		@BeforeClass
	    public static void bc(){
	    	System.out.println("beforeClass");
	    }
		
		
		@Before
		public void tbefore()
		{  
			//before��������ʼ��
		    pf=new pritfResult();
			System.out.println("before");
			
			
		}
		
		
		
		
		@Test
		public void tpritf(){
			//test ���൱�ڰ���Ҫ���ķ�������
			//�з���ֵ�Ŀ�����������жϷ���ֵ�ǲ��Ǻ�Ԥ��һ��������10��5��Լ��2
		
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
