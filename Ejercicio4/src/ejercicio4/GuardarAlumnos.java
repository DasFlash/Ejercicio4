package ejercicio4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GuardarAlumnos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta y el nombre del archivo donde guardar los datos: ");
        String archivo = scanner.nextLine();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Introduce los datos del alumno " + (i + 1) + ":");

                System.out.print("NIA (número entero): ");
                int nia = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer

                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Apellidos: ");
                String apellidos = scanner.nextLine();

                System.out.print("Género (M/F): ");
                char genero = scanner.nextLine().charAt(0);

                System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
                String fechaStr = scanner.nextLine();

                System.out.print("Ciclo: ");
                String ciclo = scanner.nextLine();

                System.out.print("Curso: ");
                String curso = scanner.nextLine();

                System.out.print("Grupo: ");
                String grupo = scanner.nextLine();

                // Crear un objeto Alumno
                Alumno alumno = new Alumno(nia, nombre, apellidos, genero, fechaStr, ciclo, curso, grupo);

                // Escribir el objeto Alumno en el archivo
                oos.writeObject(alumno);

                System.out.println("Alumno " + (i + 1) + " guardado correctamente.\n");
            }
            System.out.println("Todos los alumnos han sido guardados correctamente en el archivo.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();

	}

}
