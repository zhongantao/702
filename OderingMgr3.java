package Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class OderingMgr3 {

	public static void main(String[] args) {
		//ѭ������ʾϵͳ�˵����û��������������ִ����Ӧ�Ĺ���
		
		//�����Ʒ���飬������
		
		int num=-1;
		boolean isExit=false;
		do {
			Scanner input=new Scanner(System.in);			 
		System.out.println("********************************");
		System.out.println("1����Ҫ����");
		System.out.println("2���鿴�ʹ�");
		System.out.println("3��ǩ�ն���");
		System.out.println("4��ɾ������");
		System.out.println("5����Ҫ����");
		System.out.println("6���˳�ϵͳ");
		System.out.println("********************************");
		System.out.println("��ѡ��");
		int choose= input.nextInt();
		/*
		 * �����û������ţ�ִ����Ӧ����
		 * ���Ŵ����OrderingMa
		 */
				
		  
		    switch(choose) {
		    case 1://��Ҫ����
		    	//���幦�ܴ����
		    	System.out.println("1����Ҫ����");
		        String[] dishNames= {"����","����","����"};
		        double[] prices= {28,20,35};
		        int[] praiseNums= {666,666,666};
		        int i;
		        System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
		        for(i=0;i<dishNames.length;i++) {
		    		 String price=prices[i]+"Ԫ";
		    		String praiseNum=(praiseNums[i]>0)?(praiseNums[i]+"��"):"0";
		    		 
		    		System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
		    	}
		        //�û������4������
		        String[] names=new String[4];//����������
		        String[] dishMegds=new String[4];//��ѡ��Ʒ��������Ʒ���������
		        int[] times=new int[4];//�Ͳ����� 
		        String[] addresses=new String[4];//�Ͳ͵�ַ
		        int[] states=new int[4];////����״̬��0��ʾ��Ԥ����1��ʾ�����
		        double[] sumprices=new double[4];//���涩�����ܽ��
		       
		        
		        boolean xuancai=false;
		        
		        
		    	System.out.println("�����붩����������");
		    	String name=input.next();
		    	System.out.println("����������Ҫ�Ĳ�Ʒ��ţ�");
			    int chooseDish=input.nextInt();
			    System.out.println("����������Ҫ�ķ�����");
			    int number=input.nextInt();
			    
			    String dishMeg=dishNames[chooseDish-1]+""+number+"��";
			    
			    System.out.println("���������ĵ�ַ��");
			    String address=input.next();
			    System.out.println("������"+name+'\n'+"");
		        
		      
		        
		        
		        
		        
		             break;
		    case 2:
		    	
		    	
				System.out.println("2���鿴�ʹ�");
				System.out.println(name chooseDish number address);
				
				
				break;
		    case 3:
		        //ǩ�ն���
		    	
				System.out.println("3��ǩ�ն���");
				break;
		    case 4:  
		        //ɾ������
		    	System.out.println("4��ɾ������");
		    	break;
		    case 5:
		    	
		    	System.out.println("5����Ҫ����");
		    	
		    	break;
		    case 6:
		
				
				System.out.println("6���˳�ϵͳ");
		    	break;
		    	default://���ܱ��¼�������Ϊ�˳�ϵͳ
		    		isExit=true;
		    }
		
		    if(!isExit) {//���˳�ϵͳ��¼��0�����Է������˵�
		    	System.out.println("����0���أ�");
		        num=input.nextInt();//�û�ѡ����
		    }else {//����ѭ��
		    	break;
		    }
		}while(num==0);
		
		
		
		
	}

}
