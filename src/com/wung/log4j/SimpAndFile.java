package com.wung.log4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.FileAppender;

/**
 * 程序实现了SimpleLayout和FileAppender
 * @author Administrator
 *
 * Created by wung on 2016/12/12.
 *
 */
public class SimpAndFile {

    //	static Logger logger = Logger.getLogger(SimpAndFile.class);
    static Logger logger = Logger.getLogger("log4j.SimpAndFile");
//	static Logger logger = Logger.getRootLogger();

    public static void main(String args[]) {
//        SimpleLayout layout = new SimpleLayout();
//        FileAppender appender = null;
//        try {
//             appender = new FileAppender(layout,"output1.txt",false);
//        } catch(Exception e) {}
//        logger.addAppender(appender);

        logger.addAppender(new ConsoleAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)));

        /*
         * 级别等级：DEBUG, INFO, WARN, ERROR, FATAL
         * 只记录设置的级别（此处为DEBUG）及以上的信息，
         * 例如：如果设置为INFO，则不再输出DEBUG的信息
         */
        logger.setLevel(Level.DEBUG);
        logger.debug("Here is some DEBUG");
        logger.info("Here is some INFO");
        logger.warn("Here is some WARN");
        logger.error("Here is some ERROR");
        logger.fatal("Here is some FATAL");
        System.out.println(logger.getName());
    }
}
