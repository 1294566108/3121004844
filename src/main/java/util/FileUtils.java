package util;

import exception.FileException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author Akai
 */
public class FileUtils {
    public static String getFileString(String filePath){
        if (null==filePath){
            try {
                throw new FileException("文件名错误");
            } catch (FileException e) {
                e.printStackTrace();
            }
        }
        File file = null;
        if (filePath != null) {
            file = new File(filePath);
        }
        if (file != null && (!file.exists() || !file.isFile())) {
            try {
                throw new FileException("文件错误，请重新检查文件名或者该路径是否是文件夹");
            } catch (FileException e) {
                e.printStackTrace();
            }
        }
        StringBuilder str = new StringBuilder();
        String strLine;
        // 将 txt文件按行读入 str中
        FileInputStream fileInputStream = null;
        try {
            if (file != null) {
                fileInputStream = new FileInputStream(file);
            }
            InputStreamReader inputStreamReader = null;
            if (fileInputStream != null) {
                inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            }
            BufferedReader bufferedReader = null;
            if (inputStreamReader != null) {
                bufferedReader = new BufferedReader(inputStreamReader);
            }
            // 字符串拼接
            if (bufferedReader != null) {
                while ((strLine = bufferedReader.readLine()) != null) {
                    str.append(strLine);
                }
            }
            // 关闭资源
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static String[] iterateFile(String filepath)
    {
        File file=new File(filepath);
        if(file.isFile())
        {
            //是文件
            System.out.println("\t"+file.getName());
            String[] files = new String[1];
            files[0] = file.getAbsolutePath();
            return files;
        }else{
            return file.list();
        }
    }
    public static void write(String name,String context){
        if(null==name||null==context){
            System.out.println("请输出正确的格式");
            return;
        }
        File file = new File(name);
        BufferedWriter writer=null;
        if(!file.exists()){
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!file.isFile()){
            System.out.println("路径："+name+" 不是文件，写入文件失败");
            return;
        }
        try {
            writer=new BufferedWriter(new FileWriter(file));
            writer.write(context);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=writer){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
