package com.jdklog.test;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * JDK自带的日志
 * all→finest→finer→fine→config→info→warning→server→off
 * 以上输出级别由低到高，通过setLevel设置等级进行筛选
 * 大于等于该级别的信息会在控制台进行输出，小于该级别的信息会被屏蔽
 * 根据个人需要设置合适的级别
 */
public class LogJdkTest {
   public static Logger log=Logger.getLogger(LogJdkTest.class.toString());
   public static void main(String[] args) {
	 log.setLevel(Level.INFO);
	  log.finest("1");  
      log.finer("2");  
      log.fine("3");  
      log.config("4");  
      log.info("5");  
      log.warning("6");  
      log.severe("7");
      log.severe("8");
}
}
