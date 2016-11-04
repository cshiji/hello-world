package test;

import javax.jws.WebService;

@WebService(
        endpointInterface = "test.HelloWS",
        portName = "HelloWSPort",
        serviceName = "HelloWSService",
        targetNamespace = "http://www.tmp.com/services/hello"
    )
public class HelloWSImpl implements HelloWS {
    @Override
    public String welcome(String name) {
        return "Welcome " + name;
    }

}
