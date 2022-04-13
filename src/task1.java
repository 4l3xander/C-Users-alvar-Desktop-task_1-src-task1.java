class Suma {
    public static void main(String[] args) {
        int resultado = sumar(30, 40, 55);
        System.out.println(resultado);


        //Crear un objeto miCoche en el main y añadirle una puerta.
        Coche mycoche = new Coche();

        //Mostrar el número de puertas que tiene el objeto.
        System.out.println(mycoche.puertas);

        // add new door
        mycoche.agregarPuertas();
        System.out.println(mycoche.puertas);


    }// dentro de los () se define el numero de parametros que se tendran
    public static int sumar(int a, int b, int c){
        return a+b+c;


    }// crear la clase; La clase Coche o la defines en un nuevo fichero Coche.java o la metes entre las llaves de la clase principal para tenerla en un solo fichero, en este caso, has de definirla como private, ya que queda dentro de la clase principal.
    private static class Coche{


        // variable numero que almacena el numero de puertas  dentro de la clase coche
        int puertas = 4;


        //Una función que incremente el número de puertas que tiene el coche.
        public void agregarPuertas(){
            this.puertas++;
        }
    }
}