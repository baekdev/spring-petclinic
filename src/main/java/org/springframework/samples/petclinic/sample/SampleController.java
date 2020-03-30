package org.springframework.samples.petclinic.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.stereotype.Controller;

/**
 * @author baekdev
 * @since 2020-03-30 https://baek.dev
 */
// @Controller
public class SampleController {

//	@Autowired
	private OwnerRepository ownerRepository;

//	@Autowired
//    public void setOwnerRepository(OwnerRepository ownerRepository) {
//        this.ownerRepository = ownerRepository;
//    }

    public SampleController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
}
