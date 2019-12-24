package com.zaborostroj.test;

public class JNIHelloWorld {
	public native void printHelloWorld();

	static {
		System.load("/home/user/dev/jni/helloworld.so");
	}

	public static void main(String[] args) {
		JNIHelloWorld hw = new JNIHelloWorld();
		hw.printHelloWorld();
	}
}