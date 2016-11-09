package reversefile;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

/**
 * Created by Timea_Csiszar on 11/4/2016.
 */
public class FileReaderTest {

    @Test
    public void moreLineFileReaderTest() throws IOException {
        testFileContentsAreEquals("test-resources\\test1.txt", "test-resources\\test1-reverse.txt");
    }

    @Test
    public void emptyFileReaderTest() throws IOException {
        testFileContentsAreEquals("test-resources\\test2.txt", "test-resources\\test2.txt");
    }

    @Test
    public void oneLineFileReaderTest() throws IOException {
        testFileContentsAreEquals("test-resources\\test3.txt", "test-resources\\test3-reverse.txt");
    }

    @Test(expected = NoSuchFileException.class)
    public void notExistingFileReaderTest() throws IOException {
        testFileContentsAreEquals("test-resources\\test.txt", "test-resources\\test1.txt");
    }

    private void testFileContentsAreEquals(String actualFilePath, String expectedFilePath) throws IOException {
        String expectedContent = IOUtils.toString(new FileInputStream(expectedFilePath), Charset.defaultCharset());
        FileReader fr = new FileReader();
        String actualContent = fr.readAndWriteReverse(Paths.get(actualFilePath));
        Assert.assertEquals("Wrong reverse of " + actualFilePath, expectedContent, actualContent);
    }

}
