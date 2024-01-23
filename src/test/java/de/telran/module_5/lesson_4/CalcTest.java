package de.telran.module_5.lesson_4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    private int expVal;
    //when
    private int arg1Test;
    private int arg2Test;
    int actrualVal;

    private static Calc calc;
    @BeforeAll
    static void setupAll(){
        System.out.println("----------- BeforeALL----------");
        calc = new Calc();
    }
    @BeforeEach
    void setUp() {

        System.out.println("----------- Before----------");

        //when
        arg1Test = 4;
        arg2Test = 3;

    }

    @AfterEach
    void tearDown() {
        System.out.println("-------------------After-----------");

    }

    @AfterAll
    static void afterAll(){
        System.out.println("-------------------AfterAll-----------");
        calc = null;
    }


    @Test
    void addTest() {
        //excepted
        expVal = 7;
        actrualVal = calc.add(arg1Test,arg2Test);
        assertEquals(expVal,actrualVal);
    }

    @Test
    void subTest() {
        expVal = 1;
        actrualVal = calc.sub(arg1Test,arg2Test);
        //Assert
        assertEquals(expVal,actrualVal);
    }

    @Test
    void mulTest() {
        //excepted
        expVal = 12;
        actrualVal = calc.mul(arg1Test,arg2Test);
        //Assert
        assertEquals(expVal,actrualVal);
    }

    @Test
    void divTest() {
        //excepted
        expVal = 1;
        actrualVal = calc.div(arg1Test,arg2Test);
        //Assert
        assertEquals(expVal,actrualVal);
    }
    @Test
    void divThrowTest(){
        arg2Test =0;
        assertThrows(IllegalArgumentException.class,
                () ->calc.div(arg1Test,arg2Test));
    }
}