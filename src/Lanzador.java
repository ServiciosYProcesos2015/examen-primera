abstract class Lanzador implements Runnable{

    private int numeroLanzamientos = 0;

    Lanzador(int numeroLanzamientos){
        this.numeroLanzamientos = numeroLanzamientos;
    }

    public void run(){

        for(int i=0;i<numeroLanzamientos;i++){
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                break;
            }
            lanza(i);
        }
    }

    abstract void lanza(int index);
}
