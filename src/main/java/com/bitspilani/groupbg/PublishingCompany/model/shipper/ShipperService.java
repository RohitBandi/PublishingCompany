package com.bitspilani.groupbg.PublishingCompany.model.shipper;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipperService {

    public List<Shipper> getShipper(){
        return List.of(new Shipper());
    }
}
