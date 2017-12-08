import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TowerTest {

    @Test
    public void shouldNotBeatTower() {

        int [][] board =
                {
                        {0,1,0,0,0,0,0,0},
                        {0,0,0,1,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,1,0}
                };
        Tower tower = new Tower();
        tower.initializeBoard(board);
        tower.printBoard();


        boolean beated=tower.checkBeat();
        Assert.assertEquals("There is no beat expected", false, beated);
    }

    @Test
    public void shouldBeatTowerHorizontally() {

        int [][] board =
                {
                        {0,1,0,0,0,0,0,0},
                        {0,0,0,1,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,1,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,1,0}
                };
        Tower tower = new Tower();
        tower.initializeBoard(board);
        tower.printBoard();


        boolean beated=tower.checkBeat();
        Assert.assertEquals("There is no beat expected", true, beated);
    }

    @Test
    public void shouldBeatTowerVertically() {

        int [][] board =
                {
                        {0,1,0,0,0,0,0,0},
                        {0,0,0,1,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,1,0,1,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,1,0}
                };
        Tower tower = new Tower();
        tower.initializeBoard(board);
        tower.printBoard();


        boolean beated=tower.checkBeat();
        Assert.assertEquals("There is no beat expected", true, beated);
    }
}
