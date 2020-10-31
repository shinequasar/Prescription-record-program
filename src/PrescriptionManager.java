import java.util.Iterator;
import java.util.Vector;

public class PrescriptionManager implements Manager{
static Vector<Prescription> vector = new Vector<Prescription>();	
	

	public void make(Prescription s, int index,String doctor,String period) {  //ó������ �����ϴ� �Լ�
		Prescription f = s;
		int i = index;
		String d =doctor;
		String p = period;
		System.out.println("<����ó����> \n [�⺻����]");
		System.out.println("�� ȯ�� ���� : "+PatientManager.vector.get(i).getName());
		System.out.println("�� ���� : "+PatientManager.vector.get(i).getAge());
		System.out.println("�� ���� : "+PatientManager.vector.get(i).getGender());
		System.out.println("�� �ֹε�Ϲ�ȣ : "+PatientManager.vector.get(i).getIdNum());
		System.out.println("�� ������ : "+PatientManager.vector.get(i).getBloodType());
		System.out.println("�� ���� : "+PatientManager.vector.get(i).getDiseaseName()+"\n");
		System.out.println(" [ó���Ǿ�ǰ]");
		System.out.println("# ���� : "+PatientManager.vector.get(i).getDiseaseName());
		
		int count =PatientManager.vector.get(i).getDisease().getVector().size(); //ȯ�ڰ� �ش��ϴ� ������ ó���Ǿ�ǰ�� ��
		for(int j=0; j<count; j++) { //ȯ�ڰ� �ش��ϴ� ������ ó���Ǿ�ǰ�� ��� ���
			System.out.println("�� "+PatientManager.vector.get(i).getDisease().getVector().get(j));
		}
		System.out.println("�� �� ó���� ��: "+p+"\n");
		
		//��ȯ �з����� ���� �ٸ� ���ǻ��� (���������)
		System.out.println("	[�ش� ��ȯ�� ���ǻ���]");
		String fname = f.getFname()+".txt";
		FileInputOutput fileMgr = new FileInputOutput("C:\\Users\\1\\eclipse-workspace\\Prescription\\src\\"+fname);
		fileMgr.loadLine();
		System.out.println("");
		System.out.println("	[ó����]\n"+f.getDate());
		System.out.println("");
		System.out.println("	[����ǻ�]\n"+f.getDoctor()+"\n");
		
		
		
		
	}
	
	public void add(Prescription s) {  //ó������ �߰��ϴ� �Լ�
		vector.add(s);
	}
	
	public Prescription get(String name) {
		int size = vector.size(); //����� ������ ����
		for(int i =0; i<size; i++) 
			if(vector.get(i).getPatientName().equals(name))
				return vector.get(i);
		return null;
	}
	
	@Override
	public void show() {
		// Iterator �������̽���  �̿��ؼ� ������ ���� Ž��
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

	public int check(String name) { //ó������ ������� �ϴ� ȯ�ڰ� ȯ�� ��Ͽ� �����ϴ��� üũ.
		Vector<Patient> it = PatientManager.vector;
		int a = 0;
		for(int i=0; i<it.size(); i++) {
			if(it.get(i).getName().equals(name)) {
				System.out.println("**ȯ�� ��Ͽ� "+name+"��(��) �����մϴ�.\n");
				a = i; break; //ȯ�ڸ���� �ε��� �޾ƿ���
			}
			else {
				a = -1;
			}
		}
		if(a== -1) {
			System.out.println("**ȯ�� ��Ͽ� �������� �ʽ��ϴ�. ����� ���� ���ֽʽÿ�.\n"); 
			return -1; // ȯ�� ��Ͽ� �������� ����.
		}
		else return a; //ȯ�ڸ�Ͽ� ������.

	}
	
}
