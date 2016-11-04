package test;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import test.HelloWS;
import test.HelloWSImpl;

public class CxfServer {

    public static void main(String[] args) {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWS.class);
        //服务发布的地址
        factory.setAddress("http://localhost:8080/test/hello");
        factory.setServiceBean(new HelloWSImpl());
        factory.create();
    }

}
