/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.iy;
import org.lwjgl.util.a.a.i;
import org.lwjgl.util.a.d;
import org.lwjgl.util.a.g;
import org.lwjgl.util.a.j;
import org.lwjgl.util.a.l;

public class c {
    static final float a = (float)Math.PI;
    public static final int b = 100900;
    public static final int c = 100901;
    public static final int d = 100902;
    public static final int e = 100903;
    public static final int f = 100800;
    public static final int g = 100801;
    public static final boolean h = true;
    public static final boolean i = false;
    public static final int j = 100000;
    public static final int k = 100001;
    public static final int l = 100002;
    public static final int m = 100010;
    public static final int n = 100011;
    public static final int o = 100012;
    public static final int p = 100013;
    public static final int q = 100020;
    public static final int r = 100021;
    public static final double s = 1.0E150;
    public static final double t = 1.0E150;
    public static final int u = 100140;
    public static final int v = 100141;
    public static final int w = 100142;
    public static final int x = 100130;
    public static final int y = 100131;
    public static final int z = 100132;
    public static final int A = 100133;
    public static final int B = 100134;
    public static final int C = 100100;
    public static final int D = 100101;
    public static final int E = 100102;
    public static final int F = 100103;
    public static final int G = 100104;
    public static final int H = 100105;
    public static final int I = 100106;
    public static final int J = 100107;
    public static final int K = 100108;
    public static final int L = 100109;
    public static final int M = 100110;
    public static final int N = 100111;
    public static final int O = 100151;
    public static final int P = 100152;
    public static final int Q = 100153;
    public static final int R = 100154;
    public static final int S = 100155;
    public static final int T = 100156;
    public static final int U = 100157;
    public static final int V = 100158;
    public static final int W = 100151;
    public static final int X = 100152;
    public static final int Y = 100153;
    public static final int Z = 100154;
    public static final int aa = 100155;
    public static final int ab = 100156;
    public static final int ac = 100200;
    public static final int ad = 100201;
    public static final int ae = 100203;
    public static final int af = 100204;
    public static final int ag = 100202;
    public static final int ah = 100205;
    public static final int ai = 100206;
    public static final int aj = 100207;
    public static final int ak = 100215;
    public static final int al = 100216;
    public static final int am = 100217;
    public static final int an = 100210;
    public static final int ao = 100211;
    public static final int ap = 100240;
    public static final int aq = 100241;
    public static final int ar = 100251;
    public static final int as = 100252;
    public static final int at = 100253;
    public static final int au = 100254;
    public static final int av = 100255;
    public static final int aw = 100256;
    public static final int ax = 100257;
    public static final int ay = 100258;
    public static final int az = 100259;
    public static final int aA = 100260;
    public static final int aB = 100261;
    public static final int aC = 100262;
    public static final int aD = 100263;
    public static final int aE = 100264;
    public static final int aF = 100265;
    public static final int aG = 100266;
    public static final int aH = 100267;
    public static final int aI = 100268;
    public static final int aJ = 100269;
    public static final int aK = 100270;
    public static final int aL = 100271;
    public static final int aM = 100272;
    public static final int aN = 100273;
    public static final int aO = 100274;
    public static final int aP = 100275;
    public static final int aQ = 100276;
    public static final int aR = 100277;
    public static final int aS = 100278;
    public static final int aT = 100279;
    public static final int aU = 100280;
    public static final int aV = 100281;
    public static final int aW = 100282;
    public static final int aX = 100283;
    public static final int aY = 100284;
    public static final int aZ = 100285;
    public static final int ba = 100286;
    public static final int bb = 100287;
    public static final int bc = 100120;
    public static final int bd = 100121;
    public static final int be = 100122;
    public static final int bf = 100123;
    public static final int bg = 100124;
    public static final int bh = 100100;
    public static final int bi = 100101;
    public static final int bj = 100102;
    public static final int bk = 100103;
    public static final int bl = 100104;

    public static void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        org.lwjgl.util.a.j.a(f2, f3, f4, f5, f6, f7, f8, f9, f10);
    }

    public static void a(float f2, float f3, float f4, float f5) {
        GL11.b(f2, f3, f4, f5, -1.0, 1.0);
    }

    public static void b(float f2, float f3, float f4, float f5) {
        org.lwjgl.util.a.j.a(f2, f3, f4, f5);
    }

    public static boolean a(float f2, float f3, float f4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer, FloatBuffer floatBuffer3) {
        return org.lwjgl.util.a.j.a(f2, f3, f4, floatBuffer, floatBuffer2, intBuffer, floatBuffer3);
    }

    public static boolean b(float f2, float f3, float f4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer, FloatBuffer floatBuffer3) {
        return org.lwjgl.util.a.j.b(f2, f3, f4, floatBuffer, floatBuffer2, intBuffer, floatBuffer3);
    }

    public static void a(float f2, float f3, float f4, float f5, IntBuffer intBuffer) {
        org.lwjgl.util.a.j.a(f2, f3, f4, f5, intBuffer);
    }

    public static String a(int n2) {
        return org.lwjgl.util.a.l.a(n2);
    }

    public static boolean a(String string, String string2) {
        return org.lwjgl.util.a.l.a(string, string2);
    }

    public static int a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        return org.lwjgl.util.a.g.a(n2, n3, n4, n5, n6, n7, byteBuffer);
    }

    public static int a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer, int n6, int n7, int n8, ByteBuffer byteBuffer2) {
        return org.lwjgl.util.a.g.a(n2, n3, n4, n5, byteBuffer, n6, n7, n8, byteBuffer2);
    }

    public static String b(int n2) {
        switch (n2) {
            case 100900: {
                return "Invalid enum (glu)";
            }
            case 100901: {
                return "Invalid value (glu)";
            }
            case 100902: {
                return "Out of memory (glu)";
            }
        }
        return iy.a(n2);
    }

    public static d a() {
        return new i();
    }
}

