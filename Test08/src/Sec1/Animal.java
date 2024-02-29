package Sec1;

public class Animal {
	private String type;
	protected String name;
	protected boolean spine;
	
	public String print() {
		return toString();
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", spine=" + spine + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
}
