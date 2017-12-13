/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act_extres_2;

import java.util.NoSuchElementException;

/**
 *
 * @author miquel
 */
public class Pila implements ColeccionInterfaz {

    private Object[] arrayObj;
    private int countObj;
    
    public Pila(int maxPila) {
        arrayObj = new  Object[maxPila];
        countObj = 0;
    }
    
    @Override
    public boolean estaVacia() {
        if (countObj == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object extraer() {
        if (arrayObj[0] == null) {
            throw new NoSuchElementException("Vacio");
        } else {
            arrayObj[0] = null;
            countObj--;
            return arrayObj[0];
        }
    }

    @Override
    public Object primero() {
        if (arrayObj[0] == null) {
            throw new NoSuchElementException("Vacio");
        } else {
            return arrayObj[0];
        }
    }

    @Override
    public boolean anadir(Object obj) {
        boolean anadido = false;
        if (countObj < arrayObj.length  ) {
            arrayObj[countObj] = obj;
            if (arrayObj[countObj] == obj) {
                countObj++;
                anadido = true;
            }
        }
        return anadido;
    }
}

class Test {
    public static void main(String[] args) {
        Pila p = new Pila(3);
        p.anadir("Miquel");
        p.anadir("Phillip");
        p.anadir("Joan");
        System.out.println(p.primero());
        p.extraer();
        System.out.println(p.primero());
    }
}
