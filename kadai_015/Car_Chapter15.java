package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 	1;
	private int speed = 10;
	
	int beforeGear = this.gear;
	
	public void gearChange(int afterGear) {
		beforeGear = this.gear;
		this.gear = afterGear;
		System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
		beforeGear = this.gear;
	}
	public void run () {
		switch(this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		case 6 -> this.speed = 60;
		}
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	

}
