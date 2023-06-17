/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ah;
import com.a.b.b.aj;
import java.io.Writer;

final class ai
extends Writer {
    private final Appendable a;
    private final aj b = new aj();

    private ai(Appendable appendable) {
        this.a = appendable;
    }

    public void write(char[] arrc, int n2, int n3) {
        this.b.a = arrc;
        this.a.append(this.b, n2, n2 + n3);
    }

    public void write(int n2) {
        this.a.append((char)n2);
    }

    public void flush() {
    }

    public void close() {
    }

    /* synthetic */ ai(Appendable appendable, ah ah2) {
        this(appendable);
    }
}

