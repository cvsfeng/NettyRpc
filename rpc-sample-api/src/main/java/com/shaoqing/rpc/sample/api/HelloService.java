package com.shaoqing.rpc.sample.api;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
