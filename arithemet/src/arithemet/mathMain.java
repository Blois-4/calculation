package arithemet;

public class mathMain {

	
		  public static void main(String[] args) {
				
		    	// TODO Auto-generated method stub
				
				String answer[]=new String[100];
				arithemet aa =new arithemet();
				System.out.println("请问你想做几道题呢？n=");
				aa.n=aa.scanner.nextInt();
			
				//随机生成题目并计算正确结果
				
				for(int i=0;i<aa.n;i++)
				{
					aa.numStack.clear();
					aa.signStack.clear();
			        aa.gg.genequestion(aa.numStack, aa.signStack);
					aa.result[i]=aa.cc.cacul(aa.numStack, aa.signStack);
				}
				
				System.out.println("请输入你的答案：");
				
				//读入用户答案
				
			    aa.scanner.nextLine();
				for(int i=0;i<aa.n;i++){
					
					System.out.println("第"+(i+1)+"题回答：");
					answer[i]=aa.scanner.nextLine();
				//	System.out.println(answer[i]);
				}
				
				//将用户答案转成shu类型
				aa.parseShu(aa, answer);
				
				//输出结果
			    aa.pp.printt(aa.result, aa.userResult,aa.n);
			
			}
				

		    
	

}
