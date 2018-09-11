package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cliente extends Model {
	
	public String nome;
	public int idade;
	public int peso;
	public int altura;
	public String username;
	public String senha;
	
}
