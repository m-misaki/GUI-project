import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[]args){
		Test t=new Test();
		t.connection();
		System.out.println("Hello World!");
	}
	
	Socket s;
	public Test(){
	}
	
	void connection(){
		try {
			s=new Socket("127.0.0.1",4242);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
