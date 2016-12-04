package arithemet;

public class pritfResult {
	
	
	public pritfResult()
	{
		
	}

	public void printt( shu []result, shu []userResult,int n)

	{
		
			int sum=0;
			for(int i=0;i<n;i++){
				if(result[i].isEqual(userResult[i])){
					sum++;
					System.out.println((i+1)+".答案正确！");
					
				}
				else{
					System.out.println((i+1)+".答案错误！");
					System.out.println(result[i].getFenZi()+"/"+result[i].getFenMu());
					
				}
					
				
			}
			System.out.println("正确题数："+sum);
			System.out.println("程序结束！");
	}
		

}
