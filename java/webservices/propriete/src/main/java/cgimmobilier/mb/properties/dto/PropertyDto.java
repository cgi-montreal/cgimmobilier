package cgimmobilier.mb.properties.dto;

/**
 * 
 * @author maxime.buttard
 *
 */
public class PropertyDto {
	
	private Integer id;
	
	private String reference;
	
	private String description;
	
	private DetailsDto detailsDTo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public DetailsDto getDetailsDTO() {
		return detailsDTo;
	}

	public void setDetailsDTO(DetailsDto detailsDTO) {
		this.detailsDTo = detailsDTO;
	}

	@Override
	public String toString() {
		return "PropertyDTO [id=" + id + ", reference=" + reference + ", description=" + description + ", detailsDTO="
				+ detailsDTo + "]";
	}

}
