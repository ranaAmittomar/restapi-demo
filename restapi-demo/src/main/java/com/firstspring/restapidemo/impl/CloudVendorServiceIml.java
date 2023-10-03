package com.firstspring.restapidemo.impl;

import com.firstspring.restapidemo.model.CloudVendor;
import com.firstspring.restapidemo.repository.CloudVendorRepository;
import com.firstspring.restapidemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceIml implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceIml(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    //creating data using repo.
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return null;
    }

    //delete methods are very sensitive ,so ,we must be very careful when implementing.
    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Delete Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
