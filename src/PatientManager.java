import java.util.Iterator;
import java.util.Vector;

public class PatientManager implements Manager{
	static Vector<Patient> vector = new Vector<Patient>();	
	
	public void add(Patient s) {
		vector.add(s);
	}
	
	public Patient get(String name) {
		int size = vector.size(); //저장된 원소의 개수
		for(int i =0; i<size; i++) 
			if(vector.get(i).getName().equals(name))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator 인터페이스를  이용해서 집합의 원소 탐색
		Iterator<Patient> it = vector.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
	}

	@Override
	public void remove(String s) {
		Iterator<Patient> it = vector.iterator();
		int i = 0;
		while(it.hasNext()) {
			if(it.next().getName().equals(s))
				vector.remove(i);
			i++;
		}
	}
	
	public int check(String name) { //처방전을 만드려고 하는 환자가 환자 목록에 존재하는지 체크.
		Vector<Disease> it = DiseaseManager.vector;
		int a = 0;
		for(int i=0; i<it.size(); i++) {
			if(it.get(i).getName().equals(name)) {
				System.out.println("**질병 목록에 "+name+"이 존재합니다.\n");
				a = i; break; //질병목록의 인덱스 받아오기
			}
			else {
				a = -1;
			}
		}
		if(a==-1) {
			System.out.println("**질병 목록에 존재하지 않습니다. 등록을 먼저 해주십시오.\n"); 
			return -1; // 질병 목록에 존재하지 않음.
		}
		else return a; //질병목록에 존재함.

	}
	
}
