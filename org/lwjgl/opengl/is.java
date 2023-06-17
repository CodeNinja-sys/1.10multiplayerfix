/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.fq;
import org.lwjgl.opengl.ik;
import org.lwjgl.opengl.il;
import org.lwjgl.opengl.ir;
import org.lwjgl.opengl.iu;

final class is {
    private il a;
    private final ir b;
    private boolean c;
    private final fq d = new fq();

    is() {
        this.b = new ir(0);
    }

    void a() {
        this.a = new il();
    }

    static void a(dt dt2, boolean bl2) {
        dt2.c.c = bl2;
    }

    boolean b() {
        return this.c;
    }

    static void a(dt dt2) {
        dt2.c.c();
    }

    private void c() {
        this.a.a(this.b.b());
    }

    static void a(dt dt2, int n2) {
        dt2.c.a(n2);
    }

    private void a(int n2) {
        this.b.a(n2);
        this.a.b();
    }

    static ik b(dt dt2) {
        return dt2.c.a.a();
    }

    static void a(dt dt2, int n2, int n3) {
        ik ik2 = is.b(dt2);
        switch (n2) {
            case 34962: {
                ik2.b = n3;
                break;
            }
            case 34963: {
                if (ik2.f != 0) {
                    ((iu)dt2.c.d.a((int)ik2.f)).a = n3;
                    break;
                }
                ik2.a = n3;
                break;
            }
            case 35051: {
                ik2.g = n3;
                break;
            }
            case 35052: {
                ik2.h = n3;
                break;
            }
            case 36671: {
                ik2.i = n3;
            }
        }
    }

    static void b(dt dt2, int n2) {
        fq fq2 = dt2.c.d;
        if (!fq2.b(n2)) {
            fq2.a(n2, new iu(null));
        }
        is.b((dt)dt2).f = n2;
    }

    static void a(dt dt2, IntBuffer intBuffer) {
        for (int i2 = intBuffer.position(); i2 < intBuffer.limit(); ++i2) {
            is.c(dt2, intBuffer.get(i2));
        }
    }

    static void c(dt dt2, int n2) {
        dt2.c.d.c(n2);
        ik ik2 = is.b(dt2);
        if (ik2.f == n2) {
            ik2.f = 0;
        }
    }

    static int c(dt dt2) {
        ik ik2 = is.b(dt2);
        if (ik2.f == 0) {
            return ik2.a;
        }
        return ((iu)dt2.c.d.a((int)ik2.f)).a;
    }
}

