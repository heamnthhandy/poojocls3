package pojo;

public class pojodemo {
	private String carmodel;
	private String brand;
	private int yearofmfg;
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYearofmfg() {
		return yearofmfg;
	}
	public void setYearofmfg(int yearofmfg) {
		this.yearofmfg = yearofmfg;
	}
	public pojodemo()
	{
		System.out.println("coming from default constructor");
	}
	
	

}
