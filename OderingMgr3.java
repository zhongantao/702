package Afternoon;

import java.util.Arrays;
import java.util.Scanner;

public class OderingMgr3 {

	public static void main(String[] args) {
		//循环，显示系统菜单，用户根据输入的数字执行相应的功能
		
		//定义菜品数组，及数据
		
		int num=-1;
		boolean isExit=false;
		do {
			Scanner input=new Scanner(System.in);			 
		System.out.println("********************************");
		System.out.println("1、我要订餐");
		System.out.println("2、查看餐袋");
		System.out.println("3、签收订单");
		System.out.println("4、删除订单");
		System.out.println("5、我要点赞");
		System.out.println("6、退出系统");
		System.out.println("********************************");
		System.out.println("请选择：");
		int choose= input.nextInt();
		/*
		 * 根据用户输入编号，执行相应功能
		 * 相信代码见OrderingMa
		 */
				
		  
		    switch(choose) {
		    case 1://我要订餐
		    	//具体功能代码见
		    	System.out.println("1、我要订餐");
		        String[] dishNames= {"蜂面","银面","夏面"};
		        double[] prices= {28,20,35};
		        int[] praiseNums= {666,666,666};
		        int i;
		        System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
		        for(i=0;i<dishNames.length;i++) {
		    		 String price=prices[i]+"元";
		    		String praiseNum=(praiseNums[i]>0)?(praiseNums[i]+"赞"):"0";
		    		 
		    		System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
		    	}
		        //用户最多有4条订单
		        String[] names=new String[4];//订单人名称
		        String[] dishMegds=new String[4];//所选菜品，包括菜品名及其份数
		        int[] times=new int[4];//送餐日期 
		        String[] addresses=new String[4];//送餐地址
		        int[] states=new int[4];////订单状态，0表示已预定，1表示已完成
		        double[] sumprices=new double[4];//保存订单的总金额
		       
		        
		        boolean xuancai=false;
		        
		        
		    	System.out.println("请输入订餐人姓名：");
		    	String name=input.next();
		    	System.out.println("请输入您需要的菜品编号：");
			    int chooseDish=input.nextInt();
			    System.out.println("请输入您需要的份数：");
			    int number=input.nextInt();
			    
			    String dishMeg=dishNames[chooseDish-1]+""+number+"份";
			    
			    System.out.println("请输入您的地址：");
			    String address=input.next();
			    System.out.println("姓名："+name+'\n'+"");
		        
		      
		        
		        
		        
		        
		             break;
		    case 2:
		    	
		    	
				System.out.println("2、查看餐袋");
				System.out.println(name chooseDish number address);
				
				
				break;
		    case 3:
		        //签收订单
		    	
				System.out.println("3、签收订单");
				break;
		    case 4:  
		        //删除订单
		    	System.out.println("4、删除订单");
		    	break;
		    case 5:
		    	
		    	System.out.println("5、我要点赞");
		    	
		    	break;
		    case 6:
		
				
				System.out.println("6、退出系统");
		    	break;
		    	default://功能编号录入错误，认为退出系统
		    		isExit=true;
		    }
		
		    if(!isExit) {//不退出系统，录入0，可以返回主菜单
		    	System.out.println("输入0返回：");
		        num=input.nextInt();//用户选择编号
		    }else {//结束循环
		    	break;
		    }
		}while(num==0);
		
		
		
		
	}

}
