/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.HashMap;
import java.util.Map;
import net.java.games.input.dl;
import net.java.games.input.n;

final class j
implements dl {
    private static final Map a = new HashMap();
    private final int b;

    public static final j a(int n2) {
        Integer n3 = new Integer(n2);
        j j2 = (j)a.get(n3);
        if (j2 != null) {
            return j2;
        }
        j j3 = new j(n2);
        a.put(n3, j3);
        return j3;
    }

    private j(int n2) {
        this.b = n2;
    }

    public final n a() {
        switch (this.b) {
            case 1: {
                return n.a;
            }
            case 2: {
                return n.b;
            }
            case 3: {
                return n.c;
            }
            case 4: {
                return n.d;
            }
            case 5: {
                return n.e;
            }
            case 6: {
                return n.f;
            }
            case 7: {
                return n.g;
            }
            case 8: {
                return n.h;
            }
            case 9: {
                return n.i;
            }
            case 10: {
                return n.j;
            }
            case 11: {
                return n.k;
            }
            case 12: {
                return n.l;
            }
            case 13: {
                return n.m;
            }
            case 14: {
                return n.n;
            }
            case 15: {
                return n.o;
            }
            case 16: {
                return n.p;
            }
            case 17: {
                return n.q;
            }
            case 18: {
                return n.r;
            }
            case 19: {
                return n.s;
            }
            case 20: {
                return n.t;
            }
            case 21: {
                return n.u;
            }
            case 22: {
                return n.v;
            }
            case 23: {
                return n.w;
            }
            case 24: {
                return n.x;
            }
            case 25: {
                return n.y;
            }
            case 26: {
                return n.z;
            }
            case 27: {
                return n.A;
            }
            case 28: {
                return n.B;
            }
            case 29: {
                return n.C;
            }
            case 30: {
                return n.D;
            }
            case 31: {
                return n.E;
            }
            case 32: {
                return n.F;
            }
        }
        return null;
    }

    public final String toString() {
        return "ButtonUsage (" + this.b + ")";
    }
}

