package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import demo.domain.Word;

@FeignClient("MY-LAB-7-NOUN")
public interface NounClient {

	@GetMapping("/")
	Word getWord();
	
}
