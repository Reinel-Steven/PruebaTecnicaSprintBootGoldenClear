package pruebas;

public class CuentaAhorro extends CuentaCorriente{
	
//	Tiene un atributo más de tipo doublé que es el interés. 
	private Double interes;

	public CuentaAhorro() {	}
//	Tiene un constructor con parámetros cuenta, saldo e interés.
	public CuentaAhorro(String cuenta, Double saldo, Double interes) {
		super(cuenta, saldo);
		this.interes = interes;
	}
//	Tiene un constructor con parámetros cuenta y saldo. El interés se inicializará con 15.3
	public CuentaAhorro(String cuenta, Double saldo) {
		super(cuenta, saldo);
		this.interes = 15.3;
	}
	 
//	Tiene un método para calcular interés que incrementará el saldo según el interés.
	public void calcularInteres(Double interes) {
		setSaldo(getSaldo() + interes);
	}
}
