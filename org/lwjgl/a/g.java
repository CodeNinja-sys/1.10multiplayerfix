/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.a.i;
import org.lwjgl.a.l;
import org.lwjgl.ab;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.gc;

public class g {
    public static final int a = 18;
    public static final int b = 0;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 11;
    public static final int o = 12;
    public static final int p = 13;
    public static final int q = 14;
    public static final int r = 15;
    public static final int s = 16;
    public static final int t = 17;
    public static final int u = 18;
    public static final int v = 19;
    public static final int w = 20;
    public static final int x = 21;
    public static final int y = 22;
    public static final int z = 23;
    public static final int A = 24;
    public static final int B = 25;
    public static final int C = 26;
    public static final int D = 27;
    public static final int E = 28;
    public static final int F = 29;
    public static final int G = 30;
    public static final int H = 31;
    public static final int I = 32;
    public static final int J = 33;
    public static final int K = 34;
    public static final int L = 35;
    public static final int M = 36;
    public static final int N = 37;
    public static final int O = 38;
    public static final int P = 39;
    public static final int Q = 40;
    public static final int R = 41;
    public static final int S = 42;
    public static final int T = 43;
    public static final int U = 44;
    public static final int V = 45;
    public static final int W = 46;
    public static final int X = 47;
    public static final int Y = 48;
    public static final int Z = 49;
    public static final int aa = 50;
    public static final int ab = 51;
    public static final int ac = 52;
    public static final int ad = 53;
    public static final int ae = 54;
    public static final int af = 55;
    public static final int ag = 56;
    public static final int ah = 57;
    public static final int ai = 58;
    public static final int aj = 59;
    public static final int ak = 60;
    public static final int al = 61;
    public static final int am = 62;
    public static final int an = 63;
    public static final int ao = 64;
    public static final int ap = 65;
    public static final int aq = 66;
    public static final int ar = 67;
    public static final int as = 68;
    public static final int at = 69;
    public static final int au = 70;
    public static final int av = 71;
    public static final int aw = 72;
    public static final int ax = 73;
    public static final int ay = 74;
    public static final int az = 75;
    public static final int aA = 76;
    public static final int aB = 77;
    public static final int aC = 78;
    public static final int aD = 79;
    public static final int aE = 80;
    public static final int aF = 81;
    public static final int aG = 82;
    public static final int aH = 83;
    public static final int aI = 87;
    public static final int aJ = 88;
    public static final int aK = 100;
    public static final int aL = 101;
    public static final int aM = 102;
    public static final int aN = 103;
    public static final int aO = 104;
    public static final int aP = 105;
    public static final int aQ = 112;
    public static final int aR = 113;
    public static final int aS = 121;
    public static final int aT = 123;
    public static final int aU = 125;
    public static final int aV = 141;
    public static final int aW = 144;
    public static final int aX = 145;
    public static final int aY = 146;
    public static final int aZ = 147;
    public static final int ba = 148;
    public static final int bb = 149;
    public static final int bc = 150;
    public static final int bd = 151;
    public static final int be = 156;
    public static final int bf = 157;
    public static final int bg = 167;
    public static final int bh = 179;
    public static final int bi = 181;
    public static final int bj = 183;
    public static final int bk = 184;
    public static final int bl = 196;
    public static final int bm = 197;
    public static final int bn = 199;
    public static final int bo = 200;
    public static final int bp = 201;
    public static final int bq = 203;
    public static final int br = 205;
    public static final int bs = 207;
    public static final int bt = 208;
    public static final int bu = 209;
    public static final int bv = 210;
    public static final int bw = 211;
    public static final int bx = 218;
    public static final int by = 219;
    public static final int bz = 219;
    public static final int bA = 220;
    public static final int bB = 220;
    public static final int bC = 221;
    public static final int bD = 222;
    public static final int bE = 223;
    public static final int bF = 256;
    private static final int bG = 50;
    private static final String[] bH = new String[256];
    private static final Map bI = new HashMap(253);
    private static int bJ;
    private static final int bK;
    private static boolean bL;
    private static boolean bM;
    private static final ByteBuffer bN;
    private static ByteBuffer bO;
    private static i bP;
    private static i bQ;
    private static boolean bR;
    private static gc bS;

    private g() {
    }

    private static void n() {
        if (bR) {
            return;
        }
        org.lwjgl.ab.b();
        bR = true;
    }

    private static void a(gc gc2) {
        if (bL) {
            return;
        }
        if (!bR) {
            org.lwjgl.a.g.n();
        }
        bS = gc2;
        bS.z();
        bL = true;
        bO = ByteBuffer.allocate(900);
        org.lwjgl.a.g.o();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Display must be created.");
            }
            org.lwjgl.a.g.a(org.lwjgl.a.l.a());
        }
    }

    private static void o() {
        bO.limit(0);
        for (int i2 = 0; i2 < bN.remaining(); ++i2) {
            bN.put(i2, (byte)0);
        }
        org.lwjgl.a.i.a(bP);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean b() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return bL;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!bL) {
                return;
            }
            bL = false;
            bS.A();
            org.lwjgl.a.g.o();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!bL) {
                throw new IllegalStateException("Keyboard must be created before you can poll the device");
            }
            bS.b(bN);
            org.lwjgl.a.g.p();
        }
    }

    private static void p() {
        bO.compact();
        bS.c(bO);
        bO.flip();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(int n2) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!bL) {
                throw new IllegalStateException("Keyboard must be created before you can query key state");
            }
            return bN.get(n2) != 0;
        }
    }

    public static synchronized String b(int n2) {
        return bH[n2];
    }

    public static synchronized int a(String string) {
        Integer n2 = (Integer)bI.get(string);
        if (n2 == null) {
            return 0;
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int e() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!bL) {
                throw new IllegalStateException("Keyboard must be created before you can read events");
            }
            int n2 = bO.position();
            int n3 = 0;
            while (org.lwjgl.a.g.a(bQ) && (!org.lwjgl.a.i.b(bQ) || bM)) {
                ++n3;
            }
            bO.position(n2);
            return n3;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean f() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            boolean bl2;
            if (!bL) {
                throw new IllegalStateException("Keyboard must be created before you can read events");
            }
            while ((bl2 = org.lwjgl.a.g.a(bP)) && org.lwjgl.a.i.b(bP) && !bM) {
            }
            return bl2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(boolean bl2) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            bM = bl2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean g() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return bM;
        }
    }

    private static boolean a(i i2) {
        if (bO.hasRemaining()) {
            org.lwjgl.a.i.a(i2, bO.getInt() & 0xFF);
            org.lwjgl.a.i.a(i2, bO.get() != 0);
            org.lwjgl.a.i.b(i2, bO.getInt());
            org.lwjgl.a.i.a(i2, bO.getLong());
            org.lwjgl.a.i.b(i2, bO.get() == 1);
            return true;
        }
        return false;
    }

    public static int h() {
        return bK;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static char i() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return (char)org.lwjgl.a.i.c(bP);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int j() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return org.lwjgl.a.i.d(bP);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean k() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return org.lwjgl.a.i.e(bP);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long l() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return org.lwjgl.a.i.f(bP);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean m() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return org.lwjgl.a.i.b(bP);
        }
    }

    static {
        Field[] arrfield = g.class.getFields();
        try {
            for (Field field : arrfield) {
                String string;
                if (!Modifier.isStatic(field.getModifiers()) || !Modifier.isPublic(field.getModifiers()) || !Modifier.isFinal(field.getModifiers()) || !field.getType().equals(Integer.TYPE) || !field.getName().startsWith("KEY_") || field.getName().endsWith("WIN")) continue;
                int n2 = field.getInt(null);
                org.lwjgl.a.g.bH[n2] = string = field.getName().substring(4);
                bI.put(string, n2);
                ++bJ;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        bK = bJ;
        bN = BufferUtils.a(256);
        bP = new i(null);
        bQ = new i(null);
    }
}

