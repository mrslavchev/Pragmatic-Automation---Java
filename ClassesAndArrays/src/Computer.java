
public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private int hardDiskMemory;
	private int freeMemory;
	private String operatingSystem;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isNotebook() {
		return isNotebook;
	}
	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}
	public int getHardDiskMemory() {
		return hardDiskMemory;
	}
	public void setHardDiskMemory(int hardDiskMemory) {
		this.hardDiskMemory = hardDiskMemory;
	}
	public int getFreeMemory() {
		return freeMemory;
	}
	public void setFreeMemory(int freeMemory) {
		this.freeMemory = freeMemory;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Computer [year=" + year + ", price=" + price + ", isNotebook=" + isNotebook + ", hardDiskMemory="
				+ hardDiskMemory + ", freeMemory=" + freeMemory + ", operatingSystem=" + operatingSystem + "]";
	}
	
	public void changeOperatingSystem(String newOperatingSystem){
		this.operatingSystem = newOperatingSystem;
	}
	
	public void useMemory(double memory){
		if (memory <= this.freeMemory) {
			this.freeMemory -= memory;	
		}else {
			System.out.println("Not enough memory.");
		}
	}
	
	
	
	
}
