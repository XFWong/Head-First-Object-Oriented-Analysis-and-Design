package chapter9;
import junit.framework.TestCase;


public class UnitTester extends TestCase
{
    public void testType(Unit unit, String type, String expectedOutputType) {
        System.out.println("\nTesting setting/getting the type property.");
        unit.setType(type);
        String outputType = unit.getType();
        if (expectedOutputType.equals(outputType))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed: " + outputType + " didn't match " + expectedOutputType);
        }
    }
    
    public void testUnitSpecificProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputType) {
        System.out.println("\nTesting setting/getting a unit-specific property.");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (expectedOutputType.equals(outputValue))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed: " + outputValue + " didn't match " + expectedOutputType);
        }
    }
    
    public void testNonExistentProperty(Unit unit, String propertyName) {
        System.out.println("\nTesting getting a non-existent property's value.");
        Object outputValue = unit.getProperty(propertyName);
        if (outputValue == null)
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed with value of " + outputValue);
        }
    }
    
    public static void main(String args[]) {
        UnitTester tester = new UnitTester();
        Unit unit = new Unit(1000);
        tester.testType(unit, "infantry", "infantry");
        tester.testUnitSpecificProperty(unit, "hitPoints", new Integer(25), new Integer(25));
        tester.testNonExistentProperty(unit, "strength");
    }
}
