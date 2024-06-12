package Session_40_Data_Driven_Testing_Working_with_MS_Excel.task_01;

// Excel --> WorkBook --> Sheets --> Rows --> Cells

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExcel1 {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");  // XSSFSheet sheet = workbook.getSheetAt(0);

        int totalRows = sheet.getLastRowNum();

        int totalCells = sheet.getRow(1).getLastCellNum();

        System.out.println("Number of rows : "+totalRows);
        System.out.println("Number of cells : "+totalCells);


        for(int r=0; r<=totalRows; r++){

            XSSFRow currentRow = sheet.getRow(r);

            for(int c=0; c<=totalCells; c++){
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString()+"\\t");
            }
        }

        workbook.close();
        file.close();
    }
}
