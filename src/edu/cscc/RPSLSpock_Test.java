package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RPSLSpock_Test {
    private RPSLSpock spock = new RPSLSpock();

    @Before
    public void pretests() {
    }

    @Test
    public void test_isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("Rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paPer"));
        Assert.assertTrue(RPSLSpock.isValidPick("SCISSORS"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("Spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("stick"));
    }

    @Test
    public void test_generatePick() {
        String pick;
        //Check generatePick method 1000000 times
        for (int i = 0; i < 1000000; i++) {
            pick = RPSLSpock.generatePick();
            //Check if pick is null
            Assert.assertFalse(pick.equals(null));
            //Check if pick is valid
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }

    @Test
    public void test_isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "scissors"));
        Assert.assertFalse(RPSLSpock.isComputerWin("spock", "paper"));

    }

}
