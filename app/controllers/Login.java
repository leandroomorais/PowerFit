package controllers;

import models.Administrador;
import play.mvc.Controller;


public class Login extends Controller {
	
	public static void login() {
		render();
	}
	
	public static void entrar(String username, String senha) {
		Administrador administrador = Administrador.find("username = ? and senha = ?", username, senha).first();
	
		if(administrador == null) {
			flash.error("Usuário ou senha inválidos");
			params.flash();
			login();
		}else {
			session.put("nome", administrador.nome);
			renderTemplate("Administradores/portalAdministrador.html", administrador);
			
		}
		
		
	}
	public static void logout() {
		session.clear();
		System.out.println("logout");
		renderTemplate("Login/login.html");
	}
	

	

}
