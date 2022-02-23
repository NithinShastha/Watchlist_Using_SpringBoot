package com.user.series;
import java.util.HashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class SeriesController {
	private final SeriesService seriesService;
	
	@Autowired
	public SeriesController(SeriesService seriesService) {
		super();
		this.seriesService = seriesService;
	}

	@GetMapping("/series")
	public ModelAndView getWatchlist() {
		//return seriesService.getSeries();
		return seriesService.getWatchlist();
	}
	
	@GetMapping("/all")
	public ModelAndView getSeries(Model model){
		
		return seriesService.getSeries();
		
	}
	
	@DeleteMapping(path = "{seriesId}")
	public void deleteSeries(@PathVariable("seriesId") long seriesId) {
		seriesService.deleteSeries(seriesId);
	}
	
	@GetMapping("/suggestion")
	public ModelAndView addSeries() {
		return seriesService.addSeries();

	}
	
	@PostMapping("/saveSeries")
	public void saveSeries(@ModelAttribute Series series) {
		
		seriesService.saveSeries(series);
	}
	
	/*
	 * @GetMapping("/DiscardSeries") public void deleteSeries() {
	 * SeriesRepository.delete }
	 */
	
	
	
	
	/*
	 * @PostMapping public void addNewSeries(@RequestBody Series series) {
	 * seriesService.addNewSeries(series); }
	 * 
	 * 
	 * @DeleteMapping(path = "{seriesId}") public void
	 * deleteSeries(@PathVariable("seriesId") long seriesId) {
	 * seriesService.deleteSeries(seriesId); }
	 */
	
	

} 	
