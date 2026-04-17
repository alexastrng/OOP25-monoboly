package it.unibo.monoboly.model.api;

public interface Property extends Cell {
    
    // returns the value of the property
    int getValue();

    // returns the colour group of the property
    String getColourGroup();

    // returns the number of houses placed on the property
    int getNHouses();

    // returns true if the property is owned by the player, false otherwise
    boolean isOwned();

    /*TODO:
    returns the player that owns the property
    Player getOwner();
    */

    // increases the value of the property
    void increaseValue(int n);

    // decreases the value of the property
    void decreaseValue(int n);

    // adds a house to the property (can't be done if at least one property of the same color group has a number of houses equal to this.nHouses - 1, if the property already has 4 houses, and if the whole colour group isn't owned by the same player)
    void putHouse();

    // removes a house from the property (can't be done if at least one property of the same color group has a number of houses equal to this.nHouses + 1, or if the property already has 0 houses)
    void removeHouse();

    // the property is now owned by a player, so owned is true. It also gives a value to the variable owner.
    void getsOwned(/*Player player*/);
    
    // the property is now not owned by anyone, so owned is false. It also sets the variable owner to null.
    void getsDisowned();

}