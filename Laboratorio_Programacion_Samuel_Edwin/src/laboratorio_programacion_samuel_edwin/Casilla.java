/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_programacion_samuel_edwin;
import javax.swing.*;
/**
 *
 * @author unwir
 */
public class Casilla  {
    private int fila;
    private int columna;
    
    private int valor;
    private ImageIcon imagen;
    
    private boolean seleccionado;
    private boolean encontrado;
    private boolean revelada;
    
    private JButton boton;
    
    public Casilla(int fila, int columna, int valor){
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
              
        this.revelada = false;
        this.seleccionado = false;
        this.encontrado = false;
        
        this.boton = null;
        this.imagen = null;
    }
    
    public Casilla(int fila, int columna, JButton boton){
        this.fila = fila;
        this.columna = columna;
        
        this.boton = boton;
    }
    
    public void Revelar(){
        this.revelada = true;
        this.seleccionado = true;
    }
    
    public void Ocultar(){
        this.revelada = false;
        this.seleccionado = false;
    }
    
    public void encontrada(){
        this.encontrado = true;
        this.revelada = true;
        this.seleccionado = false;          
    }
    
    public boolean sonIguales(Casilla segundaCasilla){
        if(segundaCasilla == null) return false;
        return this.valor == segundaCasilla.valor;
       
    }
    
    public void setFila(int fila){
       this.fila = fila;
    }
    public int getfila(){
        return fila;
    }
    
    public void setcolumna(int columna){
       this.columna = columna;
    }
    public int getcolumna(){
        return fila;
    }
    
    public void setValor(int valor){
       this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    
    public void setBoton(JButton boton){
       this.boton = boton;
    }
    public JButton getBoton(){
        return boton;
    }
    
    public ImageIcon getIcon(){
        return imagen;
    }
    
    public void setIcon(ImageIcon imagen){
        this.imagen = imagen;
    }
    
    public boolean isSlted(){
        return this.seleccionado;
    }
   
    public void setSelect(Boolean seleccionado){
        this.seleccionado = seleccionado;
    }
    
    
    
}
