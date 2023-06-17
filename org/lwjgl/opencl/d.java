/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import org.lwjgl.BufferUtils;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.ay;
import org.lwjgl.opencl.bf;
import org.lwjgl.opencl.e;
import org.lwjgl.opencl.f;
import org.lwjgl.opencl.g;
import org.lwjgl.opencl.h;
import org.lwjgl.opencl.i;
import org.lwjgl.opencl.j;
import org.lwjgl.opencl.k;
import org.lwjgl.opencl.l;
import org.lwjgl.opencl.m;
import org.lwjgl.opencl.n;
import org.lwjgl.opencl.p;
import org.lwjgl.opencl.q;
import org.lwjgl.opencl.r;
import org.lwjgl.x;
import org.lwjgl.z;

final class d {
    private static final int a = 256;
    private static final int b = 4;
    private static final int c = 32;
    private static final ThreadLocal d = new e();
    private static final ThreadLocal e = new i();
    private static final ThreadLocal f = new j();
    private static final ThreadLocal g = new k();
    private static final ThreadLocal h = new l();
    private static final r i = new m();
    private static final r j = new n();
    private static final r k = new org.lwjgl.opencl.o();
    private static final r l = new p();
    private static final r m = new f();
    private static final r n = new g();
    private static final r o = new h();

    private d() {
    }

    private static char[] e(int n2) {
        char[] arrc = (char[])d.get();
        if (arrc.length < n2) {
            for (int i2 = arrc.length << 1; i2 < n2; i2 <<= 1) {
            }
            arrc = new char[n2];
            d.set(arrc);
        }
        return arrc;
    }

    static ByteBuffer a(int n2) {
        ByteBuffer byteBuffer = (ByteBuffer)e.get();
        if (byteBuffer.capacity() < n2) {
            for (int i2 = byteBuffer.capacity() << 1; i2 < n2; i2 <<= 1) {
            }
            byteBuffer = BufferUtils.a(n2);
            e.set(byteBuffer);
        } else {
            byteBuffer.clear();
        }
        return byteBuffer;
    }

    private static ByteBuffer f(int n2) {
        ByteBuffer byteBuffer = (ByteBuffer)e.get();
        if (byteBuffer.capacity() < n2) {
            for (int i2 = byteBuffer.capacity() << 1; i2 < n2; i2 <<= 1) {
            }
            ByteBuffer byteBuffer2 = BufferUtils.a(n2);
            byteBuffer2.put(byteBuffer);
            byteBuffer = byteBuffer2;
            e.set(byteBuffer);
        } else {
            byteBuffer.position(byteBuffer.limit());
            byteBuffer.limit(byteBuffer.capacity());
        }
        return byteBuffer;
    }

    static x b(int n2) {
        x x2 = (x)f.get();
        if (x2.d() < n2) {
            for (int i2 = x2.d() << 1; i2 < n2; i2 <<= 1) {
            }
            x2 = BufferUtils.h(n2);
            f.set(x2);
        } else {
            x2.j();
        }
        return x2;
    }

    static ShortBuffer a() {
        return ((q)org.lwjgl.opencl.d.h.get()).a;
    }

    static IntBuffer b() {
        return ((q)org.lwjgl.opencl.d.h.get()).b;
    }

    static IntBuffer c() {
        return ((q)org.lwjgl.opencl.d.h.get()).c;
    }

    static LongBuffer d() {
        return ((q)org.lwjgl.opencl.d.h.get()).d;
    }

    static FloatBuffer e() {
        return ((q)org.lwjgl.opencl.d.h.get()).e;
    }

    static DoubleBuffer f() {
        return ((q)org.lwjgl.opencl.d.h.get()).f;
    }

    static x g() {
        return ((q)org.lwjgl.opencl.d.h.get()).g;
    }

    static x h() {
        return org.lwjgl.opencl.d.c(1);
    }

    static x c(int n2) {
        x x2 = (x)g.get();
        if (x2.d() < n2) {
            for (int i2 = x2.d(); i2 < n2; i2 <<= 1) {
            }
            x2 = BufferUtils.h(n2);
            g.set(x2);
        } else {
            x2.j();
        }
        return x2;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, CharSequence charSequence) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (org.lwjgl.d.i && '\u0080' <= c2) {
                byteBuffer.put((byte)26);
                continue;
            }
            byteBuffer.put((byte)c2);
        }
        return byteBuffer;
    }

    static String a(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        char[] arrc = org.lwjgl.opencl.d.e(n2);
        for (int i2 = byteBuffer.position(); i2 < byteBuffer.limit(); ++i2) {
            arrc[i2 - byteBuffer.position()] = (char)byteBuffer.get(i2);
        }
        return new String(arrc, 0, n2);
    }

    static long a(CharSequence charSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(org.lwjgl.opencl.d.a(charSequence.length()), charSequence);
        byteBuffer.flip();
        return org.lwjgl.o.a((Buffer)byteBuffer);
    }

    static long a(CharSequence charSequence, int n2) {
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(org.lwjgl.opencl.d.f(n2 + charSequence.length()), charSequence);
        byteBuffer.flip();
        return org.lwjgl.o.a(byteBuffer);
    }

    static long b(CharSequence charSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(org.lwjgl.opencl.d.a(charSequence.length() + 1), charSequence);
        byteBuffer.put((byte)0);
        byteBuffer.flip();
        return org.lwjgl.o.a((Buffer)byteBuffer);
    }

    static int a(CharSequence[] arrcharSequence) {
        int n2 = 0;
        for (CharSequence charSequence : arrcharSequence) {
            n2 += charSequence.length();
        }
        return n2;
    }

    static long b(CharSequence[] arrcharSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(org.lwjgl.opencl.d.a(arrcharSequence));
        for (CharSequence charSequence : arrcharSequence) {
            org.lwjgl.opencl.d.a(byteBuffer, charSequence);
        }
        byteBuffer.flip();
        return org.lwjgl.o.a((Buffer)byteBuffer);
    }

    static long c(CharSequence[] arrcharSequence) {
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(org.lwjgl.opencl.d.a(arrcharSequence) + arrcharSequence.length);
        for (CharSequence charSequence : arrcharSequence) {
            org.lwjgl.opencl.d.a(byteBuffer, charSequence);
            byteBuffer.put((byte)0);
        }
        byteBuffer.flip();
        return org.lwjgl.o.a((Buffer)byteBuffer);
    }

    static long d(CharSequence[] arrcharSequence) {
        x x2 = org.lwjgl.opencl.d.c(arrcharSequence.length);
        for (CharSequence charSequence : arrcharSequence) {
            x2.a((long)charSequence.length());
        }
        x2.k();
        return org.lwjgl.o.a(x2);
    }

    static long a(ByteBuffer[] arrbyteBuffer) {
        x x2 = org.lwjgl.opencl.d.c(arrbyteBuffer.length);
        for (ByteBuffer byteBuffer : arrbyteBuffer) {
            x2.a((long)byteBuffer.remaining());
        }
        x2.k();
        return org.lwjgl.o.a(x2);
    }

    static int a(x x2) {
        long l2 = 0L;
        for (int i2 = x2.e(); i2 < x2.g(); ++i2) {
            l2 += x2.d(i2);
        }
        return (int)l2;
    }

    static long a(z z2) {
        return org.lwjgl.o.a(org.lwjgl.opencl.d.g().a(0, z2));
    }

    static long b(z z2) {
        return org.lwjgl.o.a(org.lwjgl.opencl.d.g().a(0, z2 == null ? 0L : z2.a()));
    }

    static Set a(String string) {
        HashSet<String> hashSet = new HashSet<String>();
        if (string != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(string);
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(stringTokenizer.nextToken());
            }
        }
        return hashSet;
    }

    static boolean d(int n2) {
        switch (n2) {
            case 4225: 
            case 8198: 
            case 8199: 
            case 0x10000002: 
            case 0x10000003: {
                return true;
            }
        }
        return false;
    }

    static au b(x x2) {
        long l2;
        long l3 = 0L;
        int n2 = x2.m() / 2;
        for (int i2 = 0; i2 < n2 && (l2 = x2.d(i2 << 1)) != 0L; ++i2) {
            if (l2 != 4228L) continue;
            l3 = x2.d((i2 << 1) + 1);
            break;
        }
        if (l3 == 0L) {
            throw new IllegalArgumentException("Could not find CL_CONTEXT_PLATFORM in cl_context_properties.");
        }
        au au2 = au.a(l3);
        if (au2 == null) {
            throw new IllegalStateException("Could not find a valid CLPlatform. Make sure clGetPlatformIDs has been used before.");
        }
        return au2;
    }

    static ByteBuffer a(long l2, CLMem[] arrcLMem, long[] arrl) {
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(12 + (arrcLMem == null ? 0 : arrcLMem.length * (4 + x.c())));
        byteBuffer.putLong(0, l2);
        if (arrcLMem == null) {
            byteBuffer.putInt(8, 0);
        } else {
            byteBuffer.putInt(8, arrcLMem.length);
            int n2 = 12;
            for (int i2 = 0; i2 < arrcLMem.length; ++i2) {
                if (org.lwjgl.d.i && !arrcLMem[i2].b()) {
                    throw new IllegalArgumentException("An invalid CLMem object was specified.");
                }
                byteBuffer.putInt(n2, (int)arrl[i2]);
                n2 += 4 + x.c();
            }
        }
        return byteBuffer;
    }

    static void a(ae ae2) {
        if (!ae2.b() || ae2.n() > 1) {
            return;
        }
        org.lwjgl.opencl.d.a(ae2.h(), i);
    }

    static void a(ab ab2) {
        if (!ab2.b() || ab2.n() > 1) {
            return;
        }
        org.lwjgl.opencl.d.a(ab2.j(), o);
        org.lwjgl.opencl.d.a(ab2.i(), m);
        org.lwjgl.opencl.d.a(ab2.h(), l);
        org.lwjgl.opencl.d.a(ab2.g(), j);
        org.lwjgl.opencl.d.a(ab2.e(), k);
    }

    static void a(ay ay2) {
        if (!ay2.b() || ay2.n() > 1) {
            return;
        }
        org.lwjgl.opencl.d.a(ay2.h(), n);
    }

    static void a(org.lwjgl.opencl.z z2) {
        if (!z2.b() || z2.n() > 1) {
            return;
        }
        org.lwjgl.opencl.d.a(z2.e(), o);
    }

    private static void a(as as2, r r2) {
        if (as2.a()) {
            return;
        }
        for (bf bf2 : as2.b()) {
            ar ar2 = (ar)bf2.b;
            while (ar2.b()) {
                r2.a(ar2);
            }
        }
    }
}

