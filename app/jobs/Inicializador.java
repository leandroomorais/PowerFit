package jobs;

import models.Administrador;
import models.Cliente;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {
	
	@Override
	public void doJob() throws Exception {
		if(Administrador.count() == 0) {
			Administrador administrador = new Administrador();
			administrador.nome = "Mariana";
			administrador.senha = "1234";
			administrador.username = "2018";
		}
	}
	

}
