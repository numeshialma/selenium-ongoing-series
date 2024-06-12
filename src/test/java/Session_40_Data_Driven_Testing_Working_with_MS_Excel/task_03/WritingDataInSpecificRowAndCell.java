package Session_40_Data_Driven_Testing_Working_with_MS_Excel.task_03;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataInSpecificRowAndCell {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile_Random.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("DynamicData");

        XSSFRow row = sheet.createRow(3);
        XSSFCell cell = row.createCell(4);

        cell.setCellValue("Welcome");

        workbook.write(file);  // attach workbook to the file

        workbook.close();
        file.close();

        System.out.println("File is created.....");

    }
}
