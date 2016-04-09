package com.training.gradle;

import org.apache.log4j.Logger;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class StoplightTest {

    public static final Logger log = Logger.getLogger(StoplightTest.class);
 
	@Test
    public void testRuntimeDependency() {
		log.info("testRuntimeDependency Entered ");    		
		Path dpath=  Paths.get("C:\\GradleTraining\\Exercise_7\\Exercise_7.1\\dependencies\\TestFiles"); ;
		Path fpath = dpath.resolve("testdata.txt"); 	 // use resolve()
		log.info("using test data file: " + fpath);    		

		//read test.dat file
	    int    numRead;
	    char[] buf = new char[1024];
		Charset charset = Charset.forName("US-ASCII");
		
	    try {
	    	List<String> testdata = Files.readAllLines(fpath, charset);
	    	log.info("got Test Data: " + testdata);    		
	    	for (String data :testdata) {
	    		log.info("running with test data: " + data);
	    	}
		} catch (IOException e) {
			log.error("caught exception: " + e);
		}


		// print out it's contents
    }
}
