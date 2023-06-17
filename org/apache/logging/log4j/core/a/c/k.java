/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.core.a.c.n;
import org.apache.logging.log4j.core.a.c.o;
import org.apache.logging.log4j.core.a.c.s;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.d;

public class k
extends org.apache.logging.log4j.core.a.c.f {
    static final int c = 262144;
    private static final o d = new o(null);
    private final boolean e;
    private RandomAccessFile f;
    private final ByteBuffer g;
    private final ThreadLocal h = new ThreadLocal();

    public k(RandomAccessFile randomAccessFile, String string, String string2, OutputStream outputStream, boolean bl2, boolean bl3, long l2, long l3, v v2, s s2, String string3, f f2) {
        super(string, string2, outputStream, bl2, l2, l3, v2, s2, string3, f2);
        this.e = bl3;
        this.f = randomAccessFile;
        this.h.set(Boolean.FALSE);
        this.g = ByteBuffer.allocate(262144);
    }

    public static k b(String string, String string2, boolean bl2, boolean bl3, v v2, s s2, String string3, f f2) {
        return (k)k.a(string, new n(string2, bl2, bl3, v2, s2, string3, f2), d);
    }

    public Boolean s() {
        return (Boolean)this.h.get();
    }

    public void a(boolean bl2) {
        this.h.set(bl2);
    }

    @Override
    protected synchronized void a(byte[] arrby, int n2, int n3) {
        super.a(arrby, n2, n3);
        int n4 = 0;
        do {
            if (n3 > this.g.remaining()) {
                this.l();
            }
            n4 = Math.min(n3, this.g.remaining());
            this.g.put(arrby, n2, n4);
            n2 += n4;
        } while ((n3 -= n4) > 0);
        if (this.e || this.h.get() == Boolean.TRUE) {
            this.l();
        }
    }

    @Override
    protected void o() {
        this.f = new RandomAccessFile(this.f(), "rw");
        if (this.g()) {
            this.f.seek(this.f.length());
        }
    }

    @Override
    public synchronized void l() {
        this.g.flip();
        try {
            this.f.write(this.g.array(), 0, this.g.limit());
        }
        catch (IOException iOException) {
            String string = "Error writing to RandomAccessFile " + this.d();
            throw new org.apache.logging.log4j.core.a.d(string, iOException);
        }
        this.g.clear();
    }

    @Override
    public synchronized void k() {
        this.l();
        try {
            this.f.close();
        }
        catch (IOException iOException) {
            a.b("Unable to close RandomAccessFile " + this.d() + ". " + iOException);
        }
    }

    static /* synthetic */ d t() {
        return a;
    }

    static /* synthetic */ d u() {
        return a;
    }

    static /* synthetic */ d v() {
        return a;
    }

    static /* synthetic */ d w() {
        return a;
    }
}

