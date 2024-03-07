// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае лючения, оно должно 
// записаться в лог-файл.

package S02;

import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.text.AbstractDocument.Content;
public class task4 {
    private static Logger logger = Logger.getLogger(Content.class.getName());
    public static void main(String[] args) {
        setLogger();
        String[] content = getContentFolder(".");
        writeToFile(content, ".");
    }
    public static String[] getContentFolder(String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }
    public static void writeToFile(String[]arrayStrings, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
          for (String str : arrayStrings) {
            fileWriter.write(str);
            fileWriter.write(System.lineSeparator());
          }  
        } catch (Exception e) {   
            logger.warning("Ошибка записи в файл!");
        }
    }
    public static void setLogger() {
        try {
            FileHandler fileHandler = new FileHandler("LogFile.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter textFormatter = new SimpleFormatter();
            fileHandler.setFormatter(textFormatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
