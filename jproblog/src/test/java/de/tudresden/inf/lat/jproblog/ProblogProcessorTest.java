package de.tudresden.inf.lat.jproblog;


import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for ProblogProcessor.
 *
 * @author Julian Mendez
 */
public class ProblogProcessorTest {

    String INPUT_FOR_PROBLOG = "input_for_problog.txt";

    String OUTPUT_FROM_PROBLOG = "output_from_problog.txt";

    public String readFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get((getClass().getResource(fileName).toURI()))));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * This ensures that an instance of ProblogProcessor can properly test whether Python is
     * installed. If Python 3 is not installed, the test fails.
     */
    @Test
    public void testIsPythonInstalled() {
        ProblogProcessor instance = new ProblogProcessor(true);
        boolean result = instance.isPythonInstalled();
        Assertions.assertTrue(result);
    }

    /**
     * This tests if ProbLog can be installed by downloading the ProbLog release file.
     * This test requires an Internet connection
     *
     * @throws IOException          if the file could not be installed
     * @throws InterruptedException if the execution was interrupted
     */
    @Test
    public void testInstallProbLog() throws IOException, InterruptedException {
        ProblogProcessor instance = new ProblogProcessor(true);
        instance.install();
    }

    /**
     * This tests if ProbLog can be installed by downloading the ProbLog release file.
     * This test requires an Internet connection.
     *
     * @throws IOException if the file could not be installed
     */
    @Test
    public void testApply() throws IOException, InterruptedException {
        ProblogProcessor instance = new ProblogProcessor(true);
        instance.install();
        IntStream.range(0, 6).forEach(index -> {
            String input = readFile(File.separator + index + File.separator + INPUT_FOR_PROBLOG);
            String expected = readFile(File.separator + index + File.separator + OUTPUT_FROM_PROBLOG);
            String obtained = instance.apply(input);
            Assertions.assertEquals(expected, obtained);
        });
    }

}
