package pilas;

public class Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(4);
        Pila p2 = new Pila(4);

        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.mostrarPila();
        
      /*  
        p1.invierteSimple() ;
        System.out.println("Método con invierte simple: ");
        p1.mostrarPila();
        
        p1.invierteEficiente();
        System.out.println("Método con invierte eficiente: ");
        p1.mostrarPila();
      */
       
       
        /*for (int i = 0; i < 4; i++) {
            p2.push(p1.verTope());
            p1.pop();
        }
        p2.mostrarPila(); */
       
    }
    
}
