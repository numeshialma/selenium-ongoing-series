package Session_40_Data_Driven_Testing_Working_with_MS_Excel.task_02;

// Excel --> WorkBook --> Sheets --> Rows --> Cells

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataIntoExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Data");

        XSSFRow row1 = sheet.createRow(0);
            row1.createCell(0).setCellValue("Java");
            row1.createCell(1).setCellValue(19);
            row1.createCell(2).setCellValue("Automation");

        XSSFRow row2 = sheet.createRow(1);
            row2.createCell(0).setCellValue("Python");
            row2.createCell(1).setCellValue(3);
            row2.createCell(2).setCellValue("Automation");

        XSSFRow row3 = sheet.createRow(2);
            row3.createCell(0).setCellValue("C");
            row3.createCell(1).setCellValue(1234);
            row3.createCell(2).setCellValue("Automation");

        //FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx"); you can add like this here
        workbook.write(file);

        workbook.close();
        file.close();

        System.out.println("File is created.....");

    }
}
