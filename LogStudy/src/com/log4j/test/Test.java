package com.log4j.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/*
 * Log4j��Ŀǰʹ����Ϊ�㷺����־�ռ䣬����������jdk�Դ��Ĳ�࣬�����¼�������
 * TRACE��DEBUG��INFO��WARNING��ERROR��FATAL��OFF
 * �߼����Զ����εͼ���
 * log4jͨ��ͨ�������ļ�����ʽ���������Ϣ��һЩ������ã��ڲ���Ҫ�ֶ�ָ�������ļ���ʱ�򣬷���srcĿ¼�¼���
 * ͨ�������ļ�����������־��Ϣ�����Ŀ�ĵأ������ʽ���Լ���־���ɹ��̵ȣ���Ϊapache��һ����Դ��Ŀ�����ڲ�
 * ���˴������Ż����������Ŀ��maven��Ŀʱ������src�£�ͨ������������ļ����Զ�����class�ļ���·����
 * PropertyConfigurator.configureҲ���������ַ�ʽָ�������ļ�����·�������ǲ��Ƽ�
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
