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
                oos.writeInt(nia); // Guardar NIA
                scanner.nextLine();  // Limpiar el buffer

                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                oos.writeUTF(nombre); // Guardar nombre

                System.out.print("Apellidos: ");
                String apellidos = scanner.nextLine();
                oos.writeUTF(apellidos); // Guardar apellidos

                System.out.print("Género (M/F): ");
                char genero = scanner.nextLine().charAt(0);
                oos.writeChar(genero); // Guardar género

                System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
                String fechaStr = scanner.nextLine();
                oos.writeUTF(fechaStr); // Guardar fecha de nacimiento

                System.out.print("Ciclo: ");
                String ciclo = scanner.nextLine();
                oos.writeUTF(ciclo); // Guardar ciclo

                System.out.print("Curso: ");
                String curso = scanner.nextLine();
                oos.writeUTF(curso); // Guardar curso

                System.out.print("Grupo: ");
                String grupo = scanner.nextLine();
                oos.writeUTF(grupo); // Guardar grupo

                System.out.println("Datos del alumno " + (i + 1) + " guardados correctamente campo por campo.\n");
            }
            System.out.println("Todos los alumnos han sido guardados correctamente en el archivo.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();;

	}

}
