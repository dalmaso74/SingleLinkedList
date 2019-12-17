package arrayGenerator.generator;

import arrayGenerator.scope.Scope;
import arrayGenerator.scope.StringScope;

/**
 * Class for generating random arrays of strings.  The strings will be constructed
 * from strings in the alphabet defined by this generator's arrayGenerator.scope.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class StringArrayGenerator extends ScopedArrayGenerator<String> {
    /**
     * Constructor where the alphabet is provided.
     *
     * @param scope the arrayGenerator.scope of the Strings permitted for this generator.
     */
    public StringArrayGenerator(Scope<String> scope)
    {
        super(scope);
    }

    /**
     * If no alphabet is provided, use the default alphabet provided by {@link StringScope}.
     */
    public StringArrayGenerator()
    {
        super(new StringScope());
    }

    /**
     * This is a string array generator, so the {@link ScopedArrayGenerator#createArray(int)} method required by
     * {@link ScopedArrayGenerator} must in this instance create an array of Strings.
     * @param size the size of the array to be created
     * @return an array of {@link String}s of the required size.  The values of the Strings
     *         will be uninstantiated.
     */
    @Override
    String[] createArray(int size) {
        return new String[size];
    }
}
