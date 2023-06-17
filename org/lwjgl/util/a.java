/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.lwjgl.util.g;
import org.lwjgl.util.o;

public final class a
implements Serializable,
g,
o {
    static final long a = 1L;
    private byte n;
    private byte o;
    private byte p;
    private byte q;

    public a() {
        this(0, 0, 0, 255);
    }

    public a(int n2, int n3, int n4) {
        this(n2, n3, n4, 255);
    }

    public a(byte by2, byte by3, byte by4) {
        this(by2, by3, by4, -1);
    }

    public a(int n2, int n3, int n4, int n5) {
        this.a(n2, n3, n4, n5);
    }

    public a(byte by2, byte by3, byte by4, byte by5) {
        this.a(by2, by3, by4, by5);
    }

    public a(g g2) {
        this.a(g2);
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.n = (byte)n2;
        this.o = (byte)n3;
        this.p = (byte)n4;
        this.q = (byte)n5;
    }

    public void a(byte by2, byte by3, byte by4, byte by5) {
        this.n = by2;
        this.o = by3;
        this.p = by4;
        this.q = by5;
    }

    public void a(int n2, int n3, int n4) {
        this.a(n2, n3, n4, 255);
    }

    public void a(byte by2, byte by3, byte by4) {
        this.a(by2, by3, by4, (byte)-1);
    }

    public int a() {
        return this.n & 0xFF;
    }

    public int b() {
        return this.o & 0xFF;
    }

    public int c() {
        return this.p & 0xFF;
    }

    public int d() {
        return this.q & 0xFF;
    }

    public void a(int n2) {
        this.n = (byte)n2;
    }

    public void b(int n2) {
        this.o = (byte)n2;
    }

    public void c(int n2) {
        this.p = (byte)n2;
    }

    public void d(int n2) {
        this.q = (byte)n2;
    }

    public void a(byte by2) {
        this.n = by2;
    }

    public void b(byte by2) {
        this.o = by2;
    }

    public void c(byte by2) {
        this.p = by2;
    }

    public void d(byte by2) {
        this.q = by2;
    }

    public String toString() {
        return "Color [" + this.a() + ", " + this.b() + ", " + this.c() + ", " + this.d() + "]";
    }

    public boolean equals(Object object) {
        return object != null && object instanceof g && ((g)object).a() == this.a() && ((g)object).b() == this.b() && ((g)object).c() == this.c() && ((g)object).d() == this.d();
    }

    public int hashCode() {
        return this.n << 24 | this.o << 16 | this.p << 8 | this.q;
    }

    public byte e() {
        return this.q;
    }

    public byte f() {
        return this.p;
    }

    public byte g() {
        return this.o;
    }

    public byte h() {
        return this.n;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.n);
        byteBuffer.put(this.o);
        byteBuffer.put(this.p);
        byteBuffer.put(this.q);
    }

    public void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.n);
        byteBuffer.put(this.o);
        byteBuffer.put(this.p);
    }

    public void c(ByteBuffer byteBuffer) {
        byteBuffer.put(this.q);
        byteBuffer.put(this.p);
        byteBuffer.put(this.o);
        byteBuffer.put(this.n);
    }

    public void d(ByteBuffer byteBuffer) {
        byteBuffer.put(this.q);
        byteBuffer.put(this.n);
        byteBuffer.put(this.o);
        byteBuffer.put(this.p);
    }

    public void e(ByteBuffer byteBuffer) {
        byteBuffer.put(this.p);
        byteBuffer.put(this.o);
        byteBuffer.put(this.n);
    }

    public void f(ByteBuffer byteBuffer) {
        byteBuffer.put(this.p);
        byteBuffer.put(this.o);
        byteBuffer.put(this.n);
        byteBuffer.put(this.q);
    }

    public void g(ByteBuffer byteBuffer) {
        this.n = byteBuffer.get();
        this.o = byteBuffer.get();
        this.p = byteBuffer.get();
        this.q = byteBuffer.get();
    }

    public void h(ByteBuffer byteBuffer) {
        this.n = byteBuffer.get();
        this.o = byteBuffer.get();
        this.p = byteBuffer.get();
    }

    public void i(ByteBuffer byteBuffer) {
        this.q = byteBuffer.get();
        this.n = byteBuffer.get();
        this.o = byteBuffer.get();
        this.p = byteBuffer.get();
    }

    public void j(ByteBuffer byteBuffer) {
        this.p = byteBuffer.get();
        this.o = byteBuffer.get();
        this.n = byteBuffer.get();
        this.q = byteBuffer.get();
    }

    public void k(ByteBuffer byteBuffer) {
        this.p = byteBuffer.get();
        this.o = byteBuffer.get();
        this.n = byteBuffer.get();
    }

    public void l(ByteBuffer byteBuffer) {
        this.q = byteBuffer.get();
        this.p = byteBuffer.get();
        this.o = byteBuffer.get();
        this.n = byteBuffer.get();
    }

    public void a(g g2) {
        this.n = g2.h();
        this.o = g2.g();
        this.p = g2.f();
        this.q = g2.e();
    }

    public void a(float f2, float f3, float f4) {
        if (f3 == 0.0f) {
            this.o = this.p = (byte)(f4 * 255.0f + 0.5f);
            this.n = this.p;
        } else {
            float f5 = (f2 - (float)Math.floor(f2)) * 6.0f;
            float f6 = f5 - (float)Math.floor(f5);
            float f7 = f4 * (1.0f - f3);
            float f8 = f4 * (1.0f - f3 * f6);
            float f9 = f4 * (1.0f - f3 * (1.0f - f6));
            switch ((int)f5) {
                case 0: {
                    this.n = (byte)(f4 * 255.0f + 0.5f);
                    this.o = (byte)(f9 * 255.0f + 0.5f);
                    this.p = (byte)(f7 * 255.0f + 0.5f);
                    break;
                }
                case 1: {
                    this.n = (byte)(f8 * 255.0f + 0.5f);
                    this.o = (byte)(f4 * 255.0f + 0.5f);
                    this.p = (byte)(f7 * 255.0f + 0.5f);
                    break;
                }
                case 2: {
                    this.n = (byte)(f7 * 255.0f + 0.5f);
                    this.o = (byte)(f4 * 255.0f + 0.5f);
                    this.p = (byte)(f9 * 255.0f + 0.5f);
                    break;
                }
                case 3: {
                    this.n = (byte)(f7 * 255.0f + 0.5f);
                    this.o = (byte)(f8 * 255.0f + 0.5f);
                    this.p = (byte)(f4 * 255.0f + 0.5f);
                    break;
                }
                case 4: {
                    this.n = (byte)(f9 * 255.0f + 0.5f);
                    this.o = (byte)(f7 * 255.0f + 0.5f);
                    this.p = (byte)(f4 * 255.0f + 0.5f);
                    break;
                }
                case 5: {
                    this.n = (byte)(f4 * 255.0f + 0.5f);
                    this.o = (byte)(f7 * 255.0f + 0.5f);
                    this.p = (byte)(f8 * 255.0f + 0.5f);
                }
            }
        }
    }

    public float[] a(float[] arrf) {
        float f2;
        int n2;
        int n3;
        int n4 = this.a();
        int n5 = this.b();
        int n6 = this.c();
        if (arrf == null) {
            arrf = new float[3];
        }
        int n7 = n3 = n4 <= n5 ? n5 : n4;
        if (n6 > n3) {
            n3 = n6;
        }
        int n8 = n2 = n4 >= n5 ? n5 : n4;
        if (n6 < n2) {
            n2 = n6;
        }
        float f3 = (float)n3 / 255.0f;
        float f4 = n3 != 0 ? (float)(n3 - n2) / (float)n3 : 0.0f;
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            float f5 = (float)(n3 - n4) / (float)(n3 - n2);
            float f6 = (float)(n3 - n5) / (float)(n3 - n2);
            float f7 = (float)(n3 - n6) / (float)(n3 - n2);
            f2 = n4 == n3 ? f7 - f6 : (n5 == n3 ? 2.0f + f5 - f7 : 4.0f + f6 - f5);
            if ((f2 /= 6.0f) < 0.0f) {
                f2 += 1.0f;
            }
        }
        arrf[0] = f2;
        arrf[1] = f4;
        arrf[2] = f3;
        return arrf;
    }
}

