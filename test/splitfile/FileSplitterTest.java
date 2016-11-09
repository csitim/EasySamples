package splitfile;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

/**
 * Created by Timea_Csiszar on 11/4/2016.
 */
public class FileSplitterTest {

    @Test
    public void moreLineFileReaderTest() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        fileSplitter.split(Paths.get("D:/Workspace_bench/src/splitfile/test1.txt"));
    }

    @Test
    public void emptyFileReaderTest() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        fileSplitter.split(Paths.get("D:/Workspace_bench/src/splitfile/test2.txt"));
    }

    @Test
    public void oneLongLineFileReaderTest() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        fileSplitter.split(Paths.get("D:/Workspace_bench/src/splitfile/test3.txt"));
    }

    @Test
    public void oneShortLineFileReaderTest() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        fileSplitter.split(Paths.get("D:/Workspace_bench/src/splitfile/test4.txt"));
    }

    @Test(expected = NoSuchFileException.class)
    public void notExistingFileReaderTest() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        fileSplitter.split(Paths.get("D:/Workspace_bench/src/splitfile/test5.txt"));
    }

}
