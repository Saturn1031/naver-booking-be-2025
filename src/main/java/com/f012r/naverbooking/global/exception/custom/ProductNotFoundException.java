package com.f012r.naverbooking.global.exception.custom;
import com.f012r.naverbooking.global.common.ResponseCode;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductNotFoundException extends RuntimeException {
    private ResponseCode responseCode;
}
