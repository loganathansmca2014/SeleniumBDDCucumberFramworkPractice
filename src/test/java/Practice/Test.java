package Practice;

import BusinessLogic.BussinessFun;
import Util.ExcelReader;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Test {

  private static final Logger logger = LogManager.getLogger(BussinessFun.class.getName());
  public static void main(String[] args) {

    logger.info("started");
    logger.debug("Sample DEBUG message");
    logger.error("Sample ERROR message");
    logger.info("Sample INFO message");
    logger.warn("Sample WARN message");// public static void  Hashtable<String, String> getExcelData(String sheetname, String strQuery) {

      {
        Connection con = null;
        Recordset record = null;
        Hashtable<String, String> dict = new Hashtable<>();

        try {
          Fillo fillo = new Fillo();
          con = fillo.getConnection(ExcelReader.getInstance().getTestdatafilepath());
          record = con.executeQuery("Select * from Login");
          int recordCount=0;
          while (record.next()) {
            recordCount++;

            for (String str : record.getFieldNames())
              if (!record.getField(str).isEmpty())
                dict.put(str + recordCount, record.getField(str));

            //list.add(dict);
            //return dict;

          }
          Set<Map.Entry<String ,String>> listset=dict.entrySet();
          for(Map.Entry<String ,String> entry:listset)
          {String currentKey=entry.getKey();
          String currenValue=entry.getValue();
          System.out.println(currentKey+":::::"+currenValue);



          }

        } catch (FilloException e) {
          throw new RuntimeException("Unable to get data from Excel", e);
        } finally {



          record.close();
          con.close();
        }

      }
    }

  }