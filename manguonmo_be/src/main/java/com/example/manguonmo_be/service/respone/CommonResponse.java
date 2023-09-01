package com.example.manguonmo_be.service.respone;

public class CommonResponse<T> {

    private Result result;

    private T data;

    private long dataCount;

    public CommonResponse() {
    }

    public CommonResponse(Result result) {
        this.result = result;
    }

    public CommonResponse(Result result, T data){
        this.result = result;
        this.data = data;
    }

    public CommonResponse(Result result, T data, long dataCount) {
        this.result = result;
        this.data = data;
        this.dataCount = dataCount;
    }

    public CommonResponse error(){
        this.result = new Result("400", "Lỗi", false);
        return this;
    }

    public CommonResponse success(){
        this.result = new Result("00", "OK", true);
        return this;
    }

    public CommonResponse data(T data){
        this.data = data;
        return this;
    }

    public CommonResponse dataCount(long dataCount){
        this.dataCount = dataCount;
        return this;
    }


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getDataCount() {
        return dataCount;
    }

    public void setDataCount(long dataCount) {
        this.dataCount = dataCount;
    }
}
