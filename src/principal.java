import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int limite;  //Declaracion de variables
        int i;
        int j;
        int k;
        int entrada;
        int ingresados;
        int opcion;
        String busqueda;
        Boolean bandera;

        limite = 0; //inicializar variables
        opcion = 0;
        bandera = false;
        ingresados = 0;

        Scanner consola = new Scanner(System.in);
        while (!bandera) {
            System.out.println("### Bienvenido Promedico Soft ###");
            System.out.println("1. Registrar historia clinica paciente");
            System.out.println("2. Consultar historia clinica paciente");
            System.out.println("3. Consultar fecha ultima visita");
            System.out.println("4. Reporte pacientes con alergias");
            System.out.println("5. Reporte pacientes del regimen privado");
            System.out.println("6. Reporte general de pacientes");
            System.out.println("7. Terminar");

            try {
                System.out.println("Selecciona una opcion");
                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Selecion opcion 1");
                        break;
                    case 2:
                        System.out.println("seleccion opcion 2");
                        break;
                    case 7:
                        bandera = false;
                    default:
                        System.out.println("Opcion incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                consola.next();
            }

        }
    }

}
