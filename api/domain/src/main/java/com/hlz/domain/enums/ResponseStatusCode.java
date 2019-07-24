package com.hlz.domain.enums;

public enum ResponseStatusCode {

    SUCCESS(1),
    FAIL(2);

    public int code;

    ResponseStatusCode(int code){this.code = code;}
}
