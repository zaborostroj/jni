#include <stdio.h>
#include <jni.h>
#include "JNIHelloWorld.h"

JNIEXPORT void JNICALL Java_com_zaborostroj_test_JNIHelloWorld_printHelloWorld(JNIEnv *env, jobject obj) {
	printf("Hello, world!\n");
	return;
}