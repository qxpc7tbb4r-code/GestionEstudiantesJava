Main.java
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "Juan Perez", 8.5);
        Estudiante estudiante2 = new Estudiante(2, "Maria Lopez", 9.2);

        estudiante1.mostrarInformacion();
        System.out.println("-----------------");
        estudiante2.mostrarInformacion();

        estudiante1.actualizarPromedio(9.0);

        System.out.println("Promedio actualizado:");
        estudiante1.mostrarInformacion();
    }
}
