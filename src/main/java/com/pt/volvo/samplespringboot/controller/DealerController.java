package com.pt.volvo.samplespringboot.controller;

import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dealers")
public class DealerController {

    @Autowired
    DealerService dealerService;

    @RequestMapping(path= "/getDealers", method = RequestMethod.GET)
    public List<Dealer> getAllDealers() {
        return dealerService.getDealerList();
    }
}
