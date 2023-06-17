/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.channel.an;
import io.netty.channel.cv;
import io.netty.channel.e.a;
import io.netty.channel.e.g;
import io.netty.channel.e.h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.WritableByteChannel;

public abstract class f
extends a {
    private static final InputStream d = new g();
    private static final OutputStream e = new h();
    private InputStream f;
    private OutputStream g;
    private WritableByteChannel h;

    protected f(an an2) {
        super(an2);
    }

    protected final void a(InputStream inputStream, OutputStream outputStream) {
        if (this.f != null) {
            throw new IllegalStateException("input was set already");
        }
        if (this.g != null) {
            throw new IllegalStateException("output was set already");
        }
        if (inputStream == null) {
            throw new NullPointerException("is");
        }
        if (outputStream == null) {
            throw new NullPointerException("os");
        }
        this.f = inputStream;
        this.g = outputStream;
    }

    @Override
    public boolean I() {
        InputStream inputStream = this.f;
        if (inputStream == null || inputStream == d) {
            return false;
        }
        OutputStream outputStream = this.g;
        return outputStream != null && outputStream != e;
    }

    @Override
    protected int N() {
        try {
            return this.f.available();
        }
        catch (IOException iOException) {
            return 0;
        }
    }

    @Override
    protected int a(io.netty.b.g g2) {
        int n2 = Math.max(1, Math.min(this.N(), g2.t()));
        return g2.a(this.f, n2);
    }

    @Override
    protected void b(io.netty.b.g g2) {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            throw new NotYetConnectedException();
        }
        g2.a(outputStream, g2.r());
    }

    @Override
    protected void a(cv cv2) {
        long l2;
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            throw new NotYetConnectedException();
        }
        if (this.h == null) {
            this.h = Channels.newChannel(outputStream);
        }
        long l3 = 0L;
        do {
            if ((l2 = cv2.a(this.h, l3)) != -1L) continue;
            io.netty.channel.e.f.b(cv2);
            return;
        } while ((l3 += l2) < cv2.b());
    }

    private static void b(cv cv2) {
        if (cv2.c() < cv2.b()) {
            throw new EOFException("Expected to be able to write " + cv2.b() + " bytes, " + "but only wrote " + cv2.c());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void B() {
        InputStream inputStream = this.f;
        OutputStream outputStream = this.g;
        this.f = d;
        this.g = e;
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

