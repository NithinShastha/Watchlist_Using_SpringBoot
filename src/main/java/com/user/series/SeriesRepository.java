package com.user.series;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {
	
	//Optional<Series> findSeriesByNameOfTheSeries(String NameOfTheSeries);
	/*
	 * @Query("SELECT * FROM Series LIMIT 5") List<Series> findTop5();
	 */
	long count();
	
}
