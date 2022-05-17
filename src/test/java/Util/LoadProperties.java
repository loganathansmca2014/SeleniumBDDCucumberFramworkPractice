package Util;

import BusinessLogic.BussinessFun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
  static Properties prop = new Properties();
  public static String userName;
  public static String password;
  public static String strquery_Login;
  public static LoadProperties INSTANCE = new LoadProperties();



  public void loadProperty() throws IOException {

    String filename = "src/test/resources/UserCredentials.properties";
    BussinessFun.class.getClassLoader().getResourceAsStream(filename);
    System.out.println(filename);
    prop.load(new FileInputStream(filename));
    userName = prop.getProperty("UserName");
    password = prop.getProperty("Password");


  }


  public void queryProperty() throws IOException {

    String filename = "src/test/resources/QueryDB.properties";
    BussinessFun.class.getClassLoader().getResourceAsStream(filename);
    System.out.println(filename);
    prop.load(new FileInputStream(filename));
    strquery_Login = prop.getProperty("Strquerylogin");


  }
  public String getstrQuery() {
    return strquery_Login;
  }

  public void setstrQuery(String strQuery) {
    this.strquery_Login = strQuery ;
  }
  public static LoadProperties getInstance() {
    return INSTANCE;
  }

}
