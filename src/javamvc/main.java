package javamvc;

public class main{
	
	public static void main(String[] args){
		Board b = new Board();
		Board b1 = new Board();
		Views views = new Views(new DisplayGraphics(b,b1)); 
		views.setPresenter(new Presenter(new Model(), views));
		
	}

}
