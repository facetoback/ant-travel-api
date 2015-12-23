package com.ant.web.action;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;

/**
 * 用户接口
 * Created by qxd on 2015/8/26.
 */
@Controller("member")
@Path(value="member")
public class AntAction {

//    private static Log log = LogFactory.getLog(AntAction.class);
//    private static IRealOpenRpcService realOpenRpcService = OpenRPCClientFactory.getRealOpenRpcService();

    /**
     * 登录接口
     * @param username
     * @param password
     * @return
     */
    @GET
    @Path(value="logon")
    @Produces("application/json")
    public String logon(@QueryParam("username") String username,
                        @QueryParam("password") String password){
        JSONObject json = new JSONObject();
        json.put("statusCode", "200");
        json.put("success", "true");
        json.put("message", "ok");
        return json.toJSONString();
    }

    /**
     * 注册接口
     * @return
     */
    @POST
    @Path(value="register")
    @Produces("application/json")
    public String register(@FormParam("phonenumber") String phonenumber,
                        @FormParam("password") String password,
                        @FormParam("nickname") String nickname,
                        @FormParam("sex") int sex,
                        @FormParam("birthday") String birthday,
                        @FormParam("avatar") String avatar){
        JSONObject json = new JSONObject();
        json.put("statusCode", "200");
        json.put("success", "true");
        json.put("message", "ok");
        return json.toJSONString();
    }
}
