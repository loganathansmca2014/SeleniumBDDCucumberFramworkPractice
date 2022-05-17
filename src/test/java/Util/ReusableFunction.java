package Util;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;

public class ReusableFunction

{

    public static ReusableFunction INSTANCE = new ReusableFunction();
    public Hashtable<String,String> readExcel(int rowNo, String sheetname ) throws IOException
    {
        String key=null;
        String value=null;

        Hashtable <String,String> dict=new Hashtable <String,String>();
        String inputFilepath=ExcelReader.getInstance().getTestdatafilepath();
        FileInputStream fi=new FileInputStream(inputFilepath);
        HSSFWorkbook wb=new HSSFWorkbook(fi);
        HSSFSheet ioData=wb.getSheet(sheetname);
        int noOfCols=ioData.getRow(0).getPhysicalNumberOfCells();

        //for(int rowNo=1;rowNo<=noOfRows-1;rowNo++){
        for(int colNo=0;colNo<=noOfCols-1;colNo++){
            //if(ioData.getRow(rowNo).getCell(1).getStringCellValue().trim().compareToIgnoreCase("Yes")==0){
            if(ioData.getRow(0).getCell(colNo).getStringCellValue().trim()!=null){
                key=ioData.getRow(0).getCell(colNo).getStringCellValue().trim();
            }
            if(ioData.getRow(rowNo).getCell(colNo).getStringCellValue()!=null){
                value=ioData.getRow(rowNo).getCell(colNo).getStringCellValue().trim();
            }

            if(null!=key && null!=value){
                dict.put(key, value);
            }


        }

        fi.close();
        wb.close();
        return dict;

    }
    public static ReusableFunction getInstance() {
        return INSTANCE;
    }
}
