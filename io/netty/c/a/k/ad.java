/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.g;
import io.netty.c.a.k.aa;
import io.netty.c.a.k.af;
import io.netty.c.a.k.am;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.p;

public class ad
extends aa {
    private static final int a = 4;
    private final int b;
    private af c;
    private g d;
    private int e;
    private int f;
    private int g;
    private String h;

    public ad(bp bp2, int n2) {
        if (bp2 == null) {
            throw new NullPointerException("spdyVersion");
        }
        this.b = n2;
        this.c = af.a;
    }

    private static int a(g g2) {
        int n2 = p.d(g2, g2.p());
        g2.A(4);
        return n2;
    }

    @Override
    void a(g g2, am am2) {
        if (g2 == null) {
            throw new NullPointerException("headerBlock");
        }
        if (am2 == null) {
            throw new NullPointerException("frame");
        }
        if (this.d == null) {
            this.b(g2, am2);
            if (g2.u()) {
                this.d = g2.l().a(g2.r());
                this.d.b(g2);
            }
        } else {
            this.d.b(g2);
            this.b(this.d, am2);
            if (this.d.u()) {
                this.d.B();
            } else {
                this.b();
            }
        }
    }

    protected void b(g g2, am am2) {
        block13: while (g2.u()) {
            switch (this.c) {
                case a: {
                    if (g2.r() < 4) {
                        return;
                    }
                    this.f = ad.a(g2);
                    if (this.f < 0) {
                        this.c = af.i;
                        am2.b();
                        break;
                    }
                    if (this.f == 0) {
                        this.c = af.h;
                        break;
                    }
                    this.c = af.b;
                    break;
                }
                case b: {
                    if (g2.r() < 4) {
                        return;
                    }
                    this.g = ad.a(g2);
                    if (this.g <= 0) {
                        this.c = af.i;
                        am2.b();
                        break;
                    }
                    if (this.g > this.b || this.e > this.b - this.g) {
                        this.e = this.b + 1;
                        this.c = af.d;
                        am2.d();
                        break;
                    }
                    this.e += this.g;
                    this.c = af.c;
                    break;
                }
                case c: {
                    if (g2.r() < this.g) {
                        return;
                    }
                    byte[] arrby = new byte[this.g];
                    g2.b(arrby);
                    this.h = new String(arrby, "UTF-8");
                    if (am2.e().d(this.h)) {
                        this.c = af.i;
                        am2.b();
                        break;
                    }
                    this.c = af.e;
                    break;
                }
                case d: {
                    int n2 = Math.min(g2.r(), this.g);
                    g2.A(n2);
                    this.g -= n2;
                    if (this.g != 0) continue block13;
                    this.c = af.e;
                    break;
                }
                case e: {
                    if (g2.r() < 4) {
                        return;
                    }
                    this.g = ad.a(g2);
                    if (this.g < 0) {
                        this.c = af.i;
                        am2.b();
                        break;
                    }
                    if (this.g == 0) {
                        if (!am2.c()) {
                            am2.e().a(this.h, "");
                        }
                        this.h = null;
                        if (--this.f == 0) {
                            this.c = af.h;
                            break;
                        }
                        this.c = af.b;
                        break;
                    }
                    if (this.g > this.b || this.e > this.b - this.g) {
                        this.e = this.b + 1;
                        this.h = null;
                        this.c = af.g;
                        am2.d();
                        break;
                    }
                    this.e += this.g;
                    this.c = af.f;
                    break;
                }
                case f: {
                    if (g2.r() < this.g) {
                        return;
                    }
                    byte[] arrby = new byte[this.g];
                    g2.b(arrby);
                    int n3 = 0;
                    int n4 = 0;
                    if (arrby[0] == 0) {
                        this.c = af.i;
                        am2.b();
                        break;
                    }
                    while (n3 < this.g) {
                        while (n3 < arrby.length && arrby[n3] != 0) {
                            ++n3;
                        }
                        if (n3 < arrby.length && (n3 + 1 == arrby.length || arrby[n3 + 1] == 0)) {
                            this.c = af.i;
                            am2.b();
                            break;
                        }
                        String string = new String(arrby, n4, n3 - n4, "UTF-8");
                        try {
                            am2.e().a(this.h, string);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            this.c = af.i;
                            am2.b();
                            break;
                        }
                        n4 = ++n3;
                    }
                    this.h = null;
                    if (this.c == af.i) break;
                    if (--this.f == 0) {
                        this.c = af.h;
                        break;
                    }
                    this.c = af.b;
                    break;
                }
                case g: {
                    int n2 = Math.min(g2.r(), this.g);
                    g2.A(n2);
                    this.g -= n2;
                    if (this.g != 0) continue block13;
                    if (--this.f == 0) {
                        this.c = af.h;
                        break;
                    }
                    this.c = af.b;
                    break;
                }
                case h: {
                    this.c = af.i;
                    am2.b();
                    break;
                }
                case i: {
                    g2.A(g2.r());
                    return;
                }
                default: {
                    throw new Error("Shouldn't reach here.");
                }
            }
        }
    }

    @Override
    void a(am am2) {
        if (this.c != af.h) {
            am2.b();
        }
        this.b();
        this.e = 0;
        this.h = null;
        this.c = af.a;
    }

    @Override
    void a() {
        this.b();
    }

    private void b() {
        if (this.d != null) {
            this.d.ad();
            this.d = null;
        }
    }
}

