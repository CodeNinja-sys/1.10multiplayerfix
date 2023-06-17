/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.logging.Logger;
import net.java.games.input.l;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.o;
import net.java.games.input.r;
import net.java.games.input.s;

class cc {
    private static cc b = new cc();
    private static Logger c = Logger.getLogger((a == null ? (a = cc.a("net.java.games.input.cc")) : a).getName());
    private final l[] d;
    private final l[] e;
    private final l[] f = new l[511];
    static Class a;

    private cc() {
        this.d = new l[15];
        this.e = new l[63];
        this.a();
    }

    private void a() {
        this.f[1] = o.b;
        this.f[2] = o.c;
        this.f[3] = o.d;
        this.f[4] = o.e;
        this.f[5] = o.f;
        this.f[6] = o.g;
        this.f[7] = o.h;
        this.f[8] = o.i;
        this.f[9] = o.j;
        this.f[10] = o.k;
        this.f[11] = o.l;
        this.f[12] = o.m;
        this.f[13] = o.n;
        this.f[14] = o.o;
        this.f[15] = o.p;
        this.f[16] = o.q;
        this.f[17] = o.r;
        this.f[18] = o.s;
        this.f[19] = o.t;
        this.f[20] = o.u;
        this.f[21] = o.v;
        this.f[22] = o.w;
        this.f[23] = o.x;
        this.f[24] = o.y;
        this.f[25] = o.z;
        this.f[26] = o.A;
        this.f[27] = o.B;
        this.f[28] = o.C;
        this.f[29] = o.D;
        this.f[30] = o.E;
        this.f[31] = o.F;
        this.f[32] = o.G;
        this.f[33] = o.H;
        this.f[34] = o.I;
        this.f[35] = o.J;
        this.f[36] = o.K;
        this.f[37] = o.L;
        this.f[38] = o.M;
        this.f[39] = o.N;
        this.f[40] = o.O;
        this.f[41] = o.P;
        this.f[42] = o.Q;
        this.f[43] = o.R;
        this.f[44] = o.S;
        this.f[45] = o.T;
        this.f[46] = o.U;
        this.f[47] = o.V;
        this.f[48] = o.W;
        this.f[49] = o.X;
        this.f[50] = o.Y;
        this.f[51] = o.Z;
        this.f[52] = o.aa;
        this.f[53] = o.ab;
        this.f[54] = o.ac;
        this.f[55] = o.ad;
        this.f[56] = o.ae;
        this.f[57] = o.af;
        this.f[58] = o.ag;
        this.f[59] = o.ah;
        this.f[60] = o.ai;
        this.f[61] = o.aj;
        this.f[62] = o.ak;
        this.f[63] = o.al;
        this.f[64] = o.am;
        this.f[65] = o.an;
        this.f[66] = o.ao;
        this.f[67] = o.ap;
        this.f[68] = o.aq;
        this.f[69] = o.ar;
        this.f[70] = o.as;
        this.f[71] = o.at;
        this.f[72] = o.au;
        this.f[73] = o.av;
        this.f[74] = o.aw;
        this.f[75] = o.ax;
        this.f[76] = o.ay;
        this.f[77] = o.az;
        this.f[78] = o.aA;
        this.f[79] = o.aB;
        this.f[80] = o.aC;
        this.f[81] = o.aD;
        this.f[82] = o.aE;
        this.f[83] = o.aF;
        this.f[183] = o.aI;
        this.f[86] = null;
        this.f[87] = o.aG;
        this.f[88] = o.aH;
        this.f[184] = o.aJ;
        this.f[185] = o.aK;
        this.f[186] = null;
        this.f[187] = null;
        this.f[188] = null;
        this.f[189] = null;
        this.f[190] = null;
        this.f[96] = o.aY;
        this.f[97] = o.aZ;
        this.f[98] = o.bb;
        this.f[99] = o.bc;
        this.f[100] = o.bd;
        this.f[101] = null;
        this.f[102] = o.bf;
        this.f[103] = o.bg;
        this.f[104] = o.bh;
        this.f[105] = o.bi;
        this.f[106] = o.bj;
        this.f[107] = o.bk;
        this.f[108] = o.bl;
        this.f[109] = o.bm;
        this.f[110] = o.bn;
        this.f[111] = o.bo;
        this.f[119] = o.be;
        this.f[117] = o.aP;
        this.f[142] = o.bt;
        this.f[240] = o.aX;
        this.f[256] = n.a;
        this.f[257] = n.b;
        this.f[258] = n.c;
        this.f[259] = n.d;
        this.f[260] = n.e;
        this.f[261] = n.f;
        this.f[262] = n.g;
        this.f[263] = n.h;
        this.f[264] = n.i;
        this.f[265] = n.j;
        this.f[272] = n.aw;
        this.f[273] = n.ay;
        this.f[274] = n.ax;
        this.f[275] = n.az;
        this.f[276] = n.au;
        this.f[277] = n.av;
        this.f[278] = n.at;
        this.f[288] = n.G;
        this.f[289] = n.H;
        this.f[290] = n.I;
        this.f[291] = n.J;
        this.f[292] = n.K;
        this.f[293] = n.L;
        this.f[294] = n.M;
        this.f[295] = n.N;
        this.f[296] = n.O;
        this.f[297] = n.P;
        this.f[298] = n.Q;
        this.f[299] = n.R;
        this.f[303] = n.S;
        this.f[304] = n.T;
        this.f[305] = n.U;
        this.f[306] = n.V;
        this.f[307] = n.W;
        this.f[308] = n.X;
        this.f[309] = n.Y;
        this.f[310] = n.Z;
        this.f[311] = n.aa;
        this.f[312] = n.ab;
        this.f[313] = n.ac;
        this.f[314] = n.ad;
        this.f[316] = n.ae;
        this.f[317] = n.af;
        this.f[318] = n.ag;
        this.f[320] = n.ah;
        this.f[321] = n.ai;
        this.f[322] = n.aj;
        this.f[323] = n.ak;
        this.f[324] = n.al;
        this.f[325] = n.am;
        this.f[326] = n.an;
        this.f[327] = n.ao;
        this.f[330] = n.ap;
        this.f[331] = n.aq;
        this.f[332] = n.ar;
        this.d[0] = m.a;
        this.d[1] = m.b;
        this.d[2] = m.c;
        this.d[8] = m.c;
        this.d[6] = m.g;
        this.d[7] = m.g;
        this.d[9] = m.g;
        this.e[0] = m.a;
        this.e[1] = m.b;
        this.e[2] = m.c;
        this.e[3] = m.d;
        this.e[4] = m.e;
        this.e[5] = m.f;
        this.e[6] = m.g;
        this.e[7] = m.f;
        this.e[8] = m.b;
        this.e[9] = m.g;
        this.e[10] = m.g;
        this.e[16] = m.C;
        this.e[17] = m.C;
        this.e[18] = m.C;
        this.e[19] = m.C;
        this.e[20] = m.C;
        this.e[21] = m.C;
        this.e[22] = m.C;
        this.e[23] = m.C;
        this.e[24] = null;
        this.e[25] = null;
        this.e[26] = null;
        this.e[27] = null;
        this.e[40] = null;
    }

    public static final s a(int n2) {
        switch (n2) {
            case 288: 
            case 289: 
            case 290: 
            case 291: 
            case 292: 
            case 293: 
            case 294: 
            case 295: 
            case 296: 
            case 297: 
            case 298: 
            case 299: 
            case 303: {
                return s.h;
            }
            case 304: 
            case 305: 
            case 306: 
            case 307: 
            case 308: 
            case 309: 
            case 310: 
            case 311: 
            case 312: 
            case 313: 
            case 314: 
            case 316: 
            case 317: 
            case 318: {
                return s.e;
            }
            case 256: 
            case 257: 
            case 258: 
            case 259: 
            case 260: 
            case 261: 
            case 262: 
            case 263: 
            case 264: 
            case 265: {
                return s.a;
            }
            case 272: 
            case 273: 
            case 274: 
            case 275: 
            case 276: {
                return s.b;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: 
            case 68: 
            case 69: 
            case 70: 
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: 
            case 76: 
            case 77: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 85: 
            case 86: 
            case 87: 
            case 88: 
            case 89: 
            case 90: 
            case 91: 
            case 92: 
            case 93: 
            case 94: 
            case 95: 
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 105: 
            case 106: 
            case 107: 
            case 108: 
            case 109: 
            case 110: 
            case 111: 
            case 112: 
            case 113: 
            case 114: 
            case 115: 
            case 116: 
            case 117: 
            case 118: 
            case 119: 
            case 121: 
            case 122: 
            case 123: 
            case 124: 
            case 125: 
            case 126: 
            case 127: 
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 143: 
            case 144: 
            case 145: 
            case 146: 
            case 147: 
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
            case 168: 
            case 169: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: 
            case 177: 
            case 178: 
            case 179: 
            case 180: 
            case 183: 
            case 184: 
            case 185: 
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 191: 
            case 192: 
            case 193: 
            case 194: 
            case 200: 
            case 201: 
            case 202: 
            case 203: 
            case 205: 
            case 206: 
            case 207: 
            case 208: 
            case 209: 
            case 210: 
            case 211: 
            case 212: 
            case 213: 
            case 214: 
            case 215: 
            case 216: 
            case 217: 
            case 218: 
            case 219: 
            case 220: 
            case 221: 
            case 222: 
            case 223: 
            case 224: 
            case 225: 
            case 226: 
            case 227: 
            case 228: 
            case 229: 
            case 230: 
            case 352: 
            case 353: 
            case 354: 
            case 355: 
            case 356: 
            case 357: 
            case 358: 
            case 359: 
            case 360: 
            case 361: 
            case 362: 
            case 363: 
            case 364: 
            case 365: 
            case 366: 
            case 367: 
            case 368: 
            case 369: 
            case 370: 
            case 371: 
            case 372: 
            case 373: 
            case 374: 
            case 375: 
            case 376: 
            case 377: 
            case 378: 
            case 379: 
            case 380: 
            case 381: 
            case 382: 
            case 383: 
            case 384: 
            case 385: 
            case 386: 
            case 387: 
            case 388: 
            case 389: 
            case 390: 
            case 391: 
            case 392: 
            case 393: 
            case 394: 
            case 395: 
            case 396: 
            case 397: 
            case 398: 
            case 399: 
            case 400: 
            case 401: 
            case 402: 
            case 403: 
            case 404: 
            case 405: 
            case 406: 
            case 407: 
            case 408: 
            case 409: 
            case 410: 
            case 411: 
            case 412: 
            case 413: 
            case 414: 
            case 415: 
            case 448: 
            case 449: 
            case 450: 
            case 451: 
            case 464: 
            case 465: 
            case 466: 
            case 467: 
            case 468: 
            case 469: 
            case 470: 
            case 471: 
            case 472: 
            case 473: 
            case 474: 
            case 475: 
            case 476: 
            case 477: 
            case 478: 
            case 479: 
            case 480: 
            case 481: 
            case 482: 
            case 483: 
            case 484: {
                return s.c;
            }
        }
        return s.a;
    }

    public static r b(int n2) {
        switch (n2) {
            case 20: {
                return r.c;
            }
            case 17: {
                return r.f;
            }
            case 21: {
                return r.g;
            }
            case 19: {
                return r.e;
            }
            case 3: {
                return r.b;
            }
        }
        return r.a;
    }

    public static l c(int n2) {
        l l2 = null;
        try {
            l2 = cc.b.d[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            c.warning("INSTANCE.relAxesIDis only " + cc.b.d.length + " long, so " + n2 + " not contained");
        }
        if (l2 == null) {
            l2 = m.j;
        }
        return l2;
    }

    public static l d(int n2) {
        l l2 = null;
        try {
            l2 = cc.b.e[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            c.warning("INSTANCE.absAxesIDs is only " + cc.b.e.length + " long, so " + n2 + " not contained");
        }
        if (l2 == null) {
            l2 = m.g;
        }
        return l2;
    }

    public static l e(int n2) {
        l l2 = null;
        try {
            l2 = cc.b.f[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            c.warning("INSTANCE.buttonIDs is only " + cc.b.f.length + " long, so " + n2 + " not contained");
        }
        if (l2 == null) {
            l2 = o.bu;
        }
        return l2;
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

