package cli;

import com.beust.jcommander.Parameter;

public class Args {

	@Parameter(names = { "--input", "-i" }, required = true, description="Input file name", order = 0)
	private String inputFilename;

	@Parameter(names = { "--output", "-o" }, description="Output file name", order = 1)
	private String outputFilename = "out.xml";

	public String getInputFilename() {
		return inputFilename;
	}

	public String getOutputFilename() {
		return outputFilename;
	}

}
