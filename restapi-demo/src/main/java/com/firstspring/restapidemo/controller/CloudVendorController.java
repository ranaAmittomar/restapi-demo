package com.firstspring.restapidemo.controller;


import com.firstspring.restapidemo.model.CloudVendor;
import com.firstspring.restapidemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //to let Spring know,it's a controller class.
@RequestMapping("/cloudVendor") //it's the starting Url we created right before when we give the id.
//we write :- localhost:8080/cloudVendor/(then IDs)
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //for specific Id.
    @GetMapping("{vendorId}") //getting the id.
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        return cloudVendorService.getCloudVendor(vendorId);
    }

    //for all ids.
    @GetMapping() //getting the id.
    public List<CloudVendor> getAllCloudVendorDetails() {

        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping //To post the data
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping //to update the data
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    //to delete id which we are passing in getCloudVendorDetails
    @DeleteMapping("{vendorId}") //deleting the id
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}

