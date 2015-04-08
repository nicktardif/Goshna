package com.nicktardif.seniorproject.goshna;

import com.nicktardif.seniorproject.goshna.ApiResponses.MessageResponse;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by tick on 4/7/15.
 */
public interface GoshnaApiService {
    final String baseURL = "/";

    @GET("/messages")
    void getMessages(Callback<MessageResponse> response);
}