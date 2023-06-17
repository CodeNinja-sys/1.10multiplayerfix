/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.ap;
import com.a.a.n.a.cj;
import com.a.a.n.a.cr;
import com.a.a.n.a.dl;
import com.a.a.n.a.du;
import com.a.a.n.a.g;
import com.a.a.n.a.gm;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class cq
extends g
implements Runnable {
    private ap a;
    private dl b;
    private volatile dl c;
    private final CountDownLatch d = new CountDownLatch(1);

    private cq(ap ap2, dl dl2) {
        this.a = (ap)cl.a(ap2);
        this.b = (dl)cl.a(dl2);
    }

    @Override
    public boolean cancel(boolean bl2) {
        if (super.cancel(bl2)) {
            this.a(this.b, bl2);
            this.a(this.c, bl2);
            return true;
        }
        return false;
    }

    private void a(Future future, boolean bl2) {
        if (future != null) {
            future.cancel(bl2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block14: {
            try {
                Object object;
                try {
                    object = gm.a(this.b);
                }
                catch (CancellationException cancellationException) {
                    this.cancel(false);
                    this.a = null;
                    this.b = null;
                    this.d.countDown();
                    return;
                }
                catch (ExecutionException executionException) {
                    this.a(executionException.getCause());
                    this.a = null;
                    this.b = null;
                    this.d.countDown();
                    return;
                }
                dl dl2 = this.c = (dl)cl.a(this.a.a(object), (Object)"AsyncFunction may not return null.");
                if (this.isCancelled()) {
                    dl2.cancel(this.b());
                    this.c = null;
                    return;
                }
                dl2.a(new cr(this, dl2), du.a());
                break block14;
                {
                    catch (UndeclaredThrowableException undeclaredThrowableException) {
                        this.a(undeclaredThrowableException.getCause());
                        break block14;
                    }
                    catch (Throwable throwable) {
                        this.a(throwable);
                        break block14;
                    }
                    catch (Throwable throwable) {
                        throw throwable;
                    }
                }
            }
            finally {
                this.a = null;
                this.b = null;
                this.d.countDown();
            }
        }
    }

    /* synthetic */ cq(ap ap2, dl dl2, cj cj2) {
        this(ap2, dl2);
    }

    static /* synthetic */ dl a(cq cq2, dl dl2) {
        cq2.c = dl2;
        return cq2.c;
    }
}

