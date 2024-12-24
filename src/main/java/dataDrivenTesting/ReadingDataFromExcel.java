package dataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {

        //ExcelFile --->ExcelBook --->Sheets ---->Rows ---->Cells

        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Suresh Siripurapu\\Documents\\DataDrivenTestingExample.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream); //extracting workbook from the file
        XSSFSheet sheet=workbook.getSheet("Sheet1"); //extracting sheet from workbook

        int totalRows=sheet.getLastRowNum(); // returns the last row number,the lastRowNumber==totalNumbers of rows in the sheet
        int totalCells=sheet.getRow(1).getLastCellNum(); //returns the total no.of cells in the first row(row numbers starts from 0,cell starts from 1) 1st row lastcell count ==toatl no.of cells

        System.out.println("Total Rows::"+totalRows);  //5
        System.out.println("Total Cells::"+totalCells); //4

        for(int r=0;r<=totalRows;r++){  //rows
            XSSFRow currentRow=sheet.getRow(r);
            for(int c=0;c<totalCells;c++){ //cells

                XSSFCell currentCell=currentRow.getCell(c);
                System.out.print(currentCell.toString()+"\t");

            }
            System.out.println();
        }

        workbook.close();
        fileInputStream.close();




    }



}
