package cuentasBanco;

/**
 * Clase CuentaBanco
 * @author Dario
 * @version 0.0
 */
public class CuentaBanco {

	/**
	 * Nombre del cliente
	 */
    private String nombre;
    /**
	 * Codigo de la cuenta
	 */
    private String cuenta;
    /**
	 * Saldo de la cuenta
	 */
    private double saldo;
    /**
	 * Tipo de interes de la cuenta
	 */
    private double tipoInterés;

    /**
     * Constructor vacio de la clase CuentaBanco
     * @author Dario
     * @version 0.0
     */
    public CuentaBanco()
    {
    }

    /**
     * Constructor de la clase CuentaBanco
     * @author Dario
     * @version 0.0
     * @param nom nombre del cliente
     * @param cue codigo de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo el tipo de interees
     */
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Getter del nombre del cliente
     * @author Dario
     * @version 0.0
     * @return nombre del cliente
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Setter del nombre del cliente
     * @author Dario
     * @version 0.0
     * @param nombre nombre del cliente
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
     * Getter del codigo de la cuenta
     * @author Dario
     * @version 0.0
     * @return codigo de la cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
     * Setter del codigo de la cuenta
     * @author Dario
     * @version 0.0
     * @param cuenta codigo de la cuente
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
     * Getter del nombre del saldo de la cuenta
     * @author Dario
     * @version 0.0
     * @return saldo de la cuenta
     */
	public double getSaldo() {
		return saldo;
	}

	/**
     * Setter del saldo de la cuenta
     * @author Dario
     * @version 0.0
     * @param saldo saldo de la cuente
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
     * Getter del nombre del tipo de interes
     * @author Dario
     * @version 0.0
     * @return tipo de interes
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
     * Setter del tipo de interes
     * @author Dario
     * @version 0.0
     * @param tipoInterés tipo de interes
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
     * Metodo para obtener el saldo de la cuenta
     * @author Dario
     * @version 0.0
     * @return saldo de la cuenta
     */
	public double estado()
    {
        return getSaldo();
    }

	/**
     * Metodo para ingresar una cantidad de dinero en la cuenta
     * @author Dario
     * @version 0.0
     * @param cantidad cantidad de dinero a ingresar
     * @exception Exception se ha introducido una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar una cantidad de dinero en la cuenta
     * @author Dario
     * @version 0.0
     * @param cantidad cantidad de dinero a retirar
     * @exception Exception se ha introducido una cantidad de dinero es negativa 
     * @exception Exception se ha introducido una cantidad cantidad a retirar que es mayor que el saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
