package com.company;

public class CuentaCorriente extends Cuenta {
    private Double giroEnDescubierto;

    public void extraer(Double platita){
        if(platita <= (getSaldo() + giroEnDescubierto)){
            saldo = saldo - platita;
            System.out.println("Se han extraido $"+platita+". Su saldo actual es de $"+saldo);
        } else {
            System.out.println("¡SALDO INSUFICIENTE!");
        }
    }

    public CuentaCorriente(Cliente cl, Double giro){
        super(cl);
        this.giroEnDescubierto = giro;
    }
}
