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
	
	private DetailsDto detailsDto;
	
	private CaracteristiquesDto caracteristiquesDto;

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

	public DetailsDto getDetailsDto() {
		return detailsDto;
	}

	public void setDetailsDto(DetailsDto detailsDTO) {
		this.detailsDto = detailsDTO;
	}

	public CaracteristiquesDto getCaracteristiquesDto() {
		return caracteristiquesDto;
	}

	public void setCaracteristiquesDto(CaracteristiquesDto caracteristiquesDto) {
		this.caracteristiquesDto = caracteristiquesDto;
	}

	@Override
	public String toString() {
		return "PropertyDto [id=" + id + ", reference=" + reference + ", description=" + description + ", detailsDTo="
				+ detailsDto + ", caracteristiquesDto=" + caracteristiquesDto + "]";
	}

}
