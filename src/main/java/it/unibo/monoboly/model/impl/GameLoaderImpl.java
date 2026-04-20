package it.unibo.monoboly.model.impl;

import java.util.List;

import it.unibo.monoboly.model.api.Card;
import it.unibo.monoboly.model.api.Cell;
import it.unibo.monoboly.model.api.GameLoader;

public class GameLoaderImpl implements GameLoader {

    @Override
    public List<Cell> cellLoader(){
        // TODO: read Cells.json
        return null;
    }

    @Override
    public List<Card> cardLoader(){
        // TODO: read Cards.json
        return null;
    }
}
