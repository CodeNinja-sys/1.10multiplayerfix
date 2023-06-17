/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.b.g;
import io.netty.channel.an;
import io.netty.channel.b;
import io.netty.channel.bj;
import io.netty.channel.cv;
import io.netty.channel.d.c;
import io.netty.channel.d.d;
import io.netty.channel.d.e;
import io.netty.util.c.ad;
import io.netty.util.z;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

public abstract class a
extends d {
    private static final String f = " (expected: " + ad.a(g.class) + ", " + ad.a(cv.class) + ')';
    private Runnable g;

    protected a(an an2, SelectableChannel selectableChannel) {
        super(an2, selectableChannel, 1);
    }

    protected e L() {
        return new c(this, null);
    }

    @Override
    protected void a(bj bj2) {
        block11: {
            block12: {
                int n2;
                int n3 = -1;
                while (true) {
                    boolean bl2;
                    z z2;
                    Object object;
                    if ((object = bj2.b()) == null) {
                        this.N();
                        break block11;
                    }
                    if (object instanceof g) {
                        z2 = (g)object;
                        n2 = ((g)z2).r();
                        if (!n2) {
                            bj2.c();
                            continue;
                        }
                        bl2 = false;
                        boolean bl3 = false;
                        long l2 = 0L;
                        if (n3 == -1) {
                            n3 = this.G().d();
                        }
                        for (int i2 = n3 - 1; i2 >= 0; --i2) {
                            int n4 = this.b((g)z2);
                            if (n4 == 0) {
                                bl2 = true;
                                break;
                            }
                            l2 += (long)n4;
                            if (((g)z2).u()) continue;
                            bl3 = true;
                            break;
                        }
                        bj2.c(l2);
                        if (bl3) {
                            bj2.c();
                            continue;
                        }
                        this.a(bl2);
                        break block11;
                    }
                    if (!(object instanceof cv)) break block12;
                    z2 = (cv)object;
                    n2 = 0;
                    bl2 = false;
                    long l3 = 0L;
                    if (n3 == -1) {
                        n3 = this.G().d();
                    }
                    for (int i3 = n3 - 1; i3 >= 0; --i3) {
                        long l4 = this.a((cv)z2);
                        if (l4 == 0L) {
                            n2 = 1;
                            break;
                        }
                        l3 += l4;
                        if (z2.c() < z2.b()) continue;
                        bl2 = true;
                        break;
                    }
                    bj2.c(l3);
                    if (!bl2) break;
                    bj2.c();
                }
                this.a(n2 != 0);
                break block11;
            }
            throw new Error();
        }
    }

    @Override
    protected final Object c(Object object) {
        if (object instanceof g) {
            g g2 = (g)object;
            if (g2.o()) {
                return object;
            }
            return this.c(g2);
        }
        if (object instanceof cv) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + f);
    }

    protected final void a(boolean bl2) {
        if (bl2) {
            this.M();
        } else {
            Runnable runnable = this.g;
            if (runnable == null) {
                runnable = this.g = new io.netty.channel.d.b(this);
            }
            this.W().execute(runnable);
        }
    }

    protected abstract long a(cv var1);

    protected abstract int a(g var1);

    protected abstract int b(g var1);

    protected final void M() {
        SelectionKey selectionKey = this.X();
        if (!selectionKey.isValid()) {
            return;
        }
        int n2 = selectionKey.interestOps();
        if ((n2 & 4) == 0) {
            selectionKey.interestOps(n2 | 4);
        }
    }

    protected final void N() {
        SelectionKey selectionKey = this.X();
        if (!selectionKey.isValid()) {
            return;
        }
        int n2 = selectionKey.interestOps();
        if ((n2 & 4) != 0) {
            selectionKey.interestOps(n2 & 0xFFFFFFFB);
        }
    }

    @Override
    protected /* synthetic */ b bv_() {
        return this.L();
    }
}

