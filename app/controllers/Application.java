package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void conheca() {
    	renderTemplate("Application/conheca.html");
    }
    
    public static void planos() {
    	renderTemplate("Application/planos.html");
    }
    
    
    public static void contatos() {
    	renderTemplate("Application/contatos.html");
    }
}