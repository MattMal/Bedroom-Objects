# Bedroom-Objects
Early coding object oriented learning project. I created a bedroom with a few objects in it (bed, lamp etc)


public class Main {

	public static void main(String[] args) {
		
		Television television = new Television("Samsung", 40, 55);
		Bed bed = new Bed("Ikea", "Queen", "Blue", "Memory");
		Dresser dresser = new Dresser("JYSK", 6, "Brown");
		
		BedRoom bedroom = new BedRoom(television, bed, dresser);
		
		bedroom.style();
		for(int i = 0; i<40; i++){
			television.channelUp();

		}
		System.out.println(television.getChannel());
	}

}


public class BedRoom {
	
	Television tv;
	Bed bed;
	Dresser dresser;
	public BedRoom(Television television, Bed bed, Dresser dresser) {
		this.tv = television;
		this.bed = bed;
		this.dresser = dresser;
	}
	
	public void style(){
		getBed().info();
		dresser.info();
		getTelevision().info();
	}
	
	public Television getTelevision() {
		return tv;
	}
	
	public Bed getBed() {
		return bed;
	}
	
	public Dresser getDresser() {
		return dresser;
	}
	
	
	
	

}


public class Television {
	String brand;
	int length;
	int width;
	int channel;

	public Television(String brandIn, int lengthIn, int widthIn) {
		this.brand =brandIn;
		this.length = lengthIn;
		this.width = widthIn;
	}
	
	public void info(){
		System.out.println("The TV is a " +getWidth()+" inch TV, made by "+getBrand()+". It is currently on channel "+getChannel());
	}
	
	public void powerOn(){
		System.out.println("TV Power ON");
	}
	
	public void powerOff(){
		System.out.println("TV Power OFF");
	}
	
	public void channelUp(){
		if (channel >= 100){
			return;
		}
//		System.out.println(channel++);
		channel++;
	}
	
public void channelDown(){
		if(channel <= 0){
			return;
		}
		System.out.println(channel--);
	}

	public String getBrand() {
		return brand;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getChannel() {
		return channel;
	}
	
}


public class Dresser {
	String manufacturer;
	int drawerNum;
	String color;
	public Dresser(String manufacturer, int drawerNum, String colorIn) {
		super();
		this.manufacturer = manufacturer;
		this.drawerNum = drawerNum;
		this.color = colorIn;
	}
	public void info(){
		System.out.println("The Dresser made by " +getManufacturer()+" and has "+getDrawerNum());
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getDrawerNum() {
		return drawerNum;
	}
}


public class Bed {
	String manufacturer;
	String sizeName;
	String color;
	String mattressType;
	
	public Bed(String manufacturerIn, String sizeNameIn, String colorIn, String mattressTypeIn) {
		this.manufacturer = manufacturerIn;
		this.sizeName = sizeNameIn;
		this.color = colorIn;
		this.mattressType = mattressTypeIn;
	}

	public void info(){
		System.out.println("The manufacturer of this bed is "+getManufacturer()+" and the bed size is " + getSizeName()+
				" The color of the mattress is "+ getColor()+", and it is a "+getMattressType()+" matress");
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public String getSizeName() {
		return sizeName;
	}

	public String getColor() {
		return color;
	}

	public String getMattressType() {
		return mattressType;
	}
	
	
	
	
		
	

}

