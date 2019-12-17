package arrayGenerator.generator;

import arrayGenerator.scope.Scope;

/**
 * Class for generating arrays of random Integers.  The values will be chosen
 * from within the range of the IntegerArrayGenerator object's minimum and
 * maximum fields (inclusive).
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class IntegerArrayGenerator extends ScopedArrayGenerator<Integer>
{
    /**
     * @param scope the arrayGenerator.scope of values that may appear in the array.
     */
    public IntegerArrayGenerator(Scope<Integer> scope) {
        super(scope);
   }

    /**
     * This is an integer array generator, so the {@link ScopedArrayGenerator#createArray(int)} method required by
     * {@link ScopedArrayGenerator} must in this instance create an array of Integers.
     * @param size the size of the array to be created
     * @return an array of {@link Integer}s of the required size.  The values of the Integers
     *         will be uninstantiated.
     */
    @Override
    Integer[] createArray(int size) {
        return new Integer[size];
    }
}
