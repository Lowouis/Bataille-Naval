package javamvc;

public class Presenter {

	private Views views;
	private Model model;
	
	public Presenter(Model model, Views views){
		this.model = model;
		this.views = views;
	}
	
	public void orchestrator(){
		Model m = new Model();
	}
	
	public Model getModel(){
		return this.model;
	}
	
	
	
	
	
}

