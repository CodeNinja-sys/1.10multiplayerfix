/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.k;
import io.netty.channel.bd;
import io.netty.channel.bq;
import io.netty.channel.bw;
import io.netty.util.c.aj;
import io.netty.util.x;
import io.netty.util.z;

public abstract class p
extends bq {
    private final aj a;
    private final boolean b;

    protected p() {
        this(true);
    }

    protected p(Class class_) {
        this(class_, true);
    }

    protected p(boolean bl2) {
        this.a = aj.a(this, p.class, "I");
        this.b = bl2;
    }

    protected p(Class class_, boolean bl2) {
        this.a = aj.a(class_);
        this.b = bl2;
    }

    public boolean a(Object object) {
        return this.a.a(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(bd bd2, Object object, bw bw2) {
        block14: {
            z z2 = null;
            try {
                if (this.a(object)) {
                    Object object2 = object;
                    z2 = this.a(bd2, object2, this.b);
                    try {
                        this.a(bd2, object2, (g)z2);
                    }
                    finally {
                        x.b(object2);
                    }
                    if (((g)z2).u()) {
                        bd2.a(z2, bw2);
                    } else {
                        z2.ad();
                        bd2.a(bi.c, bw2);
                    }
                    z2 = null;
                    break block14;
                }
                bd2.a(object, bw2);
            }
            catch (k k2) {
                throw k2;
            }
            catch (Throwable throwable) {
                throw new k(throwable);
            }
            finally {
                if (z2 != null) {
                    z2.ad();
                }
            }
        }
    }

    protected g a(bd bd2, Object object, boolean bl2) {
        if (bl2) {
            return bd2.d().b();
        }
        return bd2.d().c();
    }

    protected abstract void a(bd var1, Object var2, g var3);
}

