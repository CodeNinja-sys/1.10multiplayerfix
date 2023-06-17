/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.dl;
import net.java.games.input.l;
import net.java.games.input.m;
import net.java.games.input.n;

final class at
implements dl {
    private static final at[] V = new at[255];
    public static final at a = new at(1);
    public static final at b = new at(2);
    public static final at c = new at(4);
    public static final at d = new at(5);
    public static final at e = new at(6);
    public static final at f = new at(7);
    public static final at g = new at(8);
    public static final at h = new at(48);
    public static final at i = new at(49);
    public static final at j = new at(50);
    public static final at k = new at(51);
    public static final at l = new at(52);
    public static final at m = new at(53);
    public static final at n = new at(54);
    public static final at o = new at(55);
    public static final at p = new at(56);
    public static final at q = new at(57);
    public static final at r = new at(58);
    public static final at s = new at(59);
    public static final at t = new at(60);
    public static final at u = new at(61);
    public static final at v = new at(62);
    public static final at w = new at(64);
    public static final at x = new at(65);
    public static final at y = new at(66);
    public static final at z = new at(67);
    public static final at A = new at(68);
    public static final at B = new at(69);
    public static final at C = new at(70);
    public static final at D = new at(128);
    public static final at E = new at(129);
    public static final at F = new at(130);
    public static final at G = new at(131);
    public static final at H = new at(132);
    public static final at I = new at(133);
    public static final at J = new at(134);
    public static final at K = new at(135);
    public static final at L = new at(136);
    public static final at M = new at(137);
    public static final at N = new at(138);
    public static final at O = new at(139);
    public static final at P = new at(140);
    public static final at Q = new at(141);
    public static final at R = new at(144);
    public static final at S = new at(145);
    public static final at T = new at(146);
    public static final at U = new at(147);
    private final int W;

    public static final at a(int n2) {
        if (n2 < 0 || n2 >= V.length) {
            return null;
        }
        return V[n2];
    }

    private at(int n2) {
        at.V[n2] = this;
        this.W = n2;
    }

    public final String toString() {
        return "GenericDesktopUsage (0x" + Integer.toHexString(this.W) + ")";
    }

    public final l a() {
        if (this == h) {
            return net.java.games.input.m.a;
        }
        if (this == i) {
            return net.java.games.input.m.b;
        }
        if (this == j || this == p) {
            return net.java.games.input.m.c;
        }
        if (this == k) {
            return net.java.games.input.m.d;
        }
        if (this == l) {
            return net.java.games.input.m.e;
        }
        if (this == m) {
            return net.java.games.input.m.f;
        }
        if (this == n) {
            return net.java.games.input.m.g;
        }
        if (this == q) {
            return net.java.games.input.m.C;
        }
        if (this == v) {
            return net.java.games.input.n.ad;
        }
        return null;
    }
}

