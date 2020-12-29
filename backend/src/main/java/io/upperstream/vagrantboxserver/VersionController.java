package io.upperstream.vagrantboxserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
  @GetMapping("/version")
  public Version version() {
	return new Version();
  }
}
