package com.uoesz.alumniplatform.utils;

import org.springframework.data.domain.Page;

public class ResponseResult extends ResponseBase {

    private static final long serialVersionUID = 1L;

    private Page<?> pageList;

    private Object dto;

    private Object object;

    public ResponseResult() {

    }

    public ResponseResult(String returnCode, String errorMessage) {
        super(returnCode, errorMessage);
    }

    public ResponseResult(String returnCode, String errorMessage, Object dto) {
        super(returnCode, errorMessage);
        this.dto = dto;
    }

    public ResponseResult(String returnCode, String errorMessage, Page<?> list) {
        super(returnCode, errorMessage);
        this.pageList = list;
    }

    public ResponseResult(String returnCode, String errorMessage, Object dtObject, Object object) {
        super(returnCode, errorMessage);
        this.dto = dtObject;
        this.object = object;
    }

    public Page<?> getPageList() {
        return pageList;
    }

    public void setPageList(Page<?> list) {
        this.pageList = list;
    }

    public Object getDto() {
        return dto;
    }

    public void setDto(Object dto) {
        this.dto = dto;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
