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
             int Social = 0;
             int answer; 
             int project = 0;
             int study;
	         String Daily[]={"ȭ","��","��","��","��","��","��"};
	         String Today = null;
	         while(true){
	        	 if(Month == 4) {Today=Daily[Day%7];}
	            System.out.println("=============================================================================");
	            System.out.println("�������� D-" + DdayNumber + "  2020��  "+ Month +"��  "+ Day+"��  " + Today + "����");
	            System.out.println("�Ƿε� : "+Power+"  /  �����ɷ�: "+Intelli+" /  �� : "+Money+"��   /  �米�� : "+Friend + " /  ��ȸ��: "+Social);
	            System.out.println();
	            System.out.println("���ΰ� : ������ �߰������� "+DdayNumber+"��! �� �غ���?");
	            System.out.println();
	            System.out.println("1. ���ǵ�� : ���θ� ����! ������ ����߰ھ�!(�Ƿε� +10 , ���� +5 �ָ��� ���þȵ�)");
	            System.out.println("2. �˹ٰ��� : ���� �����! ���縸ŭ  �������ž�!(�Ƿε� +50, �� +50000)"); 
	            System.out.println("3. ģ��Ȱ���ϱ� : ģ���� �׾ƺ���! �θƵ� �ɷ��̷���!(�Ƿε� +20, �� -20000, �米�� +10 , ��ȸ�� +10)"); 
	            System.out.println("4. ��մ�� : �����! ���� ���°� �ְ��!(1�� �Ҹ�,�Ƿε� 0)");//�����Լ��� ����ļ� �浿������ ���ڸ� ���״�!(�� -20000) �̷���..
	            System.out.println("5. �����ϱ�: �߰������� �� �����ʾҾ� ���θ� �غ���(1�� �Ҹ�,�Ƿε�50, ����+10)");//���� �ϱ� �����ϱ� �ΰ��� 
	            System.out.println("=============================================================================");
	            int select = input.nextInt();
	            if(select == 1 && (Today.equals("��") || Today.equals("��"))) {
		               System.out.println("�� �ָ��̴� �ٽ� �����ϼ���!");
		               continue;
		               }

	            switch(select){   
	               case 1 :
	                	  if(Power >= 91 ) {
	    	   	                 System.out.println("�ءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�.�ءءءءءءءءءءءءءء� ");
		                         System.out.println("................... �Ƿε��� �ּ� 90�̾���մϴ�!...................");					            	 		
			                     System.out.println("�ءءءءءءءءءءء� �Ƿε��� ���� �������� �˴ϴ� �ءءءءءءءءءءء�");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;
				                 break;	
	                	  }
	                   System.out.print("\n���Ǹ� ��´�.\n");
	                   System.out.println("--------------------------���� ���--------------------------");
	                   System.out.println(" 1. ���¼ҽ� ����Ʈ����\n 2. �ý��� ���α׷���\n 3. �����ͺ��̽�\n 4. ������ȣ ");
	                   System.out.println("----------------------------------------------------------");
	                   study = input.nextInt();	                   

	                   do {
	                   if (study == 1){	                	   
	                	  System.out.println("\t \t >>���¼ҽ� ����Ʈ���� ���� ����<<\t \t");
	                	  System.out.println();
	                	  System.out.println();
	                	  Intelli+=5;
	                	  Power += 10;
	                      System.out.println("������ : ����������� ������ ��������ҷ� ���������� $%@#!@*&������$^@#... " );
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("������:$%@#!@*&������$^@#...(���� : "+ Intelli+ " /  �Ƿε� : " +Power+")");	                      
	                      System.out.println();
	                      System.out.print("���ǰ� ������! �� ������?[1. YES] [2. No]\n");	                      
	                   
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] ���� �� �Ƿε� +10 �г�Ƽ�� �ްԵ˴ϴ�.\n");
	         	   	            if((Power >= 90)&&(select == 1)) {
	   	   	   	                 System.out.println("�ءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�.�ءءءءءءءءءءءءءء� ");
	   		                     System.out.println("................... �Ƿε��� �ּ� 89�̾���մϴ�!...................");		
	   			            	 System.out.println("�ءءءءءءءءءءء� �Ƿε��� ���� �������� �˴ϴ� �ءءءءءءءءءءء�");
	   			            	 Day++;
	   			                 DdayNumber--;
	   			                 Power = 0;
	   			                 
	   			                 break;	            	 			            	   
	   		         	    }
	         	   	          Power += 10;
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
	                      System.out.println();
	                      System.out.println();
	                      Intelli+=5;
	                      System.out.println("������ : �͹̳ο��� cd apue.3���Ϸ� �̵��ؼ� $%@#!@*&������$^@#... ");
	                      System.out.println("������:$%@#!@*&������$^@#...");
	                      System.out.println("������:$%@#!@*&������$^@#...");	                      	                      
	                      Power += 11;
	                      System.out.println("������: �̹� ���� ������ A4 ���� 4������ �̳��� �ۼ��Ͽ� ���� �����ϼ���");
	                      project++;
	                      System.out.println("�ý��� ���α׷��� ������ ���Ծ�!(���� : "+ Intelli+ " /  �Ƿε� : " +Power+")");	  
	                      System.out.println();
	                      System.out.println("���ǰ� ������! ���Ǹ� �� ������? [1. YES] [2. No]");
	                 
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] ���� �� �Ƿε� +10 �г�Ƽ�� �ްԵ˴ϴ�.\n");	   	                      	   	                      
	  	   	   	            if((Power >= 80)&&(select == 1)) {
	  	   	   	                 System.out.println("�ءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�.�ءءءءءءءءءءءءءء� ");
		                         System.out.println("................... �Ƿε��� �ּ� 79�̾���մϴ�!...................");					            	 		
			                     System.out.println("�ءءءءءءءءءءء� �Ƿε��� ���� �������� �˴ϴ� �ءءءءءءءءءءء�");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;
				                 break;	            	   
			         	    }
	  	   	   	              Power+=10;
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
	                      System.out.println("������ : �������� ������ ������ �̸��� �˻��Ͻÿ�" );
	                      System.out.println("������:$%@#!@*&������$^@#...");	                       
	                      System.out.println("������:$%@#!@*&������$^@#...");	                      	                      
                          System.out.println("������: �̹� �ֱ��� �������� Ǯ� ���� �����ϼ���");
                          System.out.println("!������ ���̽� ������ ���Ծ�!(���� : "+ Intelli+ " /  �Ƿε� : " +Power+")"); 		                      
	                      project++;
	                      System.out.println();
	                      System.out.println("���ǰ� ������! ���Ǹ� �� ������? [1. YES] [2. No]");
	                  
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] ���� �� �Ƿε� +10 �г�Ƽ�� �ްԵ˴ϴ�.\n");		   	                      	   	                      
	  	   	   	            if((Power >= 80)&&(select == 1)) {
	  	   	   	                 System.out.println("�ءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�.�ءءءءءءءءءءءءءء� ");
                                 System.out.println("................... �Ƿε��� �ּ� 79�̾���մϴ�!...................");	
			                     System.out.println("�ءءءءءءءءءءء� �Ƿε��� ���� �������� �˴ϴ� �ءءءءءءءءءءء�");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;				            	 
				                 break;					            			            	   
			         	    }
	  	   	   	          Power+=10;
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
	                	  System.out.println("\t\t\t >> ������ȣ << \t\t\t");
	                	  System.out.println();
	                	  System.out.println();
		                  Intelli += 5;
		                  Power += 10;
		                  System.out.println("������ : ������ ���� ����~~");
		                  System.out.println("������:$%@#!@*&������$^@#...");	                    
	                      System.out.println("������:$%@#!@*&������$^@#...(���� : "+ Intelli+ " /  �Ƿε� : " +Power+")");	                      
	                      System.out.println();
	                      System.out.println("���ǰ� ������! �� ������? [1. YES] [2. No]");	                      
	                      answer = input.nextInt();
	                      if(answer == 1) {
	                    	  System.out.print("[ YES ] ���� �� �Ƿε� +10 �г�Ƽ�� �ްԵ˴ϴ�.\n");	
	  	   	   	            if((Power >= 90)&&(select == 1)) {
	  	   	   	                 System.out.println("�ءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�.�ءءءءءءءءءءءءءء� ");
                                 System.out.println("................... �Ƿε��� �ּ� 89�̾���մϴ�!...................");		
				            	 System.out.println("�ءءءءءءءءءءء� �Ƿε��� ���� �������� �˴ϴ� �ءءءءءءءءءءء�");
				            	 Day++;
				            	 DdayNumber--;
				            	 Power = 0;
				            	 break;			            	   
			         	    }
	  	   	   	          Power += 10;
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
		               break;
	                   }	                   	                   	                  
	                   }while(select == 1);
	            
	                   break;
	                   
	                   	                 	                   
	                case 2 :
	                	  if(Power >= 51 ) {	                		  
			            	   System.out.println("�ءءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�. �ءءءءءءءءءءءءء�");
			            	   System.out.println("�ءءءءءءءءءءءءءء� �Ƿε��� �ּ� 50�̾���մϴ�.�ءءءءءءءءءءءءءء� ");
			            	   Day ++;
			            	   DdayNumber--;
			            	   Power = 0;
			            	   break;
	                	  }
	                   System.out.println("\n             \t \t \t  �˹ٸ� ����. \t \t \t\n");
	                   
	                   int job = (int) Math.round(Math.random() * (10) + 1); 
	                        
	                   if(job<=7 && job>0){
	                      System.out.println("     \t \t \t\t  �˹� ��   \t \t \t\t");
	                      System.out.println("\n\t\t $$$$$$$$$$$$$$$$$ �������� ������! $$$$$$$$$$$$$$$$$\t\t \n");
	                      Money+=50000;
	                      Power+=50;
	                      Social += 10;
	                      System.out.println(" [ �Ƿε� : "+Power+" / ���� ���� �ܰ� : "+Money+"�� " + "/��ȸ��: "+Social+"]" );
	                   }
	                   else {
		                      System.out.println("\n \t\t $$$$$$$$$$$$$$$$$ ���ʽ��� �޾Ҵ�! $$$$$$$$$$$$$$$$$ \t\t \n");
		                      System.out.println(" (�Ƿε��� 20 �پ���!)\n");
		                      Money+=40000;		                      
		                      Power+= 50;
		                      Power-= 20;
		                      System.out.println(" [ �Ƿε� : "+Power+" / ���� ���� �ܰ� : "+Money+"�� ]" );
	                   }	                   
	                   	                 
	                   break;
	                   
	                 case 3 :	                	 
	                			                 
	                	  if(Power > 80 ) {
			            	   System.out.println("�ءءءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�. �ءءءءءءءءءءءءءء�");
			            	   System.out.println("�ءءءءءءءءءءءءءء� �Ƿε��� �ּ� 80�̾���մϴ�.�ءءءءءءءءءءءءءء� ");
			            	   System.out.println("�ءءءءءءءءءءءء�1�� ���ǵ��, 4�� ��մ�⸸ ���ð����մϴ�.�ءءءءءءءءءء�");
			            	   System.out.println("1. ���ǵ�� : ���θ� ����! ������ ����߰ھ�!(�Ƿε� +10 , ���� +5 �ָ��� ���þȵ�)");
			            	   System.out.println("4. ��մ�� : �����! ���� ���°� �ְ��!(1�� �Ҹ�,�Ƿε� 0)");
			            	   
			            	   
			            	   if(Power >= 91) {
			            		   System.out.println("�ءءءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�. �ءءءءءءءءءءءءءء�");
			            	       System.out.println("�ءءءءءءءءءءءءءء� �Ƿε��� ���� �������� �˴ϴ�.�ءءءءءءءءءءءءءء� ");   
			            	        Day ++;
			            	        DdayNumber--;
			            	        Power = 0;
			            	        break;
	                	  }			            	   
			            	   break;  
	                 }
	                	  System.out.println("--------------------------ģ��Ȱ��--------------------------");
			              System.out.println(" \n1. ���Ƹ� Ȱ���ϱ�\n2. ���Ȱ���ϱ� \n ");
			              System.out.println("----------------------------------------------------------");		                 		             
		                 int act = input.nextInt();
		                 if( act == 1) {
		                	 int c = (int) Math.round(Math.random() * (10) + 1);
		                	 Friend+=10;
		                	 Power +=20;
		                	 Money -= 20000;
		                	 Social +=10;
		                	 System.out.println("\t\t\t ���Ƹ� Ȱ���ϱ� \t\t\t");
		                	 System.out.println();
		                	 System.out.println("\t $%@#!@*$^@#$%!@#$!%#$%!@#$!%...\t");	
		                	 if((c >= 1) && ( c <=7)) {
		                		 Intelli += 2;
		                		 System.out.println("\t !!!!!������ �����!!!!! \t (���� :"+ Intelli+"��ŭ �ö���!)");
		                		 
		                	 }
		                	 System.out.println(" [ �Ƿε� : "+Power+" / �ܰ� : "+Money+"��  / ģȭ��: "+Friend+ "/ �米��: "+Social+"��ŭ �ö���! ]" );
                             
		                 }
		                	 
		                	 else {
		                		 		                	 
		                		 Friend+=10;
			                	 Power +=20;
			                	 Money -= 20000;
			                	 Social +=10;
		                	     
		                		 System.out.println("\t\t\t ��� Ȱ���ϱ� \t\t\t");
		                		 System.out.println();
		                		 System.out.println("$%@#!@*$^@#$%!@#$!%#$%!@#$!%...");		                		
		                		 System.out.println(" [ �Ƿε� : "+Power+" / ���� ���� �ܰ� : "+Money+"��  / ģȭ��: "+Friend+ "/ �米��: "+Social+"��ŭ �ö���! ]" );
		                	 }
		                	 break;
		                 	 
		                 
	              
		            case 4 :
		            			            	
		            	System.out.println("\t\t >>>> ��մ�� <<<< \t\t");
		            	System.out.println();
	                	System.out.println("---------------------------------------------------------");
		                System.out.println(" \n 1. �����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
		                System.out.println("----------------------------------------------------------");
		                int v = input.nextInt();
		                do {
		                if(v == 1) {
		                	System.out.printf("[ �����ϱ� ]");
		                	System.out.printf("\n 1. ��\n 2. ����ü��\n 3. ������ġ\n");
		                	System.out.println("----------------------------------------------------------");
		                	int game = input.nextInt();
		                	if(game == 1) {
			                	System.out.println("[�� ����]\n");
			                	System.out.println("$%@#!@*$^@#...");
			                	System.out.println("$%@#!@*$^@#...\n");
		                		System.out.println(".. ��  �� ..");
		                		System.out.println("���� �� �ұ�? [ 1. Yes / 2. No ]");
		                		answer = input.nextInt();
		                		if(answer == 1) {
		                			System.out.println("[ Yes ]\n");
				                	System.out.println("$%@#!@*$^@#...");
				                	System.out.println("$%@#!@*$^@#...\n");
			                		System.out.println(" .. ��  �� ..");
				                	System.out.println("��.. �ٸ��ų� �غ���");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println("\n 1. �����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
				                	continue;
	
		                		}
		                		else {
		                			System.out.println("[ No ]");
		                			System.out.println("�ٸ��� �غ���?");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1.�����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
				                	continue;
		                		}
		                	}
		                	else if(game == 2) {
			                	System.out.println("[����ü�� ����]\n");
			                	System.out.println("$%@#!$% ���� �� @*$^@#...");
			                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
		                		System.out.println(".. ��  �� ..");
		                		System.out.println("���� �� �ұ�? [ 1. Yes / 2. No ]");
		                		answer = input.nextInt();
		                		if(answer == 1) {
		                			System.out.println("[ Yes ]\n");
				                	System.out.println("$%@#!$% ���� �� @*$^@#...");
				                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
			                		System.out.println(" .. ��  �� ..");
				                	System.out.println("��.. �ٸ��ų� �غ���");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1. �����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
	
		                		}
		                		else {
		                			System.out.println("[ No ]\n");
		                			System.out.println("�ٸ��� �غ���?");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1. �����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
		                		}
		                	}
		                	else  {
		                		System.out.println("[������ġ ����]\n");
		                		System.out.println("$%@#!$% ���� �� @*$^@#...");
			                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
		                		System.out.println(".. ��  �� ..");
		                		System.out.println("���� �� �ұ�? [ 1. Yes / 2. No ]");
		                		answer = input.nextInt();
		                		if(answer == 1) {
		                			System.out.println("[ Yes ]\n");
		                			System.out.println("$%@#!$% ���� �� @*$^@#...");
				                	System.out.println("$%@#!@*$^@#$%!@#$!%...\n");
			                		System.out.println(" .. ��  �� ..");
				                	System.out.println("��.. �ٸ��ų� �غ���");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println("\n 1. �����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
	
		                		}
		                		else {
		                			System.out.println("[ No ]\n");
		                			System.out.println("�ٸ��� �غ���?");
				                	System.out.println("---------------------------------------------------------");
					                System.out.println(" \n 1. �����ϱ�\n 2. Tv ���� \n 3. ��޽��ѸԱ�\n 4. ��ȭ, ���ú��� \n 5. ���� �� �ں���");
					                System.out.println("----------------------------------------------------------");
				                	v=input.nextInt();
				                	
		                		}
		                	}
		                }
		                else if(v == 2) {
		                	System.out.println("TV����");
		                	System.out.println();
		                	System.out.println("��Ż��(�ø��� ���ƺ���) ��û ��");
		                	System.out.println("$%@#!@*$^@#$%!@#$!%#$%!@#$!%...\n ������ȭ���� �� �þ�!");	
		                	System.out.println("�ءءءءءءءءءءء� �������� �˴ϴ� �ءءءءءءءءءءء�");
		                	Power = 0;
			            	Day++;
			            	DdayNumber--;
		                	break;
		                }
		                else if(v == 3) {
		                	System.out.println(" [ ��� ���� ��Ű�� ]");		                	
		                	System.out.println(" 1. ���߹ٻ�� �ֹ�\n 2. �������� �ֹ�");
		                	System.out.println("---------------------------------------------------------");
		                	int food = input.nextInt();
		                	if(food == 1) {
		                		Money -= 19000;
		                		System.out.println("���߹ٻ�� �ֹ� ��\n");
		                		System.out.println("[��: "+Money+"]");
		                	}
		                	else {
		                		Money -= 19000;
		                		System.out.println("�������� �ֹ� ��\n");
		                		System.out.println("[��: "+Money+"]");
		                	}
		                }
		                else if(v == 4) {
		                	System.out.println(" [ ��ȭ / ���� ���� ���� ]");		                	
		                	System.out.println(" 1. ��ȭ \n 2. ����");
		                	System.out.println("---------------------------------------------------------");
		                	int movie = input.nextInt();
		                	if( movie == 1 ) {
		                		System.out.println("[ ��ȭ ]\n");
		                		System.out.println("                        �� �� ��\n ");
		                		System.out.println("'����ī : ����ī, �ܵ���, �ϸ����� ��ī��, �� ����� ������, �״� �� ���� '");
		                		System.out.println(" �� ------dong \n");
		                		System.out.println(" ��ȭ���� ���� �����ȳ�.. ");
		                		System.out.println("�ءءءءءءءءءءء� �������� �˴ϴ� �ءءءءءءءءءءء�");
		                		
		                		Power = 0;
				            	Day++;
				            	DdayNumber--;
			                	break;
		                		
		                	}
		                	else {
		                		System.out.println("[ ���ø��� ]\n");
		                		System.out.println("                        �� ��\n ");
		                		System.out.println("'������: �� �Ѹ��� �鼺�� �������� ���� ���Դϴ�. '");
		                		System.out.println(" ����: ��ϳ�? �� �ƱⰡ ���� �ǰ��غ����� �ʴ���? \n");
		                		System.out.println(" ...��?.. \n ���� 4 ���ȴ�!");
		                		System.out.println("�ءءءءءءءءءءء� �������� �˴ϴ� �ءءءءءءءءءءء�");
		                		
		                		Money = -10000;
		                		Power = 0;
				            	Day++;
				            	DdayNumber--;
			                	break;
		                	}
		                }
		                else {
		                	System.out.println("[ ���̳� �� �ں���?]\n");
		                	System.out.println();
		                	System.out.println();
		                	Power = 0;
			            	Day++;
			            	DdayNumber--;
			            	System.out.println("�ءءءءءءءءءءء� �������� �˴ϴ� �ءءءءءءءءءءء�");
		                	break;
		                }
	          
	         }while(select == 4);
		          
	                	
		      break;
		      
		            case 5:
		          	  if(Power >= 51 ) {
 	   	                 System.out.println("�ءءءءءءءءءءءء� ���� �Ƿε��� "+Power+"�Դϴ�.�ءءءءءءءءءءءءءء� ");
	                     System.out.println("................... �Ƿε��� �ּ� 50�̾���մϴ�!...................");
	                     System.out.println("---------------------------------------------------------");
	                     System.out.println("[������]\n 1. ���� ���\n 3.ģ��Ȱ��\n 4.��մ�⸸ ���ð����մϴ�............");	
			            	 
			                 break;	
             	  }
		            	System.out.println("\t\t >>>> �����ϱ� <<<< \t\t");
		             	System.out.println();		                	
	                	System.out.println(" 1. �����ϱ� \n 2. �����ϱ�");
	                	System.out.println("---------------------------------------------------------");
	                	int w = input.nextInt();
	                	if(w == 1) {
	                		Power+=50;
	                		Intelli+=10;
	                		System.out.println("[ �����ϱ� ]\n");
	                		System.out.println("�μ����� @#$%SELECT publisher FROM Book SELECT!@#$!\n");
	                		System.out.println("master�귣ġ�� ������ $%@#!@*$^@hotfix�� ����#$%!@#$!%...\n");
	                		System.out.println("                         [ �Ƿε� : "+Power+" / ���� : "+Intelli+"]" );
	                		Power = 0;
	      		            Day++;
	      		            DdayNumber--;
	      		            System.out.println("�ءءءءءءءءءءء� �������� �˴ϴ� �ءءءءءءءءءءء�");
	      		            break;
	                	}
	      }
		}  
	}
  }
}
//if(DdayNumber==0)
//System.exit(0);//
//break;// //������ while������ ���� ������ ��*/
	      // TODO Auto-generated method stub

	   

