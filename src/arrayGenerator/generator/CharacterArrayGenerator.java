package arrayGenerator.generator;

import arrayGenerator.scope.CharacterScope;
import arrayGenerator.scope.Scope;

/**
 * Class for generating random strings (arrays of Characters).  The strings will be constructed
 * from characters in the alphabet defined by this generator's arrayGenerator.scope.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class CharacterArrayGenerator extends ScopedArrayGenerator<Character>
{
  /**
     * Constructor where the alphabet is provided.
     *
     * @param scope the arrayGenerator.scope of the characters permitted for this generator.
     */
    public CharacterArrayGenerator(Scope<Character> scope)
    {
        super(scope);
    }

    /**
     * If no alphabet is provided, use the default alphabet provided by {@link CharacterScope}.
     */
    public CharacterArrayGenerator() {
        super(new CharacterScope());
    }

    /**
     * This is a character array generator, so the {@link ScopedArrayGenerator#createArray(int)} method required by
     * {@link ScopedArrayGenerator} must in this instance create an array of Characters.
     * @param size the size of the array to be created
     * @return an array of {@link Character}s of the required size.  The values of the Characters
     *         will be uninstantiated.
     */
    @Override
    Character[] createArray(int size) {
        return new Character[size];
    }
}
