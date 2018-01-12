package vo;

/**
 * 
 * @author maxime.buttard
 *
 */
public class PropertyVo {

	private String reference;
	
	private String description;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PropertyVo [reference=" + reference + ", description=" + description + "]";
	}
	
	
}
