import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest {

    @Test
    public void ThreePlusThreeReturnSix() {
        Main main = new Main(3, 3);
        assertEquals(6, main.add());
    }
    @Test
    public void ThreePlusZeroReturnThree() {
        Main main = new Main(3, 0);
        assertEquals(3, main.add());
    }
    @Test
    public void MinusThreePlusOneReturnMinusTwo() {
        Main main = new Main(-3, 1);
        assertEquals(-2, main.add());
    }
    @Test
    public void ThreePlusMinusOneReturnTwo() {
        Main main = new Main(3, -1);
        assertEquals(2, main.add());
    }



    @Test
    public void ThreeMinusOneReturnTwo() {
        Main main = new Main(3, 1);
        assertEquals(2, main.subtract());
    }
    @Test
    public void ThreeMinusZeroReturnThree() {
        Main main = new Main(3, 0);
        assertEquals(3, main.subtract());
    }
    @Test
    public void ThreeMinusMinusReturnSix () {
        Main main = new Main(3, -3);
        assertEquals(6, main.subtract());
    }
    @Test
    public void MinusThreeMinusMinusOneReturnMinusTwo() {
        Main main = new Main(-3, -1);
        assertEquals(-2, main.subtract());
    }




    @Test
    public void ThreeMultipliedByThreeReturnNine() {
        Main main = new Main(3, 3);
        assertEquals(9, main.multi());
    }
    @Test
    public void ThreeMultipliedByZeroReturnZero() {
        Main main = new Main(3, 0);
        assertEquals(0, main.multi());
    }
    @Test
    public void ThreeMultipliedByMinusThreeReturnMinusNine () {
        Main main = new Main(3, -3);
        assertEquals(-9, main.multi());
    }
    @Test
    public void ThreeMultipliedByOneReturnThree () {
        Main main = new Main(3, 1);
        assertEquals(3, main.multi());
    }





    @Test
    public void  ThreeDividedByThreeReturnOne() {
        Main main = new Main(3, 3);
        assertEquals(1, main.division());
    }
    @Test
    public void ThreeDividedByMinusOneReturnMinusThree () {
        Main main = new Main(3, -1);
        assertEquals(-3, main.division());
    }
  @Test
    public void  ThreeDividedByZeroReturnIDK() {
        Main main = new Main(3, 0);
        assertNull(main.division());
    }
    @Test
    public void  MinusThreeDividedByMinusThreeReturnOne() {
        Main main = new Main(-3, -3);
        assertEquals(1, main.division());
    }



    @Test
    public void ThreeToSecondPowerReturnNine () {
        Main main = new Main(3, 2);
        assertEquals(9, main.exponentiation());
    }
    @Test
    public void ThreeToThePowerOfOneReturnThree () {
        Main main = new Main(3, 1);
        assertEquals(3, main.exponentiation());
    }
    @Test
    public void ThreeToTheZeroPowerReturnOne () {
        Main main = new Main(3, 0);
        assertEquals(1, main.exponentiation());
    }
    @Test
    public void ThreeToMinusSecondPowerReturnTwentySeven () {
        Main main = new Main(3, 3);
        assertEquals(27, main.exponentiation());
    }




    @Test
    public void  CubicRootOfEightReturnTwo() {
        Main main = new Main(8);
        assertEquals(2, main.cube());
    }
    @Test
    public void CubicRootOfOneReturnOne () {
        Main main = new Main(1);
        assertEquals(1, main.cube());
    }
    @Test
    public void CubicRootOfMinusOneReturnMinusOne  () {
        Main main = new Main(-1);
        assertEquals(-1, main.cube());
    }
    @Test
    public void  CubicRootOfTwentySevenReturnThree() {
        Main main = new Main(27);
        assertEquals(3, main.cube());
    }




}
