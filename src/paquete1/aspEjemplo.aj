package paquete1;

public aspect aspEjemplo {
	
	pointcut function():
		call( void paquete1.ventanaPrincipal.actionPerformed(..));
	
	after(): function(){
		System.out.println("Cambio de Color");
	}
	
	before(): function(){
		System.out.println("Aspecto Realizado");
	}

}
