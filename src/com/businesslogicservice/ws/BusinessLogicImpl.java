package com.businesslogicservice.ws;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.jws.WebService;

import org.json.JSONObject;

import com.storageservice.ws.Bmi;
import com.storageservice.ws.ExternalApiModel;
import com.storageservice.ws.Person;
import com.storageservice.ws.Sport;
import com.storageservice.ws.StorageService;




//Service Implementation

@WebService(endpointInterface = "com.storageservice.ws.BusinessLogicModel", serviceName = "businessLogicService")
public class BusinessLogicImpl implements BusinessLogicModel {

	@Override
	public int registration(Person p) {
		StorageService service = new StorageService();
		ExternalApiModel people = service.getExternalApiImplPort();
		return people.registration(p);	
	}

public int login(int id){
	return id;	
}

public String DailymotivationalWeather(){
	StorageService service = new StorageService();
	ExternalApiModel people = service.getExternalApiImplPort();
	String weather=people.getWeatherByLatLng("", "");
	List<Sport> sportWeather=people.gestSporstByWeather(weather);
	Random randomGenerator;
	randomGenerator = new Random();
	int randomIndex= randomGenerator.nextInt(sportWeather.size());
	String sport= sportWeather.get(randomIndex).getName();
	String sentence= "What a "+ weather+ " day!! The best weather for "+sport;
	return sentence;}

public String DailymotivationalCalories(int idperson){
	StorageService service = new StorageService();
	ExternalApiModel people = service.getExternalApiImplPort();
	Person p= people.getPersonInformation(idperson);
	List <Sport> sports= people.getSportsList();
	Random randomGenerator;
	randomGenerator = new Random();
	int randomIndex= randomGenerator.nextInt(sports.size());
	Sport sport= sports.get(randomIndex);
SportCalories calories= people.getCaloriesBySport(sport);

double weight=p.getWeight();
int caloriesPerHour;
if (weight<=70.0){
	caloriesPerHour=calories.getSixtyKg();
}else if(weight>=70.0 &&weight<80.0){
	caloriesPerHour=calories.getSeventyKg();
	}else if(weight>=80.0 &&weight<90.0){
		caloriesPerHour=calories.getEightyKg();
}else if(weight>=90.0 ){
	caloriesPerHour=calories.getNinetyKg();
}
	String sentence= "did you know that for 1 hour of "+sport.getName()+" you will burn "+caloriesPerHour+" cal. ? Let's do it";
	
	return sentence;
}



public String motivationBaseOnBmiStatus(int idPerson){
	StorageService service = new StorageService();
	ExternalApiModel people = service.getExternalApiImplPort();
	Person p= people.getPersonInformation(idPerson);
	Bmi bmi=p.getBmi();
	if (bmi==null){
		bmi=people.calculateandSavebmi(p);
	}
	String status= bmi.getStatus();
	String sentence="";
	switch(status){
	
	case "Normal": sentence="Congratulation your bmi is perfect! Continue your lifestyle like that!";break;
	case "Overweight": sentence="You're doing a great job, your bmi is almost right! don't give up!";break;
	case "Underweight": sentence= "Your bmi indicates a underweight, .......";break;
	case "Severly Underweight": sentence= "Your situation is difficoult and you have a "+bmi.getRisk+" !let's start a goal and improve yourself" ;break;
	case "Obese Class I (Moderately obese)":sentence= "You re a littl overweight and you are starting a risk: "+bmi.getRisk+" !let's do something" ;break;
	case "Obese Class II (Severely obese)": sentence= "Your situation is difficoult and you have a "+bmi.getRisk+" !let's start a goal and improve yourself" ;break;
	case "Obese Class III (Very severely obese)": if (p.getGenre().equals("m")){sentence= "come on man take care of yourself and start do something";}else{sentence= "come on girl take care of yourself and start do something";}break;
	}
	return sentence;
}



//ideee -> consigliare goal di peso in base a quanto pesa e al peso ideale, solo se non ne ha già uno.
//------>//consiliare un goal settimanale di sport in base al tempo della settimana




}
