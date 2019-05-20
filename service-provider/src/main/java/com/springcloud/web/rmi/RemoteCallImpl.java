package com.springcloud.web.rmi;

import com.springcloud.IRemoteCall;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * @description: 远程调用接口实现
 * @author: wxhai
 * @create: 2019-03-01 13:27
 **/
@Service("iRemoteCall")
public class RemoteCallImpl implements IRemoteCall {
    @Override
    public String remoteCallService(String param) {
        String receive = param;
        System.out.println("service-provider receive" + param);
        return "service-provider receive  " + param;
    }
}
