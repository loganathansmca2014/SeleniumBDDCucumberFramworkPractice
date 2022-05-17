package Util;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class ExcelReaderFillo {
  private static final Logger logger = LogManager.getLogger(ExcelReaderFillo.class.getName());


  public static ExcelReaderFillo INSTANCE = new ExcelReaderFillo();
  public static HashMap<String, String> getExcelData(String sheetPath, String strQuery) {

    {
      logger.info("Excel sheet called");

      Connection con = null;
      Recordset record = null;
      HashMap<String, String> dict = new HashMap<String,String>();

      try {
        Fillo fillo = new Fillo();
        con = fillo.getConnection(sheetPath);
        logger.debug("Excel path  "+sheetPath);
        logger.debug("Excel connection opened  ");
        logger.debug("Excel path  "+strQuery);
        record = con.executeQuery(strQuery);

        int recordCount=0;
        while (record.next()) {
          recordCount++;

          for (String str : record.getFieldNames()) {
            if (!record.getField(str).isEmpty()) {
              dict.put(str + recordCount, record.getField(str));
            }
          }

        }

        return dict;


      } catch (FilloException e) {
        throw new RuntimeException("Unable to get data from Excel", e);
      } finally {
        if (record != null) {
          record.close();
        }
        con.close();
        logger.info("Excel connection closed ");

      }


    }
  }

  public static ExcelReaderFillo getInstance() {
    return INSTANCE;
  }

}
