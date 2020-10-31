import java.util.Iterator;
import java.util.Vector;

public class PatientManager implements Manager{
	static Vector<Patient> vector = new Vector<Patient>();	
	
	public void add(Patient s) {
		vector.add(s);
	}
	
	public Patient get(String name) {
		int size = vector.size(); //����� ������ ����
		for(int i =0; i<size; i++) 
			if(vector.get(i).getName().equals(name))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator �������̽���  �̿��ؼ� ������ ���� Ž��
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
	
	public int check(String name) { //ó������ ������� �ϴ� ȯ�ڰ� ȯ�� ��Ͽ� �����ϴ��� üũ.
		Vector<Disease> it = DiseaseManager.vector;
		int a = 0;
		for(int i=0; i<it.size(); i++) {
			if(it.get(i).getName().equals(name)) {
				System.out.println("**���� ��Ͽ� "+name+"�� �����մϴ�.\n");
				a = i; break; //��������� �ε��� �޾ƿ���
			}
			else {
				a = -1;
			}
		}
		if(a==-1) {
			System.out.println("**���� ��Ͽ� �������� �ʽ��ϴ�. ����� ���� ���ֽʽÿ�.\n"); 
			return -1; // ���� ��Ͽ� �������� ����.
		}
		else return a; //������Ͽ� ������.

	}
	
}
