package com.company;

public class CajaDeAhorro extends Cuenta {
    private Double interes;

    public void cobrarInteres(){
        depositar(getSaldo() *  (interes / 100));
    }

    public CajaDeAhorro(Cliente titular, Double interes){
        super(titular);
        this.interes = interes;
    }

}
