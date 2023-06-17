/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.util.d.f;

public abstract class i {
    static final boolean a = org.lwjgl.d.b("org.lwjgl.util.mapped.Checks");
    public long b;
    public long c;
    ByteBuffer d;
    public static int e = -1;
    public int f;

    protected i() {
    }

    protected final long a(int n2) {
        throw new InternalError("type not registered");
    }

    public final void a(long l2) {
        if (a) {
            this.b(l2);
        }
        this.c = l2;
    }

    final void b(long l2) {
        long l3 = o.a((Buffer)this.d);
        int n2 = (int)(l2 - l3);
        if (l2 < l3 || this.d.capacity() < n2 + this.b()) {
            throw new IndexOutOfBoundsException(Integer.toString(n2 / this.b()));
        }
    }

    final void b(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException();
        }
        if ((long)this.d.capacity() < this.c - o.a((Buffer)this.d) + (long)n2) {
            throw new BufferOverflowException();
        }
    }

    public final int a() {
        throw new InternalError("type not registered");
    }

    public final int b() {
        throw new InternalError("type not registered");
    }

    public final int c() {
        throw new InternalError("type not registered");
    }

    public static i a(ByteBuffer byteBuffer) {
        throw new InternalError("type not registered");
    }

    public static i a(long l2, int n2) {
        throw new InternalError("type not registered");
    }

    public static i c(int n2) {
        throw new InternalError("type not registered");
    }

    public final i d() {
        throw new InternalError("type not registered");
    }

    public final i e() {
        throw new InternalError("type not registered");
    }

    public final void f() {
        throw new InternalError("type not registered");
    }

    public final void g() {
        throw new InternalError("type not registered");
    }

    public final void a(i i2) {
        throw new InternalError("type not registered");
    }

    public final void a(i i2, int n2) {
        throw new InternalError("type not registered");
    }

    public static Iterable b(i i2) {
        return i.b(i2, i2.c());
    }

    public static Iterable b(i i2, int n2) {
        return new f(i2, n2);
    }

    public final i[] h() {
        throw new InternalError("type not registered");
    }

    public final ByteBuffer i() {
        return this.d;
    }
}

