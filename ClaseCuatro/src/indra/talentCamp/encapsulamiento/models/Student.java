package indra.talentCamp.encapsulamiento.models;

public class Student extends Person{

    private boolean prefersFrontend;
    
    public Student(String name, int document, String address, boolean prefersFrontend) {
        super(name, document, address);
        this.prefersFrontend = prefersFrontend;
    }

	public boolean isPrefersFrontend() {
		return prefersFrontend;
	}
	public void setPrefersFrontend(boolean prefersFrontend) {
		this.prefersFrontend = prefersFrontend;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", document=" + this.getDocument() + ", address=" + this.getAddress() + ", prefersFrontend="
				+ prefersFrontend + "]";
	}
}
