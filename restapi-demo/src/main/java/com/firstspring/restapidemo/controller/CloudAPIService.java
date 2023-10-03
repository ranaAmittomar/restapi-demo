package com.firstspring.restapidemo.controller;


import com.firstspring.restapidemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController //to let Spring know,it's a controller class.
@RequestMapping("/cloudVendor") //it's the starting Url we created right before when we give the id.
//we write :- localhost:8080/cloudVendor/(then IDs)
public class CloudAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}") //getting the id.
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
    }

    @PostMapping //To post the data
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor1) {

        this.cloudVendor = cloudVendor1;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping //to update the data
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor1) {

        this.cloudVendor = cloudVendor1;
        return "Cloud Vendor Updated Successfully";
    }

    //to delete id which we are passing in getCloudVendorDetails
    @DeleteMapping("{vendorId}") //deleting the id
    public String deleteCloudVendorDetails(String vendorId) {

        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}

