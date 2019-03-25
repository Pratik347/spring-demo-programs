
public class Projector {
	private String colour;
	private String model;
	
	public String switchOnProjector() {
		return "Projector is switched On !!";
	}
	
	public String switchOffProjector() {
		return "Projector is switched Off !!";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
