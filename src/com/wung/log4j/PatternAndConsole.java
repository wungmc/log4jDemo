package com.wung.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.ConsoleAppender;

public class PatternAndConsole {

    static Logger logger = Logger.getLogger(PatternAndConsole.class);

    public static void main(String args[]) {
        // Note, %n is newline
        String pattern =  "Milliseconds since program start: %r %n";
        pattern += "Classname of caller: %C %n";
        pattern += "Date in ISO8601 format: %d{ISO8601} %n";
        pattern += "Location of log event: %l %n";
        pattern += "Message: %m %n %n";

        PatternLayout layout = new PatternLayout(pattern);
        ConsoleAppender appender = new ConsoleAppender(layout);

        logger.addAppender(appender);
        logger.setLevel((Level) Level.DEBUG);

        logger.debug("Here is some DEBUG");
        logger.info("Here is some INFO");
        logger.warn("Here is some WARN");
        logger.error("Here is some ERROR");
        logger.fatal("Here is some FATAL");

	  /* 运行结果：
	    Milliseconds since program start: 0
		Classname of caller: log.PatternAndConsole
		Date in ISO8601 format: 2013-11-21 11:08:14,102
		Location of log event: log.PatternAndConsole.main(PatternAndConsole.java:26)
		Message: Here is some DEBUG
		...
	   */
    }

}

