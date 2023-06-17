/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.g.ay;
import net.minecraft.client.m.c;
import org.apache.logging.log4j.d;
import org.lwjgl.BufferUtils;

public class e {
    private static final d a = org.apache.logging.log4j.c.c();
    private int b;
    private final int c;
    private final int d;
    private final IntBuffer e;
    private final FloatBuffer f;
    private final String g;
    private boolean h;
    private final c i;

    public e(String string, int n2, int n3, c c2) {
        this.g = string;
        this.c = n3;
        this.d = n2;
        this.i = c2;
        if (n2 <= 3) {
            this.e = BufferUtils.d(n3);
            this.f = null;
        } else {
            this.e = null;
            this.f = BufferUtils.f(n3);
        }
        this.b = -1;
        this.c();
    }

    private void c() {
        this.h = true;
        if (this.i != null) {
            this.i.d();
        }
    }

    public static int a(String string) {
        int n2 = -1;
        if ("int".equals(string)) {
            n2 = 0;
        } else if ("float".equals(string)) {
            n2 = 4;
        } else if (string.startsWith("matrix")) {
            if (string.endsWith("2x2")) {
                n2 = 8;
            } else if (string.endsWith("3x3")) {
                n2 = 9;
            } else if (string.endsWith("4x4")) {
                n2 = 10;
            }
        }
        return n2;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public String a() {
        return this.g;
    }

    public void a(float f2) {
        this.f.position(0);
        this.f.put(0, f2);
        this.c();
    }

    public void a(float f2, float f3) {
        this.f.position(0);
        this.f.put(0, f2);
        this.f.put(1, f3);
        this.c();
    }

    public void a(float f2, float f3, float f4) {
        this.f.position(0);
        this.f.put(0, f2);
        this.f.put(1, f3);
        this.f.put(2, f4);
        this.c();
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.f.position(0);
        this.f.put(f2);
        this.f.put(f3);
        this.f.put(f4);
        this.f.put(f5);
        this.f.flip();
        this.c();
    }

    public void b(float f2, float f3, float f4, float f5) {
        this.f.position(0);
        if (this.d >= 4) {
            this.f.put(0, f2);
        }
        if (this.d >= 5) {
            this.f.put(1, f3);
        }
        if (this.d >= 6) {
            this.f.put(2, f4);
        }
        if (this.d >= 7) {
            this.f.put(3, f5);
        }
        this.c();
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.e.position(0);
        if (this.d >= 0) {
            this.e.put(0, n2);
        }
        if (this.d >= 1) {
            this.e.put(1, n3);
        }
        if (this.d >= 2) {
            this.e.put(2, n4);
        }
        if (this.d >= 3) {
            this.e.put(3, n5);
        }
        this.c();
    }

    public void a(float[] arrf) {
        if (arrf.length < this.c) {
            a.f("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.c, arrf.length);
        } else {
            this.f.position(0);
            this.f.put(arrf);
            this.f.position(0);
            this.c();
        }
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f.position(0);
        this.f.put(0, f2);
        this.f.put(1, f3);
        this.f.put(2, f4);
        this.f.put(3, f5);
        this.f.put(4, f6);
        this.f.put(5, f7);
        this.f.put(6, f8);
        this.f.put(7, f9);
        this.f.put(8, f10);
        this.f.put(9, f11);
        this.f.put(10, f12);
        this.f.put(11, f13);
        this.f.put(12, f14);
        this.f.put(13, f15);
        this.f.put(14, f16);
        this.f.put(15, f17);
        this.c();
    }

    public void a(org.lwjgl.util.e.d d2) {
        this.a(d2.a, d2.b, d2.c, d2.d, d2.e, d2.f, d2.g, d2.h, d2.i, d2.j, d2.k, d2.l, d2.m, d2.n, d2.o, d2.p);
    }

    public void b() {
        if (!this.h) {
            // empty if block
        }
        this.h = false;
        if (this.d <= 3) {
            this.d();
        } else if (this.d <= 7) {
            this.e();
        } else {
            if (this.d > 10) {
                a.f("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.d);
                return;
            }
            this.f();
        }
    }

    private void d() {
        switch (this.d) {
            case 0: {
                ay.a(this.b, this.e);
                break;
            }
            case 1: {
                ay.b(this.b, this.e);
                break;
            }
            case 2: {
                ay.c(this.b, this.e);
                break;
            }
            case 3: {
                ay.d(this.b, this.e);
                break;
            }
            default: {
                a.f("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.c);
            }
        }
    }

    private void e() {
        switch (this.d) {
            case 4: {
                ay.a(this.b, this.f);
                break;
            }
            case 5: {
                ay.b(this.b, this.f);
                break;
            }
            case 6: {
                ay.c(this.b, this.f);
                break;
            }
            case 7: {
                ay.d(this.b, this.f);
                break;
            }
            default: {
                a.f("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.c);
            }
        }
    }

    private void f() {
        switch (this.d) {
            case 8: {
                ay.a(this.b, true, this.f);
                break;
            }
            case 9: {
                ay.b(this.b, true, this.f);
                break;
            }
            case 10: {
                ay.c(this.b, true, this.f);
            }
        }
    }
}

