public class Semana2 {
    public static void main() {
        // variables: contienen un valor de cierto tipo de dato

        // int numero = 3; un int es un numero entero, positivo o negativo
        // double velocidad = 0.832; un numero decimal, positivo o negativo
        // String nombre = "Cristian"; un String es texto, entre " "
        // boolean variable = true; un variable verdadera o falsa
        // null = nada

        boolean robotPrendido;
        boolean enMovimiento = false;
        robotPrendido = false;
        double velocidad = 0;
        
        // if statements
        // operadores logicos and, or, not
        // ==, !=, <, >, <=, >=, && (and), || (or)
        if (velocidad >= 0) {
            System.out.println("Robot prendido y en movimiento");
        } else if (robotPrendido == false) {
            System.out.println("Robot no esta prendido");
        } else {
            System.out.println("El robot no esta prendido ni apagado");
        }

        // Loops
        double joystickControl = 1;
        boolean opModeIsActive = true;
        double velocidadRobot;

        while (opModeIsActive == true) {
            velocidadRobot = joystickControl;
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.println("Numero: " + i);
        }

        // Funciones

        double altura = 24;
        double ancho = 7;

        double areaT = areaTriangulo(67.2, 12.5);
        cambiarNumero(234);
        int miNumero = 23;
        System.out.println(menorOMayor100(miNumero));
    }

    public static double areaTriangulo(double altura, double ancho) {
        double area = altura * ancho / 2;

        return area;
    }

    public static String menorOMayor100(int numero) {
        if (numero > 100) {
            return "Mayor que 100";
        } else if (numero < 100) {
            return "Menor que 100";
        } else {
            return "El numero es 100";
        }
    }

    // void: no regresa ningun valor, solo hace lo que le digas dentro del bloque
    public static void cambiarNumero(int numero) {
        numero += 1;
        numero -= 1;
        numero *= 1;
    }

    
}
