package com.twoblueonebrown;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lambert implements ILambert {

    private List<Double> W0;

    public double calcula(double x){
        if(Math.abs(x)<(1/Math.exp(1))) {
            double inf = Double.POSITIVE_INFINITY;
            W0 = new ArrayList<>();
            double a;
            double b;
            double xToThei;
            for (int i = 1; i < inf; i++) {
                // FORMAT: (a/b) * xToThei

                a = Math.pow((-i), (i - 1));
                b = Util.fatorial(i);
                xToThei = Math.pow(x, i);
                W0.add((a / b) * xToThei);
            }
            return Util.somatorio(1, ((int) inf),W0);
        }
        throw new IllegalArgumentException();
}

    public Iterator returnIterator(){
        if(W0!=null){return W0.iterator();}
        throw new IllegalStateException("NO FUNCTION ITERATOR TO RETURN\nPROBABLY BECAUSE THERE IS NO HISTORY YET");
    }
}
