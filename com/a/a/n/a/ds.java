/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.dt;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public final class ds {
    private final boolean a;
    private final ReentrantLock b;
    private dt c = null;

    public ds() {
        this(false);
    }

    public ds(boolean bl2) {
        this.a = bl2;
        this.b = new ReentrantLock(bl2);
    }

    public void a() {
        this.b.lock();
    }

    public void b() {
        this.b.lockInterruptibly();
    }

    public boolean a(long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        ReentrantLock reentrantLock = this.b;
        if (!this.a && reentrantLock.tryLock()) {
            return true;
        }
        long l4 = System.nanoTime() + l3;
        boolean bl2 = Thread.interrupted();
        while (true) {
            try {
                boolean bl3 = reentrantLock.tryLock(l3, TimeUnit.NANOSECONDS);
                return bl3;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                l3 = l4 - System.nanoTime();
                continue;
            }
            break;
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean b(long l2, TimeUnit timeUnit) {
        return this.b.tryLock(l2, timeUnit);
    }

    public boolean c() {
        return this.b.tryLock();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(dt dt2) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean bl2 = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        boolean bl3 = false;
        try {
            if (!dt2.a()) {
                this.a(dt2, bl2);
            }
            bl3 = true;
        }
        finally {
            if (!bl3) {
                this.d();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(dt dt2) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean bl2 = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        boolean bl3 = false;
        try {
            if (!dt2.a()) {
                this.b(dt2, bl2);
            }
            bl3 = true;
        }
        finally {
            if (!bl3) {
                this.d();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(dt dt2, long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean bl2 = reentrantLock.isHeldByCurrentThread();
        if (this.a || !reentrantLock.tryLock()) {
            long l4 = System.nanoTime() + l3;
            if (!reentrantLock.tryLock(l2, timeUnit)) {
                return false;
            }
            l3 = l4 - System.nanoTime();
        }
        boolean bl3 = false;
        boolean bl4 = true;
        try {
            bl3 = dt2.a() || this.a(dt2, l3, bl2);
            bl4 = false;
            boolean bl5 = bl3;
            return bl5;
        }
        finally {
            if (!bl3) {
                try {
                    if (bl4 && !bl2) {
                        this.k();
                    }
                }
                finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public boolean b(dt dt2, long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        long l4 = System.nanoTime() + l3;
        boolean bl2 = reentrantLock.isHeldByCurrentThread();
        boolean bl3 = Thread.interrupted();
        try {
            boolean bl4;
            if (this.a || !reentrantLock.tryLock()) {
                bl4 = false;
                do {
                    try {
                        bl4 = reentrantLock.tryLock(l3, TimeUnit.NANOSECONDS);
                        if (!bl4) {
                            boolean bl5 = false;
                            return bl5;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        bl3 = true;
                    }
                    l3 = l4 - System.nanoTime();
                } while (!bl4);
            }
            bl4 = false;
            while (true) {
                try {
                    bl4 = dt2.a() || this.a(dt2, l3, bl2);
                    boolean bl6 = bl4;
                    return bl6;
                }
                catch (InterruptedException interruptedException) {
                    bl3 = true;
                    bl2 = false;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            }
            finally {
                if (!bl4) {
                    reentrantLock.unlock();
                }
            }
            {
                catch (Throwable throwable) {
                    throw throwable;
                }
            }
        }
        finally {
            if (bl3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(dt dt2) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = dt2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(dt dt2) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lockInterruptibly();
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = dt2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(dt dt2, long l2, TimeUnit timeUnit) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        if (!this.a(l2, timeUnit)) {
            return false;
        }
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = dt2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                this.b.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(dt dt2, long l2, TimeUnit timeUnit) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        if (!reentrantLock.tryLock(l2, timeUnit)) {
            return false;
        }
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = dt2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean e(dt dt2) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        boolean bl2 = false;
        try {
            boolean bl3 = bl2 = dt2.a();
            return bl3;
        }
        finally {
            if (!bl2) {
                reentrantLock.unlock();
            }
        }
    }

    public void f(dt dt2) {
        if (!(dt2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (!dt2.a()) {
            this.a(dt2, true);
        }
    }

    public void g(dt dt2) {
        if (!(dt2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (!dt2.a()) {
            this.b(dt2, true);
        }
    }

    public boolean e(dt dt2, long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        if (!(dt2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        return dt2.a() || this.a(dt2, l3, true);
    }

    public boolean f(dt dt2, long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        if (!(dt2.b == this & this.b.isHeldByCurrentThread())) {
            throw new IllegalMonitorStateException();
        }
        if (dt2.a()) {
            return true;
        }
        boolean bl2 = true;
        long l4 = System.nanoTime() + l3;
        boolean bl3 = Thread.interrupted();
        while (true) {
            try {
                boolean bl4 = this.a(dt2, l3, bl2);
                return bl4;
            }
            catch (InterruptedException interruptedException) {
                bl3 = true;
                if (dt2.a()) {
                    boolean bl5 = true;
                    return bl5;
                }
                bl2 = false;
                l3 = l4 - System.nanoTime();
                continue;
            }
            break;
        }
        finally {
            if (bl3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        ReentrantLock reentrantLock = this.b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                this.k();
            }
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.b.isLocked();
    }

    public boolean g() {
        return this.b.isHeldByCurrentThread();
    }

    public int h() {
        return this.b.getHoldCount();
    }

    public int i() {
        return this.b.getQueueLength();
    }

    public boolean j() {
        return this.b.hasQueuedThreads();
    }

    public boolean a(Thread thread) {
        return this.b.hasQueuedThread(thread);
    }

    public boolean h(dt dt2) {
        return this.i(dt2) > 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int i(dt dt2) {
        if (dt2.b != this) {
            throw new IllegalMonitorStateException();
        }
        this.b.lock();
        try {
            int n2 = dt2.d;
            return n2;
        }
        finally {
            this.b.unlock();
        }
    }

    private void k() {
        dt dt2 = this.c;
        while (dt2 != null) {
            if (this.j(dt2)) {
                dt2.c.signal();
                break;
            }
            dt2 = dt2.e;
        }
    }

    private boolean j(dt dt2) {
        try {
            return dt2.a();
        }
        catch (Throwable throwable) {
            this.l();
            throw eg.b(throwable);
        }
    }

    private void l() {
        dt dt2 = this.c;
        while (dt2 != null) {
            dt2.c.signalAll();
            dt2 = dt2.e;
        }
    }

    private void k(dt dt2) {
        int n2;
        if ((n2 = dt2.d++) == 0) {
            dt2.e = this.c;
            this.c = dt2;
        }
    }

    private void l(dt dt2) {
        int n2;
        if ((n2 = --dt2.d) == 0) {
            dt dt3 = this.c;
            dt dt4 = null;
            while (true) {
                if (dt3 == dt2) {
                    if (dt4 == null) {
                        this.c = dt3.e;
                    } else {
                        dt4.e = dt3.e;
                    }
                    dt3.e = null;
                    break;
                }
                dt4 = dt3;
                dt3 = dt3.e;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(dt dt2, boolean bl2) {
        if (bl2) {
            this.k();
        }
        this.k(dt2);
        try {
            do {
                dt2.c.await();
            } while (!dt2.a());
        }
        finally {
            this.l(dt2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(dt dt2, boolean bl2) {
        if (bl2) {
            this.k();
        }
        this.k(dt2);
        try {
            do {
                dt2.c.awaitUninterruptibly();
            } while (!dt2.a());
        }
        finally {
            this.l(dt2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(dt dt2, long l2, boolean bl2) {
        if (bl2) {
            this.k();
        }
        this.k(dt2);
        try {
            do {
                if (l2 < 0L) {
                    boolean bl3 = false;
                    return bl3;
                }
                l2 = dt2.c.awaitNanos(l2);
            } while (!dt2.a());
            boolean bl4 = true;
            return bl4;
        }
        finally {
            this.l(dt2);
        }
    }

    static /* synthetic */ ReentrantLock a(ds ds2) {
        return ds2.b;
    }
}

