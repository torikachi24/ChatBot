package com.example.chatbot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface RetroitAPI {
    @GET
    Call<MsgModel> getMessage(@Url String url);

}
