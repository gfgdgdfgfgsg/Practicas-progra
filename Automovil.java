Esta clase modela un Automovil y su funcionamiento basico.
*/
public class Automovil {
	
	int velocidad = 0;			// La velocidad a la que se desplaza el auto
	boolean motor = false;		// Representa si el motor esta encendido (true) o apagado (false)
	String color;				// El color del auto
	String modelo;				// El modelo del auto
	String marca;			// La marca del auto
	static int numeroDeAutos = 0;	// La cantidad total de autos que se han creado

	
	/**
	* Inicializa un nuevo objeto Automovil.
	* 
	* @param fabricante: La compañia que fabrica el automovil. Este valor se convertira en el atributo marca del auto.
	* @param tipo: El nombre del modelo del automovil. Este valor se convertira en el atributo modelo del auto.
	*/
	public Automovil(String fabricante, String tipo){
		this.modelo = tipo;
		this.marca = fabricante;
		numeroDeAutos++;
	}

	public Automovil(String tono, String tipo, String fabricante) {
		this.color = tono;
		this.modelo = tipo;
		this.marca = fabricante;
	}

	public Automovil(int velocidad, boolean motor, String color, String marca, String modelo) {
		this.velocidad = velocidad;
		this.motor = motor;
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
	}

	public Automovil() {
		this(0, false, "Rojo", "Ford", "Fiesta");
	}
	
	/**
	* Enciende el motor del automovil.
	*/
	public void encenderMotor() {
		motor = true;
		System.out.println("Motor encendido");
	}
	
	/**
	* Apaga el motor del automovil.
	*/
	public void apagarMotor() {
		motor = false;
		System.out.println("Motor apagado");
	}
	
	/**
	* Incrementa la velocidad del automovil en la cantidad de kilometros/hora especificada.
	*
	* @param cantidad: El numero de km/h en que aumentara la velocidad del auto.
	*/
	public void acelerar(int cantidad) {
		if (motor) {
			velocidad += cantidad;
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor esta apagado!");
		}
	}
	
	/**
	* Reduce a cero la velocidad del auto.
	*/
	public void frenar() {
		velocidad = 0;
		System.out.println("Nos hemos detenido!");
	}

	public void frenar(int cantidad) {
		velocidad -= cantidad;
		if (velocidad < 0) velocidad = 0;
		System.out.println("Vamos a " + velocidad + " km/h");
	}
	
	/**
	* Nos muestra la velocidad a la que se esta desplazando el auto.
	* 
	* @return la velocidad del auto.
	*/
	public int verVelocidad() {
		return velocidad;
	}
	
	/**
	* Duplica la velocidad recibida.
	*
	* @param velocidad: la velocidad que sera duplicada.
	*/
	public void duplicarVelocidad(int velocidad){
		this.velocidad *= 2;
		System.out.println("Ahora vas a " + this.velocidad + " km/h!");
	}
	
	/**
	* Nos muestra la cantidad total de autos que se han creado a partir de la clase.
	* 
	* @return el total de autos creados.
	*/
	public static int verNumeroDeAutos(){
		return numeroDeAutos;
	}
	
	/**
	* Cambia el color del objeto 'auto' especificado a Negro
	*
	* @param auto: La instancia de la clase Automovil cuyo color sera cambiado.
	*/
	public static void pintar(Automovil auto){
		auto.color = "Negro";
	}

	static class Estereo { 
		public void reproducirCancion(String cancion) { 
		System.out.println("Now playing..." + cancion); 
		} 
	} 
		

	class Radiador {
		public void enfriar() {
			if(motor) {
				System.out.println("Enfriando...");
			} else {
				System.out.println("No tengo nada que enfriar");
			}
		}
	}
}
