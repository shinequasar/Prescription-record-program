import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class PrescriptionMain {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menu; //선택
		
		while(true){
			
			System.out.println("	<진료처방전 기록 시스템>\r\n\n"
					+ "-------------[MENU]---------------\r\n"
					+ "	1. 의약품 등록\r\n" + 
					"	2. 질병, 처방 의약품 관리\r\n" + 
					"	3. 환자 정보 관리\r\n" + 
					"	4. 진료 처방전 출력\r\n" + 
					"	0. 프로그램 종료\r\n" + 
					"------------------------------------\r\n");
			
			System.out.print("▶ 메인메뉴 >> ");
			menu=in.nextInt();
			if(menu==0) {
				System.out.println("→ 진료처방전 기록 시스템을 종료합니다.\n 이용해주셔서 감사합니다.");
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
	


	public static void MedicineMenu() {  //1. 의약품 등록
		MedicineManager manager = new MedicineManager();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("※ 의약품 등록 (1.등록, 2.검색, 3.목록, 4.삭제, 0.메인으로) ");	
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.print("▷ 의약품 명 : ");
					in.nextLine();
					String name = in.nextLine();
					System.out.print("▷ 제조일자 : ");
					String madeDate = in.nextLine();
					System.out.print("▷ 사용기한 : ");
					String useDate = in.nextLine();
					manager.add(new Medicine(name,madeDate,useDate)); 
					break;
			case 2: System.out.print("▷ 검색 할 의약품 명 : ");
					in.nextLine();
					name = in.nextLine();
					Medicine medicine = manager.get(name);
					System.out.println(medicine); break; 
			case 3: System.out.println("[의약품 목록]");
					manager.show(); break;
			case 4: System.out.print("▷ 삭제할 의약품 명 : ");
					name = in.next();
					manager.remove(name);
					break; 
			case 0: System.out.println("→ 메인으로 이동합니다. \n");break;
			}	
		}
	}

	public static void DieseaseMenu() { //2. 질병, 처방 의약품 관리
		DiseaseManager manager2 = new DiseaseManager();
		Vector<String> vectorMedicinese = new Vector<String>();
		Scanner in = new Scanner(System.in);	
		while(true){
			System.out.println("※ 질병, 처방 의약품 관리(1.등록, 2.검색, 3.목록, 4.삭제, 0.메인으로) ");
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.println("	[의약품 목록]");
					manager2.medicineList();  //의약품 목록을 출력해주는 함수
					System.out.println("	[질병에 해당하는 의약품 등록]");
					System.out.print("▷ 질병 명 : ");
					in.nextLine();
					String name = in.nextLine();
					System.out.print("▷ 위험도 : ");
					String risk = in.nextLine();
					System.out.print("▷ 질환분류 : ");
					String group = in.nextLine();
					System.out.println("▷ 처방 의약품명 ");
					vectorMedicinese = manager2.medicineseNameList(); // 질병에 해당하는 처방 의약품들 목록을 입력,저장하는 함수
					manager2.add(new Disease(name,risk,group,vectorMedicinese)); //vector에 추가
					break;	
			case 2: System.out.print("▷ 검색 할 질병명 : ");
					in.nextLine();
					name = in.nextLine();
					Disease disease = manager2.get(name);
					System.out.println("	[검색된 질병정보]");
					System.out.println(disease); break; 
			case 3: System.out.println("[질병별 처방의약품 목록]");
					manager2.show(); break;
			case 4: System.out.print("▷ 삭제할 질병명 : ");
					name = in.next();
					manager2.remove(name);
					System.out.println("→ "+ name+"이(가) 삭제되었습니다. \n"); break; 
			case 0: System.out.println("→ 메인으로 이동합니다. \n");break;
			}	
		}
	}

	

	private static void PatientMenu() { // 3. 환자 정보 관리
		PatientManager manager = new PatientManager();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("※ 환자 정보관리 (1.등록, 2.검색, 3.목록, 4.삭제, 0.메인으로) ");	
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.print("▷ 성함 : ");
					in.nextLine();
					String name = in.nextLine();
					System.out.print("▷ 병명 : ");
					String diseaseName = in.nextLine();
					int index = manager.check(diseaseName); // 입력된 이름과 등록된 질병이 있는지 검사 후 존재한다면  질병이 존재하는 인덱스받기
					if(index == -1) {
						break; //등록된 질병이 없으면 중지.
					}
					Disease disease = (Disease) DiseaseManager.vector.get(index); //다운캐스팅
					
					System.out.println("");
					System.out.print("▷ 나이 : ");
					int age = in.nextInt();
					System.out.print("▷ 성별 : ");
					in.nextLine();
					String gender = in.nextLine();
					System.out.print("▷ 주민등록번호 : ");
					String idNum = in.nextLine();
					System.out.print("▷ 혈액형 : ");
					String bloodType = in.nextLine();
					manager.add(new Patient(name,age,gender,disease,idNum,bloodType,diseaseName)); 
					break;
			case 2: System.out.print("▷ 검색할 환자 명 : ");
					in.nextLine();
					name = in.nextLine();
					Patient patient = manager.get(name);
					System.out.println(patient); break; 
					
			case 3: System.out.println("	[환자 대기 목록]");
					manager.show(); break;
			case 4: System.out.print("▷ 삭제할 환자명 : ");
					name = in.next();
					manager.remove(name);
					System.out.println("→ "+ name+"님의 정보가 삭제되었습니다. \n"); 
					break; 
			case 0: System.out.println("→ 메인으로 이동합니다. \n");break;
			}	
		}
	}

	
	private static void PrescriptionMenu() { //4. 진료 처방전 생성, 출력
		PrescriptionManager manager = new PrescriptionManager();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("※ 진료 처방전 출력(1.생성, 2.검색, 3.목록, 4.삭제, 0.메인페이지로)");	
			System.out.print(">> ");
			int select = in.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: System.out.print("▷ 처방전을 생성할 환자이름 입력 : ");
					in.nextLine();
					String name = in.nextLine();
					int index = manager.check(name); // 입력된 이름과 등록된 환자가 있는지 검사 후 존재한다면  환자가 존재하는 인덱스받기
					if(index == -1) break; //등록된 환자가 없으면 중지.
					System.out.println("");
					System.out.println("**진료 처방전을 생성합니다.");
					System.out.print("▷ 담당의사 이름(연락처) : ");
					String doctor = in.nextLine();
					System.out.print("▷ 처방일 수 : ");
					String period = in.nextLine();
					String fname = PatientManager.vector.get(index).getDisease().getGroup(); //해당 환자의 질병의 질환분류명
				System.out.println(fname);
					
					SimpleDateFormat format = new SimpleDateFormat ( "yyyy년 MM월dd일 : HH시mm분ss초"); //현재시간 구하기
					Date time = new Date();		
					String date = format.format(time);	//현재 시간 저장
					manager.make(new Prescription(name,doctor,period,fname, date), index, doctor, period);
					//여기에 doctor랑 period를 매개변수로  make로 넘기고 출력하게 한 후 add로 추가하기
					
					
					
					manager.add(new Prescription(name,doctor,period,fname, date)); //처방전 목록에추가
					break;
			case 2: System.out.print("▷ 검색할 처방전의 환자 명 : ");
					in.nextLine();
					name = in.nextLine();
					Prescription prescription = manager.get(name);
					System.out.println(prescription); break; 
					
			case 3: System.out.println("	[진료 처방전 목록]");
					manager.show(); break;
			case 4: System.out.print("▷ 삭제할 처방전의 환자명 : ");
					name = in.next();
					manager.remove(name);
					System.out.println("→ "+ name+"님의 진료처방전 정보가 삭제되었습니다. \n"); 
					break; 
			case 0: System.out.println("→ 메인으로 이동합니다. \n");break;
			}	
		}
	}
	
	
}
