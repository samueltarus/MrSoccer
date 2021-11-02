package com.soccer.action.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soccer.action.utils.ResultWrapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BaseServlet extends HttpServlet {

    private ObjectMapper jsonMapper = new ObjectMapper();
    private ResultWrapper resultWrapper = new ResultWrapper();

    public void transform(Object bean, Map<String, String[]> params) {
        try {
            BeanUtils.populate(bean, params);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void handleResponse(HttpServletResponse res) throws IOException {
        res.setContentType("application/json");
        res.getWriter().print(jsonMapper.writeValueAsString(resultWrapper));
    }

    public void handleResponse(HttpServletResponse res, Object obj) throws IOException {
        res.setContentType("application/json");
        if (obj instanceof Collection<?>){
            resultWrapper.setList((List<?>) obj);
            res.getWriter().print(jsonMapper.writeValueAsString(resultWrapper));
        }else
            res.getWriter().print(jsonMapper.writeValueAsString(obj));
    }

    public void exceptionResponse(HttpServletResponse res, boolean success, String message) throws IOException {
        res.setContentType("application/json");
        resultWrapper.setSuccess(success);
        resultWrapper.setMessage(message);
        res.getWriter().print(jsonMapper.writeValueAsString(resultWrapper));
    }

}


