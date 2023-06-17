/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.dm;
import com.a.a.c.dn;
import com.a.a.c.do;
import com.a.a.c.dp;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

abstract class dl
extends Number {
    static final dp a = new dp();
    static final int b = Runtime.getRuntime().availableProcessors();
    volatile transient dn[] c;
    volatile transient long d;
    volatile transient int e;
    private static final Unsafe f;
    private static final long g;
    private static final long h;

    dl() {
    }

    final boolean b(long l2, long l3) {
        return f.compareAndSwapLong(this, g, l2, l3);
    }

    final boolean f() {
        return f.compareAndSwapInt(this, h, 0, 1);
    }

    abstract long a(long var1, long var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final void a(long l2, do do_, boolean bl2) {
        int n2 = do_.b;
        boolean bl3 = false;
        while (true) {
            long l3;
            int n3;
            dn[] arrdn = this.c;
            if (this.c != null && (n3 = arrdn.length) > 0) {
                dn[] arrdn2;
                dn dn2 = arrdn[n3 - 1 & n2];
                if (dn2 == null) {
                    if (this.e == 0) {
                        arrdn2 = new dn(l2);
                        if (this.e == 0 && this.f()) {
                            boolean bl4 = false;
                            try {
                                int n4;
                                int n5;
                                dn[] arrdn3 = this.c;
                                if (this.c != null && (n5 = arrdn3.length) > 0 && arrdn3[n4 = n5 - 1 & n2] == null) {
                                    arrdn3[n4] = arrdn2;
                                    bl4 = true;
                                }
                            }
                            finally {
                                this.e = 0;
                            }
                            if (!bl4) continue;
                            break;
                        }
                    }
                    bl3 = false;
                } else if (!bl2) {
                    bl2 = true;
                } else {
                    l3 = dn2.h;
                    if (dn2.a(l3, this.a(l3, l2))) break;
                    if (n3 >= b || this.c != arrdn) {
                        bl3 = false;
                    } else if (!bl3) {
                        bl3 = true;
                    } else if (this.e == 0 && this.f()) {
                        try {
                            if (this.c == arrdn) {
                                arrdn2 = new dn[n3 << 1];
                                for (int i2 = 0; i2 < n3; ++i2) {
                                    arrdn2[i2] = arrdn[i2];
                                }
                                this.c = arrdn2;
                            }
                        }
                        finally {
                            this.e = 0;
                        }
                        bl3 = false;
                        continue;
                    }
                }
                n2 ^= n2 << 13;
                n2 ^= n2 >>> 17;
                n2 ^= n2 << 5;
                continue;
            }
            if (this.e == 0 && this.c == arrdn && this.f()) {
                boolean bl5 = false;
                try {
                    if (this.c == arrdn) {
                        dn[] arrdn4 = new dn[2];
                        arrdn4[n2 & 1] = new dn(l2);
                        this.c = arrdn4;
                        bl5 = true;
                    }
                }
                finally {
                    this.e = 0;
                }
                if (!bl5) continue;
                break;
            }
            l3 = this.d;
            if (this.b(l3, this.a(l3, l2))) break;
        }
        do_.b = n2;
    }

    final void b(long l2) {
        dn[] arrdn = this.c;
        this.d = l2;
        if (arrdn != null) {
            for (dn dn2 : arrdn) {
                if (dn2 == null) continue;
                dn2.h = l2;
            }
        }
    }

    private static Unsafe a() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new dm());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    static /* synthetic */ Unsafe g() {
        return dl.a();
    }

    static {
        try {
            f = dl.a();
            Class<dl> class_ = dl.class;
            g = f.objectFieldOffset(class_.getDeclaredField("base"));
            h = f.objectFieldOffset(class_.getDeclaredField("busy"));
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

