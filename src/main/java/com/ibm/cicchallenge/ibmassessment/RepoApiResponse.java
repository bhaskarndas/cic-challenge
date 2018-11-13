package com.ibm.cicchallenge.ibmassessment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bhaskar
 * domain class to represent the JSON objects .
 *
 * 
 */
public class RepoApiResponse {

    private String title;
    @JsonProperty("locations")
    private String location;
    @JsonProperty("actor_1")
    private String actor1;
    @JsonProperty("actor_2")
    private String actor2;
    @JsonProperty("actor_3")
    private String actor3;
    private String director;
    @JsonProperty("production_company")
    private String productionCompany;
    @JsonProperty("release_year")
    private String releaseYear;
    private String writer;
    private String distributor;
    @JsonProperty("fun_facts")
    private String funFacts;
    
    
    

    
    @Override
    public String toString() {
        return "repoApiResponse{" +
                "title='" + title + '\'' +
                ", actor_1='" + actor1 + '\'' +
                ", actor_2='" + actor2 + '\'' +
                ", actor_3='" + actor3 + '\'' +
                ", director='" + director + '\'' +
                ", production_company='" + productionCompany + '\'' +
                ", release_year='" + releaseYear + '\'' +
                ", writer='" + writer + '\'' +
                ", distributor='" + distributor + '\'' +
                ", fun_facts='" + funFacts + '\'' +
                ", locations='" + location + '\'' +
                
                
                '}';
    }



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getActor1() {
		return actor1;
	}



	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}



	public String getActor2() {
		return actor2;
	}



	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}



	public String getActor3() {
		return actor3;
	}



	public void setActor3(String actor3) {
		this.actor3 = actor3;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getProductionCompany() {
		return productionCompany;
	}



	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}



	public String getReleaseYear() {
		return releaseYear;
	}



	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getDistributor() {
		return distributor;
	}



	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}



	public String getFunFacts() {
		return funFacts;
	}



	public void setFunFacts(String funFacts) {
		this.funFacts = funFacts;
	}
}
