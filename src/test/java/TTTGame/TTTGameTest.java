/*package TTTGame;

import Game.Exeption.FieldTakenExeption;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TTTGameTest {

    @Test
    public void atBeginningFieldsAreEmpty() {
        TTTGame game = new TTTGame();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                FieldStatus field = getFieldStatus(j, i);
                System.out.println(field.getStatus());
                if (j < 2)
                    System.out.println("|");
            }
            if (i < 2)
                System.out.println("\n-*-*-");

        }

        FieldStatus status = game.getFieldStatus(0, 0);

        FieldStatus field = null;
        assertEquals(FieldStatus.EMPTY, field);
    }

    private FieldStatus getFieldStatus(int j, int i) {

    }

    @Test
    public void firstActionIsX(int column, int row) {
        TTTGame game = new TTTGame();

        game.action(0, 0);
        game.printBoard();

        assertEquals(FieldStatus.X, game.getFieldStatus(0, 0));
    }

    @Test
    public void fieldOccuppied_ActionShouldTrow(int column, int row) {
        TTTGame game = new TTTGame();

        game.action(0, 0);
        game.printBoard();

        assertThrows(FieldTakenExeption.class, Executable() {
            @Override
            public void execute () throws Throwable{
                game.action(0, 0);
            }
        }

    }

    public void action(int column, int row){
        FieldStatus status = getFieldStatus(column,row);
        if (status != FieldStatus.EMPTY){
            throw new IllegalStateException()
        }
    }
}


*/