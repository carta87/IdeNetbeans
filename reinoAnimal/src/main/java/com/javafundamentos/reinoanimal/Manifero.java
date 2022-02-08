
package com.javafundamentos.reinoanimal;

public class Manifero extends Vertebrado {

    private byte numeroDePatas;
    private String tipoDePiel;
    private float temperatura;
    private byte numeroDeDientes;

   
    
    public Manifero(){}
    
    public Manifero (byte numeroDePatas, float temperatura){
     
        this.numeroDePatas = numeroDePatas;
        this.temperatura = temperatura;  
    }
    
    public Manifero (String tipoDePiel, byte numeroDeDientes){
        
        this.tipoDePiel = tipoDePiel;
        this.numeroDeDientes = numeroDeDientes;  
    }
    
    
    public boolean amamantarCria(float cantidadDeleche, Manifero cria, float tiempo) {
        System.out.println("lacria ha sido Amammantada");
        return true;

    }

    public boolean sucionarMama(float cantidadDeleche, String maniferoHembra, float tiempo) {
        System.out.println("lacria ha sucionadola mama");
        return true;
    }

    public float darCalor(Manifero companero, float Tiempo) {

        return 37.8F;
    }

    public byte getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(byte numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getTipoDePiel() {
        return tipoDePiel;
    }

    public void setTipoDePiel(String tipoDePiel) {
        this.tipoDePiel = tipoDePiel;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public byte getNumeroDeDientes() {
        return numeroDeDientes;
    }

    public void setNumeroDeDientes(byte numeroDeDientes) {
        this.numeroDeDientes = numeroDeDientes;
    }
    
    
    
    
    }
    
    
    
