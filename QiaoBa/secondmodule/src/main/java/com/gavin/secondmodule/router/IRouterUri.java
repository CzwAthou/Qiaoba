package com.gavin.secondmodule.router;

import com.protocol.annotation.router.RouterParam;
import com.protocol.annotation.router.RouterUri;

/**
 * Created by wangfei on 2016/12/21.
 */

public interface IRouterUri {

    @RouterUri("xl://main:8888/demo")
    public void jumpToDemo(@RouterParam("key") String key);

}