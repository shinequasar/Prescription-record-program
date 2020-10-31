
public class Prescription {  //������ �Էµ� �������� �������� �ڵ����� ������ ó������ ���� ������
	private String patientName; // ó������ �ۼ��� ȯ�ڸ�
	private String doctor; // ����ǻ�
	private String period; //ó���� ��
	private String fname; // �о���� ��ȯ�з��� ���ǻ����� ��� ������ �̸�
	private String date; //������
	
	public Prescription(String patientName, String doctor, String period, String fname, String date) {
		super();
		this.patientName = patientName;
		this.doctor = doctor;
		this.period = period;
		this.fname = fname;
		this.date = date;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date; 
	}

	@Override
	public String toString() {
		return "�� ����ó����) " + " ȯ�ڸ� : "+ patientName + " / " + " ����ǻ�� : "+doctor + " / "+" ó���� : "+ date + "";
	}
	
	
	
	
	
}
