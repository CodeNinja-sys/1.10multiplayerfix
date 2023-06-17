/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.b.e;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.u;
import net.minecraft.client.r;
import net.minecraft.u.cb;
import net.minecraft.u.cc;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.ab;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.aq;
import org.lwjgl.opengl.da;
import org.lwjgl.opengl.dt;

public class ay {
    private static final d T = org.apache.logging.log4j.c.c();
    public static boolean a;
    public static boolean b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    private static u U;
    public static boolean l;
    private static boolean V;
    private static boolean W;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    private static boolean X;
    public static int q;
    public static int r;
    public static int s;
    private static boolean Y;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    private static boolean Z;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    private static String aa;
    private static String ab;
    public static boolean P;
    public static boolean Q;
    private static boolean ac;
    public static int R;
    public static int S;
    private static /* synthetic */ int[] ad;

    static {
        aa = "";
    }

    public static void a() {
        dt dt2 = GLContext.a();
        X = dt2.ba && !dt2.eu;
        boolean bl2 = Y = dt2.cb && !dt2.eu;
        if (X) {
            aa = String.valueOf(aa) + "Using ARB_multitexture.\n";
            q = 33984;
            r = 33985;
            s = 33986;
        } else {
            aa = String.valueOf(aa) + "Using GL 1.3 multitexturing.\n";
            q = 33984;
            r = 33985;
            s = 33986;
        }
        if (Y) {
            aa = String.valueOf(aa) + "Using ARB_texture_env_combine.\n";
            t = 34160;
            u = 34165;
            v = 34167;
            w = 34166;
            x = 34168;
            y = 34161;
            z = 34176;
            A = 34177;
            B = 34178;
            C = 34192;
            D = 34193;
            E = 34194;
            F = 34162;
            G = 34184;
            H = 34185;
            I = 34186;
            J = 34200;
            K = 34201;
            L = 34202;
        } else {
            aa = String.valueOf(aa) + "Using GL 1.3 texture combiners.\n";
            t = 34160;
            u = 34165;
            v = 34167;
            w = 34166;
            x = 34168;
            y = 34161;
            z = 34176;
            A = 34177;
            B = 34178;
            C = 34192;
            D = 34193;
            E = 34194;
            F = 34162;
            G = 34184;
            H = 34185;
            I = 34186;
            J = 34200;
            K = 34201;
            L = 34202;
        }
        M = dt2.dk && !dt2.ev;
        Z = dt2.ev || dt2.dk;
        boolean bl3 = l = Z && (dt2.aF || dt2.dx || dt2.ez);
        if (l) {
            aa = String.valueOf(aa) + "Using framebuffer objects because ";
            if (dt2.ez) {
                aa = String.valueOf(aa) + "OpenGL 3.0 is supported and separate blending is supported.\n";
                U = net.minecraft.client.g.u.a;
                c = 36160;
                d = 36161;
                e = 36064;
                f = 36096;
                g = 36053;
                h = 36054;
                i = 36055;
                j = 36059;
                k = 36060;
            } else if (dt2.aF) {
                aa = String.valueOf(aa) + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                U = net.minecraft.client.g.u.b;
                c = 36160;
                d = 36161;
                e = 36064;
                f = 36096;
                g = 36053;
                i = 36055;
                h = 36054;
                j = 36059;
                k = 36060;
            } else if (dt2.dx) {
                aa = String.valueOf(aa) + "EXT_framebuffer_object is supported.\n";
                U = net.minecraft.client.g.u.c;
                c = 36160;
                d = 36161;
                e = 36064;
                f = 36096;
                g = 36053;
                i = 36055;
                h = 36054;
                j = 36059;
                k = 36060;
            }
        } else {
            aa = String.valueOf(aa) + "Not using framebuffer objects because ";
            aa = String.valueOf(aa) + "OpenGL 1.4 is " + (dt2.ev ? "" : "not ") + "supported, ";
            aa = String.valueOf(aa) + "EXT_blend_func_separate is " + (dt2.dk ? "" : "not ") + "supported, ";
            aa = String.valueOf(aa) + "OpenGL 3.0 is " + (dt2.ez ? "" : "not ") + "supported, ";
            aa = String.valueOf(aa) + "ARB_framebuffer_object is " + (dt2.aF ? "" : "not ") + "supported, and ";
            aa = String.valueOf(aa) + "EXT_framebuffer_object is " + (dt2.dx ? "" : "not ") + "supported.\n";
        }
        N = dt2.ey;
        V = N || dt2.cI && dt2.aD && dt2.by;
        aa = String.valueOf(aa) + "Shaders are " + (V ? "" : "not ") + "available because ";
        if (V) {
            if (dt2.ey) {
                aa = String.valueOf(aa) + "OpenGL 2.1 is supported.\n";
                W = false;
                m = 35714;
                n = 35713;
                o = 35633;
                p = 35632;
            } else {
                aa = String.valueOf(aa) + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                W = true;
                m = 35714;
                n = 35713;
                o = 35633;
                p = 35632;
            }
        } else {
            aa = String.valueOf(aa) + "OpenGL 2.1 is " + (dt2.ey ? "" : "not ") + "supported, ";
            aa = String.valueOf(aa) + "ARB_shader_objects is " + (dt2.by ? "" : "not ") + "supported, ";
            aa = String.valueOf(aa) + "ARB_vertex_shader is " + (dt2.cI ? "" : "not ") + "supported, and ";
            aa = String.valueOf(aa) + "ARB_fragment_shader is " + (dt2.aD ? "" : "not ") + "supported.\n";
        }
        O = l && V;
        String string = GL11.v(7936).toLowerCase();
        a = string.contains("nvidia");
        ac = !dt2.ew && dt2.cG;
        P = dt2.ew || ac;
        aa = String.valueOf(aa) + "VBOs are " + (P ? "" : "not ") + "available because ";
        if (P) {
            if (ac) {
                aa = String.valueOf(aa) + "ARB_vertex_buffer_object is supported.\n";
                S = 35044;
                R = 34962;
            } else {
                aa = String.valueOf(aa) + "OpenGL 1.5 is supported.\n";
                S = 35044;
                R = 34962;
            }
        }
        if (b = string.contains("ati")) {
            if (P) {
                Q = true;
            } else {
                net.minecraft.client.b.e.f.a(16.0f);
            }
        }
        try {
            d.a.c[] arrc = new d.b().b().a();
            ab = String.format("%dx %s", arrc.length, arrc[0]).replaceAll("\\s+", " ");
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static boolean b() {
        return O;
    }

    public static String c() {
        return aa;
    }

    public static int a(int n2, int n3) {
        return W ? ARBShaderObjects.e(n2, n3) : GL20.g(n2, n3);
    }

    public static void b(int n2, int n3) {
        if (W) {
            ARBShaderObjects.b(n2, n3);
        } else {
            GL20.a(n2, n3);
        }
    }

    public static void a(int n2) {
        if (W) {
            ARBShaderObjects.a(n2);
        } else {
            GL20.d(n2);
        }
    }

    public static int b(int n2) {
        return W ? ARBShaderObjects.c(n2) : GL20.a(n2);
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        if (W) {
            ARBShaderObjects.a(n2, byteBuffer);
        } else {
            GL20.a(n2, byteBuffer);
        }
    }

    public static void c(int n2) {
        if (W) {
            ARBShaderObjects.d(n2);
        } else {
            GL20.c(n2);
        }
    }

    public static int c(int n2, int n3) {
        return W ? ARBShaderObjects.e(n2, n3) : GL20.e(n2, n3);
    }

    public static String d(int n2, int n3) {
        return W ? ARBShaderObjects.f(n2, n3) : GL20.h(n2, n3);
    }

    public static String e(int n2, int n3) {
        return W ? ARBShaderObjects.f(n2, n3) : GL20.i(n2, n3);
    }

    public static void d(int n2) {
        if (W) {
            ARBShaderObjects.f(n2);
        } else {
            GL20.g(n2);
        }
    }

    public static int d() {
        return W ? ARBShaderObjects.a() : GL20.a();
    }

    public static void e(int n2) {
        if (W) {
            ARBShaderObjects.a(n2);
        } else {
            GL20.i(n2);
        }
    }

    public static void f(int n2) {
        if (W) {
            ARBShaderObjects.e(n2);
        } else {
            GL20.f(n2);
        }
    }

    public static int a(int n2, CharSequence charSequence) {
        return W ? ARBShaderObjects.b(n2, charSequence) : GL20.b(n2, charSequence);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        if (W) {
            ARBShaderObjects.a(n2, intBuffer);
        } else {
            GL20.a(n2, intBuffer);
        }
    }

    public static void f(int n2, int n3) {
        if (W) {
            ARBShaderObjects.c(n2, n3);
        } else {
            GL20.c(n2, n3);
        }
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.a(n2, floatBuffer);
        } else {
            GL20.a(n2, floatBuffer);
        }
    }

    public static void b(int n2, IntBuffer intBuffer) {
        if (W) {
            ARBShaderObjects.b(n2, intBuffer);
        } else {
            GL20.b(n2, intBuffer);
        }
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.b(n2, floatBuffer);
        } else {
            GL20.b(n2, floatBuffer);
        }
    }

    public static void c(int n2, IntBuffer intBuffer) {
        if (W) {
            ARBShaderObjects.c(n2, intBuffer);
        } else {
            GL20.c(n2, intBuffer);
        }
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.c(n2, floatBuffer);
        } else {
            GL20.c(n2, floatBuffer);
        }
    }

    public static void d(int n2, IntBuffer intBuffer) {
        if (W) {
            ARBShaderObjects.d(n2, intBuffer);
        } else {
            GL20.d(n2, intBuffer);
        }
    }

    public static void d(int n2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.d(n2, floatBuffer);
        } else {
            GL20.d(n2, floatBuffer);
        }
    }

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.a(n2, bl2, floatBuffer);
        } else {
            GL20.a(n2, bl2, floatBuffer);
        }
    }

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.b(n2, bl2, floatBuffer);
        } else {
            GL20.b(n2, bl2, floatBuffer);
        }
    }

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (W) {
            ARBShaderObjects.c(n2, bl2, floatBuffer);
        } else {
            GL20.c(n2, bl2, floatBuffer);
        }
    }

    public static int b(int n2, CharSequence charSequence) {
        return W ? ARBVertexShader.a(n2, charSequence) : GL20.c(n2, charSequence);
    }

    public static int e() {
        return ac ? da.a() : GL15.a();
    }

    public static void g(int n2, int n3) {
        if (ac) {
            da.a(n2, n3);
        } else {
            GL15.a(n2, n3);
        }
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        if (ac) {
            da.a(n2, byteBuffer, n3);
        } else {
            GL15.a(n2, byteBuffer, n3);
        }
    }

    public static void g(int n2) {
        if (ac) {
            da.a(n2);
        } else {
            GL15.a(n2);
        }
    }

    public static boolean f() {
        return P && net.minecraft.client.r.z().w.v;
    }

    public static void h(int n2, int n3) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.j(n2, n3);
                    break;
                }
                case 2: {
                    aq.d(n2, n3);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.d(n2, n3);
                }
            }
        }
    }

    public static void i(int n2, int n3) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.g(n2, n3);
                    break;
                }
                case 2: {
                    aq.a(n2, n3);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.a(n2, n3);
                }
            }
        }
    }

    public static void h(int n2) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.b(n2);
                    break;
                }
                case 2: {
                    aq.b(n2);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.b(n2);
                }
            }
        }
    }

    public static void i(int n2) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.d(n2);
                    break;
                }
                case 2: {
                    aq.d(n2);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.d(n2);
                }
            }
        }
    }

    public static int g() {
        if (!l) {
            return -1;
        }
        switch (ay.k()[U.ordinal()]) {
            case 1: {
                return GL30.c();
            }
            case 2: {
                return aq.b();
            }
            case 3: {
                return EXTFramebufferObject.b();
            }
        }
        return -1;
    }

    public static int h() {
        if (!l) {
            return -1;
        }
        switch (ay.k()[U.ordinal()]) {
            case 1: {
                return GL30.b();
            }
            case 2: {
                return aq.a();
            }
            case 3: {
                return EXTFramebufferObject.a();
            }
        }
        return -1;
    }

    public static void a(int n2, int n3, int n4, int n5) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.d(n2, n3, n4, n5);
                    break;
                }
                case 2: {
                    aq.a(n2, n3, n4, n5);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.a(n2, n3, n4, n5);
                }
            }
        }
    }

    public static void b(int n2, int n3, int n4, int n5) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.e(n2, n3, n4, n5);
                    break;
                }
                case 2: {
                    aq.b(n2, n3, n4, n5);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.b(n2, n3, n4, n5);
                }
            }
        }
    }

    public static int j(int n2) {
        if (!l) {
            return -1;
        }
        switch (ay.k()[U.ordinal()]) {
            case 1: {
                return GL30.e(n2);
            }
            case 2: {
                return aq.e(n2);
            }
            case 3: {
                return EXTFramebufferObject.e(n2);
            }
        }
        return -1;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        if (l) {
            switch (ay.k()[U.ordinal()]) {
                case 1: {
                    GL30.e(n2, n3, n4, n5, n6);
                    break;
                }
                case 2: {
                    aq.c(n2, n3, n4, n5, n6);
                    break;
                }
                case 3: {
                    EXTFramebufferObject.b(n2, n3, n4, n5, n6);
                }
            }
        }
    }

    public static void k(int n2) {
        if (X) {
            ARBMultitexture.b(n2);
        } else {
            GL13.a(n2);
        }
    }

    public static void l(int n2) {
        if (X) {
            ARBMultitexture.a(n2);
        } else {
            GL13.b(n2);
        }
    }

    public static void a(int n2, float f2, float f3) {
        if (X) {
            ARBMultitexture.a(n2, f2, f3);
        } else {
            GL13.a(n2, f2, f3);
        }
    }

    public static void c(int n2, int n3, int n4, int n5) {
        if (Z) {
            if (M) {
                EXTBlendFuncSeparate.a(n2, n3, n4, n5);
            } else {
                GL14.a(n2, n3, n4, n5);
            }
        } else {
            GL11.a(n2, n3);
        }
    }

    public static boolean i() {
        return l && net.minecraft.client.r.z().w.g;
    }

    public static String j() {
        return ab == null ? "<unknown>" : ab;
    }

    public static void m(int n2) {
        bd.w();
        bd.a(false);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        GL11.b(4.0f);
        g2.a(1, net.minecraft.client.g.d.b.f);
        g2.b(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
        g2.b((double)n2, 0.0, 0.0).b(0, 0, 0, 255).d();
        g2.b(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
        g2.b(0.0, (double)n2, 0.0).b(0, 0, 0, 255).d();
        g2.b(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
        g2.b(0.0, 0.0, (double)n2).b(0, 0, 0, 255).d();
        ci2.b();
        GL11.b(2.0f);
        g2.a(1, net.minecraft.client.g.d.b.f);
        g2.b(0.0, 0.0, 0.0).b(255, 0, 0, 255).d();
        g2.b((double)n2, 0.0, 0.0).b(255, 0, 0, 255).d();
        g2.b(0.0, 0.0, 0.0).b(0, 255, 0, 255).d();
        g2.b(0.0, (double)n2, 0.0).b(0, 255, 0, 255).d();
        g2.b(0.0, 0.0, 0.0).b(127, 127, 255, 255).d();
        g2.b(0.0, 0.0, (double)n2).b(127, 127, 255, 255).d();
        ci2.b();
        GL11.b(1.0f);
        bd.a(true);
        bd.v();
    }

    public static void a(File file) {
        String string = file.getAbsolutePath();
        if (cb.a() == cc.d) {
            try {
                T.d(string);
                Runtime.getRuntime().exec(new String[]{"/usr/bin/open", string});
                return;
            }
            catch (IOException iOException) {
                T.b("Couldn't open file", (Throwable)iOException);
            }
        } else if (cb.a() == cc.c) {
            String string2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", string);
            try {
                Runtime.getRuntime().exec(string2);
                return;
            }
            catch (IOException iOException) {
                T.b("Couldn't open file", (Throwable)iOException);
            }
        }
        boolean bl2 = false;
        try {
            Class<?> class_ = Class.forName("java.awt.Desktop");
            Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            class_.getMethod("browse", URI.class).invoke(object, file.toURI());
        }
        catch (Throwable throwable) {
            T.b("Couldn't open link", throwable);
            bl2 = true;
        }
        if (bl2) {
            T.d("Opening via system class!");
            org.lwjgl.ab.a("file://" + string);
        }
    }

    static /* synthetic */ int[] k() {
        if (ad != null) {
            return ad;
        }
        int[] arrn = new int[net.minecraft.client.g.u.values().length];
        try {
            arrn[net.minecraft.client.g.u.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.u.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.u.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        ad = arrn;
        return arrn;
    }
}

