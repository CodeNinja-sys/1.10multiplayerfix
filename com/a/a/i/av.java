/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import java.io.Writer;

final class av
extends Writer {
    private static final av a = new av();

    private av() {
    }

    @Override
    public void write(int n2) {
    }

    @Override
    public void write(char[] arrc) {
        cl.a(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        cl.a(n2, n2 + n3, arrc.length);
    }

    @Override
    public void write(String string) {
        cl.a(string);
    }

    @Override
    public void write(String string, int n2, int n3) {
        cl.a(n2, n2 + n3, string.length());
    }

    @Override
    public Writer append(CharSequence charSequence) {
        cl.a(charSequence);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) {
        cl.a(n2, n3, charSequence.length());
        return this;
    }

    @Override
    public Writer append(char c2) {
        return this;
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() {
    }

    public String toString() {
        return "CharStreams.nullWriter()";
    }

    static /* synthetic */ av a() {
        return a;
    }
}

