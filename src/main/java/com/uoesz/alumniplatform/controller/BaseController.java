package com.uoesz.alumniplatform.controller;

import com.uoesz.alumniplatform.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import javax.servlet.http.HttpServletRequest;

public class BaseController {

    @Autowired
    private HttpServletRequest request;

    private ThreadLocal<ResponseResult> threadLocal = new ThreadLocal<ResponseResult>() {

        protected ResponseResult initialValue() {
            return new ResponseResult();
        }
    };

    public ResponseResult getResponseResult() {
        return threadLocal.get();
    }

    public ResponseResult getResponseResult(String returnCode, String errorMessage) {

        ResponseResult rs = threadLocal.get();
        rs.setReturnCode(returnCode);
        rs.setErrorMessage(errorMessage);
        return rs;
    }

    public ResponseResult getResponseResult(String returnCode, String errorMessage, Object dto) {

        ResponseResult rs = threadLocal.get();
        rs.setReturnCode(returnCode);
        rs.setErrorMessage(errorMessage);
        rs.setDto(dto);
        return rs;
    }

    public ResponseResult getResponseResult(String returnCode, String errorMessage, Page<?> list) {

        ResponseResult rs = threadLocal.get();
        rs.setReturnCode(returnCode);
        rs.setErrorMessage(errorMessage);
        rs.setPageList(list);
        return rs;
    }

    public void setResponseResult(ResponseResult rs) {
        threadLocal.set(rs);
    }

}

