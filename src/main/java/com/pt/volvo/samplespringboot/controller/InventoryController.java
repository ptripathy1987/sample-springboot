package com.pt.volvo.samplespringboot.controller;

import com.pt.volvo.samplespringboot.dto.Inventory;
import com.pt.volvo.samplespringboot.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventories")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @RequestMapping(path= "/getInventories", method = RequestMethod.GET)
    public List<Inventory> getAllInventories() {
        return inventoryService.getInventoryList();
    }
}
