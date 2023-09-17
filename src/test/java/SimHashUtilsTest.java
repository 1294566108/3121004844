import org.junit.Test;
import util.EncryptionUtils;
import util.FileUtils;


public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        EncryptionUtils.getHash("不想上学，只想睡觉。呃呃，呃呃呃，哈哈哈哈");
        EncryptionUtils.getHash("不想打码，只想睡觉。哈哈哈，呃呃，哈哈哈");
    }

    @Test
    public void getSimHashTest(){
        String filePath1 = "E:\\3121004844\\src\\main\\java\\testFile\\test3";
        String filePath2 = "E:\\3121004844\\src\\main\\java\\testFile\\test4";
        String txtString1 = FileUtils.getFileString(filePath1);
        String txtString2 = FileUtils.getFileString(filePath2);
        String simHash1 = EncryptionUtils.getSimHash(txtString1);
        String simHash2 = EncryptionUtils.getSimHash(txtString2);
    }
}
