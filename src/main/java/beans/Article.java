package beans;

public class Article {
	
	private String titre;
	
	private String description;
	
	private String contenu;
	
	private String auteur;
	
	public Article() {}

	public Article(String titre, String description, String contenu, String auteur) {
		super();
		this.titre = titre;
		this.description = description;
		this.contenu = contenu;
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Articles [titre=" + titre + ", description=" + description + ", contenu=" + contenu + ", auteur="
				+ auteur + "]";
	}
}
