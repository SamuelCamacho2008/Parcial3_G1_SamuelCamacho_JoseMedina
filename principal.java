import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionEstudiantes gestionEstudiantes = new GestionEstudiantes(6);

        while (true) {
            System.out.println("****** EduPilo S.A. ********");
            System.out.println("****** MENÚ GESTIÓN ESTUDIANTES ******");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar Estudiante por Nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese promedio: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine(); 
                    gestionEstudiantes.agregarEstudiante(nombre, edad, promedio);
                    break;
                case 2:
                    gestionEstudiantes.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBusqueda = sc.nextLine();
                    gestionEstudiantes.buscarPorNombre(nombreBusqueda);
                    break;
                case 4:
                    gestionEstudiantes.calcularPromedioGeneral();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida, seleccione una opción del 1 al 5.");
            }
        }
    }
}
