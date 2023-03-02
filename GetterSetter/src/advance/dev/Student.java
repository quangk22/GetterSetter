package advance.dev;

public class Student {
	private String name;
	private int old;
	private String address;
	private String phone;
	private double diemTrungBinh;

	Student(String name, int old, String address, String phone, double diemTrungBinh) {
		// TODO Auto-generated method stub
		this.name = name;
		this.old = old;
		this.address = address;
		this.phone = phone;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

}
