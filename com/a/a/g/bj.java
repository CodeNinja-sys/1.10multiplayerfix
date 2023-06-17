/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ae;
import com.a.a.g.bi;
import com.a.a.g.i;
import com.a.a.l.ag;
import java.nio.ByteBuffer;

final class bj
extends i {
    private static final int a = 4;
    private int b;
    private int c;

    bj(int n2) {
        super(4);
        this.b = n2;
        this.c = 0;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        int n2 = bi.c(byteBuffer.getInt());
        this.b = bi.a(this.b, n2);
        this.c += 4;
    }

    @Override
    protected void b(ByteBuffer byteBuffer) {
        this.c += byteBuffer.remaining();
        int n2 = 0;
        int n3 = 0;
        while (byteBuffer.hasRemaining()) {
            n2 ^= ag.a(byteBuffer.get()) << n3;
            n3 += 8;
        }
        this.b ^= bi.c(n2);
    }

    @Override
    public ae b() {
        return bi.b(this.b, this.c);
    }
}

