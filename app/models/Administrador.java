package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Administrador extends Model {
	
	public String nome;
	public String username;
	public String senha;

}
