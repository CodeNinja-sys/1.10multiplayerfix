/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qq;
import com.a.a.d.qx;
import com.a.a.d.qy;
import com.a.a.d.rp;
import com.a.a.d.rs;
import com.a.a.d.rz;
import com.a.a.d.sr;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class sa
extends ReentrantLock {
    final qy a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final int f;
    final ReferenceQueue g;
    final ReferenceQueue h;
    final Queue i;
    final AtomicInteger j = new AtomicInteger();
    final Queue k;
    final Queue l;

    sa(qy qy2, int n2, int n3) {
        this.a = qy2;
        this.f = n3;
        this.a(this.a(n2));
        this.g = qy2.f() ? new ReferenceQueue() : null;
        this.h = qy2.g() ? new ReferenceQueue() : null;
        this.i = qy2.b() || qy2.e() ? new ConcurrentLinkedQueue() : qy.j();
        this.k = qy2.b() ? new rp() : qy.j();
        this.l = qy2.c() ? new rs() : qy.j();
    }

    AtomicReferenceArray a(int n2) {
        return new AtomicReferenceArray(n2);
    }

    void a(AtomicReferenceArray atomicReferenceArray) {
        this.d = atomicReferenceArray.length() * 3 / 4;
        if (this.d == this.f) {
            ++this.d;
        }
        this.e = atomicReferenceArray;
    }

    rz a(Object object, int n2, rz rz2) {
        return this.a.u.a(this, object, n2, rz2);
    }

    rz a(rz rz2, rz rz3) {
        if (rz2.d() == null) {
            return null;
        }
        sr sr2 = rz2.a();
        Object object = sr2.get();
        if (object == null && !sr2.b()) {
            return null;
        }
        rz rz4 = this.a.u.a(this, rz2, rz3);
        rz4.a(sr2.a(this.h, object, rz4));
        return rz4;
    }

    void a(rz rz2, Object object) {
        sr sr2 = this.a.o.a(this, rz2, object);
        rz2.a(sr2);
        this.c(rz2);
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
        if (this.a.f()) {
            this.c();
        }
        if (this.a.g()) {
            this.d();
        }
    }

    void c() {
        Reference reference;
        int n2 = 0;
        while ((reference = this.g.poll()) != null) {
            rz rz2 = (rz)((Object)reference);
            this.a.a(rz2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void d() {
        Reference reference;
        int n2 = 0;
        while ((reference = this.h.poll()) != null) {
            sr sr2 = (sr)((Object)reference);
            this.a.a(sr2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void e() {
        if (this.a.f()) {
            this.f();
        }
        if (this.a.g()) {
            this.g();
        }
    }

    void f() {
        while (this.g.poll() != null) {
        }
    }

    void g() {
        while (this.h.poll() != null) {
        }
    }

    void a(rz rz2) {
        if (this.a.e()) {
            this.a(rz2, this.a.q);
        }
        this.i.add(rz2);
    }

    void b(rz rz2) {
        this.k.add(rz2);
        if (this.a.e()) {
            this.a(rz2, this.a.q);
            this.l.add(rz2);
        }
    }

    void c(rz rz2) {
        this.h();
        this.k.add(rz2);
        if (this.a.c()) {
            long l2 = this.a.e() ? this.a.q : this.a.r;
            this.a(rz2, l2);
            this.l.add(rz2);
        }
    }

    void h() {
        rz rz2;
        while ((rz2 = (rz)this.i.poll()) != null) {
            if (this.k.contains(rz2)) {
                this.k.add(rz2);
            }
            if (!this.a.e() || !this.l.contains(rz2)) continue;
            this.l.add(rz2);
        }
    }

    void a(rz rz2, long l2) {
        rz2.a(this.a.v.a() + l2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void i() {
        if (this.tryLock()) {
            try {
                this.j();
            }
            finally {
                this.unlock();
            }
        }
    }

    void j() {
        rz rz2;
        this.h();
        if (this.l.isEmpty()) {
            return;
        }
        long l2 = this.a.v.a();
        while ((rz2 = (rz)this.l.peek()) != null && this.a.a(rz2, l2)) {
            if (!this.a(rz2, rz2.c(), qq.d)) {
                throw new AssertionError();
            }
        }
    }

    void a(rz rz2, qq qq2) {
        this.a(rz2.d(), rz2.c(), rz2.a().get(), qq2);
    }

    void a(Object object, int n2, Object object2, qq qq2) {
        if (this.a.s != qy.x) {
            qx qx2 = new qx(object, object2, qq2);
            this.a.s.offer(qx2);
        }
    }

    boolean k() {
        if (this.a.b() && this.b >= this.f) {
            this.h();
            rz rz2 = (rz)this.k.remove();
            if (!this.a(rz2, rz2.c(), qq.e)) {
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    rz b(int n2) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        return (rz)atomicReferenceArray.get(n2 & atomicReferenceArray.length() - 1);
    }

    rz a(Object object, int n2) {
        if (this.b != 0) {
            for (rz rz2 = this.b(n2); rz2 != null; rz2 = rz2.b()) {
                if (rz2.c() != n2) continue;
                Object object2 = rz2.d();
                if (object2 == null) {
                    this.a();
                    continue;
                }
                if (!this.a.l.a(object, object2)) continue;
                return rz2;
            }
        }
        return null;
    }

    rz b(Object object, int n2) {
        rz rz2 = this.a(object, n2);
        if (rz2 == null) {
            return null;
        }
        if (this.a.c() && this.a.d(rz2)) {
            this.i();
            return null;
        }
        return rz2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object c(Object object, int n2) {
        try {
            rz rz2 = this.b(object, n2);
            if (rz2 == null) {
                Object var4_4 = null;
                return var4_4;
            }
            Object object2 = rz2.a().get();
            if (object2 != null) {
                this.a(rz2);
            } else {
                this.a();
            }
            Object object3 = object2;
            return object3;
        }
        finally {
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean d(Object object, int n2) {
        try {
            if (this.b != 0) {
                rz rz2 = this.b(object, n2);
                if (rz2 == null) {
                    boolean bl2 = false;
                    return bl2;
                }
                boolean bl3 = rz2.a().get() != null;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object) {
        try {
            if (this.b != 0) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int n2 = atomicReferenceArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    for (rz rz2 = (rz)atomicReferenceArray.get(i2); rz2 != null; rz2 = rz2.b()) {
                        Object object2 = this.e(rz2);
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
            this.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, Object object2, boolean bl2) {
        this.lock();
        try {
            Object object3;
            rz rz2;
            rz rz3;
            this.o();
            int n3 = this.b + 1;
            if (n3 > this.d) {
                this.l();
                n3 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (rz3 = rz2 = (rz)atomicReferenceArray.get(n4); rz3 != null; rz3 = rz3.b()) {
                object3 = rz3.d();
                if (rz3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                sr sr2 = rz3.a();
                Object object4 = sr2.get();
                if (object4 == null) {
                    ++this.c;
                    this.a(rz3, object2);
                    if (!sr2.b()) {
                        this.a(object, n2, object4, qq.c);
                        n3 = this.b;
                    } else if (this.k()) {
                        n3 = this.b + 1;
                    }
                    this.b = n3;
                    Object var13_13 = null;
                    return var13_13;
                }
                if (bl2) {
                    this.b(rz3);
                    Object object5 = object4;
                    return object5;
                }
                ++this.c;
                this.a(object, n2, object4, qq.b);
                this.a(rz3, object2);
                Object object6 = object4;
                return object6;
            }
            ++this.c;
            rz3 = this.a(object, n2, rz2);
            this.a(rz3, object2);
            atomicReferenceArray.set(n4, rz3);
            if (this.k()) {
                n3 = this.b + 1;
            }
            this.b = n3;
            object3 = null;
            return object3;
        }
        finally {
            this.unlock();
            this.p();
        }
    }

    void l() {
        AtomicReferenceArray atomicReferenceArray = this.e;
        int n2 = atomicReferenceArray.length();
        if (n2 >= 0x40000000) {
            return;
        }
        int n3 = this.b;
        AtomicReferenceArray atomicReferenceArray2 = this.a(n2 << 1);
        this.d = atomicReferenceArray2.length() * 3 / 4;
        int n4 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5;
            rz rz2;
            rz rz3 = (rz)atomicReferenceArray.get(i2);
            if (rz3 == null) continue;
            rz rz4 = rz3.b();
            int n6 = rz3.c() & n4;
            if (rz4 == null) {
                atomicReferenceArray2.set(n6, rz3);
                continue;
            }
            rz rz5 = rz3;
            int n7 = n6;
            for (rz2 = rz4; rz2 != null; rz2 = rz2.b()) {
                n5 = rz2.c() & n4;
                if (n5 == n7) continue;
                n7 = n5;
                rz5 = rz2;
            }
            atomicReferenceArray2.set(n7, rz5);
            for (rz2 = rz3; rz2 != rz5; rz2 = rz2.b()) {
                n5 = rz2.c() & n4;
                rz rz6 = (rz)atomicReferenceArray2.get(n5);
                rz rz7 = this.a(rz2, rz6);
                if (rz7 != null) {
                    atomicReferenceArray2.set(n5, rz7);
                    continue;
                }
                this.d(rz2);
                --n3;
            }
        }
        this.e = atomicReferenceArray2;
        this.b = n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object, int n2, Object object2, Object object3) {
        this.lock();
        try {
            rz rz2;
            this.o();
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (rz rz3 = rz2 = (rz)atomicReferenceArray.get(n3); rz3 != null; rz3 = rz3.b()) {
                Object object4 = rz3.d();
                if (rz3.c() != n2 || object4 == null || !this.a.l.a(object, object4)) continue;
                sr sr2 = rz3.a();
                Object object5 = sr2.get();
                if (object5 == null) {
                    int n4;
                    if (this.a(sr2)) {
                        n4 = this.b - 1;
                        ++this.c;
                        this.a(object4, n2, object5, qq.c);
                        rz rz4 = this.b(rz2, rz3);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, rz4);
                        this.b = n4;
                    }
                    n4 = 0;
                    return n4 != 0;
                }
                if (this.a.m.a(object2, object5)) {
                    ++this.c;
                    this.a(object, n2, object5, qq.b);
                    this.a(rz3, object3);
                    boolean bl2 = true;
                    return bl2;
                }
                this.b(rz3);
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            this.p();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object a(Object object, int n2, Object object2) {
        this.lock();
        try {
            rz rz2;
            rz rz3;
            this.o();
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (rz3 = rz2 = (rz)atomicReferenceArray.get(n3); rz3 != null; rz3 = rz3.b()) {
                Object object3 = rz3.d();
                if (rz3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                sr sr2 = rz3.a();
                Object object4 = sr2.get();
                if (object4 == null) {
                    if (this.a(sr2)) {
                        int n4 = this.b - 1;
                        ++this.c;
                        this.a(object3, n2, object4, qq.c);
                        rz rz4 = this.b(rz2, rz3);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, rz4);
                        this.b = n4;
                    }
                    Object var11_12 = null;
                    return var11_12;
                }
                ++this.c;
                this.a(object, n2, object4, qq.b);
                this.a(rz3, object2);
                Object object5 = object4;
                return object5;
            }
            rz3 = null;
            return rz3;
        }
        finally {
            this.unlock();
            this.p();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Object e(Object object, int n2) {
        this.lock();
        try {
            rz rz2;
            rz rz3;
            this.o();
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (rz3 = rz2 = (rz)atomicReferenceArray.get(n4); rz3 != null; rz3 = rz3.b()) {
                qq qq2;
                Object object2 = rz3.d();
                if (rz3.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                sr sr2 = rz3.a();
                Object object3 = sr2.get();
                if (object3 != null) {
                    qq2 = qq.a;
                } else if (this.a(sr2)) {
                    qq2 = qq.c;
                } else {
                    Object var12_12 = null;
                    return var12_12;
                }
                ++this.c;
                this.a(object2, n2, object3, qq2);
                rz rz4 = this.b(rz2, rz3);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, rz4);
                this.b = n3;
                Object object4 = object3;
                return object4;
            }
            rz3 = null;
            return rz3;
        }
        finally {
            this.unlock();
            this.p();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean b(Object object, int n2, Object object2) {
        this.lock();
        try {
            rz rz2;
            this.o();
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (rz rz3 = rz2 = (rz)atomicReferenceArray.get(n4); rz3 != null; rz3 = rz3.b()) {
                qq qq2;
                Object object3 = rz3.d();
                if (rz3.c() != n2 || object3 == null || !this.a.l.a(object, object3)) continue;
                sr sr2 = rz3.a();
                Object object4 = sr2.get();
                if (this.a.m.a(object2, object4)) {
                    qq2 = qq.a;
                } else if (this.a(sr2)) {
                    qq2 = qq.c;
                } else {
                    boolean bl2 = false;
                    return bl2;
                }
                ++this.c;
                this.a(object3, n2, object4, qq2);
                rz rz4 = this.b(rz2, rz3);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, rz4);
                this.b = n3;
                boolean bl3 = qq2 == qq.a;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            this.p();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void m() {
        if (this.b != 0) {
            this.lock();
            try {
                int n2;
                AtomicReferenceArray atomicReferenceArray = this.e;
                if (this.a.s != qy.x) {
                    for (n2 = 0; n2 < atomicReferenceArray.length(); ++n2) {
                        for (rz rz2 = (rz)atomicReferenceArray.get(n2); rz2 != null; rz2 = rz2.b()) {
                            if (rz2.a().b()) continue;
                            this.a(rz2, qq.a);
                        }
                    }
                }
                for (n2 = 0; n2 < atomicReferenceArray.length(); ++n2) {
                    atomicReferenceArray.set(n2, null);
                }
                this.e();
                this.k.clear();
                this.l.clear();
                this.j.set(0);
                ++this.c;
                this.b = 0;
            }
            finally {
                this.unlock();
                this.p();
            }
        }
    }

    rz b(rz rz2, rz rz3) {
        this.k.remove(rz3);
        this.l.remove(rz3);
        int n2 = this.b;
        rz rz4 = rz3.b();
        for (rz rz5 = rz2; rz5 != rz3; rz5 = rz5.b()) {
            rz rz6 = this.a(rz5, rz4);
            if (rz6 != null) {
                rz4 = rz6;
                continue;
            }
            this.d(rz5);
            --n2;
        }
        this.b = n2;
        return rz4;
    }

    void d(rz rz2) {
        this.a(rz2, qq.c);
        this.k.remove(rz2);
        this.l.remove(rz2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(rz rz2, int n2) {
        this.lock();
        try {
            rz rz3;
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (rz rz4 = rz3 = (rz)atomicReferenceArray.get(n4); rz4 != null; rz4 = rz4.b()) {
                if (rz4 != rz2) continue;
                ++this.c;
                this.a(rz4.d(), n2, rz4.a().get(), qq.c);
                rz rz5 = this.b(rz3, rz4);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, rz5);
                this.b = n3;
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.unlock();
            this.p();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object, int n2, sr sr2) {
        this.lock();
        try {
            rz rz2;
            int n3 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (rz rz3 = rz2 = (rz)atomicReferenceArray.get(n4); rz3 != null; rz3 = rz3.b()) {
                Object object2 = rz3.d();
                if (rz3.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                sr sr3 = rz3.a();
                if (sr3 == sr2) {
                    ++this.c;
                    this.a(object, n2, sr2.get(), qq.c);
                    rz rz4 = this.b(rz2, rz3);
                    n3 = this.b - 1;
                    atomicReferenceArray.set(n4, rz4);
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
                this.p();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean b(Object object, int n2, sr sr2) {
        this.lock();
        try {
            rz rz2;
            AtomicReferenceArray atomicReferenceArray = this.e;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (rz rz3 = rz2 = (rz)atomicReferenceArray.get(n3); rz3 != null; rz3 = rz3.b()) {
                Object object2 = rz3.d();
                if (rz3.c() != n2 || object2 == null || !this.a.l.a(object, object2)) continue;
                sr sr3 = rz3.a();
                if (sr3 == sr2) {
                    rz rz4 = this.b(rz2, rz3);
                    atomicReferenceArray.set(n3, rz4);
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
            this.p();
        }
    }

    boolean a(rz rz2, int n2, qq qq2) {
        rz rz3;
        int n3 = this.b - 1;
        AtomicReferenceArray atomicReferenceArray = this.e;
        int n4 = n2 & atomicReferenceArray.length() - 1;
        for (rz rz4 = rz3 = (rz)atomicReferenceArray.get(n4); rz4 != null; rz4 = rz4.b()) {
            if (rz4 != rz2) continue;
            ++this.c;
            this.a(rz4.d(), n2, rz4.a().get(), qq2);
            rz rz5 = this.b(rz3, rz4);
            n3 = this.b - 1;
            atomicReferenceArray.set(n4, rz5);
            this.b = n3;
            return true;
        }
        return false;
    }

    boolean a(sr sr2) {
        if (sr2.b()) {
            return false;
        }
        return sr2.get() == null;
    }

    Object e(rz rz2) {
        if (rz2.d() == null) {
            this.a();
            return null;
        }
        Object object = rz2.a().get();
        if (object == null) {
            this.a();
            return null;
        }
        if (this.a.c() && this.a.d(rz2)) {
            this.i();
            return null;
        }
        return object;
    }

    void n() {
        if ((this.j.incrementAndGet() & 0x3F) == 0) {
            this.q();
        }
    }

    void o() {
        this.r();
    }

    void p() {
        this.s();
    }

    void q() {
        this.r();
        this.s();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void r() {
        if (this.tryLock()) {
            try {
                this.b();
                this.j();
                this.j.set(0);
            }
            finally {
                this.unlock();
            }
        }
    }

    void s() {
        if (!this.isHeldByCurrentThread()) {
            this.a.k();
        }
    }
}

