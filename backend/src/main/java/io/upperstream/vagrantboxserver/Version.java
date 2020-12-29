package io.upperstream.vagrantboxserver;

import java.io.FileReader;
import java.io.IOException;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

/**
 * Hold application version.
 */
class Version
{
  private static final String appVersion;

  static {
	String version = "";
	try {
	  MavenXpp3Reader reader = new MavenXpp3Reader();
	  Model model = reader.read(new FileReader("pom.xml"));
	  version = model.getVersion();
	}
	catch (XmlPullParserException e) {
	  /* NOP */
	}
	catch (IOException e) {
	  /* NOP */
	}
	catch (Exception e) {
	  /* NOP */
	}
	appVersion = version;
  }

  public Version() {
	/* NOP */
  }

  public String getVersion() {
	return appVersion;
  }
}
