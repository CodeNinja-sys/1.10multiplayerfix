/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.ByteInput
 */
package io.netty.c.a.e;

import io.netty.c.a.e.i;
import org.jboss.marshalling.ByteInput;

class h
implements ByteInput {
    private static final i a = new i();
    private final ByteInput b;
    private final long c;
    private long d;

    h(ByteInput byteInput, long l2) {
        if (l2 <= 0L) {
            throw new IllegalArgumentException("The limit MUST be > 0");
        }
        this.b = byteInput;
        this.c = l2;
    }

    public void a() {
    }

    public int b() {
        return this.a(this.b.available());
    }

    public int c() {
        int n2 = this.a(1);
        if (n2 > 0) {
            int n3 = this.b.read();
            ++this.d;
            return n3;
        }
        throw a;
    }

    public int a(byte[] arrby) {
        return this.a(arrby, 0, arrby.length);
    }

    public int a(byte[] arrby, int n2, int n3) {
        int n4 = this.a(n3);
        if (n4 > 0) {
            int n5 = this.b.read(arrby, n2, n4);
            this.d += (long)n5;
            return n5;
        }
        throw a;
    }

    public long a(long l2) {
        int n2 = this.a((int)l2);
        if (n2 > 0) {
            long l3 = this.b.skip((long)n2);
            this.d += l3;
            return l3;
        }
        throw a;
    }

    private int a(int n2) {
        return (int)Math.min((long)n2, this.c - this.d);
    }
}

