package oops;

public class Employee {
	private int primarykey;
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Employee(int aPrimaryKey, int aCode) {
		this.primarykey = aPrimaryKey;
		this.code = aCode;
	}

	public int getPrimarykey() {
		return primarykey;
	}

	public void setPrimarykey(int primarykey) {
		this.primarykey = primarykey;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + code; result = prime * result + primarykey;
	 * return result; }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (code != other.code)
			return false;
		if (primarykey != other.primarykey)
			return false;
		return true;
	}

	/*
	 * @Override
	 * 
	 * Object obj = new Employee(10);
	 * 
	 * Employee e1 = (Employee) obj;
	 * 
	 * public boolean equals(Object obj) { if (obj instanceof Employee) { return
	 * this.primarykey == ((Employee) obj).getPrimarykey() && this.code ==
	 * ((Employee) obj).getCode(); } return false;
	 * 
	 * }
	 * 
	 * @Override public int hashCode() { return this.primarykey + this.code; }
	 */
}
