package mvvm;

import javafx.beans.property.*;
import model.*;
import mvvm.commands.ColumnAdd;
import mvvm.commands.ColumnMoveToRight;
import mvvm.commands.CommandManager;

public class BoardViewModel {
    private Board board;
    private CommandManager cmdManager;

    BoardViewModel(Board board, CommandManager cmdManager){
        this.board = board;
        this.cmdManager = cmdManager;
    }

    public StringProperty getBoardTitleProperty() {
        return board.getTitle();
    }

    public SimpleListProperty<Column> columnsProperty() {
        return new SimpleListProperty(board.getColumns());
    }

    public void addColumn(){
        board.addColumn();
        cmdManager.addCommand(new ColumnAdd(board));
    }

    public CommandManager getCmdManager(){
        return cmdManager;
    }

}
