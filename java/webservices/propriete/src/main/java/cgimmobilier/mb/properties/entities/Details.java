package cgimmobilier.mb.properties.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 
 * @author maxime.buttard
 *
 */
@Entity
public class Details {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy="details")
	private Property property;
	
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

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
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
		return "Details [id=" + id + ", quartier=" + quartier + ", superficieHabitable=" + superficieHabitable
				+ ", superficieTerrain=" + superficieTerrain + ", dateConstruction=" + dateConstruction + ", neuf="
				+ neuf + ", nbEtage=" + nbEtage + ", style=" + style + "]";
	}
	
}
