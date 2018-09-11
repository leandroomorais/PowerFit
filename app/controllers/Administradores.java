package controllers;

import models.Administrador;
import play.mvc.Controller;

public class Administradores extends Controller {
	
	public static void portalAdministrador(Administrador administrador) {
		render(administrador);
	}
	
	public static void salvar(Administrador administrador) {
		administrador.save();
	}
	
	

}
