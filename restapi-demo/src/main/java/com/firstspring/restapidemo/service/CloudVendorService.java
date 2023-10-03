package com.firstspring.restapidemo.service;

import com.firstspring.restapidemo.model.CloudVendor;

import java.util.List;

//writing methods which we want to have for in service layer.
public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);

    public CloudVendor getCloudVendor(String cloudVendorId);

    public List<CloudVendor> getAllCloudVendors();
}
