import java.util.Vector;

public class Disease {
	private String name; //병명
	private String risk; // 병의 위험도
	private String group; // 질환분류
	private Vector<String> vector = new Vector<String>(); //처방 의약품 모음
	
	public Disease(String name, String risk, String group, Vector<String> vector) {
		super();
		this.name = name;
		this.risk = risk;
		this.group = group;
		this.vector = vector;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Vector<String> getVector() {
		return vector;
	}

	public void setVector(Vector<String> vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return "●  질병명 : " + name + 
				" / 위험도 : " + risk + 
				" / 질환분류 : " + group +
				" /  처방 의약품명 : " + vector;
	}
	

}
