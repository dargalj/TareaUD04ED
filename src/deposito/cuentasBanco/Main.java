package cuentasBanco;
public class Main {

    public static void main(String[] args) {
        CuentaBanco cuentaPersonal;
        double saldoActual;
        
        //Modificaciones para el ejercicio del commit
        String modificacionCommit = "";
        int numModif = 2;
        double[] otraModif = new double[100];
        

        extracted();
    }

	private static void extracted() {
		operativaCuenta(0.0f);
	}

	public static void operativaCuenta(float cantidad) {
		CuentaBanco cuentaPersonal;
		double saldoActual;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
	
	
}
