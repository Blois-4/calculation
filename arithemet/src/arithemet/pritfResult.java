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
					System.out.println((i+1)+".����ȷ��");
					
				}
				else{
					System.out.println((i+1)+".�𰸴���");
					System.out.println(result[i].getFenZi()+"/"+result[i].getFenMu());
					
				}
					
				
			}
			System.out.println("��ȷ������"+sum);
			System.out.println("���������");
	}
		

}
