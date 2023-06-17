/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.aa;
import io.netty.util.ab;
import io.netty.util.c.ad;
import java.lang.ref.PhantomReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;

final class ac
extends PhantomReference
implements aa {
    private static final int b = 4;
    private final String c;
    private final Deque d;
    private final AtomicBoolean e;
    private ac f;
    private ac g;
    final /* synthetic */ ab a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    ac(ab ab2, Object object) {
        this.a = ab2;
        super(object, object != null ? ab.a(ab2) : null);
        this.d = new ArrayDeque();
        if (object != null) {
            io.netty.util.ad ad2 = ab.b();
            this.c = ad2.ordinal() >= io.netty.util.ad.c.ordinal() ? ab.a(3) : null;
            ac ac2 = ab.b(ab2);
            synchronized (ac2) {
                this.f = ab.b(ab2);
                this.g = ab.b((ab)ab2).g;
                ab.b((ab)ab2).g.f = this;
                ab.b((ab)ab2).g = this;
                ab.c(ab2);
            }
            this.e = new AtomicBoolean();
        } else {
            this.c = null;
            this.e = new AtomicBoolean(true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a() {
        if (this.c != null) {
            String string = ab.a(2);
            Deque deque = this.d;
            synchronized (deque) {
                int n2 = this.d.size();
                if (n2 == 0 || !((String)this.d.getLast()).equals(string)) {
                    this.d.add(string);
                }
                if (n2 > 4) {
                    this.d.removeFirst();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b() {
        if (this.e.compareAndSet(false, true)) {
            ac ac2 = ab.b(this.a);
            synchronized (ac2) {
                ab.d(this.a);
                this.f.g = this.g;
                this.g.f = this.f;
                this.f = null;
                this.g = null;
            }
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        Object[] arrobject;
        if (this.c == null) {
            return "";
        }
        Object object = this.d;
        synchronized (object) {
            arrobject = this.d.toArray();
        }
        object = new StringBuilder(16384);
        ((StringBuilder)object).append(ad.a);
        ((StringBuilder)object).append("Recent access records: ");
        ((StringBuilder)object).append(arrobject.length);
        ((StringBuilder)object).append(ad.a);
        if (arrobject.length > 0) {
            for (int i2 = arrobject.length - 1; i2 >= 0; --i2) {
                ((StringBuilder)object).append('#');
                ((StringBuilder)object).append(i2 + 1);
                ((StringBuilder)object).append(':');
                ((StringBuilder)object).append(ad.a);
                ((StringBuilder)object).append(arrobject[i2]);
            }
        }
        ((StringBuilder)object).append("Created at:");
        ((StringBuilder)object).append(ad.a);
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).setLength(((StringBuilder)object).length() - ad.a.length());
        return ((StringBuilder)object).toString();
    }

    static /* synthetic */ ac a(ac ac2, ac ac3) {
        ac2.g = ac3;
        return ac2.g;
    }

    static /* synthetic */ ac b(ac ac2, ac ac3) {
        ac2.f = ac3;
        return ac2.f;
    }
}

