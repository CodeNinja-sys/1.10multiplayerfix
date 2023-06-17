/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.b.o;
import java.io.OutputStream;

class p
extends OutputStream {
    final /* synthetic */ StringBuffer a;
    final /* synthetic */ o b;

    p(o o2, StringBuffer stringBuffer) {
        this.b = o2;
        this.a = stringBuffer;
    }

    @Override
    public void write(int n2) {
        this.a.append((char)n2);
    }
}

