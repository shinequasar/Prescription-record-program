import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class PrescriptionMain {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menu; //����
		
		while(true){
			
			System.out.println("	<����ó���� ��� �ý���>\r\n\n"
					+ "-------------[MENU]---------------\r\n"
					+ "	1. �Ǿ�ǰ ���\r\n" + 
					"	2. ����, ó�� �Ǿ�ǰ ����\r\n" + 
					"	3. ȯ�� ���� ����\r\n" + 
					"	4. ���� ó���� ���\r\n" + 
					"	0. ���α׷� ����\r\n" + 
					"------------------------------------\r\n");
			
			System.out.print("�� ���θ޴� >> ");
			menu=in.nextInt();
			if(menu==0) {
				System.out.println("�� ����ó���� ��� �ý����� �����մϴ�.\n �̿����ּż� �����մϴ�.");
				break;
			}
			switch(menu) {
			case 1: MedicineMenu(); break;
			case 2: DieseaseMenu(); break; 
			case 3: PatientMenu(); break;
			case 4: PrescriptionMenu(); break; 
			}	
		}
		
	}
	


	public static void MedicineMenu() {  //1. �Ǿ�ǰ ���
		MedicineManager manager = new MedicineManager();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("�� �Ǿ�ǰ ��� (1.���, 2.�˻�, 3.���, 4.����, 0.��������) ");	
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.print("�� �Ǿ�ǰ �� : ");
					in.nextLine();
					String name = in.nextLine();
					System.out.print("�� �������� : ");
					String madeDate = in.nextLine();
					System.out.print("�� ������ : ");
					String useDate = in.nextLine();
					manager.add(new Medicine(name,madeDate,useDate)); 
					break;
			case 2: System.out.print("�� �˻� �� �Ǿ�ǰ �� : ");
					in.nextLine();
					name = in.nextLine();
					Medicine medicine = manager.get(name);
					System.out.println(medicine); break; 
			case 3: System.out.println("[�Ǿ�ǰ ���]");
					manager.show(); break;
			case 4: System.out.print("�� ������ �Ǿ�ǰ �� : ");
					name = in.next();
					manager.remove(name);
					break; 
			case 0: System.out.println("�� �������� �̵��մϴ�. \n");break;
			}	
		}
	}

	public static void DieseaseMenu() { //2. ����, ó�� �Ǿ�ǰ ����
		DiseaseManager manager2 = new DiseaseManager();
		Vector<String> vectorMedicinese = new Vector<String>();
		Scanner in = new Scanner(System.in);	
		while(true){
			System.out.println("�� ����, ó�� �Ǿ�ǰ ����(1.���, 2.�˻�, 3.���, 4.����, 0.��������) ");
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.println("	[�Ǿ�ǰ ���]");
					manager2.medicineList();  //�Ǿ�ǰ ����� ������ִ� �Լ�
					System.out.println("	[������ �ش��ϴ� �Ǿ�ǰ ���]");
					System.out.print("�� ���� �� : ");
					in.nextLine();
					String name = in.nextLine();
					System.out.print("�� ���赵 : ");
					String risk = in.nextLine();
					System.out.print("�� ��ȯ�з� : ");
					String group = in.nextLine();
					System.out.println("�� ó�� �Ǿ�ǰ�� ");
					vectorMedicinese = manager2.medicineseNameList(); // ������ �ش��ϴ� ó�� �Ǿ�ǰ�� ����� �Է�,�����ϴ� �Լ�
					manager2.add(new Disease(name,risk,group,vectorMedicinese)); //vector�� �߰�
					break;	
			case 2: System.out.print("�� �˻� �� ������ : ");
					in.nextLine();
					name = in.nextLine();
					Disease disease = manager2.get(name);
					System.out.println("	[�˻��� ��������]");
					System.out.println(disease); break; 
			case 3: System.out.println("[������ ó���Ǿ�ǰ ���]");
					manager2.show(); break;
			case 4: System.out.print("�� ������ ������ : ");
					name = in.next();
					manager2.remove(name);
					System.out.println("�� "+ name+"��(��) �����Ǿ����ϴ�. \n"); break; 
			case 0: System.out.println("�� �������� �̵��մϴ�. \n");break;
			}	
		}
	}

	

	private static void PatientMenu() { // 3. ȯ�� ���� ����
		PatientManager manager = new PatientManager();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("�� ȯ�� �������� (1.���, 2.�˻�, 3.���, 4.����, 0.��������) ");	
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.print("�� ���� : ");
					in.nextLine();
					String name = in.nextLine();
					System.out.print("�� ���� : ");
					String diseaseName = in.nextLine();
					int index = manager.check(diseaseName); // �Էµ� �̸��� ��ϵ� ������ �ִ��� �˻� �� �����Ѵٸ�  ������ �����ϴ� �ε����ޱ�
					if(index == -1) {
						break; //��ϵ� ������ ������ ����.
					}
					Disease disease = (Disease) DiseaseManager.vector.get(index); //�ٿ�ĳ����
					
					System.out.println("");
					System.out.print("�� ���� : ");
					int age = in.nextInt();
					System.out.print("�� ���� : ");
					in.nextLine();
					String gender = in.nextLine();
					System.out.print("�� �ֹε�Ϲ�ȣ : ");
					String idNum = in.nextLine();
					System.out.print("�� ������ : ");
					String bloodType = in.nextLine();
					manager.add(new Patient(name,age,gender,disease,idNum,bloodType,diseaseName)); 
					break;
			case 2: System.out.print("�� �˻��� ȯ�� �� : ");
					in.nextLine();
					name = in.nextLine();
					Patient patient = manager.get(name);
					System.out.println(patient); break; 
					
			case 3: System.out.println("	[ȯ�� ��� ���]");
					manager.show(); break;
			case 4: System.out.print("�� ������ ȯ�ڸ� : ");
					name = in.next();
					manager.remove(name);
					System.out.println("�� "+ name+"���� ������ �����Ǿ����ϴ�. \n"); 
					break; 
			case 0: System.out.println("�� �������� �̵��մϴ�. \n");break;
			}	
		}
	}

	
	private static void PrescriptionMenu() { //4. ���� ó���� ����, ���
		PrescriptionManager manager = new PrescriptionManager();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("�� ���� ó���� ���(1.����, 2.�˻�, 3.���, 4.����, 0.������������)");	
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.print("�� ó������ ������ ȯ���̸� �Է� : ");
					in.nextLine();
					String name = in.nextLine();
					int index = manager.check(name); // �Էµ� �̸��� ��ϵ� ȯ�ڰ� �ִ��� �˻� �� �����Ѵٸ�  ȯ�ڰ� �����ϴ� �ε����ޱ�
					if(index == -1) break; //��ϵ� ȯ�ڰ� ������ ����.
					System.out.println("");
					System.out.println("**���� ó������ �����մϴ�.");
					System.out.print("�� ����ǻ� �̸�(����ó) : ");
					String doctor = in.nextLine();
					System.out.print("�� ó���� �� : ");
					String period = in.nextLine();
					String fname = PatientManager.vector.get(index).getDisease().getGroup(); //�ش� ȯ���� ������ ��ȯ�з���
				System.out.println(fname);
					
					SimpleDateFormat format = new SimpleDateFormat ( "yyyy�� MM��dd�� : HH��mm��ss��"); //����ð� ���ϱ�
					Date time = new Date();		
					String date = format.format(time);	//���� �ð� ����
					manager.make(new Prescription(name,doctor,period,fname, date), index, doctor, period);
					//���⿡ doctor�� period�� �Ű�������  make�� �ѱ�� ����ϰ� �� �� add�� �߰��ϱ�
					
					
					
					manager.add(new Prescription(name,doctor,period,fname, date)); //ó���� ��Ͽ��߰�
					break;
			case 2: System.out.print("�� �˻��� ó������ ȯ�� �� : ");
					in.nextLine();
					name = in.nextLine();
					Prescription prescription = manager.get(name);
					System.out.println(prescription); break; 
					
			case 3: System.out.println("	[���� ó���� ���]");
					manager.show(); break;
			case 4: System.out.print("�� ������ ó������ ȯ�ڸ� : ");
					name = in.next();
					manager.remove(name);
					System.out.println("�� "+ name+"���� ����ó���� ������ �����Ǿ����ϴ�. \n"); 
					break; 
			case 0: System.out.println("�� �������� �̵��մϴ�. \n");break;
			}	
		}
	}
	
	
}
