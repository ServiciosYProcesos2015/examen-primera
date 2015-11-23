class MiLanzador extends Lanzador {

    int miIndice;

    MiLanzador(int miIndice, int numeroLanzamientos){
        super(numeroLanzamientos);
        this.miIndice = miIndice;
    }

    void lanza(int index){
        // PROGRAMA ESTO PARA QUE AL FINAL SE LANCEN 15 THREADS
        // CADA UNO DE ELLOS HA DE IMPRIMIR "Hola, soy el thread X" y esperar 1000 milisegundos, siendo X un número del uno al quince.
    }
}