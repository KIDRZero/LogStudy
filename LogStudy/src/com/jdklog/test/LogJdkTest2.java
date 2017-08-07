package com.jdklog.test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * ����ͨ������Handler��������˼���֮��Ϊlog���handler
 * ����ͨ��log����setLevel�����������Ĺ��̣�����˵�������handler����
 * �Ĺ��˼����log���õĹ��˼���ͣ���ô����̨���log���õļ���ʼ��ָ���Ĵ��ڸü������Ϣ�������
 * ��֮��������õļ������log���õļ�����ôlog��handler֮��ļ�������һ�Σ���handler���õļ��������
 * �������
 * http://www.cnblogs.com/LinkinPark/p/5232853.html
 * getLogger��������Ҫô����һ���µ�logger����Ҫô����һ�����е�logger����
 * log������־�������������󼶱���м�飬������󼶱�С����־������ô�����
 * Logger�ϵ����з������Ƕ��̰߳�ȫ��
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
