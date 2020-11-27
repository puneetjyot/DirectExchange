package com.sjsu.cmpe275.term.service.offer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjsu.cmpe275.term.models.Offer;
import com.sjsu.cmpe275.term.repository.OfferRepository;

@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	OfferRepository offerRepository;

	@Override
	public Offer postOffer(Offer offer) {
		// TODO Auto-generated method stub
		return offerRepository.save(offer);
	}

	@Override
	public List<Offer> getOffer() {
		
		return offerRepository.findAll();
	}
}