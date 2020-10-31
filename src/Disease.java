import java.util.Vector;

public class Disease {
	private String name; //����
	private String risk; // ���� ���赵
	private String group; // ��ȯ�з�
	private Vector<String> vector = new Vector<String>(); //ó�� �Ǿ�ǰ ����
	
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
		return "��  ������ : " + name + 
				" / ���赵 : " + risk + 
				" / ��ȯ�з� : " + group +
				" /  ó�� �Ǿ�ǰ�� : " + vector;
	}
	

}
