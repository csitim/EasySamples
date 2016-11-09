package splitfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Timea_Csiszar on 11/4/2016.
 */
public class FileSplitter {

    private static final int MAX_LINE_LENGTH = 30;

    public void split(Path path) throws IOException {

        List<String> words = new ArrayList<>();
        List<String> rows = new ArrayList<>();

        Files.lines(path).forEachOrdered(s -> {
            words.addAll(Arrays.asList(s.split(" ")));
        });

        String actRowState = "";
        String prevRowState = "";

        for (String word : words) {

            prevRowState = actRowState;

            if (actRowState.length() > 0) {
                actRowState += " ";
            }
            actRowState += word;

            if (actRowState.length() > MAX_LINE_LENGTH) {
                rows.add(prevRowState);
                actRowState = word;
                prevRowState = "";
            }
        }

        rows.add(actRowState);

        rows.stream().forEachOrdered(s -> System.out.println(s));
    }
}
