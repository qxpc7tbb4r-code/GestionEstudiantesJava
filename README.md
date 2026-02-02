# GestionEstudiantesJava
Proyecto académico de programación orientada a objetos en Java.
public class Estudiante {

    private int id;
    private String nombre;
    private double promedio;

    public Estudiante(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
    }

    public void actualizarPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }
}
