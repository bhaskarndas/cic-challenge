package com.ibm.cicchallenge.ibmassessment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ibm.cicchallenge.ibmassessment.RepoApiResponse;
import com.ibm.cicchallenge.ibmassessment.FetchRepoApiService;

import java.io.IOException;
import java.util.List;

/**
 * Created by pp on 22.09.17.
 */
public class RepoApiServiceTest {

    private FetchRepoApiService repoApiService;

    @Before
    public void prepare(){
        this.repoApiService = new FetchRepoApiService();
    }

    @Test
    public void test(){
        List<RepoApiResponse> responses = this.repoApiService.getFilmData();
        Assert.assertFalse(responses.isEmpty());
    }

    @Test
    public void testWithFilter() throws IOException {
        List<RepoApiResponse> responses = this.repoApiService.getFilmData("311 Customer Service Center");

        for(RepoApiResponse response : responses){
            Assert.assertEquals("311 Customer Service Center", response.getTitle());
        }
    }
}
