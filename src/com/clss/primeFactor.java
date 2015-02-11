package com.clss;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisolvera on 11/02/15.
 */
public class primeFactor {

    public  List <Integer> multiplicadores = new ArrayList<Integer>();

    public List<Integer> generate (int numero){
        if (numero == 1)
            multiplicadores.add(1);
        else
            for ( int divisor=2 ; numero>1;divisor++)
                for ( ;numero % divisor == 0 ; numero /= divisor )
                    multiplicadores.add(divisor);
        return multiplicadores;
    }




}

