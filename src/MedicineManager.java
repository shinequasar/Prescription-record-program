import java.util.Iterator;
import java.util.Vector;
import java.util.Iterator;
public class MedicineManager implements Manager{
	
	static Vector<Medicine> vector = new Vector<Medicine>(); 
	
	public void add(Medicine s) {
		vector.add(s);
		
	}
	
	
	public Medicine get(String s) {
		int size = vector.size(); //����� ������ ����
		for(int i =0; i<size; i++) 
			if(vector.get(i).getName().equals(s))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator �������̽���  �̿��ؼ� ������ ���� Ž��
		Iterator<Medicine> it = vector.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	@Override
	public void remove(String s) {
		Iterator<Medicine> it = vector.iterator();
		int i = 0;
		while(it.hasNext()) {
			if(it.next().getName().equals(s))
				vector.remove(i);
			i++;
		}
	}

	
	
}
