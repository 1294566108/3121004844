import org.junit.Test;


public class MainMethodTest {

    @Test
    public void test1(){
        new main().main(null);
    }
    @Test
    public void test2(){
        String filePath1 = "E:\\3121004844\\src\\main\\java\\testFile\\test1";
        String filePath2 = "E:\\3121004844\\src\\main\\java\\testFile\\test2";
        String filePath3 = "E:\\3121004844\\src\\main\\java\\ans\\test-result2";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test3(){
        String filePath1 = "E:\\3121004844\\src\\main\\java\\testFile\\test3";
        String filePath2 = "E:\\3121004844\\src\\main\\java\\testFile\\test4";
        String filePath3 = "E:\\3121004844\\src\\main\\java\\ans\\test-result3";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
}
