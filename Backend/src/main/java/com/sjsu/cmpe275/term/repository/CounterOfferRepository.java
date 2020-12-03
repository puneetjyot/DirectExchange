package com.sjsu.cmpe275.term.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sjsu.cmpe275.term.models.CounterOffer;

public interface CounterOfferRepository extends JpaRepository<CounterOffer, Long> {
	@Query("Select co1 from CounterOffer co1 where co1.tgtUserId = :userId")
	List<CounterOffer> getReceivedCounterOffers(@Param("userId") Long userId);

	@Query("Select co1 from CounterOffer co1 where co1.srcUserId = :userId")
	List<CounterOffer> getProposedCounterOffers(@Param("userId") Long userId);
}