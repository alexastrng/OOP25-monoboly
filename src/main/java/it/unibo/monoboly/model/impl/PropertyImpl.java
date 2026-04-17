package it.unibo.monoboly.model.impl;
import it.unibo.monoboly.model.api.Property;


public class PropertyImpl implements Property {
    int value;
    private final String colourGroup;
    int nHouses = 0;
    boolean owned = false;
    // Player owner = null;
    String name;

    public PropertyImpl(int value, String colourGroup, String name){
        this.value = value;
        this.colourGroup = colourGroup;
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getValue(){
        return this.value;
    }

    @Override
    public String getColourGroup(){
        return this.colourGroup;
    }

    @Override
    public int getNHouses(){
        return this.nHouses;
    }

    @Override
    public boolean isOwned(){
        return this.owned;
    }

    /* TODO:
    @Override
    public Player getOwner(){
        return this.owner;
    } */

    @Override
    public void increaseValue(int n){
        this.value += n;
    }

    @Override
    public void decreaseValue(int n){
        this.value -= n;
    }

    @Override
    public void putHouse(){
        /* TODO:
        if (board.ownsFullGroup(this.owner, this.colourGroup)){
            */
            this.nHouses++;
            /*
        }
        
        */
    }

    @Override
    public void removeHouse(){
        this.nHouses--;
    }

    @Override
    public void getsOwned(/*Player player*/){
        this.owned = true;
        /*this.owner = player;*/
    }

    @Override
    public void getsDisowned(){
        this.owned = false;
        /*this.owner = null*/
    }
}
