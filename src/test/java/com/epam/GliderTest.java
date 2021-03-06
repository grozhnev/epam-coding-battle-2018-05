package com.epam;

import org.junit.jupiter.api.Test;

class GliderTest extends AbstractGameEngineTest {

    private static final int[][] INITIAL_STATE = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0}
    };

    @Test
    void step1() {
        test(INITIAL_STATE, 1, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0}
        });
    }

    @Test
    void step2() {
        test(INITIAL_STATE, 2, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 1, 0}
        });
    }

    @Test
    void step3() {
        test(INITIAL_STATE, 3, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 1, 1, 0}
        });
    }

    @Test
    void step4() {
        test(INITIAL_STATE, 4, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1}
        });
    }

    @Test
    void step5() {
        test(INITIAL_STATE, 5, new int[][]{
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 1}
        });
    }

    @Test
    void step6() {
        test(INITIAL_STATE, 6, new int[][]{
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 0, 1}
        });
    }

    @Test
    void step7() {
        test(INITIAL_STATE, 7, new int[][]{
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1}
        });
    }

    @Test
    void step8() {
        test(INITIAL_STATE, 8, new int[][]{
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0}
        });
    }

    @Test
    void step9() {
        test(INITIAL_STATE, 9, new int[][]{
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 1, 0}
        });
    }

    @Test
    void step10() {
        test(INITIAL_STATE, 10, new int[][]{
                {1, 0, 0, 1, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}
        });
    }

    @Test
    void step11() {
        test(INITIAL_STATE, 11, new int[][]{
                {1, 1, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1}
        });
    }

    @Test
    void step12() {
        test(INITIAL_STATE, 12, new int[][]{
                {0, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}
        });
    }
}
