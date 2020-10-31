
public class Prescription {  //이전에 입력된 정보들을 바탕으로 자동으로 써지는 처방전에 담기는 정보들
	private String patientName; // 처방전을 작성할 환자명
	private String doctor; // 담당의사
	private String period; //처방일 수
	private String fname; // 읽어들일 질환분류별 주의사항이 담긴 파일의 이름
	private String date; //진료일
	
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
		return "● 진료처방전) " + " 환자명 : "+ patientName + " / " + " 담당의사명 : "+doctor + " / "+" 처방일 : "+ date + "";
	}
	
	
	
	
	
}
