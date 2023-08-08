package org.example.bufferDemo;

import lombok.extern.slf4j.Slf4j;

import java.nio.IntBuffer;

@Slf4j
public class UseBuffer {
    static IntBuffer intBuffer = null;

    public static void allocatTest(){
        intBuffer = IntBuffer.allocate(20);

    }

}
