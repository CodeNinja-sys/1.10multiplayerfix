/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.WindowsDisplay;
import org.lwjgl.opengl.fp;

final class jg {
    private final long a;
    private final int b;
    private final boolean c;
    private final fp d = new fp(22);
    private final ByteBuffer e = ByteBuffer.allocate(22);
    private final Object f;
    private boolean g;
    private byte[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    jg(long l2) {
        this.a = l2;
        this.b = Math.min(5, WindowsDisplay.getSystemMetrics(43));
        this.c = WindowsDisplay.getSystemMetrics(75) != 0;
        this.f = this.f();
        this.h = new byte[this.b];
    }

    private Object f() {
        int n2 = WindowsDisplay.getSystemMetrics(13);
        int n3 = WindowsDisplay.getSystemMetrics(14);
        IntBuffer intBuffer = BufferUtils.d(n2 * n3);
        return WindowsDisplay.b(n2, n3, 0, 0, 1, intBuffer, null);
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public void a(IntBuffer intBuffer, ByteBuffer byteBuffer, WindowsDisplay windowsDisplay) {
        int n2;
        for (n2 = 0; n2 < intBuffer.remaining(); ++n2) {
            intBuffer.put(intBuffer.position() + n2, 0);
        }
        n2 = this.b;
        intBuffer.put(intBuffer.position() + 2, this.k);
        if (n2 > this.h.length) {
            n2 = this.h.length;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            byteBuffer.put(byteBuffer.position() + i2, this.h[i2]);
        }
        if (this.a()) {
            intBuffer.put(intBuffer.position() + 0, this.i);
            intBuffer.put(intBuffer.position() + 1, this.j);
            if (windowsDisplay.i() && windowsDisplay.h() && (this.i != 0 || this.j != 0)) {
                WindowsDisplay.b(this.a);
            }
        } else {
            intBuffer.put(intBuffer.position() + 0, this.l);
            intBuffer.put(intBuffer.position() + 1, this.m);
        }
        this.k = 0;
        this.j = 0;
        this.i = 0;
    }

    private void a(byte by2, byte by3, int n2, int n3, int n4, long l2) {
        this.e.clear();
        this.e.put(by2).put(by3).putInt(n2).putInt(n3).putInt(n4).putLong(l2);
        this.e.flip();
        this.d.b(this.e);
    }

    private void a(byte by2, byte by3, int n2, long l2) {
        if (this.g) {
            this.a(by2, by3, 0, 0, n2, l2);
        } else {
            this.a(by2, by3, this.l, this.m, n2, l2);
        }
    }

    public void a(ByteBuffer byteBuffer) {
        this.d.a(byteBuffer);
    }

    public Object d() {
        return this.f;
    }

    public void a(boolean bl2) {
        this.g = bl2;
        this.d.a();
    }

    public void a(int n2, long l2) {
        this.k += n2;
        this.a((byte)-1, (byte)0, n2, l2 * 1000000L);
    }

    public void a(int n2, int n3) {
        this.l = n2;
        this.m = n3;
    }

    public void e() {
        WindowsDisplay.doDestroyCursor(this.f);
    }

    public void a(int n2, int n3, long l2) {
        int n4 = n2 - this.l;
        int n5 = n3 - this.m;
        if (n4 != 0 || n5 != 0) {
            this.i += n4;
            this.j += n5;
            this.l = n2;
            this.m = n3;
            long l3 = l2 * 1000000L;
            if (this.g) {
                this.a((byte)-1, (byte)0, n4, n5, 0, l3);
            } else {
                this.a((byte)-1, (byte)0, n2, n3, 0, l3);
            }
        }
    }

    public void a(byte by2, byte by3, long l2) {
        this.a(by2, by3, 0, l2 * 1000000L);
        if (by2 < this.h.length) {
            this.h[by2] = by3 != 0 ? (byte)1 : 0;
        }
    }
}

