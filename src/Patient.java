import java.util.Vector;

public class Patient extends Person{  //병원을 방문한 사람들 중 환자
	
	private String idNum;
	private String bloodType;
	private String diseaseName;
	private Disease disease;
	
	public Patient(String name, int age, String gender, Disease disease,String idNum,String bloodType, String diseaseName) {
		super(name, age, gender);
		this.disease = disease;
		this.idNum = idNum;
		this.bloodType = bloodType;
		this.diseaseName = diseaseName;
		
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	
	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "● "+  getName() + " / " + getAge() + " / " + getGender() + " / " + idNum + " / " + bloodType + " / " + diseaseName;
	}


	
}
