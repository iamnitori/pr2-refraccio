package practicaunidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe principal de l'aplicació.
 * Permet interactuar amb un compte bancari mitjançant un menú
 * d'opcions per ingressar, retirar diners o finalitzar l'execució.
 */
public class Main {

    /**
     * Flux d'entrada per llegir dades des del teclat.
     */
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Mètode principal de l'aplicació.
     * Crea un compte bancari i inicia la gestió del mateix.
     *
     * @param args Arguments de la línia de comandes (no utilitzats)
     */
    public static void main(String[] args) {

        CCuenta comptePrincipal;
        double saldoActual;
        int opcion = 0;

        comptePrincipal =
                new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);

        gestionarCompte(comptePrincipal);
    }

    /**
     * Gestiona totes les operacions sobre el compte bancari.
     * Mostra un menú interactiu que permet ingressar diners,
     * retirar diners o finalitzar el programa.
     *
     * @param comptePrincipal Compte bancari a gestionar
     */
    private static void gestionarCompte(CCuenta comptePrincipal) {

        int opcion = 0;
        double saldoActual;

        do {
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion = Integer.parseInt(dato.readLine());

                if (opcion == 1) {
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar = Float.parseFloat(dato.readLine());
                    comptePrincipal.ingresar(ingresar);

                } else if (opcion == 2) {
                    System.out.println("¿Cuánto desea retirar?: ");
                    float retirar = Float.parseFloat(dato.readLine());
                    comptePrincipal.retirar(retirar);

                } else if (opcion == 3) {
                    System.out.println("Finalizamos la ejecución");

                } else {
                    System.err.println("Opción errónea");
                }

            } catch (Exception e) {
                System.out.println("Error en la operación");
            }

        } while (opcion != 3);

        saldoActual = comptePrincipal.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }
}
