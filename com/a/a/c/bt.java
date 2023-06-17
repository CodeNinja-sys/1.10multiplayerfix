/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.ab;
import com.a.a.c.af;
import com.a.a.c.ao;
import com.a.a.c.at;
import com.a.a.c.bl;
import com.a.a.c.bs;
import com.a.a.c.bu;
import com.a.a.c.c;
import com.a.a.c.cg;
import com.a.a.c.co;
import com.a.a.c.cq;
import com.a.a.c.da;
import com.a.a.c.dk;
import com.a.a.n.a.dl;
import com.a.a.n.a.gk;
import com.a.a.n.a.gm;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class bt
extends ReentrantLock {
    final ao a;
    volatile int b;
    int c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final c n;

    bt(ao ao2, int n2, long l2, c c2) {
        this.a = ao2;
        this.g = l2;
        this.n = (c)cl.a(c2);
        this.a(this.a(n2));
        this.h = ao2.n() ? new ReferenceQueue() : null;
        this.i = ao2.o() ? new ReferenceQueue() : null;
        this.j = ao2.g() ? new ConcurrentLinkedQueue() : ao.r();
        this.l = ao2.h() ? new cq() : ao.r();
        this.m = ao2.g() ? new at() : ao.r();
    }

    AtomicReferenceArray a(int n2) {
        return new AtomicReferenceArray(n2);
    }

    void a(AtomicReferenceArray atomicReferenceArray) {
        this.e = atomicReferenceArray.length() * 3 / 4;
        if (!this.a.b() && (long)this.e == this.g) {
            ++this.e;
        }
        this.f = atomicReferenceArray;
    }

    bs a(Object object, int n2, bs bs2) {
        return this.a.x.a(this, cl.a(object), n2, bs2);
    }

    bs a(bs bs2, bs bs3) {
        if (bs2.d() == null) {
            return null;
        }
        cg cg2 = bs2.a();
        Object object = cg2.get();
        if (object == null && cg2.d()) {
            return null;
        }
        bs bs4 = this.a.x.a(this, bs2, bs3);
        bs4.a(cg2.a(this.i, object, bs4));
        return bs4;
    }

    void a(bs bs2, Object object, Object object2, long l2) {
        cg cg2 = bs2.a();
        int n2 = this.a.q.a(object, object2);
        cl.b(n2 >= 0, "Weights must be non-negative");
        cg cg3 = this.a.o.a(this, bs2, object2, n2);
        bs2.a(cg3);
        this.a(bs2, n2, l2);
        cg2.a(object2);
    }

    Object a(Object object, int n2, ab ab2) {
        cl.a(object);
        cl.a(ab2);
        try {
            Object object2;
            if (this.b != 0 && (object2 = this.a(object, n2)) != null) {
                long l2 = this.a.w.a();
                Object object3 = this.c((bs)object2, l2);
                if (object3 != null) {
                    this.a((bs)object2, l2);
                    this.n.a(1);
                    Object object4 = this.a((bs)object2, object, n2, object3, l2, ab2);
                    return object4;
                }
                cg cg2 = object2.a();
                if (cg2.c()) {
                    Object object5 = this.a((bs)object2, object, cg2);
                    return object5;
                }
            }
            object2 = this.b(object, n2, ab2);
            return object2;
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable instanceof Error) {
                throw new com.a.a.n.a.bt((Error)throwable);
            }
            if (throwable instanceof RuntimeException) {
                throw new gk(throwable);
            }
            throw executionException;
        }
        finally {
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object b(Object object, int n2, ab ab2) {
        bs bs2;
        cg cg2 = null;
        bl bl2 = null;
        boolean bl3 = true;
        this.lock();
        try {
            bs bs3;
            long l2 = this.a.w.a();
            this.c(l2);
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs2 = bs3 = (bs)atomicReferenceArray.get(n4); bs2 != null; bs2 = bs2.b()) {
                Object object2 = bs2.d();
                if (bs2.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                cg2 = bs2.a();
                if (cg2.c()) {
                    bl3 = false;
                    break;
                }
                Object object3 = cg2.get();
                if (object3 == null) {
                    this.a(object2, n2, cg2, da.c);
                } else if (this.a.c(bs2, l2)) {
                    this.a(object2, n2, cg2, da.d);
                } else {
                    this.b(bs2, l2);
                    this.n.a(1);
                    Object object4 = object3;
                    return object4;
                }
                this.l.remove(bs2);
                this.m.remove(bs2);
                this.b = n3;
                break;
            }
            if (bl3) {
                bl2 = new bl();
                if (bs2 == null) {
                    bs2 = this.a(object, n2, bs3);
                    bs2.a(bl2);
                    atomicReferenceArray.set(n4, bs2);
                } else {
                    bs2.a(bl2);
                }
            }
        }
        finally {
            this.unlock();
            this.n();
        }
        if (bl3) {
            try {
                bs bs4 = bs2;
                synchronized (bs4) {
                    Object object5 = this.a(object, n2, bl2, ab2);
                    return object5;
                }
            }
            finally {
                this.n.b(1);
            }
        }
        return this.a(bs2, object, cg2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(bs bs2, Object object, cg cg2) {
        if (!cg2.c()) {
            throw new AssertionError();
        }
        cl.b(!Thread.holdsLock(bs2), "Recursive load of: %s", object);
        try {
            Object object2 = cg2.e();
            if (object2 == null) {
                throw new af("CacheLoader returned null for key " + object + ".");
            }
            long l2 = this.a.w.a();
            this.a(bs2, l2);
            Object object3 = object2;
            return object3;
        }
        finally {
            this.n.b(1);
        }
    }

    Object a(Object object, int n2, bl bl2, ab ab2) {
        dl dl2 = bl2.a(object, ab2);
        return this.a(object, n2, bl2, dl2);
    }

    dl b(Object object, int n2, bl bl2, ab ab2) {
        dl dl2 = bl2.a(object, ab2);
        dl2.a(new bu(this, object, n2, bl2, dl2), ao.g);
        return dl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, bl bl2, dl dl2) {
        Object object2 = null;
        try {
            object2 = gm.a(dl2);
            if (object2 == null) {
                throw new af("CacheLoader returned null for key " + object + ".");
            }
            this.n.a(bl2.f());
            this.a(object, n2, bl2, object2);
            Object object3 = object2;
            return object3;
        }
        finally {
            if (object2 == null) {
                this.n.b(bl2.f());
                this.a(object, n2, bl2);
            }
        }
    }

    Object a(bs bs2, Object object, int n2, Object object2, long l2, ab ab2) {
        Object object3;
        if (this.a.f() && l2 - bs2.h() > this.a.t && !bs2.a().c() && (object3 = this.a(object, n2, ab2, true)) != null) {
            return object3;
        }
        return object2;
    }

    Object a(Object object, int n2, ab ab2, boolean bl2) {
        bl bl3 = this.a(object, n2, bl2);
        if (bl3 == null) {
            return null;
        }
        dl dl2 = this.b(object, n2, bl3, ab2);
        if (dl2.isDone()) {
            try {
                return gm.a(dl2);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    bl a(Object object, int n2, boolean bl2) {
        bs bs2 = null;
        this.lock();
        try {
            Object object2;
            bs bs3;
            long l2 = this.a.w.a();
            this.c(l2);
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (bs2 = bs3 = (bs)atomicReferenceArray.get(n3); bs2 != null; bs2 = bs2.b()) {
                object2 = bs2.d();
                if (bs2.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                cg cg2 = bs2.a();
                if (cg2.c() || bl2 && l2 - bs2.h() < this.a.t) {
                    bl bl3 = null;
                    return bl3;
                }
                ++this.d;
                bl bl4 = new bl(cg2);
                bs2.a(bl4);
                bl bl5 = bl4;
                return bl5;
            }
            ++this.d;
            object2 = new bl();
            bs2 = this.a(object, n2, bs3);
            bs2.a((cg)object2);
            atomicReferenceArray.set(n3, bs2);
            Object object3 = object2;
            return object3;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        if (this.tryLock()) {
            try {
                this.b();
            }
            finally {
                this.unlock();
            }
        }
    }

    void b() {
        if (this.a.n()) {
            this.c();
        }
        if (this.a.o()) {
            this.d();
        }
    }

    void c() {
        Reference reference;
        int n2 = 0;
        while ((reference = this.h.poll()) != null) {
            bs bs2 = (bs)((Object)reference);
            this.a.a(bs2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void d() {
        Reference reference;
        int n2 = 0;
        while ((reference = this.i.poll()) != null) {
            cg cg2 = (cg)((Object)reference);
            this.a.a(cg2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void e() {
        if (this.a.n()) {
            this.f();
        }
        if (this.a.o()) {
            this.g();
        }
    }

    void f() {
        while (this.h.poll() != null) {
        }
    }

    void g() {
        while (this.i.poll() != null) {
        }
    }

    void a(bs bs2, long l2) {
        if (this.a.j()) {
            bs2.a(l2);
        }
        this.j.add(bs2);
    }

    void b(bs bs2, long l2) {
        if (this.a.j()) {
            bs2.a(l2);
        }
        this.m.add(bs2);
    }

    void a(bs bs2, int n2, long l2) {
        this.h();
        this.c += n2;
        if (this.a.j()) {
            bs2.a(l2);
        }
        if (this.a.i()) {
            bs2.b(l2);
        }
        this.m.add(bs2);
        this.l.add(bs2);
    }

    void h() {
        bs bs2;
        while ((bs2 = (bs)this.j.poll()) != null) {
            if (!this.m.contains(bs2)) continue;
            this.m.add(bs2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(long l2) {
        if (this.tryLock()) {
            try {
                this.b(l2);
            }
            finally {
                this.unlock();
            }
        }
    }

    void b(long l2) {
        bs bs2;
        this.h();
        while ((bs2 = (bs)this.l.peek()) != null && this.a.c(bs2, l2)) {
            if (!this.a(bs2, bs2.c(), da.d)) {
                throw new AssertionError();
            }
        }
        while ((bs2 = (bs)this.m.peek()) != null && this.a.c(bs2, l2)) {
            if (!this.a(bs2, bs2.c(), da.d)) {
                throw new AssertionError();
            }
        }
    }

    void a(bs bs2, da da2) {
        this.a(bs2.d(), bs2.c(), bs2.a(), da2);
    }

    void a(Object object, int n2, cg cg2, da da2) {
        this.c -= cg2.a();
        if (da2.a()) {
            this.n.a();
        }
        if (this.a.u != ao.B) {
            Object object2 = cg2.get();
            dk dk2 = new dk(object, object2, da2);
            this.a.u.offer(dk2);
        }
    }

    void i() {
        if (!this.a.a()) {
            return;
        }
        this.h();
        while ((long)this.c > this.g) {
            bs bs2 = this.j();
            if (!this.a(bs2, bs2.c(), da.e)) {
                throw new AssertionError();
            }
        }
    }

    bs j() {
        for (bs bs2 : this.m) {
            int n2 = bs2.a().a();
            if (n2 <= 0) continue;
            return bs2;
        }
        throw new AssertionError();
    }

    bs b(int n2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        return (bs)atomicReferenceArray.get(n2 & atomicReferenceArray.length() - 1);
    }

    bs a(Object object, int n2) {
        for (bs bs2 = this.b(n2); bs2 != null; bs2 = bs2.b()) {
            if (bs2.c() != n2) continue;
            Object object2 = bs2.d();
            if (object2 == null) {
                this.a();
                continue;
            }
            if (!this.a.l.a(object, object2)) continue;
            return bs2;
        }
        return null;
    }

    bs a(Object object, int n2, long l2) {
        bs bs2 = this.a(object, n2);
        if (bs2 == null) {
            return null;
        }
        if (this.a.c(bs2, l2)) {
            this.a(l2);
            return null;
        }
        return bs2;
    }

    Object c(bs bs2, long l2) {
        if (bs2.d() == null) {
            this.a();
            return null;
        }
        Object object = bs2.a().get();
        if (object == null) {
            this.a();
            return null;
        }
        if (this.a.c(bs2, l2)) {
            this.a(l2);
            return null;
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object b(Object object, int n2) {
        try {
            if (this.b != 0) {
                long l2 = this.a.w.a();
                bs bs2 = this.a(object, n2, l2);
                if (bs2 == null) {
                    Object var6_6 = null;
                    return var6_6;
                }
                Object object2 = bs2.a().get();
                if (object2 != null) {
                    this.a(bs2, l2);
                    Object object3 = this.a(bs2, bs2.d(), n2, object2, l2, this.a.z);
                    return object3;
                }
                this.a();
            }
            Object var3_4 = null;
            return var3_4;
        }
        finally {
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean c(Object object, int n2) {
        try {
            if (this.b != 0) {
                long l2 = this.a.w.a();
                bs bs2 = this.a(object, n2, l2);
                if (bs2 == null) {
                    boolean bl2 = false;
                    return bl2;
                }
                boolean bl3 = bs2.a().get() != null;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object) {
        try {
            if (this.b != 0) {
                long l2 = this.a.w.a();
                AtomicReferenceArray atomicReferenceArray = this.f;
                int n2 = atomicReferenceArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    for (bs bs2 = (bs)atomicReferenceArray.get(i2); bs2 != null; bs2 = bs2.b()) {
                        Object object2 = this.c(bs2, l2);
                        if (object2 == null || !this.a.m.a(object, object2)) continue;
                        boolean bl2 = true;
                        return bl2;
                    }
                }
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, Object object2, boolean bl2) {
        this.lock();
        try {
            Object object3;
            bs bs2;
            bs bs3;
            long l2 = this.a.w.a();
            this.c(l2);
            int n3 = this.b + 1;
            if (n3 > this.e) {
                this.k();
                n3 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs3 = bs2 = (bs)atomicReferenceArray.get(n4); bs3 != null; bs3 = bs3.b()) {
                object3 = bs3.d();
                if (bs3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                cg cg2 = bs3.a();
                Object object4 = cg2.get();
                if (object4 == null) {
                    ++this.d;
                    if (cg2.d()) {
                        this.a(object, n2, cg2, da.c);
                        this.a(bs3, object, object2, l2);
                        n3 = this.b;
                    } else {
                        this.a(bs3, object, object2, l2);
                        n3 = this.b + 1;
                    }
                    this.b = n3;
                    this.i();
                    Object var15_14 = null;
                    return var15_14;
                }
                if (bl2) {
                    this.b(bs3, l2);
                    Object object5 = object4;
                    return object5;
                }
                ++this.d;
                this.a(object, n2, cg2, da.b);
                this.a(bs3, object, object2, l2);
                this.i();
                Object object6 = object4;
                return object6;
            }
            ++this.d;
            bs3 = this.a(object, n2, bs2);
            this.a(bs3, object, object2, l2);
            atomicReferenceArray.set(n4, bs3);
            this.b = n3 = this.b + 1;
            this.i();
            object3 = null;
            return object3;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    void k() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int n2 = atomicReferenceArray.length();
        if (n2 >= 0x40000000) {
            return;
        }
        int n3 = this.b;
        AtomicReferenceArray atomicReferenceArray2 = this.a(n2 << 1);
        this.e = atomicReferenceArray2.length() * 3 / 4;
        int n4 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5;
            bs bs2;
            bs bs3 = (bs)atomicReferenceArray.get(i2);
            if (bs3 == null) continue;
            bs bs4 = bs3.b();
            int n6 = bs3.c() & n4;
            if (bs4 == null) {
                atomicReferenceArray2.set(n6, bs3);
                continue;
            }
            bs bs5 = bs3;
            int n7 = n6;
            for (bs2 = bs4; bs2 != null; bs2 = bs2.b()) {
                n5 = bs2.c() & n4;
                if (n5 == n7) continue;
                n7 = n5;
                bs5 = bs2;
            }
            atomicReferenceArray2.set(n7, bs5);
            for (bs2 = bs3; bs2 != bs5; bs2 = bs2.b()) {
                n5 = bs2.c() & n4;
                bs bs6 = (bs)atomicReferenceArray2.get(n5);
                bs bs7 = this.a(bs2, bs6);
                if (bs7 != null) {
                    atomicReferenceArray2.set(n5, bs7);
                    continue;
                }
                this.a(bs2);
                --n3;
            }
        }
        this.f = atomicReferenceArray2;
        this.b = n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object, int n2, Object object2, Object object3) {
        this.lock();
        try {
            bs bs2;
            long l2 = this.a.w.a();
            this.c(l2);
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (bs bs3 = bs2 = (bs)atomicReferenceArray.get(n3); bs3 != null; bs3 = bs3.b()) {
                Object object4 = bs3.d();
                if (bs3.c() != n2 || object4 == null || !this.a.l.a(object, object4)) continue;
                cg cg2 = bs3.a();
                Object object5 = cg2.get();
                if (object5 == null) {
                    int n4;
                    if (cg2.d()) {
                        n4 = this.b - 1;
                        ++this.d;
                        bs bs4 = this.a(bs2, bs3, object4, n2, cg2, da.c);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, bs4);
                        this.b = n4;
                    }
                    n4 = 0;
                    return n4 != 0;
                }
                if (this.a.m.a(object2, object5)) {
                    ++this.d;
                    this.a(object, n2, cg2, da.b);
                    this.a(bs3, object, object3, l2);
                    this.i();
                    boolean bl2 = true;
                    return bl2;
                }
                this.b(bs3, l2);
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, Object object2) {
        this.lock();
        try {
            bs bs2;
            bs bs3;
            long l2 = this.a.w.a();
            this.c(l2);
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (bs3 = bs2 = (bs)atomicReferenceArray.get(n3); bs3 != null; bs3 = bs3.b()) {
                Object object3 = bs3.d();
                if (bs3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                cg cg2 = bs3.a();
                Object object4 = cg2.get();
                if (object4 == null) {
                    if (cg2.d()) {
                        int n4 = this.b - 1;
                        ++this.d;
                        bs bs4 = this.a(bs2, bs3, object3, n2, cg2, da.c);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, bs4);
                        this.b = n4;
                    }
                    Object var13_13 = null;
                    return var13_13;
                }
                ++this.d;
                this.a(object, n2, cg2, da.b);
                this.a(bs3, object, object2, l2);
                this.i();
                Object object5 = object4;
                return object5;
            }
            bs3 = null;
            return bs3;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object d(Object object, int n2) {
        this.lock();
        try {
            bs bs2;
            bs bs3;
            long l2 = this.a.w.a();
            this.c(l2);
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs3 = bs2 = (bs)atomicReferenceArray.get(n4); bs3 != null; bs3 = bs3.b()) {
                da da2;
                Object object2 = bs3.d();
                if (bs3.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                cg cg2 = bs3.a();
                Object object3 = cg2.get();
                if (object3 != null) {
                    da2 = da.a;
                } else if (cg2.d()) {
                    da2 = da.c;
                } else {
                    Object var14_13 = null;
                    return var14_13;
                }
                ++this.d;
                bs bs4 = this.a(bs2, bs3, object2, n2, cg2, da2);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, bs4);
                this.b = n3;
                Object object4 = object3;
                return object4;
            }
            bs3 = null;
            return bs3;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object, int n2, bl bl2, Object object2) {
        this.lock();
        try {
            bs bs2;
            bs bs3;
            long l2 = this.a.w.a();
            this.c(l2);
            int n3 = this.b + 1;
            if (n3 > this.e) {
                this.k();
                n3 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs3 = bs2 = (bs)atomicReferenceArray.get(n4); bs3 != null; bs3 = bs3.b()) {
                Object object3 = bs3.d();
                if (bs3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                cg cg2 = bs3.a();
                Object object4 = cg2.get();
                if (bl2 == cg2 || object4 == null && cg2 != ao.A) {
                    ++this.d;
                    if (bl2.d()) {
                        da da2 = object4 == null ? da.c : da.b;
                        this.a(object, n2, (cg)bl2, da2);
                        --n3;
                    }
                    this.a(bs3, object, object2, l2);
                    this.b = n3;
                    this.i();
                    boolean bl3 = true;
                    return bl3;
                }
                cg2 = new co(object2, 0);
                this.a(object, n2, cg2, da.b);
                boolean bl4 = false;
                return bl4;
            }
            ++this.d;
            bs3 = this.a(object, n2, bs2);
            this.a(bs3, object, object2, l2);
            atomicReferenceArray.set(n4, bs3);
            this.b = n3;
            this.i();
            boolean bl5 = true;
            return bl5;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean b(Object object, int n2, Object object2) {
        this.lock();
        try {
            bs bs2;
            long l2 = this.a.w.a();
            this.c(l2);
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs bs3 = bs2 = (bs)atomicReferenceArray.get(n4); bs3 != null; bs3 = bs3.b()) {
                da da2;
                Object object3 = bs3.d();
                if (bs3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                cg cg2 = bs3.a();
                Object object4 = cg2.get();
                if (this.a.m.a(object2, object4)) {
                    da2 = da.a;
                } else if (object4 == null && cg2.d()) {
                    da2 = da.c;
                } else {
                    boolean bl2 = false;
                    return bl2;
                }
                ++this.d;
                bs bs4 = this.a(bs2, bs3, object3, n2, cg2, da2);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, bs4);
                this.b = n3;
                boolean bl3 = da2 == da.a;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void l() {
        if (this.b != 0) {
            this.lock();
            try {
                int n2;
                AtomicReferenceArray atomicReferenceArray = this.f;
                for (n2 = 0; n2 < atomicReferenceArray.length(); ++n2) {
                    for (bs bs2 = (bs)atomicReferenceArray.get(n2); bs2 != null; bs2 = bs2.b()) {
                        if (!bs2.a().d()) continue;
                        this.a(bs2, da.a);
                    }
                }
                for (n2 = 0; n2 < atomicReferenceArray.length(); ++n2) {
                    atomicReferenceArray.set(n2, null);
                }
                this.e();
                this.l.clear();
                this.m.clear();
                this.k.set(0);
                ++this.d;
                this.b = 0;
            }
            finally {
                this.unlock();
                this.n();
            }
        }
    }

    bs a(bs bs2, bs bs3, Object object, int n2, cg cg2, da da2) {
        this.a(object, n2, cg2, da2);
        this.l.remove(bs3);
        this.m.remove(bs3);
        if (cg2.c()) {
            cg2.a(null);
            return bs2;
        }
        return this.b(bs2, bs3);
    }

    bs b(bs bs2, bs bs3) {
        int n2 = this.b;
        bs bs4 = bs3.b();
        for (bs bs5 = bs2; bs5 != bs3; bs5 = bs5.b()) {
            bs bs6 = this.a(bs5, bs4);
            if (bs6 != null) {
                bs4 = bs6;
                continue;
            }
            this.a(bs5);
            --n2;
        }
        this.b = n2;
        return bs4;
    }

    void a(bs bs2) {
        this.a(bs2, da.c);
        this.l.remove(bs2);
        this.m.remove(bs2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(bs bs2, int n2) {
        this.lock();
        try {
            bs bs3;
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs bs4 = bs3 = (bs)atomicReferenceArray.get(n4); bs4 != null; bs4 = bs4.b()) {
                if (bs4 != bs2) continue;
                ++this.d;
                bs bs5 = this.a(bs3, bs4, bs4.d(), n2, bs4.a(), da.c);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, bs5);
                this.b = n3;
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object, int n2, cg cg2) {
        this.lock();
        try {
            bs bs2;
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (bs bs3 = bs2 = (bs)atomicReferenceArray.get(n4); bs3 != null; bs3 = bs3.b()) {
                Object object2 = bs3.d();
                if (bs3.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                cg cg3 = bs3.a();
                if (cg3 == cg2) {
                    ++this.d;
                    bs bs4 = this.a(bs2, bs3, object2, n2, cg2, da.c);
                    n3 = this.b - 1;
                    atomicReferenceArray.set(n4, bs4);
                    this.b = n3;
                    boolean bl2 = true;
                    return bl2;
                }
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            if (!this.isHeldByCurrentThread()) {
                this.n();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object, int n2, bl bl2) {
        this.lock();
        try {
            bs bs2;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (bs bs3 = bs2 = (bs)atomicReferenceArray.get(n3); bs3 != null; bs3 = bs3.b()) {
                Object object2 = bs3.d();
                if (bs3.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                cg cg2 = bs3.a();
                if (cg2 == bl2) {
                    if (bl2.d()) {
                        bs3.a(bl2.g());
                    } else {
                        bs bs4 = this.b(bs2, bs3);
                        atomicReferenceArray.set(n3, bs4);
                    }
                    boolean bl3 = true;
                    return bl3;
                }
                boolean bl4 = false;
                return bl4;
            }
            boolean bl5 = false;
            return bl5;
        }
        finally {
            this.unlock();
            this.n();
        }
    }

    boolean a(bs bs2, int n2, da da2) {
        bs bs3;
        int n3 = this.b - 1;
        AtomicReferenceArray atomicReferenceArray = this.f;
        int n4 = n2 & atomicReferenceArray.length() - 1;
        for (bs bs4 = bs3 = (bs)atomicReferenceArray.get(n4); bs4 != null; bs4 = bs4.b()) {
            if (bs4 != bs2) continue;
            ++this.d;
            bs bs5 = this.a(bs3, bs4, bs4.d(), n2, bs4.a(), da2);
            n3 = this.b - 1;
            atomicReferenceArray.set(n4, bs5);
            this.b = n3;
            return true;
        }
        return false;
    }

    void m() {
        if ((this.k.incrementAndGet() & 0x3F) == 0) {
            this.o();
        }
    }

    void c(long l2) {
        this.d(l2);
    }

    void n() {
        this.p();
    }

    void o() {
        long l2 = this.a.w.a();
        this.d(l2);
        this.p();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void d(long l2) {
        if (this.tryLock()) {
            try {
                this.b();
                this.b(l2);
                this.k.set(0);
            }
            finally {
                this.unlock();
            }
        }
    }

    void p() {
        if (!this.isHeldByCurrentThread()) {
            this.a.s();
        }
    }
}

