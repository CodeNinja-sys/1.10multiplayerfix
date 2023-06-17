/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bd;
import com.a.a.b.bf;
import com.a.a.b.bg;
import com.a.a.b.bh;
import com.a.a.b.bi;
import java.io.Closeable;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class be
implements Closeable {
    private static final Logger d = Logger.getLogger(be.class.getName());
    private static final String e = "com.google.common.base.internal.Finalizer";
    private static final Method f;
    final ReferenceQueue a = new ReferenceQueue();
    final PhantomReference b = new PhantomReference<be>(this, this.a);
    final boolean c;

    public be() {
        boolean bl2 = false;
        try {
            f.invoke(null, bd.class, this.a, this.b);
            bl2 = true;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        catch (Throwable throwable) {
            d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", throwable);
        }
        this.c = bl2;
    }

    @Override
    public void close() {
        this.b.enqueue();
        this.a();
    }

    void a() {
        Reference reference;
        if (this.c) {
            return;
        }
        while ((reference = this.a.poll()) != null) {
            reference.clear();
            try {
                ((bd)((Object)reference)).a();
            }
            catch (Throwable throwable) {
                d.log(Level.SEVERE, "Error cleaning up after reference.", throwable);
            }
        }
    }

    private static Class a(bh ... arrbh) {
        for (bh bh2 : arrbh) {
            Class class_ = bh2.a();
            if (class_ == null) continue;
            return class_;
        }
        throw new AssertionError();
    }

    static Method a(Class class_) {
        try {
            return class_.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new AssertionError((Object)noSuchMethodException);
        }
    }

    static /* synthetic */ Logger b() {
        return d;
    }

    static {
        Class class_ = be.a(new bi(), new bf(), new bg());
        f = be.a(class_);
    }
}

