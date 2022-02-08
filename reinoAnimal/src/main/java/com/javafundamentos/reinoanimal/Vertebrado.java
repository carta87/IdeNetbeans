package com.javafundamentos.reinoanimal;

public class Vertebrado  {

    private short numerosDeHuesos;
    private float peso;
    private String tipoEsqueleto;
    private short numeroDeVetebras;
    private short edad;
    private float altura;
    
    public Vertebrado (){}
            
    public Vertebrado (short numeroDeHuesos, float peso){
             this.numerosDeHuesos = numeroDeHuesos;
             this.peso = peso;
    }
    
    public Vertebrado (float altura, short numerDeVertebras){
          this.numeroDeVetebras = numerDeVertebras;
          this.altura = altura;
    }
    
    
    //comportamental
    public boolean comer(String tipoDeAlimento, float cantidad) {
        System.out.println("el vertebrado ha comido");
        return true;
    }

    public boolean desplazar(float velocidad, float puntoInicial, float distancia) {
        System.out.println("el vetebrado se ha dezplado");
        return true;
    }

    public boolean dormir(float duracion) {
        System.out.println("el vetebrado se ha dormido");
        return true;

    }

    public String habitad(String tipoHabitad) {
        return "terrestre";
    }

    // Getter:obtener y Setter determinar
   

    public short getNumerosDeHuesos() {
        return this.numerosDeHuesos;

    }

    public void setNumerosDeHuesos(short nuevoNumeroDehuesos) {
        this.numerosDeHuesos = nuevoNumeroDehuesos;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipoEsqueleto() {
        return tipoEsqueleto;
    }

    public void setTipoEsqueleto(String tipoEsqueleto) {
        this.tipoEsqueleto = tipoEsqueleto;
    }

    public Short getNumeroDeVetebras() {
        return numeroDeVetebras;
    }

    public void setNumeroDeVetebras(short numeroDeVetebras) {
        this.numeroDeVetebras = numeroDeVetebras;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Vertebrado{" + "numerosDeHuesos = " + numerosDeHuesos +
                           ", peso = " + peso + 
                           ", tipoEsqueleto = " + tipoEsqueleto +
                           ", numero De Vertebras = " + numeroDeVetebras +
                           ", edad = " + edad + '}';
    }
    
    
    
}
