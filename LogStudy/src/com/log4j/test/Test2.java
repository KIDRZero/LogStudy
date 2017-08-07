package com.log4j.test;
/*
 * log设置输出级别，大于等于该级别的会输出，小于该级别的会屏蔽
 * 通常getLogger的参数是类的class，，这样返回的是类名的Logger，当然也可以随便起名，但是不建议
 * 这样可以为每个类建立自己的日志信息，清晰且方便管理
 * Logger为单例模式，即如果是第一次调用，会创建一个新的，再次调用会返回之前创建好的实例
 * Logger类负责处理日志记录的大部分操作
 * Appender负责控制日志记录输出 公共接口
 * Layout负责输出格式 抽象类
 * rootLogger是所有Logger类的父类，默认只需要配置该logger即可，所有logger在没有自行配置时会使用该父类的配置
 * 如果想特殊化某个logger，只需要单独配置即可，即子类覆盖父类的配置
 */
public class Test2 {
  public static void main(String[] args) {
	
}
  
}
