/**
 * 
 */
package com.user.series;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author N$
 *
 */

@Entity
@Table
public class Series {
	
	@Id
	@SequenceGenerator(
			name = "series_sequence",
			sequenceName =  "series_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "series_sequence"
			)
	
	private Long SeriesId;
	private String NameOfTheSeries = "";
	private String Ott = "";
	private int NumberOfSeasons;
	private String AvgDurationOfEachEp;
    private long YearOfRelease;
    
    public Series() {
		// TODO Auto-generated constructor stub
	}

	public Series(Long seriesId,
			      String nameOfTheSeries,
			      String ott,
			      int numberOfSeasons,
			      String avgDurationOfEachEp,
			      long yearOfRelease) {
		
		super();
		SeriesId = seriesId; 
		NameOfTheSeries = nameOfTheSeries;
		Ott = ott;
		NumberOfSeasons = numberOfSeasons;
		AvgDurationOfEachEp = avgDurationOfEachEp;
		YearOfRelease = yearOfRelease;
	}

	public Series(String nameOfTheSeries, String ott, int numberOfSeasons, String avgDurationOfEachEp,
			long yearOfRelease) {
		super();
		NameOfTheSeries = nameOfTheSeries;
		Ott = ott;
		NumberOfSeasons = numberOfSeasons;
		AvgDurationOfEachEp = avgDurationOfEachEp;
		YearOfRelease = yearOfRelease;
	}

	public Long getSeriesId() {
		return SeriesId;
	}

	public void setSeriesId(Long seriesId) {
		SeriesId = seriesId;
	}

	public String getNameOfTheSeries() {
		return NameOfTheSeries;
	}

	public void setNameOfTheSeries(String nameOfTheSeries) {
		NameOfTheSeries = nameOfTheSeries;
	}

	public String getOtt() {
		return Ott;
	}

	public void setOtt(String ott) {
		Ott = ott;
	}

	public int getNumberOfSeasons() {
		return NumberOfSeasons;
	}

	public void setNumberOfSeasons(int numberOfSeasons) {
		NumberOfSeasons = numberOfSeasons;
	}

	public String getAvgDurationOfEachEp() {
		return AvgDurationOfEachEp;
	}

	public void setAvgDurationOfEachEp(String avgDurationOfEachEp) {
		AvgDurationOfEachEp = avgDurationOfEachEp;
	}

	public long getYearOfRelease() {
		return YearOfRelease;
	}

	public void setYearOfRelease(long yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "Series [SeriesId=" + SeriesId + ", NameOfTheSeries=" + NameOfTheSeries + ", Ott=" + Ott
				+ ", NumberOfSeasons=" + NumberOfSeasons + ", AvgDurationOfEachEp=" + AvgDurationOfEachEp
				+ ", YearOfRelease=" + YearOfRelease + "]";
	}
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
}
