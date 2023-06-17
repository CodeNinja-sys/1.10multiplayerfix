/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.aj;
import com.a.a.g.bk;
import com.a.a.g.d;
import com.a.a.g.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class i
extends d {
    private final ByteBuffer a;
    private final int b;
    private final int c;

    protected i(int n2) {
        this(n2, n2);
    }

    protected i(int n2, int n3) {
        cl.a(n3 % n2 == 0);
        this.a = ByteBuffer.allocate(n3 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.b = n3;
        this.c = n2;
    }

    protected abstract void a(ByteBuffer var1);

    protected void b(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(this.c + 7);
        while (byteBuffer.position() < this.c) {
            byteBuffer.putLong(0L);
        }
        byteBuffer.limit(this.c);
        byteBuffer.flip();
        this.a(byteBuffer);
    }

    @Override
    public final aj b(byte[] arrby) {
        return this.b(arrby, 0, arrby.length);
    }

    @Override
    public final aj b(byte[] arrby, int n2, int n3) {
        return this.c(ByteBuffer.wrap(arrby, n2, n3).order(ByteOrder.LITTLE_ENDIAN));
    }

    private aj c(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.a.remaining()) {
            this.a.put(byteBuffer);
            this.c();
            return this;
        }
        int n2 = this.b - this.a.position();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.put(byteBuffer.get());
        }
        this.d();
        while (byteBuffer.remaining() >= this.c) {
            this.a(byteBuffer);
        }
        this.a.put(byteBuffer);
        return this;
    }

    @Override
    public final aj a(CharSequence charSequence) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            this.a(charSequence.charAt(i2));
        }
        return this;
    }

    @Override
    public final aj b(byte by2) {
        this.a.put(by2);
        this.c();
        return this;
    }

    @Override
    public final aj a(short s2) {
        this.a.putShort(s2);
        this.c();
        return this;
    }

    @Override
    public final aj a(char c2) {
        this.a.putChar(c2);
        this.c();
        return this;
    }

    @Override
    public final aj a(int n2) {
        this.a.putInt(n2);
        this.c();
        return this;
    }

    @Override
    public final aj a(long l2) {
        this.a.putLong(l2);
        this.c();
        return this;
    }

    @Override
    public final aj a(Object object, u u2) {
        u2.a(object, this);
        return this;
    }

    @Override
    public final ae a() {
        this.d();
        this.a.flip();
        if (this.a.remaining() > 0) {
            this.b(this.a);
        }
        return this.b();
    }

    abstract ae b();

    private void c() {
        if (this.a.remaining() < 8) {
            this.d();
        }
    }

    private void d() {
        this.a.flip();
        while (this.a.remaining() >= this.c) {
            this.a(this.a);
        }
        this.a.compact();
    }

    @Override
    public /* synthetic */ bk b(CharSequence charSequence) {
        return this.a(charSequence);
    }

    @Override
    public /* synthetic */ bk b(char c2) {
        return this.a(c2);
    }

    @Override
    public /* synthetic */ bk b(long l2) {
        return this.a(l2);
    }

    @Override
    public /* synthetic */ bk b(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ bk b(short s2) {
        return this.a(s2);
    }

    @Override
    public /* synthetic */ bk c(byte[] arrby, int n2, int n3) {
        return this.b(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ bk c(byte[] arrby) {
        return this.b(arrby);
    }

    @Override
    public /* synthetic */ bk c(byte by2) {
        return this.b(by2);
    }
}

