package ua.hillel.petrenko.homework16;

import org.junit.jupiter.api.*;
import ua.hillel.petrenko.homeworks.homework18.UnitArray;

public class TestUnitArray {

    static int[] array;
    static int[][] matrix;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
        array = new int[] {2, 4, 6, 2, -4};

        matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test");
    }

    @Test
    void averageArrayNotNull() {
        System.out.println("averageArrayNotNull");
        Assertions.assertEquals(2.0, UnitArray.averageArray(array));
    }

    @Test
    void averageArrayEmpty() {
        System.out.println("averageArrayEmpty");
        int[] emptyArray = {};
        Assertions.assertEquals(-2, UnitArray.averageArray(emptyArray));
    }

    @Test
    void averageArrayNull() {
        System.out.println("averageArrayNull");
        Assertions.assertEquals(-1, UnitArray.averageArray(null));
    }

    @Test
    void checkMatrix() {
        System.out.println("checkMatrix");
        Assertions.assertEquals(3, UnitArray.checkMatrix(matrix));
    }

    @Test
    void checkNotSquareMatrix() {
        System.out.println("checkNotSquareMatrix");
        int[][] notSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Assertions.assertEquals(-3, UnitArray.checkMatrix(notSquareMatrix));
    }

    @Test
    void checkEmptyMatrix() {
        System.out.println("checkEmptyMatrix");
        int[][] emptyMatrix = {};
        Assertions.assertEquals(-2, UnitArray.checkMatrix(emptyMatrix));
    }

    @Test
    void checkNullMatrix() {
        System.out.println("checkNullMatrix");
        Assertions.assertEquals(-1, UnitArray.checkMatrix(null));
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach ");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
        array = null;
        matrix = null;
    }

}
