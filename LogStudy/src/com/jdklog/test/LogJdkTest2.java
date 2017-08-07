package com.jdklog.test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * 可以通过创建Handler设置其过滤级别，之后为log添加handler
 * 这与通过log调用setLevel是两个独立的过程，简单来说就是如果handler设置
 * 的过滤级别比log设置的过滤级别低，那么控制台会从log设置的级别开始到指定的大于该级别的信息输出两次
 * 反之，如果设置的级别高于log设置的级别，那么log与handler之间的级别会输出一次，从handler设置的级别往后的
 * 输出两次
 * http://www.cnblogs.com/LinkinPark/p/5232853.html
 * getLogger工厂方法要么创建一个新的logger对象，要么返回一个已有的logger对象
 * log设置日志级别用来对请求级别进行检查，如果请求级别小于日志级别，那么会忽略
 * Logger上的所有方法都是多线程安全的
 */
public class LogJdkTest2 {
   public static Logger log=Logger.getLogger(LogJdkTest2.class.toString());
   static{
	   Handler handler=new ConsoleHandler();
	   handler.setLevel(Level.WARNING);
	   log.addHandler(handler);
   }
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
