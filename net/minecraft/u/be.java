/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class be
extends PrintStream {
    private static final d a = c.c();
    private final String b;

    public be(String string, OutputStream outputStream) {
        super(outputStream);
        this.b = string;
    }

    @Override
    public void println(String string) {
        this.a(string);
    }

    @Override
    public void println(Object object) {
        this.a(String.valueOf(object));
    }

    private void a(String string) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = arrstackTraceElement[Math.min(3, arrstackTraceElement.length)];
        a.d("[{}]@.({}:{}): {}", this.b, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), string);
    }
}

