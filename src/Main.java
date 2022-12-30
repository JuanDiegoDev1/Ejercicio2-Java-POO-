import java.util.Scanner;
/*EJERCICIO2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un trablero
  y actualice su posicion dentro del mismo.Los movimientos  posibles son Arriba,Abajo,Izquierda,Derecha.
  Tras cada movimiento el programa mostrara la nueva direccion elegida y las coordenadas de situacion del
  objeto dentro del tablero */


public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        Tablero t1;
        int x,y,opcion,incremento=0;

        System.out.println("Digite la coordenada inicial de x:");
        x= entrada.nextInt();
        System.out.println("Digite la coordenada inicial de y:");
        y= entrada.nextInt();

        //posicion inicial del objeto
        t1=new Tablero(x,y);

        do {
            System.out.println("\n\t.:MENU:");
            System.out.println("1. Mover  hacia Arriba");
            System.out.println("2. Mover  hacia Abajo");
            System.out.println("3. Mover  hacia Derecha");
            System.out.println("4. Mover  hacia Izquierda");
            System.out.println("5. Salir");
            System.out.println("Digite la apcion del menu");
            opcion= entrada.nextInt();

            if(opcion!=5){
                System.out.println("\n digite la cantidad de espacios a moverse ");
                incremento=entrada.nextInt();
            }
            switch (opcion){
                case 1: t1.moverArriba(incremento);break;
                case 2: t1.moverAbajo(incremento);break;
                case 3: t1.MoverDerecha(incremento);break;
                case 4: t1.MoverIzquierda(incremento);break;
                case 5:break;
                default: System.out.println("Error se equivoco de opcion de menu");break;
            }
            System.out.println("\n posicion actual (x,y):("+t1.getX()+","+ t1.getY()+")");

        }while (opcion!=5);

    }
}