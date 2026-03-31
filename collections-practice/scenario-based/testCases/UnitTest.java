package collections.testCases;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// The UnitTest class
public class UnitTest {

    // 1. Test for Valid Deposit
    @Test
    public void Test_Deposit_ValidAmount() throws Exception {
        // Arrange
        double initialBalance = 100.00;
        Program account = new Program(initialBalance);
        double depositAmount = 50.00;
        double expectedBalance = 150.00;

        // Act
        account.Deposit(depositAmount);

        // Assert (Checking if actual balance equals expected balance)
        assertEquals(expectedBalance, account.Balance);
    }

    // 2. Test for Negative Deposit (Expects Exception)
    @Test
    public void Test_Deposit_NegativeAmount() {
        // Arrange
        Program account = new Program(100.00);
        double invalidAmount = -50.00;

        // Act & Assert (Verifies that the specific logic throws an Exception)
        assertThrows(Exception.class, () -> account.Deposit(invalidAmount));
    }

    // 3. Test for Valid Withdraw
    @Test
    public void Test_Withdraw_ValidAmount() throws Exception {
        // Arrange
        double initialBalance = 100.00;
        Program account = new Program(initialBalance);
        double withdrawAmount = 40.00;
        double expectedBalance = 60.00;

        // Act
        account.Withdraw(withdrawAmount);

        // Assert (Checking if actual balance equals expected balance)
        assertEquals(expectedBalance, account.Balance);
    }

    // 4. Test for Withdraw Insufficient Funds (Expects Exception)
    @Test
    public void Test_Withdraw_InsufficientFunds() {
        // Arrange
        Program account = new Program(100.00);
        double withdrawAmount = 200.00; // Amount greater than balance

        // Act & Assert (Verifies that the specific logic throws an Exception)
        assertThrows(Exception.class, () -> account.Withdraw(withdrawAmount));
    }
}
