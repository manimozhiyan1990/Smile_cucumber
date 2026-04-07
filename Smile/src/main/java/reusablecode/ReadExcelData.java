package reusablecode;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData {

    public static String getData(String sheetname , int rowIndex , int coloum) throws IOException {

        FileInputStream file = new FileInputStream("src/main/resources/testdata/NameList.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet(sheetname);
       String dataValue = sheet.getRow(rowIndex).getCell(coloum).getStringCellValue();
       return dataValue;

    }

    public static void main(String[] args) throws IOException {
        String value = ReadExcelData.getData("list" , 1,0);
        System.out.println(value);
    }
    }

