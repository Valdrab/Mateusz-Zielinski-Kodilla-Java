package com.kodilla.testing.shape;

        import org.junit.*;
        import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(8.3);
        //When
        shapeCollector.addFigure(circle);
        //Then
        assertEquals(1, shapeCollector.getShapeCollectorList().size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(8.3);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeCollectorList().size());
    }
    @Test
    public void testRemoveNonExistingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(8.3);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        assertFalse(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(10.5, 25);
        shapeCollector.addFigure(triangle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        assertEquals(triangle, result);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(6.0);
        shapeCollector.addFigure(square);
        //When
        String result = shapeCollector.showFigures();
        //Then
        assertEquals("[Square, 6.0]", result);
    }
}

