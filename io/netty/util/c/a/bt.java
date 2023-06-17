/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.br;
import io.netty.util.c.a.bu;
import io.netty.util.c.a.bv;
import io.netty.util.c.a.bw;
import io.netty.util.c.a.by;
import io.netty.util.c.a.bz;
import io.netty.util.c.a.ca;
import io.netty.util.c.a.cb;
import io.netty.util.c.a.cc;
import io.netty.util.c.a.ce;
import io.netty.util.c.a.cf;
import io.netty.util.c.a.cg;
import io.netty.util.c.a.ci;
import io.netty.util.c.a.cj;
import io.netty.util.c.ag;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import sun.misc.Unsafe;

public class bt
extends AbstractExecutorService {
    static final ThreadLocal a;
    public static final by b;
    private static final RuntimePermission K;
    static final bt c;
    static final int d;
    private static int L;
    private static final long M = 2000000000L;
    private static final long N = 200000000L;
    private static final long O = 2000000L;
    private static final int P = 64;
    private static final int Q = 1640531527;
    private static final int R = 48;
    private static final int S = 32;
    private static final int T = 31;
    private static final int U = 16;
    private static final int V = 65535;
    private static final int W = 32767;
    private static final int X = 65534;
    private static final int Y = 126;
    private static final int Z = 32768;
    private static final int aa = Integer.MIN_VALUE;
    private static final long ab = 0x80000000L;
    private static final long ac = -281474976710656L;
    private static final long ad = 0xFFFF00000000L;
    private static final long ae = 0x100000000L;
    private static final long af = 0x1000000000000L;
    private static final int ag = 16;
    private static final int ah = 0;
    private static final int ai = -65536;
    private static final int aj = 65535;
    private static final int ak = 65536;
    private static final int al = 1;
    private static final int am = Integer.MAX_VALUE;
    private static final int an = 65536;
    private static final int ao = Integer.MIN_VALUE;
    private static final int ap = 2;
    private static final int aq = 1;
    private static final int ar = 256;
    static final int e = 0;
    static final int f = 1;
    static final int g = -1;
    volatile long h;
    volatile long i;
    volatile long j;
    volatile long k;
    volatile long l;
    volatile long m;
    volatile long n;
    volatile long o;
    volatile long p;
    volatile int q;
    volatile int r;
    final short s;
    final short t;
    cb[] u;
    final by v;
    final Thread.UncaughtExceptionHandler w;
    final String x;
    volatile Object y;
    volatile Object z;
    volatile Object A;
    volatile Object B;
    volatile Object C;
    volatile Object D;
    volatile Object E;
    volatile Object F;
    volatile Object G;
    volatile Object H;
    volatile Object I;
    volatile Object J;
    private static final Unsafe as;
    private static final long at;
    private static final long au;
    private static final int av;
    private static final int aw;
    private static final long ax;
    private static final long ay;
    private static final long az;
    private static final long aA;
    private static final long aB;

    private static void w() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(K);
        }
    }

    private static final synchronized int x() {
        return ++L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int y() {
        int n2 = 256;
        int n3;
        int n4;
        while (((n4 = this.q) & 2) != 0 || !as.compareAndSwapInt(this, ay, n4, n3 = n4 + 2)) {
            if (n2 >= 0) {
                if (io.netty.util.c.ag.b().nextInt() < 0) continue;
                --n2;
                continue;
            }
            if (!as.compareAndSwapInt(this, ay, n4, n4 | 1)) continue;
            bt bt2 = this;
            synchronized (bt2) {
                if ((this.q & 1) != 0) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {
                        try {
                            Thread.currentThread().interrupt();
                        }
                        catch (SecurityException securityException) {}
                    }
                } else {
                    this.notifyAll();
                }
            }
        }
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n2) {
        this.q = n2;
        bt bt2 = this;
        synchronized (bt2) {
            this.notifyAll();
        }
    }

    private void z() {
        int n2;
        long l2;
        int n3;
        while ((n3 = (int)((l2 = this.p) >>> 32)) < 0 && (n3 & 0x8000) != 0 && (n2 = (int)l2) >= 0) {
            long l3 = (long)(n3 + 1 & 0xFFFF | n3 + 65536 & 0xFFFF0000) << 32 | (long)n2;
            if (!as.compareAndSwapLong(this, at, l2, l3)) continue;
            Throwable throwable = null;
            cj cj2 = null;
            try {
                by by2 = this.v;
                if (by2 != null && (cj2 = by2.a(this)) != null) {
                    cj2.start();
                    break;
                }
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
            }
            this.a(cj2, throwable);
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final cb a(cj cj2) {
        int n2;
        cj2.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.w;
        if (uncaughtExceptionHandler != null) {
            cj2.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        do {
            n2 = this.r;
        } while (!as.compareAndSwapInt(this, az, n2, n2 += 1640531527) || n2 == 0);
        cb cb2 = new cb(this, cj2, this.t, n2);
        int n3 = this.q;
        if ((n3 & 2) != 0 || !as.compareAndSwapInt(this, ay, n3, n3 += 2)) {
            n3 = this.y();
        }
        int n4 = n3 & Integer.MIN_VALUE | n3 + 2 & Integer.MAX_VALUE;
        try {
            cb[] arrcb = this.u;
            if (this.u != null) {
                int n5 = arrcb.length;
                int n6 = n5 - 1;
                int n7 = n2 << 1 | 1;
                if (arrcb[n7 &= n6] != null) {
                    int n8;
                    int n9 = 0;
                    int n10 = n8 = n5 <= 4 ? 2 : (n5 >>> 1 & 0xFFFE) + 2;
                    while (arrcb[n7 = n7 + n8 & n6] != null) {
                        if (++n9 < n5) continue;
                        this.u = arrcb = Arrays.copyOf(arrcb, n5 <<= 1);
                        n6 = n5 - 1;
                        n9 = 0;
                    }
                }
                cb2.n = (short)n7;
                cb2.j = n7;
                arrcb[n7] = cb2;
            }
        }
        finally {
            if (!as.compareAndSwapInt(this, ay, n3, n4)) {
                this.a(n4);
            }
        }
        cj2.setName(this.x.concat(Integer.toString(cb2.n >>> 1)));
        return cb2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final void a(cj cj2, Throwable throwable) {
        long l2;
        cb cb2 = null;
        if (cj2 != null && (cb2 = cj2.b) != null) {
            long l3;
            cb2.p = -1;
            while (!as.compareAndSwapLong(this, ax, l3 = this.o, l3 + (long)cb2.l)) {
            }
            int n2 = this.q;
            if ((n2 & 2) != 0 || !as.compareAndSwapInt(this, ay, n2, n2 += 2)) {
                n2 = this.y();
            }
            int n3 = n2 & Integer.MIN_VALUE | n2 + 2 & Integer.MAX_VALUE;
            try {
                short s2 = cb2.n;
                cb[] arrcb = this.u;
                if (arrcb != null && s2 >= 0 && s2 < arrcb.length && arrcb[s2] == cb2) {
                    arrcb[s2] = null;
                }
            }
            finally {
                if (!as.compareAndSwapInt(this, ay, n2, n3)) {
                    this.a(n3);
                }
            }
        }
        while (!as.compareAndSwapLong(this, at, l2 = this.p, l2 - 0x1000000000000L & 0xFFFF000000000000L | l2 - 0x100000000L & 0xFFFF00000000L | l2 & 0xFFFFFFFFL)) {
        }
        if (!this.a(false, false) && cb2 != null && cb2.s != null) {
            int n4;
            int n5;
            cb2.h();
            while ((n5 = (int)((l2 = this.p) >>> 32)) < 0 && (n4 = (int)l2) >= 0) {
                if (n4 > 0) {
                    cb cb3;
                    int n6;
                    cb[] arrcb = this.u;
                    if (this.u == null || (n6 = n4 & 0xFFFF) >= arrcb.length || (cb3 = arrcb[n6]) == null) break;
                    long l4 = (long)(cb3.k & Integer.MAX_VALUE) | (long)(n5 + 65536) << 32;
                    if (cb3.j != (n4 | Integer.MIN_VALUE)) break;
                    if (!as.compareAndSwapLong(this, at, l2, l4)) continue;
                    cb3.j = n4 + 65536 & Integer.MAX_VALUE;
                    Thread thread = cb3.v;
                    if (thread == null) break;
                    as.unpark(thread);
                    break;
                }
                if ((short)n5 >= 0) break;
                this.z();
                break;
            }
        }
        if (throwable == null) {
            cc.q();
        } else {
            cc.c(throwable);
        }
    }

    final void a(cc cc2) {
        int n2;
        cb cb2;
        int n3;
        ca ca2 = (ca)a.get();
        int n4 = this.q;
        cb[] arrcb = this.u;
        if (ca2 != null && n4 > 0 && arrcb != null && (n3 = arrcb.length - 1) >= 0 && (cb2 = arrcb[n3 & (n2 = ca2.a) & 0x7E]) != null && n2 != 0 && as.compareAndSwapInt(cb2, aB, 0, 1)) {
            int n5;
            int n6;
            int n7;
            cc[] arrcc = cb2.s;
            if (cb2.s != null && (n7 = arrcc.length - 1) > (n6 = (n5 = cb2.r) - cb2.q)) {
                int n8 = ((n7 & n5) << aw) + av;
                as.putOrderedObject(arrcc, n8, cc2);
                cb2.r = n5 + 1;
                cb2.p = 0;
                if (n6 <= 1) {
                    this.a(arrcb, cb2);
                }
                return;
            }
            cb2.p = 0;
        }
        this.f(cc2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void f(cc cc2) {
        int n2 = 0;
        ca ca2 = (ca)a.get();
        while (true) {
            int n3;
            int n4;
            int n5;
            int n6;
            cb[] arrcb;
            int n7;
            block25: {
                block24: {
                    if (ca2 == null) {
                        n2 = this.r;
                        if (as.compareAndSwapInt(this, az, n2, n2 += 1640531527) && n2 != 0) {
                            ca2 = new ca(n2);
                            a.set(ca2);
                        }
                    } else if (n2 == 0) {
                        n2 = ca2.a;
                        n2 ^= n2 << 13;
                        n2 ^= n2 >>> 17;
                        n2 ^= n2 << 5;
                        ca2.a = n2;
                    }
                    if ((n7 = this.q) < 0) {
                        throw new RejectedExecutionException();
                    }
                    if (n7 == 0) break block24;
                    arrcb = this.u;
                    if (this.u != null && (n6 = arrcb.length - 1) >= 0) break block25;
                }
                n4 = (n5 = this.s) > 1 ? n5 - 1 : 1;
                n4 |= n4 >>> 1;
                n4 |= n4 >>> 2;
                n4 |= n4 >>> 4;
                n4 |= n4 >>> 8;
                n4 |= n4 >>> 16;
                n4 = n4 + 1 << 1;
                arrcb = this.u;
                cb[] arrcb2 = this.u == null || arrcb.length == 0 ? new cb[n4] : null;
                n7 = this.q;
                if ((n7 & 2) != 0 || !as.compareAndSwapInt(this, ay, n7, n7 += 2)) {
                    n7 = this.y();
                }
                arrcb = this.u;
                if ((this.u == null || arrcb.length == 0) && arrcb2 != null) {
                    this.u = arrcb2;
                }
                if (as.compareAndSwapInt(this, ay, n7, n3 = n7 & Integer.MIN_VALUE | n7 + 2 & Integer.MAX_VALUE)) continue;
                this.a(n3);
                continue;
            }
            int n8 = n2 & n6 & 0x7E;
            cb cb2 = arrcb[n8];
            if (cb2 != null) {
                if (cb2.p == 0 && as.compareAndSwapInt(cb2, aB, 0, 1)) {
                    cc[] arrcc = cb2.s;
                    n4 = cb2.r;
                    boolean bl2 = false;
                    try {
                        if (arrcc != null && arrcc.length > n4 + 1 - cb2.q || (arrcc = cb2.c()) != null) {
                            n3 = ((arrcc.length - 1 & n4) << aw) + av;
                            as.putOrderedObject(arrcc, n3, cc2);
                            cb2.r = n4 + 1;
                            bl2 = true;
                        }
                    }
                    finally {
                        cb2.p = 0;
                    }
                    if (bl2) {
                        this.a(arrcb, cb2);
                        return;
                    }
                }
                n2 = 0;
                continue;
            }
            n7 = this.q;
            if ((n7 & 2) == 0) {
                cb2 = new cb(this, null, -1, n2);
                cb2.n = (short)n8;
                n7 = this.q;
                if ((n7 & 2) != 0 || !as.compareAndSwapInt(this, ay, n7, n7 += 2)) {
                    n7 = this.y();
                }
                arrcb = this.u;
                if (this.u != null && n8 < arrcb.length && arrcb[n8] == null) {
                    arrcb[n8] = cb2;
                }
                if (as.compareAndSwapInt(this, ay, n7, n5 = n7 & Integer.MIN_VALUE | n7 + 2 & Integer.MAX_VALUE)) continue;
                this.a(n5);
                continue;
            }
            n2 = 0;
        }
    }

    final void a() {
        long l2;
        while (!as.compareAndSwapLong(this, at, l2 = this.p, l2 & 0xFFFFFFFFFFFFL | (l2 & 0xFFFF000000000000L) + 0x1000000000000L)) {
        }
    }

    final void a(cb[] arrcb, cb cb2) {
        long l2;
        int n2;
        while ((n2 = (int)((l2 = this.p) >>> 32)) < 0) {
            cb cb3;
            int n3;
            int n4 = (int)l2;
            if (n4 <= 0) {
                if ((short)n2 >= 0) break;
                this.z();
                break;
            }
            if (arrcb == null || arrcb.length <= (n3 = n4 & 0xFFFF) || (cb3 = arrcb[n3]) == null) break;
            long l3 = (long)(cb3.k & Integer.MAX_VALUE) | (long)(n2 + 65536) << 32;
            int n5 = n4 + 65536 & Integer.MAX_VALUE;
            if (cb3.j == (n4 | Integer.MIN_VALUE) && as.compareAndSwapLong(this, at, l2, l3)) {
                cb3.j = n5;
                Thread thread = cb3.v;
                if (thread == null) break;
                as.unpark(thread);
                break;
            }
            if (cb2 == null || cb2.q < cb2.r) continue;
            break;
        }
    }

    final void a(cb cb2) {
        cb2.c();
        int n2 = cb2.m;
        while (this.a(cb2, n2) == 0) {
            n2 ^= n2 << 13;
            n2 ^= n2 >>> 17;
            n2 ^= n2 << 5;
        }
    }

    private final int a(cb cb2, int n2) {
        block6: {
            int n3;
            long l2 = this.p;
            cb[] arrcb = this.u;
            if (this.u == null || (n3 = arrcb.length - 1) < 0 || cb2 == null) break block6;
            int n4 = n3 + n3 + 1;
            int n5 = cb2.j;
            do {
                int n6;
                cb cb3;
                if ((cb3 = arrcb[n2 - n4 & n3]) == null || (n6 = cb3.q) - cb3.r >= 0) continue;
                cc[] arrcc = cb3.s;
                if (cb3.s == null) continue;
                long l3 = ((arrcc.length - 1 & n6) << aw) + av;
                cc cc2 = (cc)as.getObjectVolatile(arrcc, l3);
                if (cc2 == null) break block6;
                if (n5 < 0) {
                    this.a(l2, arrcb, cb2, cb3, n6);
                    break block6;
                }
                if (cb3.q != n6 || !as.compareAndSwapObject(arrcc, l3, cc2, null)) break block6;
                as.putOrderedInt(cb3, aA, n6 + 1);
                if (n6 + 1 - cb3.r < 0) {
                    this.a(arrcb, cb3);
                }
                cb2.c(cc2);
                break block6;
            } while (--n4 >= 0);
            int n7 = (int)l2;
            if ((n5 | n7) < 0) {
                return this.a(cb2, l2, n5);
            }
            if (this.p == l2) {
                long l4 = (long)n5 | l2 - 0x1000000000000L & 0xFFFFFFFF00000000L;
                cb2.k = n7;
                cb2.j = n5 | Integer.MIN_VALUE;
                if (!as.compareAndSwapLong(this, at, l2, l4)) {
                    cb2.j = n5;
                }
            }
        }
        return 0;
    }

    private final int a(cb cb2, long l2, int n2) {
        int n3 = cb2.p;
        if (n3 >= 0 && cb2.j == n2 && this.p == l2 && !Thread.interrupted()) {
            int n4 = (int)l2;
            int n5 = (int)(l2 >>> 32);
            int n6 = (n5 >> 16) + this.s;
            if (n4 < 0 || n6 <= 0 && this.a(false, false)) {
                cb2.p = -1;
                n3 = -1;
            } else {
                int n7 = cb2.l;
                if (n7 != 0) {
                    long l3;
                    cb2.l = 0;
                    while (!as.compareAndSwapLong(this, ax, l3 = this.o, l3 + (long)n7)) {
                    }
                } else {
                    long l4;
                    long l5;
                    long l6;
                    long l7 = l6 = n6 > 0 || n2 != (n4 | Integer.MIN_VALUE) ? 0L : (long)(cb2.k & Integer.MAX_VALUE) | (long)(n5 + 65536) << 32;
                    if (l6 != 0L) {
                        short s2 = -((short)(l2 >>> 32));
                        l5 = s2 < 0 ? 200000000L : (long)(s2 + 1) * 2000000000L;
                        l4 = System.nanoTime() + l5 - 2000000L;
                    } else {
                        l4 = 0L;
                        l5 = 0L;
                    }
                    if (cb2.j == n2 && this.p == l2) {
                        Thread thread = Thread.currentThread();
                        as.putObject(thread, au, this);
                        cb2.v = thread;
                        if (cb2.j == n2 && this.p == l2) {
                            as.park(false, l5);
                        }
                        cb2.v = null;
                        as.putObject(thread, au, null);
                        if (l5 != 0L && this.p == l2 && l4 - System.nanoTime() <= 0L && as.compareAndSwapLong(this, at, l2, l6)) {
                            cb2.p = -1;
                            n3 = -1;
                        }
                    }
                }
            }
        }
        return n3;
    }

    private final void a(long l2, cb[] arrcb, cb cb2, cb cb3, int n2) {
        cb cb4;
        int n3;
        int n4;
        if (cb2 != null && cb2.j < 0 && (n4 = (int)l2) > 0 && arrcb != null && arrcb.length > (n3 = n4 & 0xFFFF) && (cb4 = arrcb[n3]) != null && this.p == l2) {
            long l3 = (long)(cb4.k & Integer.MAX_VALUE) | (long)((int)(l2 >>> 32) + 65536) << 32;
            int n5 = n4 + 65536 & Integer.MAX_VALUE;
            if (cb3 != null && cb3.q == n2 && cb2.j < 0 && cb4.j == (n4 | Integer.MIN_VALUE) && as.compareAndSwapLong(this, at, l2, l3)) {
                cb4.j = n5;
                Thread thread = cb4.v;
                if (thread != null) {
                    as.unpark(thread);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int c(cb var1_1, cc var2_2) {
        var3_3 = 0;
        var4_4 = 0;
        if (var2_2 == null) return var3_3;
        if (var1_1 == null) return var3_3;
        if (var1_1.q - var1_1.r < 0) return var3_3;
        block0: while (true) lbl-1000:
        // 5 sources

        {
            var5_5 = var2_2;
            var6_6 = var1_1;
            while (true) {
                block9: {
                    block8: {
                        if ((var10_10 = var2_2.p) < 0) {
                            return var10_10;
                        }
                        var8_8 = this.u;
                        if (this.u == null) return var3_3;
                        var9_9 = var8_8.length - 1;
                        if (var9_9 <= 0) {
                            return var3_3;
                        }
                        var11_11 = (var6_6.m | 1) & var9_9;
                        var7_7 = var8_8[var11_11];
                        if (var7_7 != null && var7_7.x == var5_5) break block8;
                        var12_12 = var11_11;
                        do {
                            if (((var11_11 = var11_11 + 2 & var9_9) & 15) == 1 && (var5_5.p < 0 || var6_6.w != var5_5)) ** GOTO lbl-1000
                            var7_7 = var8_8[var11_11];
                            if (var7_7 == null || var7_7.x != var5_5) continue;
                            var6_6.m = var11_11;
                            break block8;
                        } while (var11_11 != var12_12);
                        return var3_3;
                    }
                    do lbl-1000:
                    // 3 sources

                    {
                        if (var5_5.p < 0) ** GOTO lbl-1000
                        var13_14 = var7_7.q;
                        if (var13_14 - var7_7.r >= 0) break block9;
                        var12_13 = var7_7.s;
                        if (var7_7.s == null) break block9;
                        var14_15 = ((var12_13.length - 1 & var13_14) << bt.aw) + bt.av;
                        var15_17 = (cc)bt.as.getObjectVolatile(var12_13, var14_15);
                        if (var5_5.p < 0 || var6_6.w != var5_5 || var7_7.x != var5_5) ** GOTO lbl-1000
                        var3_3 = 1;
                        if (var7_7.q != var13_14) ** GOTO lbl-1000
                        if (var15_17 != null) continue;
                        return var3_3;
                    } while (!bt.as.compareAndSwapObject(var12_13, var14_15, var15_17, null));
                    bt.as.putOrderedInt(var7_7, bt.aA, var13_14 + 1);
                    var16_18 = var1_1.x;
                    var17_19 = var1_1.r;
                    do {
                        var1_1.x = var15_17;
                        var15_17.o();
                    } while (var2_2.p >= 0 && var1_1.r != var17_19 && (var15_17 = var1_1.d()) != null);
                    var1_1.x = var16_18;
                    return var3_3;
                }
                var14_16 = var7_7.w;
                if (var5_5.p < 0 || var6_6.w != var5_5 || var7_7.x != var5_5) continue block0;
                if (var14_16 == null) return var3_3;
                if (++var4_4 == 64) {
                    return var3_3;
                }
                var5_5 = var14_16;
                var6_6 = var7_7;
            }
            break;
        }
    }

    private int a(cb cb2, br br2) {
        int n2;
        int n3 = 0;
        cb[] arrcb = this.u;
        if (this.u != null && (n2 = arrcb.length - 1) >= 0 && cb2 != null && br2 != null) {
            int n4 = cb2.n;
            int n5 = n2 + n2 + 1;
            long l2 = 0L;
            int n6 = n5;
            while ((n3 = br2.p) >= 0) {
                if (cb2.c(br2)) {
                    n6 = n5;
                } else {
                    n3 = br2.p;
                    if (n3 < 0) break;
                    cb cb3 = arrcb[n4 & n2];
                    if (cb3 != null && cb3.a(br2)) {
                        n6 = n5;
                    } else if (--n6 < 0) {
                        if (l2 == (l2 = this.p)) break;
                        n6 = n5;
                    }
                }
                n4 += 2;
            }
        }
        return n3;
    }

    final boolean a(long l2) {
        int n2;
        cb[] arrcb = this.u;
        short s2 = this.s;
        int n3 = (int)l2;
        if (arrcb != null && (n2 = arrcb.length - 1) >= 0 && n3 >= 0 && this.p == l2) {
            cb cb2 = arrcb[n3 & n2];
            if (n3 != 0 && cb2 != null) {
                long l3 = (long)(cb2.k & Integer.MAX_VALUE) | l2 & 0xFFFFFFFF00000000L;
                int n4 = n3 + 65536 & Integer.MAX_VALUE;
                if (cb2.j == (n3 | Integer.MIN_VALUE) && as.compareAndSwapLong(this, at, l2, l3)) {
                    cb2.j = n4;
                    Thread thread = cb2.v;
                    if (thread != null) {
                        as.unpark(thread);
                    }
                    return true;
                }
            } else {
                long l4;
                short s3 = (short)(l2 >>> 32);
                if (s3 >= 0 && (int)(l2 >> 48) + s2 > 1) {
                    long l5 = l2 - 0x1000000000000L & 0xFFFF000000000000L | l2 & 0xFFFFFFFFFFFFL;
                    if (as.compareAndSwapLong(this, at, l2, l5)) {
                        return true;
                    }
                } else if (s3 + s2 < 32767 && as.compareAndSwapLong(this, at, l2, l4 = l2 + 0x100000000L & 0xFFFF00000000L | l2 & 0xFFFF0000FFFFFFFFL)) {
                    Throwable throwable = null;
                    cj cj2 = null;
                    try {
                        by by2 = this.v;
                        if (by2 != null && (cj2 = by2.a(this)) != null) {
                            cj2.start();
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                    }
                    this.a(cj2, throwable);
                }
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final int a(cb cb2, cc cc2) {
        int n2 = 0;
        if (cc2 != null && (n2 = cc2.p) >= 0 && cb2 != null) {
            cc cc3 = cb2.w;
            cb2.w = cc2;
            while (cb2.d(cc2) && (n2 = cc2.p) >= 0) {
            }
            if (n2 >= 0 && cc2 instanceof br) {
                n2 = this.a(cb2, (br)cc2);
            }
            long l2 = 0L;
            while (n2 >= 0 && (n2 = cc2.p) >= 0) {
                long l3;
                n2 = this.c(cb2, cc2);
                if (n2 != 0 || (n2 = cc2.p) < 0) continue;
                if (!this.a(l2)) {
                    l2 = this.p;
                    continue;
                }
                if (cc2.p() && (n2 = cc2.p) >= 0) {
                    cc cc4 = cc2;
                    synchronized (cc4) {
                        if (cc2.p >= 0) {
                            try {
                                cc2.wait();
                            }
                            catch (InterruptedException interruptedException) {}
                        } else {
                            cc2.notifyAll();
                        }
                    }
                }
                while (!as.compareAndSwapLong(this, at, l3 = this.p, l3 & 0xFFFFFFFFFFFFL | (l3 & 0xFFFF000000000000L) + 0x1000000000000L)) {
                }
            }
            cb2.w = cc3;
        }
        return n2;
    }

    final void b(cb cb2, cc cc2) {
        int n2;
        if (cb2 != null && cc2 != null && (n2 = cc2.p) >= 0) {
            cc cc3 = cb2.w;
            cb2.w = cc2;
            while (cb2.d(cc2) && (n2 = cc2.p) >= 0) {
            }
            if (n2 >= 0) {
                if (cc2 instanceof br) {
                    this.a(cb2, (br)cc2);
                }
                while (cc2.p >= 0 && this.c(cb2, cc2) > 0) {
                }
            }
            cb2.w = cc3;
        }
    }

    private cb A() {
        int n2;
        int n3 = io.netty.util.c.ag.b().nextInt();
        do {
            int n4;
            n2 = this.q;
            cb[] arrcb = this.u;
            if (this.u == null || (n4 = arrcb.length - 1) < 0) continue;
            for (int i2 = n4 + 1 << 2; i2 >= 0; --i2) {
                cb cb2 = arrcb[(n3 - i2 << 1 | 1) & n4];
                if (cb2 == null || cb2.q - cb2.r >= 0) continue;
                return cb2;
            }
        } while (this.q != n2);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void b(cb cb2) {
        cc cc2 = cb2.x;
        boolean bl2 = true;
        while (true) {
            long l2;
            cc cc3;
            if ((cc3 = cb2.f()) != null) {
                cc3.o();
                continue;
            }
            cb cb3 = this.A();
            if (cb3 != null) {
                int n2;
                if (!bl2) {
                    bl2 = true;
                    while (!as.compareAndSwapLong(this, at, l2 = this.p, l2 & 0xFFFFFFFFFFFFL | (l2 & 0xFFFF000000000000L) + 0x1000000000000L)) {
                    }
                }
                if ((n2 = cb3.q) - cb3.r >= 0 || (cc3 = cb3.a(n2)) == null) continue;
                cb2.x = cc3;
                cb2.x.o();
                cb2.x = cc2;
                continue;
            }
            if (bl2) {
                l2 = this.p;
                long l3 = l2 & 0xFFFFFFFFFFFFL | (l2 & 0xFFFF000000000000L) - 0x1000000000000L;
                if ((int)(l3 >> 48) + this.s == 0) return;
                if (!as.compareAndSwapLong(this, at, l2, l3)) continue;
                bl2 = false;
                continue;
            }
            l2 = this.p;
            if ((int)(l2 >> 48) + this.s <= 0 && as.compareAndSwapLong(this, at, l2, l2 & 0xFFFFFFFFFFFFL | (l2 & 0xFFFF000000000000L) + 0x1000000000000L)) return;
        }
    }

    final cc c(cb cb2) {
        cc cc2;
        cb cb3;
        int n2;
        do {
            if ((cc2 = cb2.f()) != null) {
                return cc2;
            }
            cb3 = this.A();
            if (cb3 != null) continue;
            return null;
        } while ((n2 = cb3.q) - cb3.r >= 0 || (cc2 = cb3.a(n2)) == null);
        return cc2;
    }

    static int b() {
        Thread thread = Thread.currentThread();
        if (thread instanceof cj) {
            cj cj2 = (cj)thread;
            bt bt2 = cj2.a;
            int n2 = bt2.s;
            cb cb2 = cj2.b;
            int n3 = cb2.r - cb2.q;
            int n4 = (int)(bt2.p >> 48) + n2;
            return n3 - (n4 > (n2 >>>= 1) ? 0 : (n4 > (n2 >>>= 1) ? 1 : (n4 > (n2 >>>= 1) ? 2 : (n4 > (n2 >>>= 1) ? 4 : 8))));
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private boolean a(boolean var1_1, boolean var2_2) {
        if (this == bt.c) {
            return false;
        }
        var3_3 = this.q;
        if (var3_3 >= 0) {
            if (!var2_2) {
                return false;
            }
            if ((var3_3 & 2) != 0 || !bt.as.compareAndSwapInt(this, bt.ay, var3_3, var3_3 += 2)) {
                var3_3 = this.y();
            }
            if (!bt.as.compareAndSwapInt(this, bt.ay, var3_3, var4_4 = var3_3 + 2 & 0x7FFFFFFF | -2147483648)) {
                this.a(var4_4);
            }
        }
        block4: while (true) lbl-1000:
        // 3 sources

        {
            if (((var4_5 = this.p) & 0x80000000L) != 0L) {
                if ((short)(var4_5 >>> 32) + this.s > 0) return true;
                var6_6 = this;
                // MONITORENTER : var6_6
                this.notifyAll();
                // MONITOREXIT : var6_6
                return true;
            }
            if (!var1_1) {
                if ((int)(var4_5 >> 48) + this.s > 0) {
                    return false;
                }
                var6_7 = this.u;
                if (this.u != null) {
                    for (var8_10 = 0; var8_10 < var6_7.length; ++var8_10) {
                        var7_9 = var6_7[var8_10];
                        if (var7_9 == null || var7_9.b() && ((var8_10 & 1) == 0 || var7_9.j < 0)) continue;
                        this.a(var6_7, (cb)var7_9);
                        return false;
                    }
                }
            }
            if (!bt.as.compareAndSwapLong(this, bt.at, var4_5, var4_5 | 0x80000000L)) ** GOTO lbl-1000
            var6_8 = 0;
            while (true) {
                if (var6_8 >= 3) continue block4;
                var7_9 = this.u;
                if (this.u != null) {
                    var10_14 = ((cb[])var7_9).length;
                    for (var11_15 = 0; var11_15 < var10_14; ++var11_15) {
                        var8_11 = var7_9[var11_15];
                        if (var8_11 == null) continue;
                        var8_11.p = -1;
                        if (var6_8 <= 0) continue;
                        var8_11.h();
                        if (var6_8 <= 1 || (var9_13 = var8_11.u) == null) continue;
                        if (!var9_13.isInterrupted()) {
                            try {
                                var9_13.interrupt();
                            }
                            catch (Throwable var12_17) {
                                // empty catch block
                            }
                        }
                        bt.as.unpark(var9_13);
                    }
                    while ((var12_16 = (int)(var13_18 = this.p) & 0x7FFFFFFF) != 0 && (var11_15 = var12_16 & 65535) < var10_14 && var11_15 >= 0 && (var8_12 = var7_9[var11_15]) != null) {
                        var16_20 = (long)(var8_12.k & 0x7FFFFFFF) | var13_18 + 0x1000000000000L & -281474976710656L | var13_18 & 0xFFFF80000000L;
                        if (var8_12.j != (var12_16 | -2147483648) || !bt.as.compareAndSwapLong(this, bt.at, var13_18, var16_20)) continue;
                        var8_12.j = var12_16 + 65536 & 0x7FFFFFFF;
                        var8_12.p = -1;
                        var15_19 = var8_12.v;
                        if (var15_19 == null) continue;
                        bt.as.unpark(var15_19);
                    }
                }
                ++var6_8;
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static cb c() {
        ca ca2 = (ca)a.get();
        if (ca2 == null) return null;
        bt bt2 = c;
        if (bt2 == null) return null;
        cb[] arrcb = bt2.u;
        if (bt2.u == null) return null;
        int n2 = arrcb.length - 1;
        if (n2 < 0) return null;
        cb cb2 = arrcb[n2 & ca2.a & 0x7E];
        return cb2;
    }

    final boolean b(cc cc2) {
        int n2;
        cb cb2;
        int n3;
        ca ca2 = (ca)a.get();
        cb[] arrcb = this.u;
        boolean bl2 = false;
        if (ca2 != null && arrcb != null && (n3 = arrcb.length - 1) >= 0 && (cb2 = arrcb[ca2.a & n3 & 0x7E]) != null && cb2.q != (n2 = cb2.r)) {
            long l2;
            cc[] arrcc = cb2.s;
            if (cb2.s != null && as.getObject(arrcc, l2 = (long)(((arrcc.length - 1 & n2 - 1) << aw) + av)) == cc2 && as.compareAndSwapInt(cb2, aB, 0, 1)) {
                if (cb2.r == n2 && cb2.s == arrcc && as.compareAndSwapObject(arrcc, l2, cc2, null)) {
                    cb2.r = n2 - 1;
                    bl2 = true;
                }
                cb2.p = 0;
            }
        }
        return bl2;
    }

    final int a(br br2) {
        int n2;
        cb cb2;
        int n3;
        ca ca2 = (ca)a.get();
        cb[] arrcb = this.u;
        int n4 = 0;
        if (ca2 != null && arrcb != null && (n3 = arrcb.length - 1) >= 0 && (cb2 = arrcb[(n2 = ca2.a) & n3 & 0x7E]) != null && br2 != null) {
            int n5 = n3 + n3 + 1;
            long l2 = 0L;
            n2 |= 1;
            int n6 = n5;
            while ((n4 = br2.p) >= 0) {
                if (cb2.b(br2)) {
                    n6 = n5;
                } else {
                    n4 = br2.p;
                    if (n4 < 0) break;
                    cb cb3 = arrcb[n2 & n3];
                    if (cb3 != null && cb3.a(br2)) {
                        n6 = n5;
                    } else if (--n6 < 0) {
                        if (l2 == (l2 = this.p)) break;
                        n6 = n5;
                    }
                }
                n2 += 2;
            }
        }
        return n4;
    }

    public bt() {
        this(Math.min(32767, Runtime.getRuntime().availableProcessors()), b, null, false);
    }

    public bt(int n2) {
        this(n2, b, null, false);
    }

    public bt(int n2, by by2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean bl2) {
        this(bt.b(n2), bt.a(by2), uncaughtExceptionHandler, bl2 ? 1 : 0, "ForkJoinPool-" + bt.x() + "-worker-");
        bt.w();
    }

    private static int b(int n2) {
        if (n2 <= 0 || n2 > 32767) {
            throw new IllegalArgumentException();
        }
        return n2;
    }

    private static by a(by by2) {
        if (by2 == null) {
            throw new NullPointerException();
        }
        return by2;
    }

    private bt(int n2, by by2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int n3, String string) {
        this.x = string;
        this.v = by2;
        this.w = uncaughtExceptionHandler;
        this.t = (short)n3;
        this.s = (short)n2;
        long l2 = -n2;
        this.p = l2 << 48 & 0xFFFF000000000000L | l2 << 32 & 0xFFFF00000000L;
    }

    public static bt d() {
        return c;
    }

    public Object c(cc cc2) {
        if (cc2 == null) {
            throw new NullPointerException();
        }
        this.a(cc2);
        return cc2.s();
    }

    public void d(cc cc2) {
        if (cc2 == null) {
            throw new NullPointerException();
        }
        this.a(cc2);
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        cc cc2 = runnable instanceof cc ? (cc)((Object)runnable) : new ci(runnable);
        this.a(cc2);
    }

    public cc e(cc cc2) {
        if (cc2 == null) {
            throw new NullPointerException();
        }
        this.a(cc2);
        return cc2;
    }

    public cc a(Callable callable) {
        ce ce2 = new ce(callable);
        this.a(ce2);
        return ce2;
    }

    public cc a(Runnable runnable, Object object) {
        cf cf2 = new cf(runnable, object);
        this.a(cf2);
        return cf2;
    }

    public cc a(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        cc cc2 = runnable instanceof cc ? (cc)((Object)runnable) : new cg(runnable);
        this.a(cc2);
        return cc2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List invokeAll(Collection collection) {
        int n2;
        ArrayList<ce> arrayList = new ArrayList<ce>(collection.size());
        boolean bl2 = false;
        try {
            for (Callable callable : collection) {
                ce ce2 = new ce(callable);
                arrayList.add(ce2);
                this.a(ce2);
            }
            n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((cc)arrayList.get(i2)).y();
            }
            bl2 = true;
            ArrayList<ce> arrayList2 = arrayList;
            return arrayList2;
        }
        finally {
            if (!bl2) {
                int n3 = arrayList.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    ((Future)arrayList.get(n2)).cancel(false);
                }
            }
        }
    }

    public by e() {
        return this.v;
    }

    public Thread.UncaughtExceptionHandler f() {
        return this.w;
    }

    public int g() {
        short s2 = this.s;
        return s2 > 0 ? s2 : (short)1;
    }

    public static int h() {
        return d;
    }

    public int i() {
        return this.s + (short)(this.p >>> 32);
    }

    public boolean j() {
        return this.t == 1;
    }

    public int k() {
        int n2 = 0;
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 1; i2 < arrcb.length; i2 += 2) {
                cb cb2 = arrcb[i2];
                if (cb2 == null || !cb2.j()) continue;
                ++n2;
            }
        }
        return n2;
    }

    public int l() {
        int n2 = this.s + (int)(this.p >> 48);
        return n2 <= 0 ? 0 : n2;
    }

    public boolean m() {
        return this.s + (int)(this.p >> 48) <= 0;
    }

    public long n() {
        long l2 = this.o;
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 1; i2 < arrcb.length; i2 += 2) {
                cb cb2 = arrcb[i2];
                if (cb2 == null) continue;
                l2 += (long)cb2.l;
            }
        }
        return l2;
    }

    public long o() {
        long l2 = 0L;
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 1; i2 < arrcb.length; i2 += 2) {
                cb cb2 = arrcb[i2];
                if (cb2 == null) continue;
                l2 += (long)cb2.a();
            }
        }
        return l2;
    }

    public int p() {
        int n2 = 0;
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 0; i2 < arrcb.length; i2 += 2) {
                cb cb2 = arrcb[i2];
                if (cb2 == null) continue;
                n2 += cb2.a();
            }
        }
        return n2;
    }

    public boolean q() {
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 0; i2 < arrcb.length; i2 += 2) {
                cb cb2 = arrcb[i2];
                if (cb2 == null || cb2.b()) continue;
                return true;
            }
        }
        return false;
    }

    protected cc r() {
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 0; i2 < arrcb.length; i2 += 2) {
                cc cc2;
                cb cb2 = arrcb[i2];
                if (cb2 == null || (cc2 = cb2.e()) == null) continue;
                return cc2;
            }
        }
        return null;
    }

    protected int a(Collection collection) {
        int n2 = 0;
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (int i2 = 0; i2 < arrcb.length; ++i2) {
                cc cc2;
                cb cb2 = arrcb[i2];
                if (cb2 == null) continue;
                while ((cc2 = cb2.e()) != null) {
                    collection.add(cc2);
                    ++n2;
                }
            }
        }
        return n2;
    }

    public String toString() {
        int n2;
        int n3;
        long l2 = 0L;
        long l3 = 0L;
        int n4 = 0;
        long l4 = this.o;
        long l5 = this.p;
        cb[] arrcb = this.u;
        if (this.u != null) {
            for (n3 = 0; n3 < arrcb.length; ++n3) {
                cb cb2 = arrcb[n3];
                if (cb2 == null) continue;
                n2 = cb2.a();
                if ((n3 & 1) == 0) {
                    l3 += (long)n2;
                    continue;
                }
                l2 += (long)n2;
                l4 += (long)cb2.l;
                if (!cb2.j()) continue;
                ++n4;
            }
        }
        n3 = this.s;
        n2 = n3 + (short)(l5 >>> 32);
        int n5 = n3 + (int)(l5 >> 48);
        if (n5 < 0) {
            n5 = 0;
        }
        String string = (l5 & 0x80000000L) != 0L ? (n2 == 0 ? "Terminated" : "Terminating") : (this.q < 0 ? "Shutting down" : "Running");
        return super.toString() + "[" + string + ", parallelism = " + n3 + ", size = " + n2 + ", active = " + n5 + ", running = " + n4 + ", steals = " + l4 + ", tasks = " + l2 + ", submissions = " + l3 + "]";
    }

    @Override
    public void shutdown() {
        bt.w();
        this.a(false, true);
    }

    public List shutdownNow() {
        bt.w();
        this.a(true, true);
        return Collections.emptyList();
    }

    @Override
    public boolean isTerminated() {
        long l2 = this.p;
        return (l2 & 0x80000000L) != 0L && (short)(l2 >>> 32) + this.s <= 0;
    }

    public boolean s() {
        long l2 = this.p;
        return (l2 & 0x80000000L) != 0L && (short)(l2 >>> 32) + this.s > 0;
    }

    @Override
    public boolean isShutdown() {
        return this.q < 0;
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this == c) {
            this.a(l2, timeUnit);
            return false;
        }
        long l3 = timeUnit.toNanos(l2);
        if (this.isTerminated()) {
            return true;
        }
        if (l3 <= 0L) {
            return false;
        }
        long l4 = System.nanoTime() + l3;
        bt bt2 = this;
        synchronized (bt2) {
            while (true) {
                if (this.isTerminated()) {
                    return true;
                }
                if (l3 <= 0L) {
                    return false;
                }
                long l5 = TimeUnit.NANOSECONDS.toMillis(l3);
                this.wait(l5 > 0L ? l5 : 1L);
                l3 = l4 - System.nanoTime();
            }
        }
    }

    public boolean a(long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        Thread thread = Thread.currentThread();
        if (thread instanceof cj) {
            cj cj2 = (cj)thread;
            if (cj2.a == this) {
                this.b(cj2.b);
                return true;
            }
        }
        long l4 = System.nanoTime();
        int n2 = 0;
        boolean bl2 = true;
        block0: while (!this.m()) {
            int n3;
            cb[] arrcb = this.u;
            if (this.u == null || (n3 = arrcb.length - 1) < 0) break;
            if (!bl2) {
                if (System.nanoTime() - l4 > l3) {
                    return false;
                }
                Thread.yield();
            }
            bl2 = false;
            for (int i2 = n3 + 1 << 2; i2 >= 0; --i2) {
                int n4;
                cb cb2;
                if ((cb2 = arrcb[n2++ & n3]) == null || (n4 = cb2.q) - cb2.r >= 0) continue;
                bl2 = true;
                cc cc2 = cb2.a(n4);
                if (cc2 == null) continue block0;
                cc2.o();
                continue block0;
            }
        }
        return true;
    }

    static void t() {
        c.a(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(bz bz2) {
        Thread thread = Thread.currentThread();
        if (thread instanceof cj) {
            bt bt2 = ((cj)thread).a;
            while (!bz2.b()) {
                if (!bt2.a(bt2.p)) continue;
                try {
                    while (!bz2.b() && !bz2.a()) {
                    }
                    break;
                }
                finally {
                    bt2.a();
                }
            }
        } else {
            while (!bz2.b() && !bz2.a()) {
            }
        }
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object object) {
        return new cf(runnable, object);
    }

    protected RunnableFuture newTaskFor(Callable callable) {
        return new ce(callable);
    }

    private static bt B() {
        int n2 = -1;
        by by2 = b;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
        try {
            String string = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            String string2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            String string3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
            if (string != null) {
                n2 = Integer.parseInt(string);
            }
            if (string2 != null) {
                by2 = (by)ClassLoader.getSystemClassLoader().loadClass(string2).newInstance();
            }
            if (string3 != null) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)ClassLoader.getSystemClassLoader().loadClass(string3).newInstance();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (n2 < 0 && (n2 = Runtime.getRuntime().availableProcessors() - 1) < 0) {
            n2 = 0;
        }
        if (n2 > 32767) {
            n2 = 32767;
        }
        return new bt(n2, by2, uncaughtExceptionHandler, 0, "ForkJoinPool.commonPool-worker-");
    }

    private static Unsafe C() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new bv());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    public /* synthetic */ Future submit(Callable callable) {
        return this.a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.a(runnable, object);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return this.a(runnable);
    }

    static /* synthetic */ Unsafe u() {
        return bt.C();
    }

    static /* synthetic */ bt v() {
        return bt.B();
    }

    static {
        try {
            as = bt.C();
            Class<bt> class_ = bt.class;
            at = as.objectFieldOffset(class_.getDeclaredField("ctl"));
            ax = as.objectFieldOffset(class_.getDeclaredField("stealCount"));
            ay = as.objectFieldOffset(class_.getDeclaredField("plock"));
            az = as.objectFieldOffset(class_.getDeclaredField("indexSeed"));
            Class<Thread> class_2 = Thread.class;
            au = as.objectFieldOffset(class_2.getDeclaredField("parkBlocker"));
            Class<cb> class_3 = cb.class;
            aA = as.objectFieldOffset(class_3.getDeclaredField("base"));
            aB = as.objectFieldOffset(class_3.getDeclaredField("qlock"));
            Class<cc[]> class_4 = cc[].class;
            av = as.arrayBaseOffset(class_4);
            int n2 = as.arrayIndexScale(class_4);
            if ((n2 & n2 - 1) != 0) {
                throw new Error("data type scale not a power of two");
            }
            aw = 31 - Integer.numberOfLeadingZeros(n2);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
        a = new ThreadLocal();
        b = new bw();
        K = new RuntimePermission("modifyThread");
        c = (bt)AccessController.doPrivileged(new bu());
        short s2 = bt.c.s;
        d = s2 > 0 ? s2 : (short)1;
    }
}

