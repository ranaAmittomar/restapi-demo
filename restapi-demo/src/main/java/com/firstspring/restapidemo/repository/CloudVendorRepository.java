package com.firstspring.restapidemo.repository;

import com.firstspring.restapidemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    //we can always write custom methods here,but JPA repo provide more than enough methods to work with.

}
