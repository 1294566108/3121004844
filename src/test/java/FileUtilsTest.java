import org.junit.Test;
import util.FileUtils;


public class FileUtilsTest {
    @Test
    public void getTxtStringTest(){
        String filePath = "E:\\3121004844\\src\\main\\java\\testFile\\test1";
        String txtString = FileUtils.getFileString(filePath);
    }
    @Test
    public void iterateFileTest(){
        String filePath1 = "E:\\3121004844\\src\\main\\java\\testFile\\test3";
        String filePath2 = "E:\\3121004844\\src\\main\\java\\testFile\\test4";
        String[] iterateFile1 = FileUtils.iterateFile(filePath1);
        String[] iterateFile2 = FileUtils.iterateFile(filePath2);
    }
}
