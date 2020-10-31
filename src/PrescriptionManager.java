import java.util.Iterator;
import java.util.Vector;

public class PrescriptionManager implements Manager{
static Vector<Prescription> vector = new Vector<Prescription>();	
	

	public void make(Prescription s, int index,String doctor,String period) {  //처방전을 생성하는 함수
		Prescription f = s;
		int i = index;
		String d =doctor;
		String p = period;
		System.out.println("<진료처방전> \n [기본정보]");
		System.out.println("● 환자 성명 : "+PatientManager.vector.get(i).getName());
		System.out.println("● 나이 : "+PatientManager.vector.get(i).getAge());
		System.out.println("● 성별 : "+PatientManager.vector.get(i).getGender());
		System.out.println("● 주민등록번호 : "+PatientManager.vector.get(i).getIdNum());
		System.out.println("● 혈액형 : "+PatientManager.vector.get(i).getBloodType());
		System.out.println("● 병명 : "+PatientManager.vector.get(i).getDiseaseName()+"\n");
		System.out.println(" [처방의약품]");
		System.out.println("# 병명 : "+PatientManager.vector.get(i).getDiseaseName());
		
		int count =PatientManager.vector.get(i).getDisease().getVector().size(); //환자가 해당하는 질병속 처방의약품의 수
		for(int j=0; j<count; j++) { //환자가 해당하는 질병속 처방의약품을 모두 출력
			System.out.println("● "+PatientManager.vector.get(i).getDisease().getVector().get(j));
		}
		System.out.println("● 총 처방일 수: "+p+"\n");
		
		//질환 분류별로 각각 다른 주의사항 (파일입출력)
		System.out.println("	[해당 질환의 주의사항]");
		String fname = f.getFname()+".txt";
		FileInputOutput fileMgr = new FileInputOutput("C:\\Users\\1\\eclipse-workspace\\Prescription\\src\\"+fname);
		fileMgr.loadLine();
		System.out.println("");
		System.out.println("	[처방일]\n"+f.getDate());
		System.out.println("");
		System.out.println("	[담당의사]\n"+f.getDoctor()+"\n");
		
		
		
		
	}
	
	public void add(Prescription s) {  //처방전을 추가하는 함수
		vector.add(s);
	}
	
	public Prescription get(String name) {
		int size = vector.size(); //저장된 원소의 개수
		for(int i =0; i<size; i++) 
			if(vector.get(i).getPatientName().equals(name))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator 인터페이스를  이용해서 집합의 원소 탐색
		Iterator<Prescription> it = vector.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
	}

	@Override
	public void remove(String s) {
		Iterator<Prescription> it = vector.iterator();
		int i = 0;
		while(it.hasNext()) {
			if(it.next().getPatientName().equals(s))
				vector.remove(i);
			i++;
		}
	}

	public int check(String name) { //처방전을 만드려고 하는 환자가 환자 목록에 존재하는지 체크.
		Vector<Patient> it = PatientManager.vector;
		int a = 0;
		for(int i=0; i<it.size(); i++) {
			if(it.get(i).getName().equals(name)) {
				System.out.println("**환자 목록에 "+name+"이(가) 존재합니다.\n");
				a = i; break; //환자목록의 인덱스 받아오기
			}
			else {
				a = -1;
			}
		}
		if(a== -1) {
			System.out.println("**환자 목록에 존재하지 않습니다. 등록을 먼저 해주십시오.\n"); 
			return -1; // 환자 목록에 존재하지 않음.
		}
		else return a; //환자목록에 존재함.

	}
	
}
