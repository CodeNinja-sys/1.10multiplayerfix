/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.br;
import io.netty.util.c.a.bt;
import io.netty.util.c.a.bx;
import io.netty.util.c.a.cc;
import io.netty.util.c.a.cj;
import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

final class cb {
    static final int a = 8192;
    static final int b = 0x4000000;
    volatile long c;
    volatile long d;
    volatile long e;
    volatile long f;
    volatile long g;
    volatile long h;
    volatile long i;
    volatile int j;
    int k;
    int l;
    int m;
    short n;
    final short o;
    volatile int p;
    volatile int q;
    int r;
    cc[] s;
    final bt t;
    final cj u;
    volatile Thread v;
    volatile cc w;
    cc x;
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
    volatile Object K;
    volatile Object L;
    private static final Unsafe M;
    private static final long N;
    private static final long O;
    private static final int P;
    private static final int Q;

    cb(bt bt2, cj cj2, int n2, int n3) {
        this.t = bt2;
        this.u = cj2;
        this.o = (short)n2;
        this.m = n3;
        this.r = 4096;
        this.q = 4096;
    }

    final int a() {
        int n2 = this.q - this.r;
        return n2 >= 0 ? 0 : -n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean b() {
        int n2 = this.r;
        int n3 = this.q - n2;
        if (n3 >= 0) return true;
        if (n3 != -1) return false;
        cc[] arrcc = this.s;
        if (this.s == null) return true;
        int n4 = arrcc.length - 1;
        if (n4 < 0) return true;
        if (M.getObject(arrcc, (long)((n4 & n2 - 1) << Q) + (long)P) != null) return false;
        return true;
    }

    final void a(cc cc2) {
        int n2 = this.r;
        cc[] arrcc = this.s;
        if (this.s != null) {
            int n3 = arrcc.length - 1;
            M.putOrderedObject(arrcc, ((n3 & n2) << Q) + P, cc2);
            this.r = n2 + 1;
            int n4 = this.r - this.q;
            if (n4 <= 2) {
                bt bt2 = this.t;
                bt2.a(bt2.u, this);
            } else if (n4 >= n3) {
                this.c();
            }
        }
    }

    final cc[] c() {
        int n2;
        int n3;
        int n4;
        int n5;
        cc[] arrcc = this.s;
        int n6 = n5 = arrcc != null ? arrcc.length << 1 : 8192;
        if (n5 > 0x4000000) {
            throw new RejectedExecutionException("Queue capacity exceeded");
        }
        this.s = new cc[n5];
        cc[] arrcc2 = this.s;
        if (arrcc != null && (n4 = arrcc.length - 1) >= 0 && (n3 = this.r) - (n2 = this.q) > 0) {
            int n7 = n5 - 1;
            do {
                int n8 = ((n2 & n4) << Q) + P;
                int n9 = ((n2 & n7) << Q) + P;
                cc cc2 = (cc)M.getObjectVolatile(arrcc, n8);
                if (cc2 == null || !M.compareAndSwapObject(arrcc, n8, cc2, null)) continue;
                M.putObjectVolatile(arrcc2, n9, cc2);
            } while (++n2 != n3);
        }
        return arrcc2;
    }

    final cc d() {
        int n2;
        cc[] arrcc = this.s;
        if (this.s != null && (n2 = arrcc.length - 1) >= 0) {
            long l2;
            cc cc2;
            int n3;
            while ((n3 = this.r - 1) - this.q >= 0 && (cc2 = (cc)M.getObject(arrcc, l2 = (long)(((n2 & n3) << Q) + P))) != null) {
                if (!M.compareAndSwapObject(arrcc, l2, cc2, null)) continue;
                this.r = n3;
                return cc2;
            }
        }
        return null;
    }

    final cc a(int n2) {
        int n3;
        cc cc2;
        cc[] arrcc = this.s;
        if (this.s != null && (cc2 = (cc)M.getObjectVolatile(arrcc, n3 = ((arrcc.length - 1 & n2) << Q) + P)) != null && this.q == n2 && M.compareAndSwapObject(arrcc, n3, cc2, null)) {
            M.putOrderedInt(this, N, n2 + 1);
            return cc2;
        }
        return null;
    }

    final cc e() {
        int n2;
        while ((n2 = this.q) - this.r < 0) {
            cc[] arrcc = this.s;
            if (this.s == null) break;
            int n3 = ((arrcc.length - 1 & n2) << Q) + P;
            cc cc2 = (cc)M.getObjectVolatile(arrcc, n3);
            if (cc2 != null) {
                if (!M.compareAndSwapObject(arrcc, n3, cc2, null)) continue;
                M.putOrderedInt(this, N, n2 + 1);
                return cc2;
            }
            if (this.q != n2) continue;
            if (n2 + 1 == this.r) break;
            Thread.yield();
        }
        return null;
    }

    final cc f() {
        return this.o == 0 ? this.d() : this.e();
    }

    final cc g() {
        int n2;
        cc[] arrcc = this.s;
        if (arrcc == null || (n2 = arrcc.length - 1) < 0) {
            return null;
        }
        int n3 = this.o == 0 ? this.r - 1 : this.q;
        int n4 = ((n3 & n2) << Q) + P;
        return (cc)M.getObjectVolatile(arrcc, n4);
    }

    final boolean b(cc cc2) {
        int n2;
        cc[] arrcc = this.s;
        if (this.s != null && (n2 = this.r) != this.q && M.compareAndSwapObject(arrcc, ((arrcc.length - 1 & --n2) << Q) + P, cc2, null)) {
            this.r = n2;
            return true;
        }
        return false;
    }

    final void h() {
        cc cc2;
        cc.a(this.w);
        cc.a(this.x);
        while ((cc2 = this.e()) != null) {
            cc.a(cc2);
        }
    }

    final void i() {
        cc cc2;
        while ((cc2 = this.e()) != null) {
            cc2.o();
        }
    }

    final void c(cc cc2) {
        this.x = cc2;
        if (this.x != null) {
            cc2.o();
            cc[] arrcc = this.s;
            short s2 = this.o;
            ++this.l;
            this.x = null;
            if (s2 != 0) {
                this.i();
            } else if (arrcc != null) {
                long l2;
                cc cc3;
                int n2;
                int n3 = arrcc.length - 1;
                while ((n2 = this.r - 1) - this.q >= 0 && (cc3 = (cc)M.getObject(arrcc, l2 = (long)(((n3 & n2) << Q) + P))) != null) {
                    if (!M.compareAndSwapObject(arrcc, l2, cc3, null)) continue;
                    this.r = n2;
                    cc3.o();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean d(cc cc2) {
        long l2;
        cc cc3;
        if (cc2 == null) return false;
        cc[] arrcc = this.s;
        if (this.s == null) return false;
        int n2 = arrcc.length - 1;
        if (n2 < 0) return false;
        int n3 = this.r;
        int n4 = this.q;
        int n5 = n3 - n4;
        if (n5 <= 0) return false;
        boolean bl2 = false;
        boolean bl3 = true;
        boolean bl4 = true;
        while ((cc3 = (cc)M.getObject(arrcc, l2 = (long)(((--n3 & n2) << Q) + P))) != null) {
            if (cc3 == cc2) {
                if (n3 + 1 == this.r) {
                    if (!M.compareAndSwapObject(arrcc, l2, cc2, null)) break;
                    this.r = n3;
                    bl2 = true;
                    break;
                }
                if (this.q != n4) break;
                bl2 = M.compareAndSwapObject(arrcc, l2, cc2, new bx());
                break;
            }
            if (cc3.p >= 0) {
                bl3 = false;
            } else if (n3 + 1 == this.r) {
                if (!M.compareAndSwapObject(arrcc, l2, cc3, null)) break;
                this.r = n3;
                break;
            }
            if (--n5 != 0) continue;
            if (bl3 || this.q != n4) break;
            bl4 = false;
            break;
        }
        if (!bl2) return bl4;
        cc2.o();
        return bl4;
    }

    final boolean a(br br2) {
        block5: {
            int n2 = this.q;
            if (n2 - this.r >= 0) break block5;
            cc[] arrcc = this.s;
            if (this.s != null) {
                long l2 = ((arrcc.length - 1 & n2) << Q) + P;
                Object object = M.getObjectVolatile(arrcc, l2);
                if (object == null) {
                    return true;
                }
                if (object instanceof br) {
                    br br3;
                    br br4 = br3 = (br)object;
                    do {
                        if (br4 != br2) continue;
                        if (this.q == n2 && M.compareAndSwapObject(arrcc, l2, br3, null)) {
                            M.putOrderedInt(this, N, n2 + 1);
                            br3.o();
                        }
                        return true;
                    } while ((br4 = br4.n) != null);
                }
            }
        }
        return false;
    }

    final boolean b(br br2) {
        block5: {
            long l2;
            Object object;
            int n2 = this.r;
            if (this.q - n2 >= 0) break block5;
            cc[] arrcc = this.s;
            if (this.s != null && (object = M.getObject(arrcc, l2 = (long)(((arrcc.length - 1 & n2 - 1) << Q) + P))) instanceof br) {
                br br3;
                br br4 = br3 = (br)object;
                do {
                    if (br4 != br2) continue;
                    if (M.compareAndSwapInt(this, O, 0, 1)) {
                        if (this.r == n2 && this.s == arrcc && M.compareAndSwapObject(arrcc, l2, br3, null)) {
                            this.r = n2 - 1;
                            this.p = 0;
                            br3.o();
                        } else {
                            this.p = 0;
                        }
                    }
                    return true;
                } while ((br4 = br4.n) != null);
            }
        }
        return false;
    }

    final boolean c(br br2) {
        block3: {
            long l2;
            Object object;
            int n2 = this.r;
            if (this.q - n2 >= 0) break block3;
            cc[] arrcc = this.s;
            if (this.s != null && (object = M.getObject(arrcc, l2 = (long)(((arrcc.length - 1 & n2 - 1) << Q) + P))) instanceof br) {
                br br3;
                br br4 = br3 = (br)object;
                do {
                    if (br4 != br2) continue;
                    if (M.compareAndSwapObject(arrcc, l2, br3, null)) {
                        this.r = n2 - 1;
                        br3.o();
                    }
                    return true;
                } while ((br4 = br4.n) != null);
            }
        }
        return false;
    }

    final boolean j() {
        Thread.State state;
        cj cj2;
        return this.j >= 0 && (cj2 = this.u) != null && (state = cj2.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING;
    }

    static {
        try {
            M = bt.u();
            Class<cb> class_ = cb.class;
            Class<cc[]> class_2 = cc[].class;
            N = M.objectFieldOffset(class_.getDeclaredField("base"));
            O = M.objectFieldOffset(class_.getDeclaredField("qlock"));
            P = M.arrayBaseOffset(class_2);
            int n2 = M.arrayIndexScale(class_2);
            if ((n2 & n2 - 1) != 0) {
                throw new Error("data type scale not a power of two");
            }
            Q = 31 - Integer.numberOfLeadingZeros(n2);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

