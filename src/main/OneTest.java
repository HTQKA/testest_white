package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneTest {



    @org.junit.jupiter.api.Test
    void test1() {//语句覆盖
        assertEquals(101,new One().test(1,0) );
        assertEquals(10,new One().test(1,1) );
        assertEquals(20,new One().test(1,2) );
    }

   @Test
    void test2(){ //判定覆盖
       assertEquals(101,new One().test(1,0) );
       assertEquals(10,new One().test(1,1) );
   }
    @Test
    void test3(){ //条件覆盖
        assertEquals(101,new One().test(1,0) );
        assertEquals(10,new One().test(1,1) );

    }
    @Test
    void test4(){ //判定条件覆盖覆盖
        assertEquals(101,new One().test(1,0) );
        assertEquals(10,new One().test(1,1) );

    }
    @Test
    void test5(){ //条件组合覆盖
        assertEquals(101,new One().test(1,0) );
        assertEquals(10,new One().test(1,1) );

    }
    @Test
    void test6(){ //路径覆盖
        assertEquals(101,new One().test(1,0) );
        assertEquals(10,new One().test(1,1) );
        assertEquals(20,new One().test(1,2) );
    }



}