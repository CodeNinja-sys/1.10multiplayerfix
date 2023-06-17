/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.bs;
import io.netty.util.c.a.cc;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

public abstract class br
extends cc {
    private static final long a = 5232453752276485070L;
    final br n;
    volatile int o;
    private static final Unsafe b;
    private static final long c;

    protected br(br br2, int n2) {
        this.n = br2;
        this.o = n2;
    }

    protected br(br br2) {
        this.n = br2;
    }

    protected br() {
        this.n = null;
    }

    public abstract void b();

    public void a(br br2) {
    }

    public boolean a(Throwable throwable, br br2) {
        return true;
    }

    public final br e() {
        return this.n;
    }

    public final int f() {
        return this.o;
    }

    public final void a(int n2) {
        this.o = n2;
    }

    public final void b(int n2) {
        int n3;
        while (!b.compareAndSwapInt(this, c, n3 = this.o, n3 + n2)) {
        }
    }

    public final boolean a(int n2, int n3) {
        return b.compareAndSwapInt(this, c, n2, n3);
    }

    public final int g() {
        int n2;
        while ((n2 = this.o) != 0 && !b.compareAndSwapInt(this, c, n2, n2 - 1)) {
        }
        return n2;
    }

    public final br h() {
        br br2;
        br br3 = this;
        while ((br2 = br3.n) != null) {
            br3 = br2;
        }
        return br3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void i() {
        var2_2 = var1_1 = this;
        do lbl-1000:
        // 3 sources

        {
            if ((var3_3 = var1_1.o) != 0) continue;
            var1_1.a(var2_2);
            var2_2 = var1_1;
            var1_1 = var2_2.n;
            if (var1_1 != null) ** GOTO lbl-1000
            var2_2.x();
            return;
        } while (!br.b.compareAndSwapInt(var1_1, br.c, var3_3, var3_3 - 1));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void j() {
        var2_2 = var1_1 = this;
        do lbl-1000:
        // 3 sources

        {
            if ((var3_3 = var1_1.o) != 0) continue;
            var2_2 = var1_1;
            var1_1 = var2_2.n;
            if (var1_1 != null) ** GOTO lbl-1000
            var2_2.x();
            return;
        } while (!br.b.compareAndSwapInt(var1_1, br.c, var3_3, var3_3 - 1));
    }

    @Override
    public void a(Object object) {
        this.b(object);
        this.a(this);
        this.x();
        br br2 = this.n;
        if (br2 != null) {
            br2.i();
        }
    }

    public final br k() {
        int n2;
        do {
            if ((n2 = this.o) != 0) continue;
            return this;
        } while (!b.compareAndSwapInt(this, c, n2, n2 - 1));
        return null;
    }

    public final br l() {
        br br2 = this.n;
        if (br2 != null) {
            return br2.k();
        }
        this.x();
        return null;
    }

    public final void m() {
        br br2 = this;
        while (true) {
            br br3;
            if ((br3 = br2.n) == null) {
                br2.x();
                return;
            }
            br2 = br3;
        }
    }

    @Override
    void a(Throwable throwable) {
        br br2;
        br br3 = br2 = this;
        while (br2.a(throwable, br3)) {
            br3 = br2;
            br2 = br3.n;
            if (br2 != null && br2.p >= 0 && br2.b(throwable) == Integer.MIN_VALUE) continue;
        }
    }

    @Override
    protected final boolean n() {
        this.b();
        return false;
    }

    @Override
    public Object c() {
        return null;
    }

    @Override
    protected void b(Object object) {
    }

    private static Unsafe a() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new bs());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    static {
        try {
            b = br.a();
            c = b.objectFieldOffset(br.class.getDeclaredField("o"));
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

