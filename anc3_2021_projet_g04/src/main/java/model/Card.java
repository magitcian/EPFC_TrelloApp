package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Card {
    private Column column;
    private String title;

    // TODO: remove if not necessary (check later)
    public Card(String title){
        this.title = title;
    }

    public Card(String title, Column column){
        this.title = title;
        this.column = column;
    }

    public String getTitle(){
        return this.title;
    }

    public Column getColumn(){
        return this.column;
    }

    public void setColumn(Column column){
        this.column = column;
    }

    public BooleanProperty isFirstInColumn(){
        return new SimpleBooleanProperty(this.column.isCardFirst(this));
    }

    public BooleanProperty isLastInColumn(){
        return new SimpleBooleanProperty(this.column.isCardLast(this));
    }

    public void changePositionInColumn(int posCard, int posColumn){
        this.column.changeCardPosition(this, posCard, posColumn);
    }


}
