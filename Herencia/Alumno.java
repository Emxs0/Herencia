public class Alumno extends Persona {

    protected String grupo;
    protected char horario;

    
    public Alumno() {
        super(); // Llama al constructor de la clase padre (Persona)
    }

    
    public Alumno(String nombre, String apellidos, int anyoNacimiento) {
        super(nombre, apellidos, anyoNacimiento);
    }

    
    public void ponGrupo(String grupo, char horario) {
        if (grupo == null || grupo.length() == 0) {
            System.out.println("Error: Grupo no valido");
        } else if (horario != 'M' && horario != 'T') {
            System.out.println("Error: Horario no valido");
        } else {
            this.grupo = grupo;
            this.horario = horario;
        }
    }

    
    public void imprimeGrupo() {
        System.out.println("Grupo: " + grupo + ", Horario: " + horario);
    }
}
