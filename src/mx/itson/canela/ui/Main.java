/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Franki Beownie");
        receta.setDescripcion("tan ricos ");
        receta.setNumeroPorciones(6);
        receta.setTiempo(62);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("chocolate");
        ingredientes.add(ingrediente1);
        
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("buebo");
        ingredientes.add(ingrediente2);
                
        receta.setIngredientes(ingredientes);
                
        //agregar pasos
        
        receta.setDificultad(Dificultad.INTERMEDIO);
        
        
    }
    
}
