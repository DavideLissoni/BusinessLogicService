
package com.storageservice.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.storageservice.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadPerson_QNAME = new QName("http://ws.storageservice.com/", "readPerson");
    private final static QName _GetPersonInformation_QNAME = new QName("http://ws.storageservice.com/", "getPersonInformation");
    private final static QName _Person_QNAME = new QName("http://ws.storageservice.com/", "person");
    private final static QName _Bmi_QNAME = new QName("http://ws.storageservice.com/", "bmi");
    private final static QName _GetWeatherByLatLng_QNAME = new QName("http://ws.storageservice.com/", "getWeatherByLatLng");
    private final static QName _GetbmiResponse_QNAME = new QName("http://ws.storageservice.com/", "getbmiResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.storageservice.com/", "readPersonResponse");
    private final static QName _GetPersonInformationResponse_QNAME = new QName("http://ws.storageservice.com/", "getPersonInformationResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://ws.storageservice.com/", "readPersonListResponse");
    private final static QName _Getbmi_QNAME = new QName("http://ws.storageservice.com/", "getbmi");
    private final static QName _GetWeatherByLatLngResponse_QNAME = new QName("http://ws.storageservice.com/", "getWeatherByLatLngResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://ws.storageservice.com/", "readPersonList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.storageservice.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetPersonInformation }
     * 
     */
    public GetPersonInformation createGetPersonInformation() {
        return new GetPersonInformation();
    }

    /**
     * Create an instance of {@link Bmi }
     * 
     */
    public Bmi createBmi() {
        return new Bmi();
    }

    /**
     * Create an instance of {@link GetPersonInformationResponse }
     * 
     */
    public GetPersonInformationResponse createGetPersonInformationResponse() {
        return new GetPersonInformationResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetbmiResponse }
     * 
     */
    public GetbmiResponse createGetbmiResponse() {
        return new GetbmiResponse();
    }

    /**
     * Create an instance of {@link GetWeatherByLatLng }
     * 
     */
    public GetWeatherByLatLng createGetWeatherByLatLng() {
        return new GetWeatherByLatLng();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link Getbmi }
     * 
     */
    public Getbmi createGetbmi() {
        return new Getbmi();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link GetWeatherByLatLngResponse }
     * 
     */
    public GetWeatherByLatLngResponse createGetWeatherByLatLngResponse() {
        return new GetWeatherByLatLngResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "getPersonInformation")
    public JAXBElement<GetPersonInformation> createGetPersonInformation(GetPersonInformation value) {
        return new JAXBElement<GetPersonInformation>(_GetPersonInformation_QNAME, GetPersonInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "bmi")
    public JAXBElement<Bmi> createBmi(Bmi value) {
        return new JAXBElement<Bmi>(_Bmi_QNAME, Bmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByLatLng }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "getWeatherByLatLng")
    public JAXBElement<GetWeatherByLatLng> createGetWeatherByLatLng(GetWeatherByLatLng value) {
        return new JAXBElement<GetWeatherByLatLng>(_GetWeatherByLatLng_QNAME, GetWeatherByLatLng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetbmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "getbmiResponse")
    public JAXBElement<GetbmiResponse> createGetbmiResponse(GetbmiResponse value) {
        return new JAXBElement<GetbmiResponse>(_GetbmiResponse_QNAME, GetbmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "getPersonInformationResponse")
    public JAXBElement<GetPersonInformationResponse> createGetPersonInformationResponse(GetPersonInformationResponse value) {
        return new JAXBElement<GetPersonInformationResponse>(_GetPersonInformationResponse_QNAME, GetPersonInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getbmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "getbmi")
    public JAXBElement<Getbmi> createGetbmi(Getbmi value) {
        return new JAXBElement<Getbmi>(_Getbmi_QNAME, Getbmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByLatLngResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "getWeatherByLatLngResponse")
    public JAXBElement<GetWeatherByLatLngResponse> createGetWeatherByLatLngResponse(GetWeatherByLatLngResponse value) {
        return new JAXBElement<GetWeatherByLatLngResponse>(_GetWeatherByLatLngResponse_QNAME, GetWeatherByLatLngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storageservice.com/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

}
