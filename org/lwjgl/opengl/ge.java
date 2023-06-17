/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.gf;
import org.lwjgl.z;

public final class ge {
    public static final int a = 37600;
    public static final int b = 33346;
    public static final int c = 2;
    public static final int d = 37187;
    public static final int e = 37188;
    public static final int f = 37189;
    public static final int g = 33347;
    public static final int h = 33388;
    public static final int i = 33389;
    public static final int j = 33512;
    public static final int k = 33348;
    public static final int l = 33349;
    public static final int m = 33350;
    public static final int n = 33351;
    public static final int o = 33352;
    public static final int p = 33353;
    public static final int q = 33354;
    public static final int r = 33355;
    public static final int s = 33356;
    public static final int t = 33357;
    public static final int u = 33358;
    public static final int v = 33359;
    public static final int w = 33360;
    public static final int x = 33361;
    public static final int y = 33384;
    public static final int z = 33385;
    public static final int A = 33386;
    public static final int B = 37190;
    public static final int C = 37191;
    public static final int D = 37192;
    public static final int E = 33387;
    public static final int F = 33504;
    public static final int G = 33505;
    public static final int H = 33506;
    public static final int I = 33507;
    public static final int J = 33508;
    public static final int K = 33510;
    public static final int L = 33511;

    private ge() {
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, boolean bl2) {
        GL43.a(n2, n3, n4, intBuffer, bl2);
    }

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        GL43.b(n2, n3, n4, n5, byteBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, CharSequence charSequence) {
        GL43.a(n2, n3, n4, n5, charSequence);
    }

    public static void a(gf gf2) {
        GL43.a(gf2);
    }

    public static int a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, IntBuffer intBuffer4, IntBuffer intBuffer5, ByteBuffer byteBuffer) {
        return GL43.a(n2, intBuffer, intBuffer2, intBuffer3, intBuffer4, intBuffer5, byteBuffer);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        GL43.a(n2, n3, byteBuffer);
    }

    public static void a(int n2, int n3, CharSequence charSequence) {
        GL43.a(n2, n3, charSequence);
    }

    public static void a() {
        GL43.a();
    }

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        GL43.b(n2, n3, byteBuffer);
    }

    public static void b(int n2, int n3, CharSequence charSequence) {
        GL43.b(n2, n3, charSequence);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        GL43.a(n2, n3, intBuffer, byteBuffer);
    }

    public static String a(int n2, int n3, int n4) {
        return GL43.b(n2, n3, n4);
    }

    public static void a(z z2, ByteBuffer byteBuffer) {
        GL43.a(z2, byteBuffer);
    }

    public static void a(z z2, CharSequence charSequence) {
        GL43.a(z2, charSequence);
    }

    public static void a(z z2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        GL43.a(z2, intBuffer, byteBuffer);
    }

    public static String a(z z2, int n2) {
        return GL43.a(z2, n2);
    }
}

