package com.ibm.cicchallenge.ibmassessment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhaskar
 */
@RestController
public class FilmServiceController {

    private FetchRepoApiService repoApiService = new FetchRepoApiService();

    @RequestMapping("/films")
    public List<FilmApiResponse> getFilms(@RequestParam(value="title", required = false) String title) {

        List<RepoApiResponse> repoApiResponses;

        if(title != null && title.length() > 0){
            repoApiResponses = this.repoApiService.getFilmData(title);
        } else {
            repoApiResponses = this.repoApiService.getFilmData();
        }

        List<FilmApiResponse> responses = new ArrayList<>();
        for(RepoApiResponse repoApiResponse : repoApiResponses){
            
                responses.add(new FilmApiResponse(repoApiResponse.getTitle(), repoApiResponse.getLocation()));
            
        }

        return responses;
    }

}
