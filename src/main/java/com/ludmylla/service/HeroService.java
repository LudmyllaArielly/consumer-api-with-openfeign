package com.ludmylla.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ludmylla.model.dto.HeroFindPowerstatsDto;

@FeignClient(url = "https://superheroapi.com/api/3400690410026873/", name = "HeroFindPowerstatsDto")
public interface HeroService {

	@GetMapping("{id}/powerstats")
	HeroFindPowerstatsDto findHero(@PathVariable("id") Long id);

}
