package org.example.bufferDemo;

import lombok.extern.slf4j.Slf4j;

import java.nio.IntBuffer;

@Slf4j
public class UseBuffer {
    static IntBuffer intBuffer = null;

    public static void allocatTest(){
        intBuffer = IntBuffer.allocate(20);
        log.info("position = "+ intBuffer.position());
        log.info("limit = "+ intBuffer.limit());
        log.info("capacity = "+ intBuffer.capacity());
    }
    public static void putTest(){
        for (int i = 0; i < 5; i++) {
            intBuffer.put(i);
        }
        log.info("-------------after put--------------");
        log.info("position = "+ intBuffer.position());
        log.info("limit = "+ intBuffer.limit());
        log.info("capacity = "+ intBuffer.capacity());
    }

    public static void flipTest(){
        intBuffer.flip();

        log.info("-------------after flip--------------");
        log.info("position = "+ intBuffer.position());
        log.info("limit = "+ intBuffer.limit());
        log.info("capacity = "+ intBuffer.capacity());
    }

    public static void getTest(){
        for (int i = 0; i < 2; i++) {
            int j = intBuffer.get();
            log.info("j = " + j);
        }
        log.info("-------------after get 2 int--------------");
        log.info("position = "+ intBuffer.position());
        log.info("limit = "+ intBuffer.limit());
        log.info("capacity = "+ intBuffer.capacity());
        for (int i = 0; i < 3; i++) {
            int j = intBuffer.get();
            log.info("j = " + j);
        }
        log.info("-------------after get 3 int--------------");
        log.info("position = "+ intBuffer.position());
        log.info("limit = "+ intBuffer.limit());
        log.info("capacity = "+ intBuffer.capacity());
    }
    public static void main(String[] args) {
        allocatTest();
        putTest();
        flipTest();
        getTest();
    }

}
