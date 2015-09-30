package com.rajeshsurana.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshsurana.spring.web.dao.Offer;
import com.rajeshsurana.spring.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {

	private OffersDAO offersDAO;

	@Autowired
	public void setOffersDAO(OffersDAO offersDAO) {
		this.offersDAO = offersDAO;
	}

	public List<Offer> getCurrent() {
		return offersDAO.getOffers();
	}

	public void create(Offer offer) {
		offersDAO.create(offer);
		
	}
}
