package com.log4j.study;

import org.apache.log4j.Logger;

public class Test {
 public static Logger log=Logger.getLogger(Test.class);
  
  public static void logTest(){
	  System.out.println("=====rootLogger类的日志输出");
	  System.out.println(log.isDebugEnabled());
	  log.trace("2");  
      log.info("3");  
      log.warn("4");  
      log.error("5");  
      log.fatal("6"); 
      try{
    	  System.out.println(1/0);
      }catch(RuntimeException e){
    	  log.error(e.getMessage());
      }
  }
  static{
	  log.debug("1");
  }
  public static void main(String[] args) {
	logTest();
}
}
