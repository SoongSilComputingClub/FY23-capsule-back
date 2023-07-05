package com.sscc.capsule.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/TemporalGetApi")
    public String getRequestApi(){
        return "임시로 만들어본 Get api";
    }
}
