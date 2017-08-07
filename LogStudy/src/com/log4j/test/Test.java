package com.log4j.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/*
 * Log4j是目前使用最为广泛的日志空间，规则与上面jdk自带的差不多，有以下几个级别
 * TRACE→DEBUG→INFO→WARNING→ERROR→FATAL→OFF
 * 高级别自动屏蔽低级别
 * log4j通常通过配置文件的形式进行输出信息的一些相关配置，在不需要手动指定配置文件的时候，放在src目录下即可
 * 通过配置文件可以配置日志信息的输出目的地，输出格式，以及日志生成过程等，作为apache的一个开源项目，其内部
 * 做了大量的优化，当这个项目是maven项目时，放入src下，通过编译后，配置文件会自动放在class文件夹路径下
 * PropertyConfigurator.configure也可以用这种方式指定配置文件绝对路径，但是不推荐
 */
public class Test {
   public static Logger log=Logger.getLogger(Test.class);
   public static void test(){
	   log.trace("1");
	   log.debug("2");  
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
   public static void main(String[] args) {
	   test();
	  // PropertyConfigurator.configure("xxx");
}
}
