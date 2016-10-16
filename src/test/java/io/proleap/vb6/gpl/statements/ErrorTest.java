package io.proleap.vb6.gpl.statements;

import java.io.File;

import org.junit.Test;
import io.proleap.vb6.runner.VbParseTestRunner;
import io.proleap.vb6.runner.impl.VbParseTestRunnerImpl;

public class ErrorTest {

	@Test
	public void test() throws Exception {
		final File inputFile = new File("src/test/resources/io/proleap/vb6/gpl/statements/Error.cls");
		final VbParseTestRunner runner = new VbParseTestRunnerImpl();
		runner.parseFile(inputFile);
	}
}