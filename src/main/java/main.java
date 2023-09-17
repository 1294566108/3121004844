import util.EncryptionUtils;
import util.FileUtils;

/**
 * @author Akai
 */
public class main {
    public static void main(String[] args) {
        if (null == args || args.length < 3) {
            System.out.println("输入格式错误，请重新尝试");
            return;
        }
        String path1 = args[0];
        String path2 = args[1];
        String targetFile = args[2];
        String fileString1 = FileUtils.getFileString(path1);
        String fileString2 = FileUtils.getFileString(path2);
        System.out.println(fileString1);
        System.out.println(fileString2);
        String hash0 = EncryptionUtils.getSimHash(fileString1);
        String hash1 = EncryptionUtils.getSimHash(fileString2);
        double similarity = EncryptionUtils.getSimilarity(hash0, hash1);
        String builder = "原文文件的路径为：" + path1 + "\n" +
                "抄袭文件的路径为：" + path2 + "\n" +
                "两文件的相似度为：" + similarity + "\n";
        FileUtils.write(targetFile, builder);
    }
}
