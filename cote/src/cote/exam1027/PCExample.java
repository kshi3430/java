package cote.exam1027;

public class PCExample {
	public static void main(String[] args) {
		Usb u1 = new MyStick();
		Usb u2 = new MySpoon();
		PC pc = new PC();
		pc.setport1(u1);
		System.out.println(pc.port1.read());
		pc.setport2(u2);
		System.out.println(pc.port2.read());
	}

}
