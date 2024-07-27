package com.ismataga.productservicegrpc.service.grpc;

import com.ismataga.productservicegrpc.DiscountRequest;
import com.ismataga.productservicegrpc.DiscountResponse;

public interface DiscountGrpcService {
    DiscountResponse getDiscount(DiscountRequest request);

}
