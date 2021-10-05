package Bai2;

public class Thread2 extends Thread{
	FileTReader f;
	Thread2(FileTReader f){
		this.f=f;
	}
	public void run() {
		f.read("D:\\\\Thang\\\\phat trien he thong tich hop\\\\FIle\\\\2.txt");
	}
}
