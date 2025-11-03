package cote.exam1027;

public class MyStick implements Usb{
	public long size = 8 * 1073741824L; //8기가 바이트
	public long currentUsage = 0;
	
	//기본 생성자
	public MyStick() {
		
	}
	//기가 단위를 입력받는 생성자
	public MyStick(int giga) {
		size = giga * 1073741824L;
	}
	
	public String read() {
		return "총" + currentUsage + "바이트사용";
	}
	public void write(long dataSize) {
		long leftSize = size - currentUsage;
		if(dataSize <= leftSize) {
			currentUsage += dataSize;
		}
	}

}
