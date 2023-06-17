/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class ARBShadingLanguageInclude {
    public static final int a = 36270;
    public static final int b = 36329;
    public static final int c = 36330;

    private ARBShadingLanguageInclude() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBShadingLanguageInclude.nglNamedStringARB(n2, byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.a(byteBuffer2), l2);
    }

    static native void nglNamedStringARB(int var0, int var1, long var2, int var4, long var5, long var7);

    public static void a(int n2, CharSequence charSequence, CharSequence charSequence2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lL;
        org.lwjgl.a.a(l2);
        ARBShadingLanguageInclude.nglNamedStringARB(n2, charSequence.length(), i.a(dt2, charSequence), charSequence2.length(), i.a(dt2, charSequence2, charSequence.length()), l2);
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBShadingLanguageInclude.nglDeleteNamedStringARB(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglDeleteNamedStringARB(int var0, long var1, long var3);

    public static void a(CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lM;
        org.lwjgl.a.a(l2);
        ARBShadingLanguageInclude.nglDeleteNamedStringARB(charSequence.length(), i.a(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer, n3);
        ARBShadingLanguageInclude.nglCompileShaderIncludeARB(n2, n3, o.a(byteBuffer), 0L, l2);
    }

    static native void nglCompileShaderIncludeARB(int var0, int var1, long var2, long var4, long var6);

    public static void a(int n2, CharSequence[] arrcharSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        ARBShadingLanguageInclude.nglCompileShaderIncludeARB2(n2, arrcharSequence.length, i.a(dt2, arrcharSequence), i.c(dt2, arrcharSequence), l2);
    }

    static native void nglCompileShaderIncludeARB2(int var0, int var1, long var2, long var4, long var6);

    public static boolean b(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        boolean bl2 = ARBShadingLanguageInclude.nglIsNamedStringARB(byteBuffer.remaining(), o.a(byteBuffer), l2);
        return bl2;
    }

    static native boolean nglIsNamedStringARB(int var0, long var1, long var3);

    public static boolean b(CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lO;
        org.lwjgl.a.a(l2);
        boolean bl2 = ARBShadingLanguageInclude.nglIsNamedStringARB(charSequence.length(), i.a(dt2, charSequence), l2);
        return bl2;
    }

    public static void a(ByteBuffer byteBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer2);
        ARBShadingLanguageInclude.nglGetNamedStringARB(byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.b(intBuffer), o.a(byteBuffer2), l2);
    }

    static native void nglGetNamedStringARB(int var0, long var1, int var3, long var4, long var6, long var8);

    public static void a(CharSequence charSequence, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lP;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        ARBShadingLanguageInclude.nglGetNamedStringARB(charSequence.length(), i.a(dt2, charSequence), byteBuffer.remaining(), o.b(intBuffer), o.a(byteBuffer), l2);
    }

    public static String a(CharSequence charSequence, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lP;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.e(dt2);
        ByteBuffer byteBuffer = i.a(dt2, n2 + charSequence.length());
        ARBShadingLanguageInclude.nglGetNamedStringARB(charSequence.length(), i.a(dt2, charSequence), n2, o.a((Buffer)intBuffer), o.a(byteBuffer), l2);
        byteBuffer.limit(charSequence.length() + intBuffer.get(0));
        return i.a(dt2, byteBuffer);
    }

    public static void a(ByteBuffer byteBuffer, int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(intBuffer, 1);
        ARBShadingLanguageInclude.nglGetNamedStringivARB(byteBuffer.remaining(), o.a(byteBuffer), n2, o.a(intBuffer), l2);
    }

    static native void nglGetNamedStringivARB(int var0, long var1, int var3, long var4, long var6);

    public static void a(CharSequence charSequence, int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        ARBShadingLanguageInclude.nglGetNamedStringivARB(charSequence.length(), i.a(dt2, charSequence), n2, o.a(intBuffer), l2);
    }

    public static int b(CharSequence charSequence, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lQ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBShadingLanguageInclude.nglGetNamedStringivARB(charSequence.length(), i.a(dt2, charSequence), n2, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

