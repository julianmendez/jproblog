package de.tudresden.inf.lat.jproblog;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for ProblogProcessor.
 * @author Julian Mendez
 *
 */
public class ProblogProcessorTest {

	/**
	 * This ensures that an instance of ProblogProcessor can properly test whether Python is installed.
	 */
	@Test
	public void testIsPythonInstalled() {
		ProblogProcessor instance = new  ProblogProcessor(true);
		instance.isPythonInstalled();
	}

}
