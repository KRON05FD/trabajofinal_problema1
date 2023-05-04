import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int limite, i, j, k, entrada, ingresados; //Declaracion de variables
        String busqueda;
        Boolean bandera;

        limite = 0; //inicializar variables
        bandera = false;
        entrada = 0;
        ingresados = 0;

        Scanner consola = new Scanner(System.in);
        while (!bandera){
            System.out.println("### Bienvenido Promedico Soft ###");
            System.out.println("Selecciona una opcion");
            System.out.println("1. Registrar historia clinica paciente");
            System.out.println("2. Consultar historia clinica paciente");
            System.out.println("3. Consultar fecha ultima visita");
            System.out.println("4. Reporte pacientes con alergias");
            System.out.println("5. Reporte pacientes del regimen privado");
            System.out.println("6. Reporte general de pacientes");
            System.out.println("7. Terminar");

        }



        int entrada = consola.nextLine();


        switch (entrada) {

            case 1:
                System.out.println("Seleccione la opcion # 1: ");

        }
    }

}
