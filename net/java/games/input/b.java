/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.awt.event.KeyEvent;
import net.java.games.input.o;

final class b {
    b() {
    }

    public static final o a(int n2) {
        switch (n2) {
            case 48: {
                return o.l;
            }
            case 49: {
                return o.c;
            }
            case 50: {
                return o.d;
            }
            case 51: {
                return o.e;
            }
            case 52: {
                return o.f;
            }
            case 53: {
                return o.g;
            }
            case 54: {
                return o.h;
            }
            case 55: {
                return o.i;
            }
            case 56: {
                return o.j;
            }
            case 57: {
                return o.k;
            }
            case 81: {
                return o.q;
            }
            case 87: {
                return o.r;
            }
            case 69: {
                return o.s;
            }
            case 82: {
                return o.t;
            }
            case 84: {
                return o.u;
            }
            case 89: {
                return o.v;
            }
            case 85: {
                return o.w;
            }
            case 73: {
                return o.x;
            }
            case 79: {
                return o.y;
            }
            case 80: {
                return o.z;
            }
            case 65: {
                return o.E;
            }
            case 83: {
                return o.F;
            }
            case 68: {
                return o.G;
            }
            case 70: {
                return o.H;
            }
            case 71: {
                return o.I;
            }
            case 72: {
                return o.J;
            }
            case 74: {
                return o.K;
            }
            case 75: {
                return o.L;
            }
            case 76: {
                return o.M;
            }
            case 90: {
                return o.S;
            }
            case 88: {
                return o.T;
            }
            case 67: {
                return o.U;
            }
            case 86: {
                return o.V;
            }
            case 66: {
                return o.W;
            }
            case 78: {
                return o.X;
            }
            case 77: {
                return o.Y;
            }
            case 112: {
                return o.ah;
            }
            case 113: {
                return o.ai;
            }
            case 114: {
                return o.aj;
            }
            case 115: {
                return o.ak;
            }
            case 116: {
                return o.al;
            }
            case 117: {
                return o.am;
            }
            case 118: {
                return o.an;
            }
            case 119: {
                return o.ao;
            }
            case 120: {
                return o.ap;
            }
            case 121: {
                return o.aq;
            }
            case 122: {
                return o.aG;
            }
            case 123: {
                return o.aH;
            }
            case 27: {
                return o.b;
            }
            case 45: {
                return o.m;
            }
            case 61: {
                return o.n;
            }
            case 8: {
                return o.R;
            }
            case 9: {
                return o.p;
            }
            case 91: {
                return o.A;
            }
            case 93: {
                return o.B;
            }
            case 59: {
                return o.N;
            }
            case 222: {
                return o.O;
            }
            case 520: {
                return o.P;
            }
            case 92: {
                return o.R;
            }
            case 46: {
                return o.aa;
            }
            case 47: {
                return o.ab;
            }
            case 106: {
                return o.ad;
            }
            case 32: {
                return o.af;
            }
            case 20: {
                return o.ag;
            }
            case 144: {
                return o.ar;
            }
            case 145: {
                return o.as;
            }
            case 103: {
                return o.at;
            }
            case 104: {
                return o.au;
            }
            case 105: {
                return o.av;
            }
            case 109: {
                return o.aw;
            }
            case 100: {
                return o.ax;
            }
            case 101: {
                return o.ay;
            }
            case 102: {
                return o.az;
            }
            case 107: {
                return o.aA;
            }
            case 97: {
                return o.aB;
            }
            case 98: {
                return o.aC;
            }
            case 99: {
                return o.aD;
            }
            case 96: {
                return o.aE;
            }
            case 110: {
                return o.aF;
            }
            case 21: {
                return o.aL;
            }
            case 28: {
                return o.aM;
            }
            case 29: {
                return o.aN;
            }
            case 514: {
                return o.aQ;
            }
            case 512: {
                return o.aR;
            }
            case 513: {
                return o.aS;
            }
            case 523: {
                return o.aT;
            }
            case 25: {
                return o.aU;
            }
            case 65480: {
                return o.aV;
            }
            case 111: {
                return o.bb;
            }
            case 19: {
                return o.be;
            }
            case 36: {
                return o.bf;
            }
            case 38: {
                return o.bg;
            }
            case 33: {
                return o.bh;
            }
            case 37: {
                return o.bi;
            }
            case 39: {
                return o.bj;
            }
            case 35: {
                return o.bk;
            }
            case 40: {
                return o.bl;
            }
            case 34: {
                return o.bm;
            }
            case 155: {
                return o.bn;
            }
            case 127: {
                return o.bo;
            }
        }
        return o.bu;
    }

    public static final o a(KeyEvent keyEvent) {
        int n2 = keyEvent.getKeyCode();
        int n3 = keyEvent.getKeyLocation();
        switch (n2) {
            case 17: {
                if (n3 == 3) {
                    return o.aZ;
                }
                return o.D;
            }
            case 16: {
                if (n3 == 3) {
                    return o.ac;
                }
                return o.Q;
            }
            case 18: {
                if (n3 == 3) {
                    return o.bd;
                }
                return o.ae;
            }
            case 10: {
                if (n3 == 4) {
                    return o.aY;
                }
                return o.C;
            }
            case 44: {
                if (n3 == 4) {
                    return o.ba;
                }
                return o.Z;
            }
        }
        return b.a(n2);
    }
}

