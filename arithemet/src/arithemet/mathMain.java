package arithemet;

public class mathMain {

	
		  public static void main(String[] args) {
				
		    	// TODO Auto-generated method stub
				
				String answer[]=new String[100];
				arithemet aa =new arithemet();
				System.out.println("�����������������أ�n=");
				aa.n=aa.scanner.nextInt();
			
				//���������Ŀ��������ȷ���
				
				for(int i=0;i<aa.n;i++)
				{
					aa.numStack.clear();
					aa.signStack.clear();
			        aa.gg.genequestion(aa.numStack, aa.signStack);
					aa.result[i]=aa.cc.cacul(aa.numStack, aa.signStack);
				}
				
				System.out.println("��������Ĵ𰸣�");
				
				//�����û���
				
			    aa.scanner.nextLine();
				for(int i=0;i<aa.n;i++){
					
					System.out.println("��"+(i+1)+"��ش�");
					answer[i]=aa.scanner.nextLine();
				//	System.out.println(answer[i]);
				}
				
				//���û���ת��shu����
				aa.parseShu(aa, answer);
				
				//������
			    aa.pp.printt(aa.result, aa.userResult,aa.n);
			
			}
				

		    
	

}
