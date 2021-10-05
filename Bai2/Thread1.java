package Bai2;

public class Thread1 extends Thread{
	FileTReader f;
	Thread1(FileTReader f){
		this.f=f;
	}
	public void run() {
		f.read("D:\\\\Thang\\\\phat trien he thong tich hop\\\\FIle \\\\1.txt");
	}

}
