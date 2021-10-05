package Bai2;
	
public class Thread3 extends Thread{
	FileTReader f;
	Thread3(FileTReader f){
		this.f=f;
	}
	public void run() {
		f.read("D:\\\\Thang\\\\phat trien he thong tich hop\\\\FIle\\\\3.txt");
	}
}
