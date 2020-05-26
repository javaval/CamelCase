import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void SpinWordsTest() {
        assertEquals("TheStealthWarrior", solution.toCamelCase("the-stealth-warrior"));
        assertEquals("TheStealthWarrior", solution.toCamelCase("The_Stealth_Warrior"));
    }
}