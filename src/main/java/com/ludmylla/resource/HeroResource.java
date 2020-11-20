package com.ludmylla.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ludmylla.model.dto.HeroFindPowerstatsDto;
import com.ludmylla.service.HeroService;

@RestController

public class HeroResource {

	@Autowired
	private HeroService heroService;

	@GetMapping("{id}/powerstats")
	public ResponseEntity<HeroFindPowerstatsDto> findPowerstats(@PathVariable("id") Long id) {
		HeroFindPowerstatsDto heros = new HeroFindPowerstatsDto();
		heros = heroService.findHero(id);
		return new ResponseEntity<HeroFindPowerstatsDto>(heros, HttpStatus.OK);
	}

}
