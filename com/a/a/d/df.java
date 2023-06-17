/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.db;
import com.a.a.d.dc;
import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sr;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

final class df
implements sr {
    final bl a;
    volatile sr b = qy.h();

    public df(bl bl2) {
        this.a = bl2;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public rz a() {
        return null;
    }

    @Override
    public sr a(ReferenceQueue referenceQueue, Object object, rz rz2) {
        return this;
    }

    @Override
    public boolean b() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object c() {
        if (this.b == qy.w) {
            boolean bl2 = false;
            try {
                df df2 = this;
                synchronized (df2) {
                    while (this.b == qy.w) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            bl2 = true;
                        }
                    }
                }
            }
            finally {
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return this.b.c();
    }

    @Override
    public void a(sr sr2) {
        this.b(sr2);
    }

    Object a(Object object, int n2) {
        Object object2;
        try {
            object2 = this.a.a(object);
        }
        catch (Throwable throwable) {
            this.b(new db(throwable));
            throw new ExecutionException(throwable);
        }
        this.b(new dc(object2));
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(sr sr2) {
        df df2 = this;
        synchronized (df2) {
            if (this.b == qy.w) {
                this.b = sr2;
                this.notifyAll();
            }
        }
    }
}

