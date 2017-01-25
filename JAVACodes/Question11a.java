import java.util.scanner;

class loop{
	void loop(int x){
		for(int y=0, y<x+1,y++){
			System.out.print(y);
		}
	}
}

class Question11a{
	scanner s = new scanner(System.in);
	loop l = new loop();
	
	System.out.println("enter how much line you want to print:");
	
	int x = s.nextint();
	
	l.loop(x);
}