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
public class Caracteristiques {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy="caracteristiques")
	private Property property;
	
	private String modeDeChauffage;
	
	private String proximite;
	
	private String revetements;
	
	private String sousSol;
	
	private String stationnement;
	
	private String systemeEgout;

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

	public String getModeDeChauffage() {
		return modeDeChauffage;
	}

	public void setModeDeChauffage(String modeDeChauffage) {
		this.modeDeChauffage = modeDeChauffage;
	}

	public String getProximite() {
		return proximite;
	}

	public void setProximite(String proximite) {
		this.proximite = proximite;
	}

	public String getRevetements() {
		return revetements;
	}

	public void setRevetements(String revetements) {
		this.revetements = revetements;
	}

	public String getSousSol() {
		return sousSol;
	}

	public void setSousSol(String sousSol) {
		this.sousSol = sousSol;
	}

	public String getStationnement() {
		return stationnement;
	}

	public void setStationnement(String stationnement) {
		this.stationnement = stationnement;
	}

	public String getSystemeEgout() {
		return systemeEgout;
	}

	public void setSystemeEgout(String systemeEgout) {
		this.systemeEgout = systemeEgout;
	}

	@Override
	public String toString() {
		return "Caracteristiques [id=" + id + ", property=" + property + ", modeDeChauffage=" + modeDeChauffage
				+ ", proximite=" + proximite + ", revetements=" + revetements + ", sousSol=" + sousSol
				+ ", stationnement=" + stationnement + ", systemeEgout=" + systemeEgout + "]";
	}
	
}
