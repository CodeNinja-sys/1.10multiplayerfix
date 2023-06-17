/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.c.a.k;
import io.netty.channel.bd;
import io.netty.channel.bq;
import io.netty.channel.bw;
import io.netty.util.c.aa;
import io.netty.util.c.ad;
import io.netty.util.c.aj;
import io.netty.util.x;
import java.util.List;

public abstract class u
extends bq {
    private final aj a;

    protected u() {
        this.a = aj.a(this, u.class, "I");
    }

    protected u(Class class_) {
        this.a = aj.a(class_);
    }

    public boolean a(Object object) {
        return this.a.a(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(bd bd2, Object object, bw bw2) {
        block14: {
            aa2 = null;
            try {
                if (this.a(object)) {
                    aa2 = aa.a();
                    object2 = object;
                    try {
                        this.a(bd2, object2, aa2);
                    }
                    finally {
                        x.b(object2);
                    }
                    if (aa2.isEmpty()) {
                        aa2.b();
                        aa2 = null;
                        throw new k(ad.a(this) + " must produce at least one message.");
                    }
                } else {
                    bd2.a(object, bw2);
                }
                if (aa2 == null) return;
            }
            catch (k k2) {
                try {
                    throw k2;
                    catch (Throwable throwable) {
                        throw new k(throwable);
                    }
                }
                catch (Throwable throwable) {
                    block16: {
                        block17: {
                            block15: {
                                if (aa2 == null) throw throwable;
                                n2 = aa2.size() - 1;
                                if (n2 != 0) break block15;
                                bd2.a(aa2.get(0), bw2);
                                break block16;
                            }
                            if (n2 <= 0) break block16;
                            bw3 = bd2.u();
                            bl2 = bw2 == bw3;
                            break block17;
lbl50:
                            // 2 sources

                            for (i3 = 0; i3 < n3; ++i3) {
                                bw6 = bl3 != false ? bw5 : bd2.r();
                                bd2.a(aa2.get(i3), bw6);
                            }
                            bd2.a(aa2.get(n3), bw2);
lbl57:
                            // 3 sources

                            aa2.b();
                            return;
                        }
                        for (i2 = 0; i2 < n2; ++i2) {
                            bw4 = bl2 != false ? bw3 : bd2.r();
                            bd2.a(aa2.get(i2), bw4);
                        }
                        bd2.a(aa2.get(n2), bw2);
                    }
                    aa2.b();
                    throw throwable;
                }
            }
            n3 = aa2.size() - 1;
            if (n3 != 0) break block14;
            bd2.a(aa2.get(0), bw2);
            ** GOTO lbl57
        }
        if (n3 <= 0) ** GOTO lbl57
        bw5 = bd2.u();
        bl3 = bw2 == bw5;
        ** GOTO lbl50
    }

    protected abstract void a(bd var1, Object var2, List var3);
}

