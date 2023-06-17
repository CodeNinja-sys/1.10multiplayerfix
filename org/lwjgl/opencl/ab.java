/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.IntBuffer;
import java.util.List;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.a.c;
import org.lwjgl.opencl.ac;
import org.lwjgl.opencl.ad;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.ay;
import org.lwjgl.opencl.bb;
import org.lwjgl.opencl.z;
import org.lwjgl.opengl.eh;

public final class ab
extends ar {
    private static final ac b = (ac)au.a(ab.class, "CL_CONTEXT_UTIL");
    private final as c;
    private final as d;
    private final as e;
    private final as f;
    private final as g;
    private long h;
    private long i;

    ab(long l2, au au2) {
        super(l2, au2);
        if (this.b()) {
            this.c = new as();
            this.d = new as();
            this.e = new as();
            this.f = new as();
            this.g = new as();
        } else {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }
    }

    public z a(long l2) {
        return (z)this.c.a(l2);
    }

    public CLMem b(long l2) {
        return (CLMem)this.d.a(l2);
    }

    public bb c(long l2) {
        return (bb)this.e.a(l2);
    }

    public ay d(long l2) {
        return (ay)this.f.a(l2);
    }

    public ag e(long l2) {
        return (ag)this.g.a(l2);
    }

    public static ab a(au au2, List list, IntBuffer intBuffer) {
        return ab.a(au2, list, null, null, intBuffer);
    }

    public static ab a(au au2, List list, ad ad2, IntBuffer intBuffer) {
        return ab.a(au2, list, ad2, null, intBuffer);
    }

    public static ab a(au au2, List list, ad ad2, eh eh2, IntBuffer intBuffer) {
        return b.a(au2, list, ad2, eh2, intBuffer);
    }

    public static ab a(au au2, long l2, IntBuffer intBuffer) {
        return b.a(au2, l2, null, null, intBuffer);
    }

    public static ab a(au au2, long l2, ad ad2, IntBuffer intBuffer) {
        return b.a(au2, l2, ad2, null, intBuffer);
    }

    public static ab a(au au2, long l2, ad ad2, eh eh2, IntBuffer intBuffer) {
        return b.a(au2, l2, ad2, eh2, intBuffer);
    }

    public int a(int n2) {
        return b.a(this, n2);
    }

    public List d() {
        return b.a(this);
    }

    public List a(long l2, int n2) {
        return this.a(l2, n2, null);
    }

    public List a(long l2, int n2, c c2) {
        return b.a(this, l2, n2, c2);
    }

    as e() {
        return this.c;
    }

    as g() {
        return this.d;
    }

    as h() {
        return this.e;
    }

    as i() {
        return this.f;
    }

    as j() {
        return this.g;
    }

    private boolean c(long l2, int n2) {
        if (n2 == 0 && (l2 == 0L || this.b())) {
            return true;
        }
        if (l2 != 0L) {
            CallbackUtil.deleteGlobalRef(l2);
        }
        return false;
    }

    void f(long l2) {
        if (this.c(l2, 0)) {
            this.h = l2;
        }
    }

    void b(long l2, int n2) {
        if (this.c(l2, n2)) {
            this.i = l2;
        }
    }

    void k() {
        if (this.f() > 0) {
            return;
        }
        if (this.h != 0L) {
            CallbackUtil.deleteGlobalRef(this.h);
        }
        if (this.i != 0L) {
            CallbackUtil.deleteGlobalRef(this.i);
        }
    }
}

