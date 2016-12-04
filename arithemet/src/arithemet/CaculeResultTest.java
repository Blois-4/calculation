package arithemet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaculeResultTest {

	private caculeResult mCaculeResult;
	
	@Before
	public void setUp(){
		mCaculeResult = new caculeResult();		
	}
	
	
	@Test
	public void testAdd() {
		shu shu1 = new shu(1,3);
		shu shu2 = new shu(1,2);
		shu result = mCaculeResult.add(shu1, shu2);
		
		assertEquals(5,result.getFenZi());
		assertEquals(6, result.getFenMu());
		
	}
	
	@Test
	public void testSub() {
		shu shu1 = new shu(1,2);
		shu shu2 = new shu(3,1);
		shu result = mCaculeResult.sub(shu1, shu2);
		
		assertEquals(1, result.getFenZi());
		assertEquals(6, result.getFenMu());
	}
	
	@Test
	public void testMul() {
		shu shu1 = new shu(1,2);
		shu shu2 = new shu(2,3);
		shu result = mCaculeResult.mul(shu1, shu2);
		
		assertEquals(1, result.getFenZi());
		assertEquals(3, result.getFenMu());
	}
	
	@Test
	public void testDiv() {
		shu shu1 = new shu(1,2);
		shu shu2 = new shu(1,3);
		shu result = mCaculeResult.div(shu1, shu2);
		
		assertEquals(3, result.getFenZi());
		assertEquals(2, result.getFenMu());
	}
	

}
