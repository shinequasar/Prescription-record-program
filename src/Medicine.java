
public class Medicine {
	private String name; // ���̸�
	private String madeDate; // ��������
	private String useDate;  //������
	
	public Medicine(String name, String madeDate, String useDate) {
		super();
		this.name = name;
		this.madeDate = madeDate;
		this.useDate = useDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}

	public String getUseDate() {
		return useDate;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

	@Override
	public String toString() {
		return "��  ���̸� :" + name + " / �������� : " + madeDate + " / ������ " + useDate ;
	}

	
}
