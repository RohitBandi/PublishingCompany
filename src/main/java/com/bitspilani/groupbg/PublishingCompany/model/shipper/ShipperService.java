package com.bitspilani.groupbg.PublishingCompany.model.shipper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipperService {

    private final ShipperRepository shipperRepository;
    @Autowired
    public ShipperService(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    public List<Shipper> getShipper(){
        return shipperRepository.findAll();
    }
}
