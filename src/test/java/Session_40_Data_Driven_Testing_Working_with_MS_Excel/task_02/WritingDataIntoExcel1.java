package Session_40_Data_Driven_Testing_Working_with_MS_Excel.task_02;

// Excel --> WorkBook --> Sheets --> Rows --> Cells

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataIntoExcel1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile_dynamic.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("DynamicData");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many rows? ");
        int noOfRows = sc.nextInt();

        System.out.println("Enter how many cells? ");
        int noOfCells = sc.nextInt();

        for(int r=0; r<=noOfRows; r++){
            XSSFRow currentRow = sheet.createRow(r);

            for(int c=0; c<noOfCells; c++){
                XSSFCell cell = currentRow.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);  // attach workbook to the file

        workbook.close();
        file.close();

        System.out.println("File is created.....");

    }
}
