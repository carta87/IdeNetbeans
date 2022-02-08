package com.javafundamentos.reinoanimal;

public class ReinoAnimal {

    public static void main(String[] argumentos) {
        Vertebrado perro = new Vertebrado(3, (short)5);   
        perro.setEdad((short) 4);//castin
        perro.setNumerosDeHuesos((short) 40);
        perro.setNumeroDeVetebras((short) 25);
        perro.setTipoEsqueleto("tipo Cartilagoso");

        perro.comer("purina", 3.5F);
        perro.desplazar(4.5F, 2.3F, 4);
        perro.dormir((float) 30);
        perro.habitad("terrestre");

        Manifero tigre = new Manifero();
        Manifero tigrillo = new Manifero();
        tigre.setTemperatura((float) 15);
        tigre.setTipoDePiel("rustico");
        tigre.setNumeroDeDientes((byte) 58);
        tigre.amamantarCria(10.5F, tigrillo, 30);
        
        Manifero elefante = new Manifero();
        elefante.setNumeroDeDientes((byte) 41);
        elefante.setTemperatura((float)35);
        elefante.comer("plantas", 10);
        elefante.dormir((float) 30);
        
        Manifero gaviota = new Manifero("suave", (byte)22);
        gaviota.setTemperatura((float)35);
        //gaviota.dormir((float)10);
        //gaviota.setEdad((short)12);
        System.out.println(" la gaviota tiene un tipo de piel = " + gaviota.getTipoDePiel() 
                + "y  tiene "+ gaviota.getNumeroDeDientes()+ "dientes");

        
        
        
        
        //System.out.println(" el convertido a string "+ perro.toString());    
     
    }

}
