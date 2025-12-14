package practicaunidad4;

/**
 * Classe que representa un compte bancari.
 * Permet assignar un titular, ingressar i retirar diners,
 * i consultar el saldo actual del compte.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor per defecte.
     * Crea un compte sense valors inicials.
     */
    public CCuenta() {
    }

    /**
     * Constructor amb paràmetres.
     *
     * @param nom Nom del titular del compte
     * @param cue Número del compte bancari
     * @param sal Saldo inicial del compte
     * @param tipo Tipus d'interés aplicat al compte
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Assigna el nom del titular del compte.
     *
     * @param nom Nom del titular
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * Retorna el nom del titular del compte.
     *
     * @return nom del titular
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Retorna el saldo actual del compte.
     *
     * @return saldo del compte
     */
    public double estado() {
        return saldo;
    }

    /**
     * Retorna el saldo del compte.
     *
     * @return saldo del compte
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo del compte.
     *
     * @param saldo Nou saldo del compte
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Ingressa una quantitat de diners al compte.
     *
     * @param cantidad Quantitat a ingressar
     * @throws Exception si la quantitat és negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * Retira una quantitat de diners del compte.
     *
     * @param cantidad Quantitat a retirar
     * @throws Exception si la quantitat és negativa o no hi ha saldo suficient
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * Retorna el número del compte bancari.
     *
     * @return número del compte
     */
    public String obtenerCuenta() {
        return cuenta;
    }
}
