import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class DiseaseManager implements Manager{
	static Vector<Disease> vector = new Vector<Disease>();	 
	Scanner in = new Scanner(System.in);
	
	public void add(Disease s) {
		vector.add(s);
	}
	
	public Disease get(String s) {
		int size = vector.size(); //저장된 원소의 개수
		for(int i =0; i<size; i++) 
			if(vector.get(i).getName().equals(s))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator 인터페이스를  이용해서 집합의 원소 탐색
		Iterator<Disease> it = vector.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
	}

	@Override
	public void remove(String s) {
		Iterator<Disease> it = vector.iterator();
		int i = 0;
		while(it.hasNext()) {
			if(it.next().getName().equals(s))
				vector.remove(i);
			i++;
		}
	}
	
	public void medicineList() { // 미리 추가해두었던 약품 목록들을 출력하는 함수
			Vector<Medicine> it = MedicineManager.vector;
			for(int i=0; i<it.size(); i++) {
			System.out.println("＊ "+it.get(i).getName());
			}
	}
	
	public Vector medicineseNameList(){ // 질병에 알맞은 약들을 추가해 질병별로 담아두는 함수
		Vector<String> vectorMedicinese = new Vector<String>();
		System.out.println(">> 입력 종료를 원하시면 #을 넣어주세요. ");
		String name=null;
		while(name != "#") {
			System.out.print(">> 입력 : ");
			name = in.nextLine();
			if(!name.equals("#")) {
				vectorMedicinese.add(name);
				System.out.println("추가되었습니다."); 
			}
			else {
				System.out.println("입력이 종료합니다.\n"); 
				break;
			}
		} 
		return vectorMedicinese;
	}

	
}
