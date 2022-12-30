public class Tablero {

    private int x;
    private int y;
    //construcctor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //metodos
    public void moverArriba(int incremento){
        y += incremento;
    }
    public void moverAbajo(int incremento){
        y-= incremento;
    }
    public void MoverDerecha(int incremento){
        x += incremento;
    }
    public void MoverIzquierda(int incremento){
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

