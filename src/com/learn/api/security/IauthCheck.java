package com.learn.api.security;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-09-14T08:36:20.356+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://controller.web.phicomm.com/", name = "IauthCheck")
@XmlSeeAlso({ObjectFactory.class})
public interface IauthCheck {

    @WebMethod
    @RequestWrapper(localName = "authCheck", targetNamespace = "http://controller.web.phicomm.com/", className = "com.learn.AuthCheck")
    @ResponseWrapper(localName = "authCheckResponse", targetNamespace = "http://controller.web.phicomm.com/", className = "com.learn.AuthCheckResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String authCheck(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1
    );
}
