package com.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class VideoPlayerApplication {
	@Autowired
	private StreamingService service;

	@GetMapping(value = "video/{videoId}", produces = "video/mp4")
	public Mono<Resource> getVideo(@PathVariable String videoId, @RequestHeader("Range") String range) {
		return service.getVideo(videoId);
	}

	public static void main(String[] args) {
		SpringApplication.run(VideoPlayerApplication.class, args);
	}

}
