package uprop;

public class Principal {

    public static void main(String[] args) {
        // Crear una instancia de Domicilio
        Domicilio domicilio = new Domicilio("Calle Falsa", 123, 1);

        // Crear una instancia de Inmueble
        Inmueble inmueble = new Inmueble(100.0, 3, 50000.0, domicilio);

        // Crear una instancia de Inmobiliaria
        Inmobiliaria inmobiliaria = new Inmobiliaria("Inmobiliaria Falsa", "correo@falso.com", 10.0);

        // Agregar la Inmobiliaria como interesada en el Inmueble
        inmueble.agregarInteresado(inmobiliaria);

        // Cambiar el precio del Inmueble
        double precioAntiguo = inmueble.getPrecio();
        inmueble.setPrecio(60000.0);

        // Notificar a los interesados del cambio de precio
        inmueble.notificarInteresados(precioAntiguo, inmueble.getPrecio());
    }

}