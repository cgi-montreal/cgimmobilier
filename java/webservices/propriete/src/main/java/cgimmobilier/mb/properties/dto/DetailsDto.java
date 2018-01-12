package cgimmobilier.mb.properties.dto;

/**
 * 
 * @author maxime.buttard
 *
 */
public class DetailsDto {

	private Integer id;
	
	private Integer propertyId;
	
	private String quartier;
	
	private Integer superficieHabitable;
	
	private Integer superficieTerrain;
	
	private Integer dateConstruction;
	
	private Boolean neuf;
	
	private Integer nbEtage;
	
	private String style;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public Integer getSuperficieHabitable() {
		return superficieHabitable;
	}

	public void setSuperficieHabitable(Integer superficieHabitable) {
		this.superficieHabitable = superficieHabitable;
	}

	public Integer getSuperficieTerrain() {
		return superficieTerrain;
	}

	public void setSuperficieTerrain(Integer superficieTerrain) {
		this.superficieTerrain = superficieTerrain;
	}

	public Integer getDateConstruction() {
		return dateConstruction;
	}

	public void setDateConstruction(Integer dateConstruction) {
		this.dateConstruction = dateConstruction;
	}

	public Boolean getNeuf() {
		return neuf;
	}

	public void setNeuf(Boolean neuf) {
		this.neuf = neuf;
	}

	public Integer getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(Integer nbEtage) {
		this.nbEtage = nbEtage;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "DetailsDTO [id=" + id + ", propertyId=" + propertyId + ", quartier=" + quartier
				+ ", superficieHabitable=" + superficieHabitable + ", superficieTerrain=" + superficieTerrain
				+ ", dateConstruction=" + dateConstruction + ", neuf=" + neuf + ", nbEtage=" + nbEtage + ", style="
				+ style + "]";
	}
	
}
