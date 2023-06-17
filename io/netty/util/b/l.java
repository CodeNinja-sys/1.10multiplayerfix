/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.af;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.ae;
import io.netty.util.b.as;
import io.netty.util.b.au;
import io.netty.util.b.e;
import io.netty.util.b.f;
import io.netty.util.b.j;
import io.netty.util.b.m;
import io.netty.util.b.n;
import io.netty.util.b.o;
import io.netty.util.b.p;
import io.netty.util.b.q;
import io.netty.util.b.r;
import io.netty.util.b.s;
import io.netty.util.b.t;
import io.netty.util.b.w;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.d;
import io.netty.util.c.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

public class l
extends e
implements au {
    private static final g a = io.netty.util.c.b.h.a(l.class);
    private static final g b = io.netty.util.c.b.h.b(l.class.getName() + ".rejectedExecution");
    private static final int c = 8;
    private static final af d = af.a(l.class.getName() + ".SUCCESS");
    private static final af e = af.a(l.class.getName() + ".UNCANCELLABLE");
    private static final r f = new r(new CancellationException());
    private final w g;
    private volatile Object h;
    private Object i;
    private t j;
    private short k;

    public l(w w2) {
        if (w2 == null) {
            throw new NullPointerException("executor");
        }
        this.g = w2;
    }

    protected l() {
        this.g = null;
    }

    protected w bu_() {
        return this.g;
    }

    @Override
    public boolean isCancelled() {
        return l.c(this.h);
    }

    private static boolean c(Object object) {
        return object instanceof r && ((r)object).a instanceof CancellationException;
    }

    @Override
    public boolean bp_() {
        return this.h == null;
    }

    @Override
    public boolean isDone() {
        return l.d(this.h);
    }

    private static boolean d(Object object) {
        return object != null && object != e;
    }

    @Override
    public boolean bo_() {
        Object object = this.h;
        if (object == null || object == e) {
            return false;
        }
        return !(object instanceof r);
    }

    @Override
    public Throwable bq_() {
        Object object = this.h;
        if (object instanceof r) {
            return ((r)object).a;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public au l(ad ad2) {
        if (ad2 == null) {
            throw new NullPointerException("listener");
        }
        if (this.isDone()) {
            this.a(ad2);
            return this;
        }
        l l2 = this;
        synchronized (l2) {
            if (!this.isDone()) {
                if (this.i == null) {
                    this.i = ad2;
                } else if (this.i instanceof j) {
                    ((j)this.i).a(ad2);
                } else {
                    ad ad3 = (ad)this.i;
                    this.i = new j(ad3, ad2);
                }
                return this;
            }
        }
        this.a(ad2);
        return this;
    }

    @Override
    public au l(ad ... arrad) {
        if (arrad == null) {
            throw new NullPointerException("listeners");
        }
        for (ad ad2 : arrad) {
            if (ad2 == null) break;
            this.l(ad2);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public au k(ad ad2) {
        if (ad2 == null) {
            throw new NullPointerException("listener");
        }
        if (this.isDone()) {
            return this;
        }
        l l2 = this;
        synchronized (l2) {
            if (!this.isDone()) {
                if (this.i instanceof j) {
                    ((j)this.i).b(ad2);
                } else if (this.i == ad2) {
                    this.i = null;
                }
            }
        }
        return this;
    }

    @Override
    public au k(ad ... arrad) {
        if (arrad == null) {
            throw new NullPointerException("listeners");
        }
        for (ad ad2 : arrad) {
            if (ad2 == null) break;
            this.k(ad2);
        }
        return this;
    }

    @Override
    public au C() {
        this.E();
        this.b();
        return this;
    }

    @Override
    public au B() {
        this.D();
        this.b();
        return this;
    }

    private void b() {
        Throwable throwable = this.bq_();
        if (throwable == null) {
            return;
        }
        u.a(throwable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public au E() {
        if (this.isDone()) {
            return this;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException(this.toString());
        }
        l l2 = this;
        synchronized (l2) {
            while (!this.isDone()) {
                this.w();
                this.f();
                try {
                    this.wait();
                }
                finally {
                    this.g();
                }
            }
        }
        return this;
    }

    @Override
    public boolean a(long l2, TimeUnit timeUnit) {
        return this.a(timeUnit.toNanos(l2), true);
    }

    @Override
    public boolean a_(long l2) {
        return this.a(TimeUnit.MILLISECONDS.toNanos(l2), true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public au D() {
        if (this.isDone()) {
            return this;
        }
        boolean bl2 = false;
        l l2 = this;
        synchronized (l2) {
            while (!this.isDone()) {
                this.w();
                this.f();
                try {
                    this.wait();
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                }
                finally {
                    this.g();
                }
            }
        }
        if (bl2) {
            Thread.currentThread().interrupt();
        }
        return this;
    }

    @Override
    public boolean b(long l2, TimeUnit timeUnit) {
        try {
            return this.a(timeUnit.toNanos(l2), false);
        }
        catch (InterruptedException interruptedException) {
            throw new InternalError();
        }
    }

    @Override
    public boolean b(long l2) {
        try {
            return this.a(TimeUnit.MILLISECONDS.toNanos(l2), false);
        }
        catch (InterruptedException interruptedException) {
            throw new InternalError();
        }
    }

    /*
     * Exception decompiling
     */
    private boolean a(long var1_1, boolean var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 7[TRYBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    protected void w() {
        w w2 = this.bu_();
        if (w2 != null && w2.bt_()) {
            throw new f(this.toString());
        }
    }

    @Override
    public au b(Object object) {
        if (this.e(object)) {
            this.h();
            return this;
        }
        throw new IllegalStateException("complete already: " + this);
    }

    @Override
    public boolean a_(Object object) {
        if (this.e(object)) {
            this.h();
            return true;
        }
        return false;
    }

    @Override
    public au c(Throwable throwable) {
        if (this.a(throwable)) {
            this.h();
            return this;
        }
        throw new IllegalStateException("complete already: " + this, throwable);
    }

    @Override
    public boolean b(Throwable throwable) {
        if (this.a(throwable)) {
            this.h();
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean cancel(boolean bl2) {
        Object object = this.h;
        if (l.d(object) || object == e) {
            return false;
        }
        l l2 = this;
        synchronized (l2) {
            object = this.h;
            if (l.d(object) || object == e) {
                return false;
            }
            this.h = f;
            if (this.e()) {
                this.notifyAll();
            }
        }
        this.h();
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean bn_() {
        Object object = this.h;
        if (l.d(object)) {
            return !l.c(object);
        }
        l l2 = this;
        synchronized (l2) {
            object = this.h;
            if (l.d(object)) {
                return !l.c(object);
            }
            this.h = e;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        if (this.isDone()) {
            return false;
        }
        l l2 = this;
        synchronized (l2) {
            if (this.isDone()) {
                return false;
            }
            this.h = new r(throwable);
            if (this.e()) {
                this.notifyAll();
            }
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean e(Object object) {
        if (this.isDone()) {
            return false;
        }
        l l2 = this;
        synchronized (l2) {
            if (this.isDone()) {
                return false;
            }
            this.h = object == null ? d : object;
            if (this.e()) {
                this.notifyAll();
            }
        }
        return true;
    }

    @Override
    public Object bm_() {
        Object object = this.h;
        if (object instanceof r || object == d) {
            return null;
        }
        return object;
    }

    private boolean e() {
        return this.k > 0;
    }

    private void f() {
        if (this.k == 32767) {
            throw new IllegalStateException("too many waiters: " + this);
        }
        this.k = (short)(this.k + 1);
    }

    private void g() {
        this.k = (short)(this.k - 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void h() {
        Object object;
        int n2;
        Object object2 = this.i;
        if (object2 == null) {
            return;
        }
        w w2 = this.bu_();
        if (w2.bt_() && (n2 = ((io.netty.util.c.f)(object = io.netty.util.c.f.b())).k()) < 8) {
            ((io.netty.util.c.f)object).a(n2 + 1);
            try {
                if (object2 instanceof j) {
                    l.b(this, (j)object2);
                } else {
                    ad ad2 = (ad)object2;
                    l.a((ab)this, ad2);
                }
            }
            finally {
                this.i = null;
                ((io.netty.util.c.f)object).a(n2);
            }
            return;
        }
        if (object2 instanceof j) {
            object = (j)object2;
            l.b(w2, new m(this, (j)object));
        } else {
            object = (ad)object2;
            l.b(w2, new n(this, (ad)object));
        }
    }

    private static void b(ab ab2, j j2) {
        ad[] arrad = j2.a();
        int n2 = j2.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            l.a(ab2, arrad[i2]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ad ad2) {
        w w2 = this.bu_();
        if (w2.bt_()) {
            if (this.i == null && this.j == null) {
                io.netty.util.c.f f2 = io.netty.util.c.f.b();
                int n2 = f2.k();
                if (n2 < 8) {
                    f2.a(n2 + 1);
                    try {
                        l.a((ab)this, ad2);
                    }
                    finally {
                        f2.a(n2);
                    }
                    return;
                }
            } else {
                t t2 = this.j;
                if (t2 == null) {
                    this.j = t2 = new t(this);
                }
                t2.add(ad2);
                l.b(w2, t2);
                return;
            }
        }
        l.b(w2, new s(this, ad2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void a(w w2, ab ab2, ad ad2) {
        io.netty.util.c.f f2;
        int n2;
        if (w2.bt_() && (n2 = (f2 = io.netty.util.c.f.b()).k()) < 8) {
            f2.a(n2 + 1);
            try {
                l.a(ab2, ad2);
            }
            finally {
                f2.a(n2);
            }
            return;
        }
        l.b(w2, new o(ab2, ad2));
    }

    private static void b(w w2, Runnable runnable) {
        try {
            w2.execute(runnable);
        }
        catch (Throwable throwable) {
            b.e("Failed to submit a listener notification task. Event loop shut down?", throwable);
        }
    }

    static void a(ab ab2, ad ad2) {
        block2: {
            try {
                ad2.a(ab2);
            }
            catch (Throwable throwable) {
                if (!a.f()) break block2;
                a.d("An exception was thrown by " + ad2.getClass().getName() + ".operationComplete()", throwable);
            }
        }
    }

    private synchronized Object i() {
        Object object = this.i;
        if (object == null) {
            return null;
        }
        if (object instanceof j) {
            j j2 = (j)object;
            int n2 = j2.c();
            switch (n2) {
                case 0: {
                    return null;
                }
                case 1: {
                    for (ad ad2 : j2.a()) {
                        if (!(ad2 instanceof ae)) continue;
                        return ad2;
                    }
                    return null;
                }
            }
            ad[] arrad = j2.a();
            ae[] arrae = new ae[n2];
            int n3 = 0;
            int n4 = 0;
            while (n4 < n2) {
                ad ad3 = arrad[n3];
                if (ad3 instanceof ae) {
                    arrae[n4++] = (ae)ad3;
                }
                ++n3;
            }
            return arrae;
        }
        if (object instanceof ae) {
            return object;
        }
        return null;
    }

    void d(long l2, long l3) {
        Object object = this.i();
        if (object == null) {
            return;
        }
        as as2 = (as)((Object)this);
        w w2 = this.bu_();
        if (w2.bt_()) {
            if (object instanceof ae[]) {
                l.b(as2, (ae[])object, l2, l3);
            } else {
                l.b(as2, (ae)object, l2, l3);
            }
        } else if (object instanceof ae[]) {
            ae[] arrae = (ae[])object;
            l.b(w2, new p(this, as2, arrae, l2, l3));
        } else {
            ae ae2 = (ae)object;
            l.b(w2, new q(this, as2, ae2, l2, l3));
        }
    }

    private static void b(as as2, ae[] arrae, long l2, long l3) {
        for (ae ae2 : arrae) {
            if (ae2 == null) break;
            l.b(as2, ae2, l2, l3);
        }
    }

    private static void b(as as2, ae ae2, long l2, long l3) {
        block2: {
            try {
                ae2.a(as2, l2, l3);
            }
            catch (Throwable throwable) {
                if (!a.f()) break block2;
                a.d("An exception was thrown by " + ae2.getClass().getName() + ".operationProgressed()", throwable);
            }
        }
    }

    public String toString() {
        return this.J().toString();
    }

    protected StringBuilder J() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(io.netty.util.c.ad.a(this));
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        Object object = this.h;
        if (object == d) {
            stringBuilder.append("(success)");
        } else if (object == e) {
            stringBuilder.append("(uncancellable)");
        } else if (object instanceof r) {
            stringBuilder.append("(failure(");
            stringBuilder.append(((r)object).a);
            stringBuilder.append(')');
        } else {
            stringBuilder.append("(incomplete)");
        }
        return stringBuilder;
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.D();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.E();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.B();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.C();
    }

    @Override
    public /* synthetic */ ab b_(ad[] arrad) {
        return this.k(arrad);
    }

    @Override
    public /* synthetic */ ab b_(ad ad2) {
        return this.k(ad2);
    }

    @Override
    public /* synthetic */ ab a_(ad[] arrad) {
        return this.l(arrad);
    }

    @Override
    public /* synthetic */ ab a_(ad ad2) {
        return this.l(ad2);
    }

    static /* synthetic */ void a(ab ab2, j j2) {
        l.b(ab2, j2);
    }

    static /* synthetic */ Object a(l l2, Object object) {
        l2.i = object;
        return l2.i;
    }

    static /* synthetic */ void a(as as2, ae[] arrae, long l2, long l3) {
        l.b(as2, arrae, l2, l3);
    }

    static /* synthetic */ void a(as as2, ae ae2, long l2, long l3) {
        l.b(as2, ae2, l2, l3);
    }

    static /* synthetic */ Object a(l l2) {
        return l2.i;
    }

    static /* synthetic */ void a(w w2, Runnable runnable) {
        l.b(w2, runnable);
    }

    static /* synthetic */ t b(l l2) {
        return l2.j;
    }

    static /* synthetic */ t a(l l2, t t2) {
        l2.j = t2;
        return l2.j;
    }

    static {
        l.f.a.setStackTrace(io.netty.util.c.d.k);
    }
}

