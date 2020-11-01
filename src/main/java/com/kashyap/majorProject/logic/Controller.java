package com.kashyap.majorProject.logic;

import com.kashyap.majorProject.DAO.MetaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "/ping",method = RequestMethod.GET)
    public ResponseEntity<?> ping(){
        logger.info("Working fine");
        return ResponseEntity.status(HttpStatus.OK).body("pong");
    }

    @RequestMapping(value = "/getData",method = RequestMethod.GET)
    public ResponseEntity<?> getData(@RequestBody MetaData metaData){
        logger.info("Got metaData : " + metaData.toString());
        return ResponseEntity.status(HttpStatus.OK).body("pong");
    }

}
