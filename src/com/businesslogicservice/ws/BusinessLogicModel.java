package com.businesslogicservice.ws;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.storageservice.ws.Person;


//service definition
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) 
public interface BusinessLogicModel {
    @WebMethod(operationName="registration")
    @WebResult(name="registration") 
    public int registration(@WebParam(name="person") Person p);
 
    @WebMethod(operationName="login")
    @WebResult(name="login") 
    public int login(@WebParam(name="id") int id);
 

//suggerimento goal in base al bmi 

}