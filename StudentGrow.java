import java.util.Scanner;

public class StudentGrow {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("\t+-----<< ���л� Ű��� >>-----+");
		System.out.println("1. �����ϱ�");
		System.out.println("2. �����ϱ�");
		int starting=input.nextInt();
		if(starting!=1) {System.out.println("������ �����մϴ�."); System.exit(0);}
		else{
			System.out.println("=========================== ������ �����մϴ� ============================");
	         System.out.println();
	         System.out.println("<������ �� �бⰡ ���۵Ǿ���!..�� ��� ����� �߰���簡 ����?! ");
	         System.out.println("<�߰������� ���� 8�� ���� ���л��� ������ Ű������! ����� ���� � ������ �����ϰ� �� ���ΰ� !>");
	         System.out.println();
	         int DdayNumber=8; //�ʱⰪ
	         int Power=0;
	         int Money=100000;
	         int Friend=50;
	         int Intelli=0;
	         int Attendence=0;
             int Month = 4;
             int Day = 20;
             int Social = 10;
             int answer; 
             int project = 0;
	         String Daily[]={"ȭ","��","��","��","��","��","��"};
	         String Today = null;
	         while(true){
	        	 if(Month == 4) {Today=Daily[Day%7];}
	            System.out.println("===================================================================");
	            System.out.println("�������� D-" + DdayNumber + "  2020��  "+ Month +"��  "+ Day+"��  " + Today + "����");
	            System.out.println("�Ƿε� : "+Power+"  /  �����ɷ�: "+Intelli+" /  �� : "+Money+"��   /  �米�� : "+Friend + " /  ��ȸ��: "+Social);
	            System.out.println();
	            System.out.println("���ΰ� : ������ �߰������� "+DdayNumber+"��! �� �غ���?");
	            System.out.println();
	            System.out.println("1. ���ǵ�� : ���θ� ����! ������ ����߰ھ�!(�Ƿε� +10 , ���� +5 �ָ��� ���þȵ�)");
	            System.out.println("2. �˹ٰ��� : ���� �����! ���縸ŭ  �������ž�!(�Ƿε� +50, �� +50000)"); 
	            System.out.println("3. ģ��Ȱ���ϱ� : ģ���� �׾ƺ���! �θƵ� �ɷ��̷���!(�Ƿε� +20, �� -20000, �米�� +10 , ��ȸ�� +10)"); //�����Լ��� �����ϰ� ���谡 �� ����(�����ɷ�+3) �̷��͵� ������?!
	            System.out.println("4. ��մ�� : �����! ���� ���°� �ְ��!(1�� �Ҹ�,�Ƿε� 0)");//�����Լ��� ����ļ� �浿������ ���ڸ� ���״�!(�� -20000) �̷���..
	            System.out.println("5. �����ϱ�: �߰������� �� �����ʾҾ� �� ������ ������ ���θ� �غ���(1�� �Ҹ�,�Ƿε�50, ����+20)");//���� �ϱ� �����ϱ� �ΰ��� 
	            System.out.println("===================================================================");
	            int select = input.nextInt();
	            if(select == 1 && (Today.equals("��") || Today.equals("��"))) {
		               System.out.println("�� �ָ��̴� �ٽ� �����ϼ���!");
		               continue;
		               }
	        
	            switch(select){
	               case 1 :
	                	  if(Power >= 100) {
			            	   System.out.println("\n �ءءءءءء� �Ƿε��� �����ϴ�. 4���� �������ּ��� �ءءءءءء�");
			            	   continue;
	                	  }
	                   System.out.print("\n���Ǹ� ��´�.\n");
	                   System.out.println("--------------------------���� ���--------------------------");
	                   System.out.println(" 1. ���¼ҽ� ����Ʈ����\n 2. �ý��� ���α׷���\n 3. �����ͺ��̽�\n 4. ������ȣ ");
	                   System.out.println("----------------------------------------------------------");
	                   int study = input.nextInt();
	                   int [] i = {1,2,3,4};
	                   do {
	                   if (study == 1){
	                	  System.out.println("\t \t >>���¼ҽ� ����Ʈ���� ���� ����<<\t \t");
	                	  Intelli+=5;
	                	  Power += 10;
	                      System.out.println("������ : ����������� ������ ��������ҷ� ���������� $%@#!@*&������$^@#... " );
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("!!!!! ���ǰ� ������!!!!\n"+" [ ���� : "+ Intelli+ "��ŭ �ö���!] [�Ƿε� : " +Power+ "��ŭ �ö���!]");
	                      System.out.print("���Ǹ� �� ������?");
	                      System.out.println("[1. YES] [2. No]");
	                   int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------���� ���--------------------------");
	   	                      System.out.println(" 1. ���¼ҽ� ����Ʈ����\n 2. �ý��� ���α׷���\n 3. �����ͺ��̽�\n 4. ������ȣ ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");
	                    	  break;
	                      }
	                   }
	                   
	                   else if(study == 2){
	                      System.out.println("\t \t >>�ý��� ���α׷��� ���� ����<< \t \t");
	                      Intelli+=5;
	                      System.out.println("������ : �͹̳ο��� cd apue.3���Ϸ� �̵��ؼ� $%@#!@*&������$^@#... ");
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("������:$%@#!@*&������$^@#..."+" [ ���� : "+ Intelli+ "��ŭ �ö���! ]");
	                      Power += 11;
	                      System.out.println("'������: �̹� ���� ������ A4 ���� 4������ �̳��� �ۼ��Ͽ� ���� �����ϼ���' ");
	                      project++;
	                      System.out.println(" !�ý��� ���α׷��� ������ ���Ծ�!"+" [ �Ƿε� : "+ Power+ "��ŭ �ö���!!]" );	
	                      System.out.println("!!!!! ���ǰ� ������!!!!\n ���Ǹ� �� ������?");
	                      System.out.println("[1. YES] [2. No]");
	                   int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------���� ���--------------------------");
	   	                      System.out.println(" 1. ���¼ҽ� ����Ʈ����\n 2. �ý��� ���α׷���\n 3. �����ͺ��̽�\n 4. ������ȣ ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");
	                    	  break;
	                      }

	                   }
	                   
	                   else if(study == 3) {
	                	  Intelli += 5;	
	                	  Power += 11;
	                	  System.out.println("\t \t >> �����ͺ��̽� ���� ����  <<\t \t");
	                      System.out.println();
	                      System.out.println();
	                      System.out.println(" '������ : �������� ������ ������ �̸��� �˻��Ͻÿ�' " );
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("������:$%@#!@*&������$^@#..."+" [ ���� : "+ Intelli+ "��ŭ �ö���! ]");	                      	                      	               	                       
                          System.out.println(" '������: �̹� �ֱ��� �������� Ǯ� ���� �����ϼ���' ");
                          System.out.println(" !������ ���̽� ������ ���Ծ�!"+" [ �Ƿε� : "+ Power+ "��ŭ �ö���!!]" );		                      
	                      project++;
	                      System.out.println("!!!!! ���ǰ� ������!!!!\n ���Ǹ� �� ������?");
	                      System.out.println("[1. YES] [2. No]");
	                   int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------���� ���--------------------------");
	   	                      System.out.println(" 1. ���¼ҽ� ����Ʈ����\n 2. �ý��� ���α׷���\n 3. �����ͺ��̽�\n 4. ������ȣ ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");	   
	                    	  break;
	                      }

	                   }
	                      
	         
	                   else
	                   {
	                	  System.out.println("\t \t >> ������ȣ << \t \t");
		                  Intelli += 5;
		                  Power += 10;
		                  System.out.println(" '������ : ������ ���� ����~~' ");
		                  System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("!!!!! ���ǰ� ������!!!! [ ���� : "+ Intelli+ "��ŭ �ö���!] [�Ƿε� :" +Power+ "��ŭ �ö���!]");
	                      System.out.print("�� ������?\n");
	                      System.out.println("[1. YES] [2. No]");
	                      int[] o = {1,2};
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ]\n");
	   	                      System.out.println("--------------------------���� ���--------------------------");
	   	                      System.out.println(" 1. ���¼ҽ� ����Ʈ����\n 2. �ý��� ���α׷���\n 3. �����ͺ��̽�\n 4. ������ȣ ");
	   	                      System.out.println("----------------------------------------------------------");
	   	                      study = input.nextInt();
	                      }
	                      else {
	                    	  System.out.print("[ No ]\n");
	                    	  break;
	                      }
	                   }	                                    
	                   if(Power == 100) {
	                   Day++;
		               DdayNumber--;
		               Power = 0;
		               System.out.println("\t*******************�������� ��Ҵ�*******************\t");
	                   }	                   
	                   Power+=10;	                   
	                   }while(select == 1);
	                   break;
	                   
	                   	                 	                   
	                case 2 :
	                	  if(Power >= 100 ) {
			            	   System.out.println("\n �ءءءءءء� ü���� �����ϴ�. 4���� �������ּ��� �ءءءءءء�");
			            	   continue;
	                	  }
	                   System.out.println("\n             \t \t \t  �˹ٸ� ����. \t \t \t\n");
	                   
	                   int job = (int) Math.round(Math.random() * (10) + 1); 
	                        
	                   if(job<=7 && job>0){
	                      System.out.println("              \t \t \t   �˹� ��   \t \t \t");
	                      System.out.println("\n \t $$$$$$$$$$$$$$$$$ �������� ������! $$$$$$$$$$$$$$$$$ \t \n");
	                      Money+=50000;
	                      Power+=50;
	                      Social += 10;
	                      System.out.println(" [ �Ƿε� : "+Power+" / ���� ���� �ܰ� : "+Money+"�� " + "/��ȸ��: "+Social+"]" );
	                   }
	                   else {
		                      System.out.println("\n \t $$$$$$$$$$$$$$$$$ ���ʽ��� �޾Ҵ�! $$$$$$$$$$$$$$$$$ \t \n");
		                      System.out.println(" \t \t Money +4���� ��ŭ �ö���!\t \t\n");
		                      Money+=40000;		                      
		                      Power+= 50;
		                      Power-= 20;
		                      System.out.println(" [ �Ƿε� : "+Power+" / ���� ���� �ܰ� : "+Money+"�� ]" );
	                   }	                   
	                   Day++;
	                   DdayNumber--;
	                  
	                   break;
	                   
	                 case 3 :
	                	  if(Power >= 100 ) {
			            	   System.out.println("\n �ءءءءءء� ü���� �����ϴ�. 4���� �������ּ��� �ءءءءءء�");
			            	   continue;
	                	  }
	                	 System.out.println("--------------------------ģ��Ȱ��--------------------------");
		                 System.out.println(" \n1. ���Ƹ� Ȱ���ϱ�\n 2. ���Ȱ���ϱ� \n ");
		                 System.out.println("----------------------------------------------------------");
		                 
		                 int j[] = {1,2};
		                 int act = input.nextInt();
		                 if( act == 1) {
		                	 int c = (int) Math.round(Math.random() * (10) + 1);
		                	 System.out.println("\t\t ���Ƹ� Ȱ���ϱ� \t\t");
		                	 System.out.println();
		                	 System.out.println();
		                	 System.out.println();
		                	 System.out.println("\t\t Ȱ�� �� \t\t");
		                	 System.out.println();
		                	 System.out.println();
		                	 System.out.println();
		                	 if((c >= 1) && ( c <=3)) {
		                		 System.out.println("\t\t !!!!!������ �����!!!!! \t\t");
		                		 Intelli += 2;
		                	 }
		                	 Friend+=10;
		                	 Power +=20;
		                	 Money -= 20000;
		                	 Social +=10;
		                	 System.out.println(" [ �Ƿε� : "+Power+" / ���� ���� �ܰ� : "+Money+"��  / ģȭ��: "+Friend+ "/ �米��: "+Social+"��ŭ �ö���! ]" );
		                 }
	              /* case 4 :*/
	            }
	            //if(DdayNumber==0)
	            	//System.exit(0);//
	            	//break;// //������ while������ ���� ������ ��*/
	         }
	      }
	      
	}  
	      // TODO Auto-generated method stub
}
	   


	   


