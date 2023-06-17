/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.c.a.g;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.c.aa;
import io.netty.util.c.aj;
import io.netty.util.x;
import java.util.List;

public abstract class t
extends bf {
    private final aj a;

    protected t() {
        this.a = aj.a(this, t.class, "I");
    }

    protected t(Class class_) {
        this.a = aj.a(class_);
    }

    public boolean a(Object object) {
        return this.a.a(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a_(bd bd2, Object object) {
        block11: {
            aa aa2 = aa.a();
            try {
                if (this.a(object)) {
                    Object object2 = object;
                    try {
                        this.a(bd2, object2, aa2);
                        break block11;
                    }
                    finally {
                        x.b(object2);
                    }
                }
                aa2.add(object);
            }
            catch (g g2) {
                throw g2;
            }
            catch (Exception exception) {
                throw new g(exception);
            }
            finally {
                int n2 = aa2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    bd2.b(aa2.get(i2));
                }
                aa2.b();
            }
        }
    }

    protected abstract void a(bd var1, Object var2, List var3);
}

