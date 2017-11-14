package com.goku.webapi.util.enums;


/**
 * Created by nbfujx on 2017/11/7.
 */
public enum returnCode {
    SUCCESS(20000,"success"),
    ERROR(40000,"error"),
    NOTAUTHC(40100,"not authc"),
    NOTAUTHZ(40101,"not authz"),
    USERNAMEORPASSWORD(40401,"Username or Password Not Correct");

    private final int code;
    private final String desc;

    returnCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "returnCode{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}

