package sistemarecaudacion;

public class Principal {
    public static void main(String[] args) {
        // Crear el sistema de recaudación con la carrera
        SistemaRecaudacion sistema = new SistemaRecaudacion("Maestría en Ciencia de Datos");

        // Crear 5 materias
        Materia materia1 = new Materia("MAT001", "Estadística Avanzada");
        Materia materia2 = new Materia("MAT002", "Machine Learning");
        Materia materia3 = new Materia("MAT003", "Big Data");
        Materia materia4 = new Materia("MAT004", "Visualización de Datos");
        Materia materia5 = new Materia("MAT005", "Ética en IA");

        // Agregar las materias a la carrera
        sistema.getCarrera().agregarMateria(materia1);
        sistema.getCarrera().agregarMateria(materia2);
        sistema.getCarrera().agregarMateria(materia3);
        sistema.getCarrera().agregarMateria(materia4);
        sistema.getCarrera().agregarMateria(materia5);

        // Inscribir 50 estudiantes en diversas materias
        for (int i = 1; i <= 50; i++) {
            String dni = String.format("%08d", i); // DNI único
            String nombre = "Estudiante " + i;

            // Inscribir en materias aleatoriamente
            for (int j = 1; j <= 3; j++) { // Cada estudiante se inscribe en hasta 3 materias
                String codigoMateria = "MAT00" + (1 + (int)(Math.random() * 5));
                sistema.inscribir(dni, nombre, codigoMateria);
            }

            // Intentos inválidos (1 de cada 10 estudiantes)
            if (i % 10 == 0) {
                // Intento de inscripción en materia inexistente
                sistema.inscribir(dni, nombre, "MAT999");

                // Intento de inscripción duplicada
                String codigoMateria = "MAT00" + (1 + (int)(Math.random() * 5));
                sistema.inscribir(dni, nombre, codigoMateria);
                sistema.inscribir(dni, nombre, codigoMateria);
            }
        }

        // Imprimir ganancias por materia
        System.out.println("Ganancias por materia:");
        sistema.imprimirGananciasPorMateria();
    }
}