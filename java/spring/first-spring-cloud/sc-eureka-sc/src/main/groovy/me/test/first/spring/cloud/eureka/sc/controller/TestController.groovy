package me.test.first.spring.cloud.eureka.sc.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

import javax.annotation.Resource

/**
 *
 */
@RestController()
@RequestMapping("/test")
class TestController {

    @Autowired
    private DiscoveryClient discoveryClient

    @Resource(name = "noLbRestTemplate")
    private RestTemplate noLbRestTemplate


    @RequestMapping(path = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Object hi() {

        return [
                a   : "aaaa",
                date: new Date()
        ]
    }

    @RequestMapping(path = "/test01",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Object test01() {

        List<String> serviceIds = discoveryClient.getServices();

        List list = []
        for (String s : serviceIds) {

            List list1 = []
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(s);
            for (ServiceInstance si : serviceInstances) {
                list1 << [
                        serviceId: s,
                        host     : si.getHost(),
                        port     : si.port,
                        uri      : si.uri
                ]
            }

            list << [
                    serviceId: s,
                    instance : list1
            ]
        }


        return list
    }


    // noLbRestTemplate 可以访问外部域名
    // 而 @LoadBalanced 的 restTemplate 则不能访问外部域名，只能访问 逻辑名
    @RequestMapping(path = "/test02",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Object test02() {

        String url = "https://kingsilk.net/qh/mall/api/common/sysConf?key=appendStaticResource"
        Map map = noLbRestTemplate.getForObject(url, Map)
        return map
    }

}
