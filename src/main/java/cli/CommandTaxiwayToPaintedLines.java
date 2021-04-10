package cli;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(commandDescription = "Convert taxiway centerlines to painted lines")
public class CommandTaxiwayToPaintedLines {
	@Parameter(names = {"--material", "-m"}, description="GUID of the material to be used (without curlies) for custom lines", order = 0)
	private String material;
	
	@Parameter(names = {"--linetype", "-t"}, description="line type of the new painted lines", order = 1)
	private String linetype = "DEFAULT";

	@Parameter(names = {"--extend", "-x"}, description="adds a 3rd point in the middle of segments with only 2 points", order = 2)
	private boolean extend = false;

	

	public String getMaterial() {
		return material;
	}

	public String getLinetype() {
		return linetype;
	}

	public boolean getExtend() {
		return extend;
	}
	
}
