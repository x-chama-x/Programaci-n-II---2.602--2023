package sistemarecaudacion;

import java.util.ArrayList;

public class Alumno {

    private String DNI;
    private String nombre;
    public static final int MONTO_FIJO = 95000;
    private ArrayList<Materia> materiasCursando;

    public Alumno(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.materiasCursando = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribir(Materia materia) {
        if (!estaCursando(materia.getCodigo())) {
            materiasCursando.add(materia);
        } else {
            System.out.println("El alumno ya se encuentra inscripto en la materia.");
        }
    }

    public boolean estaCursando(String codigoMateria) {
        int i = 0;
        boolean estaInscripto = false;
        while (i < materiasCursando.size() && !estaInscripto) {
            if (materiasCursando.get(i).getCodigo().equals(codigoMateria)) {
                estaInscripto = true;
            }
            i++;
        }
        return estaInscripto;
    }



    public double calcularCuota(){
        return MONTO_FIJO;
    }

}