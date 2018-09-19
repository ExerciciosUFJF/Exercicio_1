/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luis
 */
public class Lampada {
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    
    public String verificarEstado(){
        String retorno;
        if(ligada){
           retorno = "Ligada"; 
        }else{
            retorno = "Desligada";
        }
        return retorno;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
