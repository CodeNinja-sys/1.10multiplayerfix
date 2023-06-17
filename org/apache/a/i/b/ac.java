/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.f;
import org.apache.a.i.b.ad;
import org.apache.a.i.b.aw;
import org.apache.a.n;
import org.apache.a.o;

public class ac
extends aw
implements o {
    private n a;
    private boolean d;

    public ac(o o2) {
        super(o2);
        this.a(o2.b());
    }

    public n b() {
        return this.a;
    }

    public void a(n n2) {
        this.a = n2 != null ? new ad(this, n2) : null;
        this.d = false;
    }

    public boolean a() {
        f f2 = this.c("Expect");
        return f2 != null && "100-continue".equalsIgnoreCase(f2.d());
    }

    public boolean i() {
        return this.a == null || this.a.a() || !this.d;
    }

    static /* synthetic */ boolean a(ac ac2, boolean bl2) {
        ac2.d = bl2;
        return ac2.d;
    }
}

