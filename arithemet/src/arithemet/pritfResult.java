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
					System.out.println((i+1)+".回答正确！");
					
				}
				else{
					System.out.println((i+1)+".回答错误！");
					if(result[i].getFenMu()>1)
					System.out.println(result[i].getFenZi()+"/"+result[i].getFenMu());
					else 
					{
						System.out.println(result[i].getFenZi());
					}
					
				}
					
				
			}
			System.out.println("正确题数："+sum);
			System.out.println("程序结束！");
	}
		

}
