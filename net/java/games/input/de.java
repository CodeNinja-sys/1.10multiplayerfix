/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.ar;
import net.java.games.input.cf;
import net.java.games.input.dh;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.q;

final class de
extends cf {
    private static final int a = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private final RawDevice k;
    private final dh l = new dh();
    private int m = 1;

    protected de(String string, RawDevice rawDevice, k[] arrk, q[] arrq, dj[] arrdj) {
        super(string, arrk, arrq, arrdj);
        this.k = rawDevice;
    }

    public final void a() {
        this.k.a();
    }

    private static final boolean a(dh dh2, ar ar2, k k2, int n2, int n3) {
        if ((dh2.c() & n2) != 0) {
            ar2.a(k2, 1.0f, dh2.g());
            return true;
        }
        if ((dh2.c() & n3) != 0) {
            ar2.a(k2, 0.0f, dh2.g());
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final synchronized boolean a(ar ar2) {
        block11: while (true) {
            switch (this.m) {
                case 1: {
                    if (!this.k.a(this.l)) {
                        return false;
                    }
                    this.m = 2;
                    continue block11;
                }
                case 2: {
                    int n2 = this.k.d();
                    this.m = 3;
                    if (n2 == 0) continue block11;
                    ar2.a(this.k(), n2, this.l.g());
                    return true;
                }
                case 3: {
                    int n3 = this.k.e();
                    this.m = 4;
                    if (n3 == 0) continue block11;
                    ar2.a(this.l(), n3, this.l.g());
                    return true;
                }
                case 4: {
                    int n4 = this.l.a();
                    this.m = 5;
                    if (n4 == 0) continue block11;
                    ar2.a(this.m(), n4, this.l.g());
                    return true;
                }
                case 5: {
                    this.m = 6;
                    if (!de.a(this.l, ar2, this.n(), 1, 2)) continue block11;
                    return true;
                }
                case 6: {
                    this.m = 7;
                    if (!de.a(this.l, ar2, this.o(), 4, 8)) continue block11;
                    return true;
                }
                case 7: {
                    this.m = 8;
                    if (!de.a(this.l, ar2, this.p(), 16, 32)) continue block11;
                    return true;
                }
                case 8: {
                    this.m = 9;
                    if (!de.a(this.l, ar2, this.x(), 64, 128)) continue block11;
                    return true;
                }
                case 9: {
                    this.m = 1;
                    if (de.a(this.l, ar2, this.y(), 256, 512)) return true;
                    continue block11;
                }
            }
            break;
        }
        throw new RuntimeException("Unknown event state: " + this.m);
    }

    protected final void a(int n2) {
        this.k.c(n2);
    }
}

