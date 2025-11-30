
public class Profesor extends Persona {

    protected String departamento;

    
    public Profesor(String nombre, String apellidos, int anyoNacimiento, String departamento) {
        super(nombre, apellidos, anyoNacimiento);
        this.departamento = departamento;
    }

   
    public void imprime() {
        super.imprime(); 
        System.out.println("Datos del Profesor: Departamento de " + departamento);
    }
}