package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {

	ruedas=4;
	largo=2000;
	ancho=300;
	motor=1600;
	peso_plataforma=500;
	
	
	
	}
public String dime_largo() {//metodo getter devuelve datos 
	
return " el largo de el coche es"+largo;

}

public  void establece_color(){///metodo setter no devuelve 
	color="azul";
}
public String dime_color() {//getter
	return "el color del coche es "+color;//cada vez que use getter me tiene que devolver un dato o sea return
}
public String dime_ruedas() {
	return "las ruedas del coche son"+ruedas;
}

}