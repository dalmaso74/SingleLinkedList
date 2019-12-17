package arrayGenerator.generator;

import org.junit.jupiter.api.Test;
import arrayGenerator.scope.CharacterScope;
import arrayGenerator.scope.Scope;

/**
 * Some basic tests for character array generators.
 *
 * @author Hugh Osborne
 * @version October 2019
 */

class CharacterArrayGeneratorTest extends ScopedArrayGeneratorTest<Character> {

    @Override
    ScopedArrayGenerator<Character> getGenerator(Scope<Character> scope) {
        return new CharacterArrayGenerator(scope);
    }

    @Override
    ArrayGenerator<Character> getGenerator() {
        return new CharacterArrayGenerator();
    }

    @Test
    void testInRangeABC() {
        testWithinRange(new CharacterScope("ABC"),150);
    }

    @Test
    void testInSingletonRangeZ()
    {
        testWithinRange(new CharacterScope("Z"),10);
    }

    @Test
    void testInAlphabet()
    {
        testWithinRange(new CharacterScope(),150);
    }

    @Test
    void testCoversAlphabet() {
        testCoversRange(new CharacterScope());
    }

    @Test
    void testCoversSingletonQ()
    {
        testCoversRange(new CharacterScope("Q"));
    }
}