package it.unibo.monoboly.model.api;

import java.util.List;

public interface GameLoader {
    
    List<Cell> cellLoader();

    List<Card> cardLoader();

}
