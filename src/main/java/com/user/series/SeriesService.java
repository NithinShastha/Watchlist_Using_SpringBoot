package com.user.series;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Optional;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class SeriesService {

	SeriesRepository seriesRepository;

	@Autowired
	public SeriesService(SeriesRepository seriesRepository) {
		super();
		this.seriesRepository = seriesRepository;
	}

	public ModelAndView getSeries() {
		String viewName = "ListOfSeries";

		Map<String, Object> model = new HashMap<String, Object>();

		model.put("AllSeries", seriesRepository.findAll());

		return new ModelAndView(viewName, model);
	}

	
	  public ModelAndView getWatchlist() {
	  
	  
	  
	  String viewName = "watchlist";
	  
	  Map<String, Object> model = new HashMap<String, Object>();
	  
	  model.put("present", seriesRepository.findAll()); model.put("numberOfMovies",
	  seriesRepository.count());
	  

	  return new ModelAndView(viewName , model); }
	 

	public ModelAndView addSeries() {

		ModelAndView mav = new ModelAndView("addSeries");
		Series newSeries = new Series();
		mav.addObject("series", newSeries);
		return mav;
	}

	public void saveSeries(Series series) {
		seriesRepository.save(series);
	}

	public void deleteSeries(long seriesId) {

		seriesRepository.deleteById(seriesId);

	}

	/*
	 * public void addNewSeries(Series series) {
	 * 
	 * Optional<Series> seriesName =
	 * seriesRepository.findSeriesByNameOfTheSeries(series.getNameOfTheSeries());
	 * 
	 * if(seriesName.isPresent()) { throw new
	 * IllegalStateException("Series already exist in the DB"); }
	 * seriesRepository.save(series);
	 * 
	 * }
	 */

}
