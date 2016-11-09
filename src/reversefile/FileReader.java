package reversefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Timea_Csiszar on 11/4/2016.
 */
public class FileReader {



    public String readAndWriteReverse(Path path) throws IOException {

        List<StringBuilder> collect = Files.lines(path).map(x -> new StringBuilder(x).reverse()).collect(Collectors.toList());
        Collections.reverse(collect);
        return collect.stream().map(StringBuilder::toString).collect(Collectors.joining(System.lineSeparator()));
    }
}
