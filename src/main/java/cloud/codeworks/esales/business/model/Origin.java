package cloud.codeworks.esales.business.model;

public enum Origin {
	
	NATIONAL("National"),
	INTERNATIONAL("International");
	
	private String description;
	
	Origin(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

}
