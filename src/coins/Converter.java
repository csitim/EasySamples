package coins;

/**
 * Created by Timea_Csiszar on 11/4/2016.
 */
@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

}
