/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.c;

import net.java.games.input.ar;
import net.java.games.input.cf;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.q;
import org.lwjgl.a.j;
import org.lwjgl.util.c.f;
import org.lwjgl.util.c.g;

final class e
extends cf {
    private static final int a = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private int g = 5;

    e() {
        super("LWJGLMouse", org.lwjgl.util.c.e.z(), new q[0], new dj[0]);
    }

    private static k[] z() {
        return new k[]{new f(m.a), new f(m.b), new f(m.c), new g(n.aw), new g(n.ax), new g(n.ay)};
    }

    public synchronized void a() {
        if (!j.e()) {
            return;
        }
        j.g();
        for (int i2 = 0; i2 < 3; ++i2) {
            this.d(i2);
        }
    }

    private g c(int n2) {
        switch (n2) {
            case 0: {
                return (g)this.q();
            }
            case 1: {
                return (g)this.r();
            }
            case 2: {
                return (g)this.s();
            }
        }
        return null;
    }

    private void d(int n2) {
        g g2 = this.c(n2);
        if (g2 != null) {
            g2.a(j.a(n2) ? 1.0f : 0.0f);
        }
    }

    protected synchronized boolean a(ar ar2) {
        if (!j.e()) {
            return false;
        }
        block7: while (true) {
            long l2 = j.p();
            switch (this.g) {
                case 1: {
                    this.g = 2;
                    int n2 = j.k();
                    if (n2 == 0) break;
                    ar2.a(this.k(), n2, l2);
                    return true;
                }
                case 2: {
                    this.g = 3;
                    int n3 = -j.l();
                    if (n3 == 0) break;
                    ar2.a(this.l(), n3, l2);
                    return true;
                }
                case 3: {
                    this.g = 4;
                    int n4 = j.o();
                    if (n4 == 0) break;
                    ar2.a(this.m(), n4, l2);
                    return true;
                }
                case 4: {
                    this.g = 5;
                    int n5 = j.i();
                    if (n5 == -1) break;
                    g g2 = this.c(n5);
                    if (g2 == null) continue block7;
                    ar2.a(g2, j.j() ? 1.0f : 0.0f, l2);
                    return true;
                }
                case 5: {
                    if (!j.h()) {
                        return false;
                    }
                    this.g = 1;
                    break;
                }
            }
        }
    }
}

