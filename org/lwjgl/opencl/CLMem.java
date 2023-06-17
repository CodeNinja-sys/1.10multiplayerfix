/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opencl.a.a;
import org.lwjgl.opencl.a.b;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.an;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.au;

public final class CLMem
extends ar {
    private static final an b = (an)au.a(CLMem.class, "CL_MEM_UTIL");

    CLMem(long l2, ab ab2) {
        super(l2, ab2);
        if (this.b()) {
            ab2.g().a(this);
        }
    }

    public static CLMem a(ab ab2, long l2, b b2, long l3, long l4, long l5, Buffer buffer, IntBuffer intBuffer) {
        return b.a(ab2, l2, b2, l3, l4, l5, buffer, intBuffer);
    }

    public static CLMem a(ab ab2, long l2, b b2, long l3, long l4, long l5, long l6, long l7, Buffer buffer, IntBuffer intBuffer) {
        return b.a(ab2, l2, b2, l3, l4, l5, l6, l7, buffer, intBuffer);
    }

    public CLMem a(long l2, int n2, a a2, IntBuffer intBuffer) {
        return b.a(this, l2, n2, a2, intBuffer);
    }

    public int a(int n2) {
        return b.a((aq)this, n2);
    }

    public long b(int n2) {
        return b.b((aq)this, n2);
    }

    public long c(int n2) {
        return b.d(this, n2);
    }

    public ByteBuffer d() {
        return b.a(this);
    }

    public long d(int n2) {
        return b.a(this, n2);
    }

    public b e() {
        return b.b(this);
    }

    public int h() {
        return b.b(this, 0);
    }

    public int i() {
        return b.b(this, 1);
    }

    public int j() {
        return b.c(this);
    }

    public int k() {
        return b.d(this);
    }

    public int e(int n2) {
        return b.c(this, n2);
    }

    static CLMem a(long l2, ab ab2) {
        CLMem cLMem = (CLMem)ab2.g().a(l2);
        if (cLMem == null) {
            cLMem = new CLMem(l2, ab2);
        } else {
            cLMem.cP_();
        }
        return cLMem;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int f() {
        try {
            int n2 = super.f();
            return n2;
        }
        finally {
            if (!this.b()) {
                ((ab)this.m()).g().b(this);
            }
        }
    }
}

