package projectTask;

import java.sql.Date;

public class Task {
	
	private int id;
	private String nom;
	private String description;
	private Date dateEcheance;
	
	/**
	 * @param id
	 * @param nom
	 * @param description
	 * @param dateEcheance
	 */
	public Task(int id, String nom, String description, Date dateEcheance) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.dateEcheance = dateEcheance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	
	
}
