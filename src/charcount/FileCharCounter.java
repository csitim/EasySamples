package charcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Timea_Csiszar on 11/7/2016.
 */
public class FileCharCounter {


    public Map<String, Long> readAndCount(Path path) throws IOException {

        Stream<String> charStream = Files.lines(path).flatMapToInt(String::chars).mapToObj(this::convertString);
        return charStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }

    private String convertString(Integer x) {
        return String.valueOf((char) x.intValue());
    }


}
