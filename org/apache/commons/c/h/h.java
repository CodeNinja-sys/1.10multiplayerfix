/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.io.Writer;
import org.apache.commons.c.h.e;

class h
extends Writer {
    final /* synthetic */ e a;

    h(e e2) {
        this.a = e2;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void write(int n2) {
        this.a.a((char)n2);
    }

    @Override
    public void write(char[] arrc) {
        this.a.b(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        this.a.a(arrc, n2, n3);
    }

    @Override
    public void write(String string) {
        this.a.c(string);
    }

    @Override
    public void write(String string, int n2, int n3) {
        this.a.a(string, n2, n3);
    }
}

