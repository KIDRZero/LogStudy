package com.jdklog.test;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * JDK�Դ�����־
 * all��finest��finer��fine��config��info��warning��server��off
 * ������������ɵ͵��ߣ�ͨ��setLevel���õȼ�����ɸѡ
 * ���ڵ��ڸü������Ϣ���ڿ���̨���������С�ڸü������Ϣ�ᱻ����
 * ���ݸ�����Ҫ���ú��ʵļ���
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
