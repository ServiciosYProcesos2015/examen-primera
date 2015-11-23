public class Examen {

    public static void main(String args[]){

        System.out.println("Inicio programa principal");

        Lanzador[] lanzador = new Lanzador[3];

        for(int i=0;i<3;i++){
            lanzador[i] = new MiLanzador(i,5);
            Thread t = new Thread(lanzador[i]);
            t.start();
        }

        System.out.println("Fin programa principal");

    }

}