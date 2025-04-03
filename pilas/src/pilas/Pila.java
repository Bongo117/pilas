package pilas;

public class Pila {

    private int[] datos;
    private int tope;
    private int tam;

    public Pila(int i) {
        this.tam = i;
        this.datos = new int[tam];
        this.tope = -1;
    }

    public boolean push(int ingreso) {
        if (!pilaLlena()) {
            tope++;
            datos[tope] = ingreso;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        if (!pilaVacia()) {
            tope--;
            return datos[tope + 1];
        } else {
            return -1;
        }
    }

    public boolean pilaVacia() {
        return this.tope == -1;
    }

    public boolean pilaLlena() {
        return this.tam - 1 == this.tope;
    }

    public int verTope() {
        if (!pilaVacia()) {
            return datos[tope];
        } else {
            return -1;
        }
    }

    public int getTope() {
        return tope;
    }

    public void mostrarPila() {
        Pila paux = new Pila(tam);
        while (!pilaVacia()) {
            System.out.print(verTope()+" ");
            paux.push(this.pop());
        }
        System.out.println("");
        while (!paux.pilaVacia()) {            
            push(paux.pop());
        }
    }
    
       // Método invierteSimple (Usando 2 pilas auxiliares)
    public void invierteSimple() {
        Pila aux1 = new Pila(tam);
        Pila aux2 = new Pila(tam);
        

        // Pasar de la pila original a aux1
        while (!pilaVacia()) {
            aux1.push(pop());
        }

        // Pasar de aux1 a aux2
        while (!aux1.pilaVacia()) {
            aux2.push(aux1.pop());
        }

        // Pasar de aux2 a la pila original (queda invertida)
        while (!aux2.pilaVacia()) {
            push(aux2.pop());
        }
    }  
    //  Método invierteEficiente (Usando solo 1 pila auxiliar y 1 variable)
    public void invierteEficiente() {
        Pila aux = new Pila(tam);
        int copia;

        // Pasar elementos de la pila original a aux
        while (!pilaVacia()) {
            copia = pop(); // Guardamos temporalmente el valor
            aux.push(copia);
        }

        // Pasar de aux a la pila original (queda invertida)
        while (!aux.pilaVacia()) {
            push(aux.pop());
        }
    }
}

