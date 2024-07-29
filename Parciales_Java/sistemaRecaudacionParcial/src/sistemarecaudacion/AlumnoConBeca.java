package sistemarecaudacion;

public class AlumnoConBeca extends Alumno {

    private double porcentajeBeca;

    public AlumnoConBeca(String DNI, String nombre, double porcentajeBeca) {
        super(DNI, nombre);
        this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public double calcularCuota() {
        return MONTO_FIJO - (MONTO_FIJO * porcentajeBeca / 100);
    }

}