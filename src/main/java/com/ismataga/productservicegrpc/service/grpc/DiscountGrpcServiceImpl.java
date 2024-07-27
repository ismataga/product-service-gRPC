package com.ismataga.productservicegrpc.service.grpc;

import com.ismataga.productservicegrpc.DiscountRequest;
import com.ismataga.productservicegrpc.DiscountResponse;
import com.ismataga.productservicegrpc.DiscountServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountGrpcServiceImpl implements DiscountGrpcService{

    private DiscountServiceGrpc.DiscountServiceBlockingStub discountServiceBlockingStub;

    private ManagedChannel channel;

    public DiscountGrpcServiceImpl(@Value("${discount.grpc.host}")String grpcHost,
                                   @Value("${discount.grpc.port}")int grpcPort){
        System.out.println("---> Discount grpc: " + grpcHost+ ":" +grpcPort);
        channel = ManagedChannelBuilder.forAddress(grpcHost, grpcPort)
                .usePlaintext()
                .build();

    }

    @Override
    public DiscountResponse getDiscount(DiscountRequest request){
        discountServiceBlockingStub=DiscountServiceGrpc.newBlockingStub(channel);
        DiscountResponse discountResponse  = discountServiceBlockingStub.getDiscount(request);
        return  discountResponse;
    };


}
