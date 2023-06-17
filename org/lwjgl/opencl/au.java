/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;
import org.lwjgl.opencl.a.c;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.av;
import org.lwjgl.opencl.be;
import org.lwjgl.opencl.bj;
import org.lwjgl.x;

public final class au
extends aq {
    private static final av b = (av)au.a(au.class, "CL_PLATFORM_UTIL");
    private static final be c = new be();
    private final as d;
    private Object e;

    au(long l2) {
        super(l2);
        if (this.b()) {
            c.a(l2, this);
            this.d = new as();
        } else {
            this.d = null;
        }
    }

    public static au a(long l2) {
        return (au)c.a(l2);
    }

    public ae b(long l2) {
        return (ae)this.d.a(l2);
    }

    static bj a(Class class_, String string) {
        bj bj2 = null;
        try {
            Class<?> class_2 = Class.forName("org.lwjgl.opencl.bl");
            bj2 = (bj)class_2.getDeclaredField(string).get(null);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bj2;
    }

    public static List d() {
        return au.a(null);
    }

    public static List a(c c2) {
        return b.a(c2);
    }

    public String a(int n2) {
        return b.e(this, n2);
    }

    public List b(int n2) {
        return this.a(n2, null);
    }

    public List a(int n2, c c2) {
        return b.a(this, n2, c2);
    }

    void a(Object object) {
        this.e = object;
    }

    Object e() {
        return this.e;
    }

    static void a(x x2, IntBuffer intBuffer) {
        if (x2 == null) {
            return;
        }
        int n2 = x2.e();
        int n3 = Math.min(intBuffer.get(0), x2.m());
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = x2.d(n2 + i2);
            if (c.b(l2)) continue;
            new au(l2);
        }
    }

    as f() {
        return this.d;
    }

    void b(x x2, IntBuffer intBuffer) {
        int n2 = x2.e();
        int n3 = Math.min(intBuffer.get(intBuffer.position()), x2.m());
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = x2.d(n2 + i2);
            if (this.d.b(l2)) continue;
            new ae(l2, this);
        }
    }

    void a(ByteBuffer byteBuffer, x x2) {
        int n2 = byteBuffer.position();
        int n3 = Math.min((int)x2.d(x2.e()), byteBuffer.remaining()) / x.c();
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2;
            int n4 = n2 + i2 * x.c();
            long l3 = l2 = x.b() ? byteBuffer.getLong(n4) : (long)byteBuffer.getInt(n4);
            if (this.d.b(l2)) continue;
            new ae(l2, this);
        }
    }
}

