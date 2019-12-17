package arrayGenerator.generator;

import org.junit.jupiter.api.Test;
import arrayGenerator.scope.IntegerScope;
import arrayGenerator.scope.Scope;

/**
 * Some basic tests for integer array generators.
 *
 * @author Hugh Osborne
 * @version October 2019
 */

class IntegerArrayGeneratorTest extends ScopedArrayGeneratorTest<Integer> {

    @Override
    ArrayGenerator<Integer> getGenerator()
    {
        return new IntegerArrayGenerator(new IntegerScope());
    }

    ScopedArrayGenerator<Integer> getGenerator(Scope<Integer> scope) {
        return new IntegerArrayGenerator(scope);
    }

    @Test
    void testInRangeThreeToEightySeven() {
        testWithinRange(new IntegerScope(3,87),150);
    }

    @Test
    void testInSingletonRangeFour()
    {
        testWithinRange(new IntegerScope(4,4),10);
    }

    @Test
    void testInSingletonRangeZero()
    {
        testWithinRange(new IntegerScope(0,0),150);
    }

    @Test
    void testCoversZeroToNine() {
        testCoversRange(new IntegerScope(0,9));
    }

    @Test
    void testCoversSingletonZero() {
        testCoversRange(new IntegerScope(0,0));
    }
}