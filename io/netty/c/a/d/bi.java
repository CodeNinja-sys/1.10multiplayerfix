/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.ax;
import io.netty.c.a.d.bs;
import io.netty.c.a.u;
import io.netty.channel.bd;
import io.netty.channel.cv;
import io.netty.util.e;
import java.util.List;

public abstract class bi
extends u {
    private static final byte[] a = new byte[]{13, 10};
    private static final byte[] b = new byte[]{48, 13, 10};
    private static final byte[] c = new byte[]{48, 13, 10, 13, 10};
    private static final g d = io.netty.b.bi.d(io.netty.b.bi.b(a.length).c(a));
    private static final g e = io.netty.b.bi.d(io.netty.b.bi.b(c.length).c(c));
    private static final int f = 0;
    private static final int h = 1;
    private static final int i = 2;
    private int j = 0;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(bd bd2, Object object, List list) {
        g g2 = null;
        if (object instanceof av) {
            if (this.j != 0) {
                throw new IllegalStateException("unexpected message type: " + io.netty.util.c.ad.a(object));
            }
            av av2 = (av)object;
            g2 = bd2.d().a();
            this.a(g2, av2);
            ar.a(av2.q(), g2);
            g2.c(a);
            int n2 = this.j = ar.h(av2) ? 2 : 1;
        }
        if (object instanceof ad || object instanceof g || object instanceof cv) {
            if (this.j == 0) {
                throw new IllegalStateException("unexpected message type: " + io.netty.util.c.ad.a(object));
            }
            long l2 = bi.c(object);
            if (this.j == 1) {
                if (l2 > 0L) {
                    if (g2 != null && (long)g2.s() >= l2 && object instanceof ad) {
                        g2.b(((ad)object).a());
                        list.add(g2);
                    } else {
                        if (g2 != null) {
                            list.add(g2);
                        }
                        list.add(bi.b(object));
                    }
                } else if (g2 != null) {
                    list.add(g2);
                } else {
                    list.add(io.netty.b.bi.c);
                }
                if (!(object instanceof bs)) return;
                this.j = 0;
                return;
            } else {
                if (this.j != 2) throw new Error();
                if (g2 != null) {
                    list.add(g2);
                }
                this.a(bd2, object, l2, list);
            }
            return;
        } else {
            if (g2 == null) return;
            list.add(g2);
        }
    }

    private void a(bd bd2, Object object, long l2, List list) {
        g g2;
        Object object2;
        if (l2 > 0L) {
            object2 = Long.toHexString(l2).getBytes(io.netty.util.e.f);
            g2 = bd2.d().a(((byte[])object2).length + 2);
            g2.c((byte[])object2);
            g2.c(a);
            list.add(g2);
            list.add(bi.b(object));
            list.add(d.S());
        }
        if (object instanceof bs) {
            object2 = ((bs)object).e();
            if (((ar)object2).c()) {
                list.add(e.S());
            } else {
                g2 = bd2.d().a();
                g2.c(b);
                ar.a((ar)object2, g2);
                g2.c(a);
                list.add(g2);
            }
            this.j = 0;
        } else if (l2 == 0L) {
            list.add(io.netty.b.bi.c);
        }
    }

    @Override
    public boolean a(Object object) {
        return object instanceof ax || object instanceof g || object instanceof cv;
    }

    private static Object b(Object object) {
        if (object instanceof g) {
            return ((g)object).ab();
        }
        if (object instanceof ad) {
            return ((ad)object).a().ab();
        }
        if (object instanceof cv) {
            return ((cv)object).ae();
        }
        throw new IllegalStateException("unexpected message type: " + io.netty.util.c.ad.a(object));
    }

    private static long c(Object object) {
        if (object instanceof ad) {
            return ((ad)object).a().r();
        }
        if (object instanceof g) {
            return ((g)object).r();
        }
        if (object instanceof cv) {
            return ((cv)object).b();
        }
        throw new IllegalStateException("unexpected message type: " + io.netty.util.c.ad.a(object));
    }

    protected static void a(String string, g g2) {
        ar.b(string, g2);
    }

    protected abstract void a(g var1, av var2);
}

