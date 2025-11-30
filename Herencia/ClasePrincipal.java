
public class ClasePrincipal {
    public static void main(String[] args) {
        
        Persona vecina = new Persona("Luisa", "Asenjo Martinez", 1978);
        Alumno unAlumno = new Alumno("Juan", "Ugarte Lopez", 1985);
        unAlumno.ponGrupo("66", 'M');
        
        System.out.println("--- Datos del Alumno ---");
        vecina.imprime();
        unAlumno.imprime();
        unAlumno.imprimeGrupo();
        System.out.println("------------------------------------");
        
        // --- Ejemplo de uso de la parte creativa ---
        System.out.println("\n--- Datos del Profesor ---");
        Profesor unProfesor = new Profesor("Jonathan", "Berthel Castro", 1980, "Informática");
        unProfesor.imprime();
        System.out.println("---------------------------------------");
    }
}
