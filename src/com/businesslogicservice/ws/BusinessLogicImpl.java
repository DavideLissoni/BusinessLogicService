package com.businesslogicservice.ws;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.storageservice.model.Person;
import com.storageservice.model.Bmi;

//Service Implementation

@WebService(endpointInterface = "com.storageservice.ws.BusinessLogicModel", serviceName = "businessLogicService")
public class BusinessLogicImpl implements BusinessLogicModel {



}
