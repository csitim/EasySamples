package charcount;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Map;

/**
 * Created by Timea_Csiszar on 11/7/2016.
 */
public class FileCharCounterTest {


    @Test
    public void test() throws Exception {
        FileCharCounter fileCharCounter = new FileCharCounter();
        Map<String, Long> letters = fileCharCounter.readAndCount(Paths.get("test-resources\\test1.txt"));

        Assert.assertEquals("", letters.get("a"), new Long(10));
        Assert.assertEquals("", letters.get("b"), new Long(16));
        Assert.assertEquals("", letters.get("c"), new Long(19));
        Assert.assertEquals("", letters.get("l"), new Long(3));
        Assert.assertEquals("", letters.get("m"), new Long(4));
        Assert.assertEquals("", letters.get("n"), new Long(10));
    }
}
