package pruebas;

public class CuentaCorriente {
	//nombre apellidos, edad, el número de cuenta y el saldo.
	private String nombre;
	private String apellido;
	private String cuenta;
	private Double saldo;
	/****************************** Constructor *******************/	
	public CuentaCorriente(String nombre, String apellido, String cuenta, Double saldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta = cuenta;
		this.saldo = saldo;
	}
	// número de cuenta y el saldo.
		public CuentaCorriente(String cuenta, Double saldo) {
			this.cuenta = cuenta;
			this.saldo = saldo;
		}	
		
	public CuentaCorriente() {}
	/****************************** methods *******************/			
		// método ingresar que incremente el saldo en una cantidad
		public void ingresar(Double ingresoSaldo) {
			this.saldo += ingresoSaldo;
		}
		//método reintegro que decremente el saldo en una cantidad
		public void reintegro(Double reintegroSaldo) {
			this.saldo -= reintegroSaldo;
		} 
		//método para concatenar con un texto adjunte el número de cuenta y el saldo.
		public String concatenar() {
			 return "Cuenta Numero" + this.cuenta + " saldo = " + this.saldo; 
		}
	/****************************** getter and setter *******************/	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}	
}
