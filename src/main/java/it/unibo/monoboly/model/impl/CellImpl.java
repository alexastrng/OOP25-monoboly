package it.unibo.monoboly.model.impl;
import it.unibo.monoboly.model.api.Cell;


public class CellImpl implements Cell{
    String name;
    
    void Cell(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
}