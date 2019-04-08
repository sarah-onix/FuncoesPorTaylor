package com.twoblueonebrown;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class ExpLog implements IExpLog {

    public List<Double> criaListaExp( double x ) {
        List<Double> lst = new LinkedList<>();
        double current = 1;
        int n = 1;
        while( current > 10E-5 ) {
            lst.add(current);
            current = Math.pow( x, n ) / Util.fatorial(n);
            n++;
        }
        return lst;
    }

    public List<Double> criaListaLn( double x ) {
        List<Double> lst = new LinkedList<>();
        double current = 1;
        int n = 1;
        while( current > 10E-5 ) {
            lst.add(current);
            current = (Math.pow(-1, n) / (n + 1)) * Math.pow( x, n + 1);
            n++;
        }
        return lst;
    }
    public double mod( double n ) {
        return n > 0 ? n : -1 * n;
    }
    @Override
    public double calculaExp( double x ) {
        List<Double> valores = criaListaExp( x );
        return Util.somatorio(0, valores.size(), valores);
    }

    @Override
    public double calculaLn( double x ) {
        if(mod( x ) >= 1) { throw new IllegalArgumentException(); }
        List<Double> valores = criaListaLn( x );
        return Util.somatorio(0, valores.size(), valores);
    }

    @Override
    public Iterator returnIterator() {
        return null;
    }
}
