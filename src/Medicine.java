
public class Medicine {
	private String name; // 약이름
	private String madeDate; // 제조일자
	private String useDate;  //사용기한
	
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
		return "●  약이름 :" + name + " / 제조일자 : " + madeDate + " / 사용기한 " + useDate ;
	}

	
}
