1.
gcc -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -fPIC JNIHelloWorld.c -shared -o helloworld.so -Wl,-soname -Wl,--no-whole-archive

2.
javac -d ./ JNIHelloWorld.java

3.
java com.zaborostroj.test.JNIHelloWorld