package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import arithemet.geneQuestion;
import arithemet.shu;
import junit.framework.Assert;

public class testgeneQusetion {

	geneQuestion gene;

	@BeforeClass
    public static void bc(){
    	System.out.println("beforeClass");
    }
	
	
	@Before
	public void tbefore()
	{  
	   gene=new geneQuestion();
	   System.out.println("before");
	
		
	}
	
	
	
	
	@Test
	public void tfenshu(){
		
		shu shu1=new shu();
		shu1=gene.fenshu();
		System.out.println(shu1.getFenZi()+"/"+shu1.getFenMu());
		
	//	Assert.assertEquals(true,Shu1.isEqual(Shu2));
		
	}

	@Test
	public void tzhengshu(){
		
		shu shu1=new shu();
		shu1=gene.zhengshu(true);
		System.out.println(shu1.getFenZi()+"/"+shu1.getFenMu());
	//	Assert.assertEquals(true,Shu1.isEqual(Shu2));
		
	}
	@Test
	public void tsign(){
		
		char c;
		c=gene.sign();
		System.out.println(c);
	//	Assert.assertEquals(true,Shu1.isEqual(Shu2));
		
	}
	
	@Test
	public void tgenequestion(){
		
		
	//	Assert.assertEquals(true,Shu1.isEqual(Shu2));
		
	}
	@Test
	public void tis_not_num(){
		
		
		System.out.println(gene.num_not_0());
		
		
	//	Assert.assertEquals(true,Shu1.isEqual(Shu2));
		
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
