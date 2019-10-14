package spring;

public class StuClass {
	
	private int cid;
	private String cname;
	
	public StuClass() {
		super();
		
	}
	
	public StuClass(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "StuClass [cid=" + cid + ", cname=" + cname + "]";
	}
}
