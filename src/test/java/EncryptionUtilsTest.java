import org.junit.Test;
import util.EncryptionUtils;
import util.FileUtils;
public class EncryptionUtilsTest {

    @Test
    public void getSimilarityTest(){
        String filePath1 = "E:\\3121004844\\src\\main\\java\\testFile\\test3";
        String filePath2 = "E:\\3121004844\\src\\main\\java\\testFile\\test4";
        String txtString1 = FileUtils.getFileString(filePath1);
        String txtString2 = FileUtils.getFileString(filePath2);
        String hash1 = EncryptionUtils.getSimHash(txtString1);
        String hash2 = EncryptionUtils.getSimHash(txtString2);
        System.out.println(hash1);
        System.out.println(hash2);
    }
}
