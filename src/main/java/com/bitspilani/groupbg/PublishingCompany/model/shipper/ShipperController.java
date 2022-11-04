package com.bitspilani.groupbg.PublishingCompany.model.shipper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ship")
public class ShipperController {

    private final ShipperService shipperService;

    @Autowired
    public ShipperController(ShipperService shipperService){
        this.shipperService = shipperService;
    }

    @GetMapping
    public List<Shipper> getShipper(){
        return shipperService.getShipper();
    }
}
