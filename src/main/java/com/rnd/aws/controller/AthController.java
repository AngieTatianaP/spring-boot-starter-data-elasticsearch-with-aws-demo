package com.rnd.aws.controller;

import com.rnd.aws.model.AthModel;
import com.rnd.aws.model.PhotoDto;
import com.rnd.aws.service.AthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/ath")
public class AthController {

    @Autowired
    private AthService service;
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        return service.search(key, value);
    }
}
