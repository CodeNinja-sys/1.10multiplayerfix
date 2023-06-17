/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.br;
import io.netty.util.c.a.bt;
import io.netty.util.c.a.cb;
import io.netty.util.c.a.cd;
import io.netty.util.c.a.ce;
import io.netty.util.c.a.cf;
import io.netty.util.c.a.cg;
import io.netty.util.c.a.ch;
import io.netty.util.c.a.cj;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

public abstract class cc
implements Serializable,
Future {
    volatile int p;
    static final int q = -268435456;
    static final int r = -268435456;
    static final int s = -1073741824;
    static final int t = Integer.MIN_VALUE;
    static final int u = 65536;
    static final int v = 65535;
    private static final ch[] a;
    private static final ReentrantLock b;
    private static final ReferenceQueue c;
    private static final int d = 32;
    private static final long e = -7721805057305804111L;
    private static final Unsafe f;
    private static final long g;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int a(int n2) {
        int n3;
        do {
            if ((n3 = this.p) >= 0) continue;
            return n3;
        } while (!f.compareAndSwapInt(this, g, n3, n3 | n2));
        if (n3 >>> 16 != 0) {
            cc cc2 = this;
            synchronized (cc2) {
                this.notifyAll();
            }
        }
        return n2;
    }

    final int o() {
        int n2 = this.p;
        if (n2 >= 0) {
            boolean bl2;
            try {
                bl2 = this.n();
            }
            catch (Throwable throwable) {
                return this.f(throwable);
            }
            if (bl2) {
                n2 = this.a(-268435456);
            }
        }
        return n2;
    }

    final boolean p() {
        int n2 = this.p;
        return n2 >= 0 && f.compareAndSwapInt(this, g, n2, n2 | 0x10000);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int a() {
        bt bt2 = bt.c;
        int n2 = this.p;
        if (n2 >= 0) {
            if (bt2 != null) {
                if (this instanceof br) {
                    n2 = bt2.a((br)this);
                } else if (bt2.b(this)) {
                    n2 = this.o();
                }
            }
            if (n2 >= 0 && (n2 = this.p) >= 0) {
                boolean bl2 = false;
                do {
                    if (!f.compareAndSwapInt(this, g, n2, n2 | 0x10000)) continue;
                    cc cc2 = this;
                    synchronized (cc2) {
                        if (this.p >= 0) {
                            try {
                                this.wait();
                            }
                            catch (InterruptedException interruptedException) {
                                bl2 = true;
                            }
                        } else {
                            this.notifyAll();
                        }
                    }
                } while ((n2 = this.p) >= 0);
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int b() {
        bt bt2 = bt.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int n2 = this.p;
        if (n2 >= 0 && bt2 != null) {
            if (this instanceof br) {
                bt2.a((br)this);
            } else if (bt2.b(this)) {
                this.o();
            }
        }
        while ((n2 = this.p) >= 0) {
            if (!f.compareAndSwapInt(this, g, n2, n2 | 0x10000)) continue;
            cc cc2 = this;
            synchronized (cc2) {
                if (this.p >= 0) {
                    this.wait();
                } else {
                    this.notifyAll();
                }
            }
        }
        return n2;
    }

    private int d() {
        int n2;
        int n3 = this.p;
        if (n3 < 0) {
            n2 = n3;
        } else {
            Thread thread = Thread.currentThread();
            if (thread instanceof cj) {
                cj cj2 = (cj)thread;
                cb cb2 = cj2.b;
                n2 = cb2.b(this) && (n3 = this.o()) < 0 ? n3 : cj2.a.a(cb2, this);
            } else {
                n2 = this.a();
            }
        }
        return n2;
    }

    private int e() {
        int n2;
        int n3 = this.o();
        if (n3 < 0) {
            n2 = n3;
        } else {
            Thread thread = Thread.currentThread();
            if (thread instanceof cj) {
                cj cj2 = (cj)thread;
                n2 = cj2.a.a(cj2.b, this);
            } else {
                n2 = this.a();
            }
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final int b(Throwable throwable) {
        int n2 = this.p;
        if (n2 >= 0) {
            int n3 = System.identityHashCode(this);
            ReentrantLock reentrantLock = b;
            reentrantLock.lock();
            try {
                cc.h();
                ch[] arrch = a;
                int n4 = n3 & arrch.length - 1;
                ch ch2 = arrch[n4];
                while (true) {
                    if (ch2 == null) {
                        arrch[n4] = new ch(this, throwable, arrch[n4]);
                        break;
                    }
                    if (ch2.get() == this) {
                        break;
                    }
                    ch2 = ch2.b;
                }
            }
            finally {
                reentrantLock.unlock();
            }
            n2 = this.a(Integer.MIN_VALUE);
        }
        return n2;
    }

    private int f(Throwable throwable) {
        int n2 = this.b(throwable);
        if ((n2 & 0xF0000000) == Integer.MIN_VALUE) {
            this.a(throwable);
        }
        return n2;
    }

    void a(Throwable throwable) {
    }

    static final void a(cc cc2) {
        if (cc2 != null && cc2.p >= 0) {
            try {
                cc2.cancel(false);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void f() {
        int n2 = System.identityHashCode(this);
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            ch[] arrch = a;
            int n3 = n2 & arrch.length - 1;
            ch ch2 = arrch[n3];
            ch ch3 = null;
            while (ch2 != null) {
                ch ch4 = ch2.b;
                if (ch2.get() == this) {
                    if (ch3 == null) {
                        arrch[n3] = ch4;
                        break;
                    }
                    ch3.b = ch4;
                    break;
                }
                ch3 = ch2;
                ch2 = ch4;
            }
            cc.h();
            this.p = 0;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Throwable g() {
        ch ch2;
        Object object;
        if ((this.p & 0xF0000000) != Integer.MIN_VALUE) {
            return null;
        }
        int n2 = System.identityHashCode(this);
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            cc.h();
            object = a;
            ch2 = object[n2 & ((ch[])object).length - 1];
            while (ch2 != null && ch2.get() != this) {
                ch2 = ch2.b;
            }
        }
        finally {
            reentrantLock.unlock();
        }
        if (ch2 == null || (object = ch2.a) == null) {
            return null;
        }
        return object;
    }

    private static void h() {
        Reference reference;
        block0: while ((reference = c.poll()) != null) {
            if (!(reference instanceof ch)) continue;
            cc cc2 = (cc)((ch)reference).get();
            ch[] arrch = a;
            int n2 = System.identityHashCode(cc2) & arrch.length - 1;
            ch ch2 = arrch[n2];
            ch ch3 = null;
            while (ch2 != null) {
                ch ch4 = ch2.b;
                if (ch2 == reference) {
                    if (ch3 == null) {
                        arrch[n2] = ch4;
                        continue block0;
                    }
                    ch3.b = ch4;
                    continue block0;
                }
                ch3 = ch2;
                ch2 = ch4;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static final void q() {
        ReentrantLock reentrantLock = b;
        if (reentrantLock.tryLock()) {
            try {
                cc.h();
            }
            finally {
                reentrantLock.unlock();
            }
        }
    }

    static void c(Throwable throwable) {
        if (throwable != null) {
            cc.d(throwable);
        }
    }

    static void d(Throwable throwable) {
        throw throwable;
    }

    private void b(int n2) {
        if (n2 == -1073741824) {
            throw new CancellationException();
        }
        if (n2 == Integer.MIN_VALUE) {
            cc.c(this.g());
        }
    }

    public final cc r() {
        Thread thread = Thread.currentThread();
        if (thread instanceof cj) {
            ((cj)thread).b.a(this);
        } else {
            bt.c.a(this);
        }
        return this;
    }

    public final Object s() {
        int n2 = this.d() & 0xF0000000;
        if (n2 != -268435456) {
            this.b(n2);
        }
        return this.c();
    }

    public final Object t() {
        int n2 = this.e() & 0xF0000000;
        if (n2 != -268435456) {
            this.b(n2);
        }
        return this.c();
    }

    public static void a(cc cc2, cc cc3) {
        int n2;
        cc3.r();
        int n3 = cc2.e() & 0xF0000000;
        if (n3 != -268435456) {
            cc2.b(n3);
        }
        if ((n2 = cc3.d() & 0xF0000000) != -268435456) {
            cc3.b(n2);
        }
    }

    public static void a(cc ... arrcc) {
        cc cc2;
        int n2;
        int n3;
        Throwable throwable = null;
        for (n3 = n2 = arrcc.length - 1; n3 >= 0; --n3) {
            cc2 = arrcc[n3];
            if (cc2 == null) {
                if (throwable != null) continue;
                throwable = new NullPointerException();
                continue;
            }
            if (n3 != 0) {
                cc2.r();
                continue;
            }
            if (cc2.e() >= -268435456 || throwable != null) continue;
            throwable = cc2.w();
        }
        for (n3 = 1; n3 <= n2; ++n3) {
            cc2 = arrcc[n3];
            if (cc2 == null) continue;
            if (throwable != null) {
                cc2.cancel(false);
                continue;
            }
            if (cc2.d() >= -268435456) continue;
            throwable = cc2.w();
        }
        if (throwable != null) {
            cc.c(throwable);
        }
    }

    public static Collection a(Collection collection) {
        cc cc2;
        int n2;
        int n3;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            cc.a(collection.toArray(new cc[collection.size()]));
            return collection;
        }
        List list = (List)collection;
        Throwable throwable = null;
        for (n3 = n2 = list.size() - 1; n3 >= 0; --n3) {
            cc2 = (cc)list.get(n3);
            if (cc2 == null) {
                if (throwable != null) continue;
                throwable = new NullPointerException();
                continue;
            }
            if (n3 != 0) {
                cc2.r();
                continue;
            }
            if (cc2.e() >= -268435456 || throwable != null) continue;
            throwable = cc2.w();
        }
        for (n3 = 1; n3 <= n2; ++n3) {
            cc2 = (cc)list.get(n3);
            if (cc2 == null) continue;
            if (throwable != null) {
                cc2.cancel(false);
                continue;
            }
            if (cc2.d() >= -268435456) continue;
            throwable = cc2.w();
        }
        if (throwable != null) {
            cc.c(throwable);
        }
        return collection;
    }

    @Override
    public boolean cancel(boolean bl2) {
        return (this.a(-1073741824) & 0xF0000000) == -1073741824;
    }

    @Override
    public final boolean isDone() {
        return this.p < 0;
    }

    @Override
    public final boolean isCancelled() {
        return (this.p & 0xF0000000) == -1073741824;
    }

    public final boolean u() {
        return this.p < -268435456;
    }

    public final boolean v() {
        return (this.p & 0xF0000000) == -268435456;
    }

    public final Throwable w() {
        int n2 = this.p & 0xF0000000;
        return n2 >= -268435456 ? null : (n2 == -1073741824 ? new CancellationException() : this.g());
    }

    public void e(Throwable throwable) {
        this.f(throwable instanceof RuntimeException || throwable instanceof Error ? throwable : new RuntimeException(throwable));
    }

    public void a(Object object) {
        try {
            this.b(object);
        }
        catch (Throwable throwable) {
            this.f(throwable);
            return;
        }
        this.a(-268435456);
    }

    public final void x() {
        this.a(-268435456);
    }

    public final Object get() {
        Throwable throwable;
        int n2;
        int n3 = n2 = Thread.currentThread() instanceof cj ? this.d() : this.b();
        if ((n2 &= 0xF0000000) == -1073741824) {
            throw new CancellationException();
        }
        if (n2 == Integer.MIN_VALUE && (throwable = this.g()) != null) {
            throw new ExecutionException(throwable);
        }
        return this.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final Object get(long l2, TimeUnit timeUnit) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        long l3 = timeUnit.toNanos(l2);
        int n2 = this.p;
        if (n2 >= 0 && l3 > 0L) {
            long l4 = System.nanoTime() + l3;
            bt bt2 = null;
            cb cb2 = null;
            Thread thread = Thread.currentThread();
            if (thread instanceof cj) {
                cj cj2 = (cj)thread;
                bt2 = cj2.a;
                cb2 = cj2.b;
                bt2.b(cb2, this);
            } else {
                bt bt3 = bt.c;
                if (bt3 != null) {
                    if (this instanceof br) {
                        bt3.a((br)this);
                    } else if (bt3.b(this)) {
                        this.o();
                    }
                }
            }
            boolean bl2 = false;
            boolean bl3 = false;
            try {
                while ((n2 = this.p) >= 0) {
                    if (cb2 != null && cb2.p < 0) {
                        cc.a(this);
                        continue;
                    }
                    if (!bl2) {
                        if (bt2 != null && !bt2.a(bt2.p)) continue;
                        bl2 = true;
                        continue;
                    }
                    long l5 = TimeUnit.NANOSECONDS.toMillis(l3);
                    if (l5 > 0L && f.compareAndSwapInt(this, g, n2, n2 | 0x10000)) {
                        cc cc2 = this;
                        synchronized (cc2) {
                            if (this.p >= 0) {
                                try {
                                    this.wait(l5);
                                }
                                catch (InterruptedException interruptedException) {
                                    if (bt2 == null) {
                                        bl3 = true;
                                    }
                                }
                            } else {
                                this.notifyAll();
                            }
                        }
                    }
                    if ((n2 = this.p) >= 0 && !bl3 && (l3 = l4 - System.nanoTime()) > 0L) continue;
                    break;
                }
            }
            finally {
                if (bt2 != null && bl2) {
                    bt2.a();
                }
            }
            if (bl3) {
                throw new InterruptedException();
            }
        }
        if ((n2 &= 0xF0000000) != -268435456) {
            if (n2 == -1073741824) {
                throw new CancellationException();
            }
            if (n2 != Integer.MIN_VALUE) {
                throw new TimeoutException();
            }
            Throwable throwable = this.g();
            if (throwable != null) {
                throw new ExecutionException(throwable);
            }
        }
        return this.c();
    }

    public final void y() {
        this.d();
    }

    public final void z() {
        this.e();
    }

    public static void A() {
        Thread thread = Thread.currentThread();
        if (thread instanceof cj) {
            cj cj2 = (cj)thread;
            cj2.a.b(cj2.b);
        } else {
            bt.t();
        }
    }

    public void B() {
        if ((this.p & 0xF0000000) == Integer.MIN_VALUE) {
            this.f();
        } else {
            this.p = 0;
        }
    }

    public static bt C() {
        Thread thread = Thread.currentThread();
        return thread instanceof cj ? ((cj)thread).a : null;
    }

    public static boolean D() {
        return Thread.currentThread() instanceof cj;
    }

    public boolean E() {
        Thread thread = Thread.currentThread();
        return thread instanceof cj ? ((cj)thread).b.b(this) : bt.c.b(this);
    }

    public static int F() {
        Thread thread = Thread.currentThread();
        cb cb2 = thread instanceof cj ? ((cj)thread).b : bt.c();
        return cb2 == null ? 0 : cb2.a();
    }

    public static int G() {
        return bt.b();
    }

    public abstract Object c();

    protected abstract void b(Object var1);

    protected abstract boolean n();

    protected static cc H() {
        Thread thread = Thread.currentThread();
        cb cb2 = thread instanceof cj ? ((cj)thread).b : bt.c();
        return cb2 == null ? null : cb2.g();
    }

    protected static cc I() {
        Thread thread = Thread.currentThread();
        return thread instanceof cj ? ((cj)thread).b.f() : null;
    }

    protected static cc J() {
        cc cc2;
        Thread thread = Thread.currentThread();
        if (thread instanceof cj) {
            cj cj2 = (cj)thread;
            cc2 = cj2.a.c(cj2.b);
        } else {
            cc2 = null;
        }
        return cc2;
    }

    public final short K() {
        return (short)this.p;
    }

    public final short a(short s2) {
        int n2;
        while (!f.compareAndSwapInt(this, g, n2 = this.p, n2 & 0xFFFF0000 | s2 & 0xFFFF)) {
        }
        return (short)n2;
    }

    public final boolean a(short s2, short s3) {
        int n2;
        do {
            if ((short)(n2 = this.p) == s2) continue;
            return false;
        } while (!f.compareAndSwapInt(this, g, n2, n2 & 0xFFFF0000 | s3 & 0xFFFF));
        return true;
    }

    public static cc a(Runnable runnable) {
        return new cg(runnable);
    }

    public static cc a(Runnable runnable, Object object) {
        return new cf(runnable, object);
    }

    public static cc a(Callable callable) {
        return new ce(callable);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.w());
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        if (object != null) {
            this.f((Throwable)object);
        }
    }

    private static Unsafe i() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new cd());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    static /* synthetic */ ReferenceQueue L() {
        return c;
    }

    static {
        b = new ReentrantLock();
        c = new ReferenceQueue();
        a = new ch[32];
        try {
            f = cc.i();
            Class<cc> class_ = cc.class;
            g = f.objectFieldOffset(class_.getDeclaredField("status"));
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

