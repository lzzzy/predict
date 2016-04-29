package org.predict;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiscTest {

	private static Logger logger = LoggerFactory.getLogger(MiscTest.class);

	@Test
	public void logging() throws Exception {
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
	}
}
