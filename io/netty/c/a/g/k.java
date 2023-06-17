/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.c.a.d.bp;

public final class k {
    public static final bp a = bp.a;
    public static final bp b = bp.d;
    public static final bp c = bp.e;
    public static final bp d = new bp(250, "Low on Storage Space");
    public static final bp e = bp.l;
    public static final bp f = bp.m;
    public static final bp g = new bp(302, "Moved Temporarily");
    public static final bp h = bp.p;
    public static final bp i = bp.q;
    public static final bp j = bp.s;
    public static final bp k = bp.t;
    public static final bp l = bp.u;
    public static final bp m = bp.v;
    public static final bp n = bp.w;
    public static final bp o = bp.x;
    public static final bp p = bp.y;
    public static final bp q = bp.z;
    public static final bp r = bp.A;
    public static final bp s = bp.C;
    public static final bp t = bp.D;
    public static final bp u = bp.E;
    public static final bp v = bp.F;
    public static final bp w = bp.G;
    public static final bp x = bp.H;
    public static final bp y = new bp(451, "Parameter Not Understood");
    public static final bp z = new bp(452, "Conference Not Found");
    public static final bp A = new bp(453, "Not Enough Bandwidth");
    public static final bp B = new bp(454, "Session Not Found");
    public static final bp C = new bp(455, "Method Not Valid in This State");
    public static final bp D = new bp(456, "Header Field Not Valid for Resource");
    public static final bp E = new bp(457, "Invalid Range");
    public static final bp F = new bp(458, "Parameter Is Read-Only");
    public static final bp G = new bp(459, "Aggregate operation not allowed");
    public static final bp H = new bp(460, "Only Aggregate operation allowed");
    public static final bp I = new bp(461, "Unsupported transport");
    public static final bp J = new bp(462, "Destination unreachable");
    public static final bp K = new bp(463, "Key management failure");
    public static final bp L = bp.S;
    public static final bp M = bp.T;
    public static final bp N = bp.U;
    public static final bp O = bp.V;
    public static final bp P = bp.W;
    public static final bp Q = new bp(505, "RTSP Version not supported");
    public static final bp R = new bp(551, "Option not supported");

    public static bp a(int n2) {
        switch (n2) {
            case 250: {
                return d;
            }
            case 302: {
                return g;
            }
            case 451: {
                return y;
            }
            case 452: {
                return z;
            }
            case 453: {
                return A;
            }
            case 454: {
                return B;
            }
            case 455: {
                return C;
            }
            case 456: {
                return D;
            }
            case 457: {
                return E;
            }
            case 458: {
                return F;
            }
            case 459: {
                return G;
            }
            case 460: {
                return H;
            }
            case 461: {
                return I;
            }
            case 462: {
                return J;
            }
            case 463: {
                return K;
            }
            case 505: {
                return Q;
            }
            case 551: {
                return R;
            }
        }
        return bp.a(n2);
    }

    private k() {
    }
}

