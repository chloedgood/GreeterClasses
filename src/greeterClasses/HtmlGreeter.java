package greeterClasses;

public class HtmlGreeter extends Greeter {
	
	public String tagName;
	
	public HtmlGreeter(String greeting) {
		super(greeting);
		this.tagName = "hg1";
	}
	

	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		this.tagName = tagName;

	}
	
	public String getTagName() {
		return tagName;
		
	}
	
	public void setTagName(String tagName) {
		this.tagName = tagName;
		
	}
	
	@Override
	public String Greet(String name) {
		return "<" + tagName + ">" + super.Greet(name) + "</" + tagName + ">";
	}

}