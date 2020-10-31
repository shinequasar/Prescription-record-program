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
		int size = vector.size(); //����� ������ ����
		for(int i =0; i<size; i++) 
			if(vector.get(i).getName().equals(s))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator �������̽���  �̿��ؼ� ������ ���� Ž��
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
	
	public void medicineList() { // �̸� �߰��صξ��� ��ǰ ��ϵ��� ����ϴ� �Լ�
			Vector<Medicine> it = MedicineManager.vector;
			for(int i=0; i<it.size(); i++) {
			System.out.println("�� "+it.get(i).getName());
			}
	}
	
	public Vector medicineseNameList(){ // ������ �˸��� ����� �߰��� �������� ��Ƶδ� �Լ�
		Vector<String> vectorMedicinese = new Vector<String>();
		System.out.println(">> �Է� ���Ḧ ���Ͻø� #�� �־��ּ���. ");
		String name=null;
		while(name != "#") {
			System.out.print(">> �Է� : ");
			name = in.nextLine();
			if(!name.equals("#")) {
				vectorMedicinese.add(name);
				System.out.println("�߰��Ǿ����ϴ�."); 
			}
			else {
				System.out.println("�Է��� �����մϴ�.\n"); 
				break;
			}
		} 
		return vectorMedicinese;
	}

	
}
