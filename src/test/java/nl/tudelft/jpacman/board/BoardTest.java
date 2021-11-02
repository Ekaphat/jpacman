package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
/*

*/
public class BoardTest {

    @Test
    void testboard() {
        Square[][] oneoneBoard = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(oneoneBoard);
        assertThat(board.invariant()).isEqualTo(true);
    }

    @Test
    void squareAt() {
        Square[][] oneoneBoard = {
            { null },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(oneoneBoard);
        assertThat(board.invariant()).isEqualTo(true);
    }

}
