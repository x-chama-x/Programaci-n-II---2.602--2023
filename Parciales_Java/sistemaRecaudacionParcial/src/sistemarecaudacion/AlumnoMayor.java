package sistemarecaudacion;

public class AlumnoMayor extends Alumno {

    private int edad;

    public AlumnoMayor(String DNI, String nombre, int edad) {
        super(DNI, nombre);
        this.edad = edad;
    }

    @Override
    public double calcularCuota() {
        double descuento = 0;
        final int EDAD_LIMITE = 50;
        final double descuentoAplicar = 0.02;
        final double descuentoLimite = 0.15;
        if (esMayorA50()) {
            descuento = (edad - EDAD_LIMITE) * descuentoAplicar;
            if (descuento > descuentoLimite) {
                descuento = descuentoLimite;
            }
        }
        return MONTO_FIJO - (MONTO_FIJO * descuento);
    }

    public boolean esMayorA50(){
        final int EDAD_LIMITE = 50;
        return edad > EDAD_LIMITE;
    }

}