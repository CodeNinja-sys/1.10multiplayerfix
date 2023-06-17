/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.df;
import com.a.a.d.qq;
import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sa;
import com.a.a.d.sr;
import java.util.concurrent.atomic.AtomicReferenceArray;

final class dd
extends sa {
    dd(qy qy2, int n2, int n3) {
        super(qy2, n2, n3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, bl bl2) {
        try {
            Object object2;
            rz rz2;
            Object object3;
            do {
                if ((rz2 = this.a(object, n2)) != null && (object3 = this.e(rz2)) != null) {
                    this.a(rz2);
                    object2 = object3;
                    return object2;
                }
                if (rz2 == null || !rz2.a().b()) {
                    boolean bl3 = true;
                    object2 = null;
                    this.lock();
                    try {
                        rz rz3;
                        this.o();
                        int n3 = this.b - 1;
                        AtomicReferenceArray atomicReferenceArray = this.e;
                        int n4 = n2 & atomicReferenceArray.length() - 1;
                        for (rz2 = rz3 = (rz)atomicReferenceArray.get(n4); rz2 != null; rz2 = rz2.b()) {
                            Object object4 = rz2.d();
                            if (rz2.c() != n2 || object4 == null || !this.a.l.a(object, object4)) continue;
                            sr sr2 = rz2.a();
                            if (sr2.b()) {
                                bl3 = false;
                                break;
                            }
                            Object object5 = rz2.a().get();
                            if (object5 == null) {
                                this.a(object4, n2, object5, qq.c);
                            } else if (this.a.c() && this.a.d(rz2)) {
                                this.a(object4, n2, object5, qq.d);
                            } else {
                                this.b(rz2);
                                Object object6 = object5;
                                return object6;
                            }
                            this.k.remove(rz2);
                            this.l.remove(rz2);
                            this.b = n3;
                            break;
                        }
                        if (bl3) {
                            object2 = new df(bl2);
                            if (rz2 == null) {
                                rz2 = this.a(object, n2, rz3);
                                rz2.a((sr)object2);
                                atomicReferenceArray.set(n4, rz2);
                            } else {
                                rz2.a((sr)object2);
                            }
                        }
                    }
                    finally {
                        this.unlock();
                        this.p();
                    }
                    if (bl3) {
                        Object object7 = this.a(object, n2, rz2, (df)object2);
                        return object7;
                    }
                }
                cl.b(!Thread.holdsLock(rz2), "Recursive computation");
            } while ((object3 = rz2.a().c()) == null);
            this.a(rz2);
            object2 = object3;
            return object2;
        }
        finally {
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, rz rz2, df df2) {
        Object object2 = null;
        long l2 = System.nanoTime();
        long l3 = 0L;
        try {
            Object object3 = rz2;
            synchronized (object3) {
                object2 = df2.a(object, n2);
                l3 = System.nanoTime();
            }
            if (object2 != null && (object3 = this.a(object, n2, object2, true)) != null) {
                this.a(object, n2, object2, qq.b);
            }
            object3 = object2;
            return object3;
        }
        finally {
            if (l3 == 0L) {
                l3 = System.nanoTime();
            }
            if (object2 == null) {
                this.b(object, n2, df2);
            }
        }
    }
}

