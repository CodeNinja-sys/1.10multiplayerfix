/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.h;
import io.netty.util.i;
import io.netty.util.k;
import java.util.Set;

final class j {
    private k b;
    private k c;
    static final /* synthetic */ boolean a;

    private j() {
    }

    public void a(k k2) {
        if (!a && k2.d != null) {
            throw new AssertionError();
        }
        k2.d = this;
        if (this.b == null) {
            this.b = this.c = k2;
        } else {
            this.c.b = k2;
            k2.c = this.c;
            this.c = k2;
        }
    }

    public void a(long l2) {
        k k2 = this.b;
        while (k2 != null) {
            boolean bl2 = false;
            if (k2.a <= 0L) {
                if (k.a(k2) > l2) {
                    throw new IllegalStateException(String.format("timeout.deadline (%d) > deadline (%d)", k.a(k2), l2));
                }
                k2.i();
                bl2 = true;
            } else if (k2.f()) {
                bl2 = true;
            } else {
                --k2.a;
            }
            k k3 = k2.b;
            if (bl2) {
                this.b(k2);
            }
            k2 = k3;
        }
    }

    public void b(k k2) {
        k k3 = k2.b;
        if (k2.c != null) {
            k2.c.b = k3;
        }
        if (k2.b != null) {
            k2.b.c = k2.c;
        }
        if (k2 == this.b) {
            if (k2 == this.c) {
                this.c = null;
                this.b = null;
            } else {
                this.b = k3;
            }
        } else if (k2 == this.c) {
            this.c = k2.c;
        }
        k2.c = null;
        k2.b = null;
        k2.d = null;
    }

    public void a(Set set) {
        k k2;
        while ((k2 = this.a()) != null) {
            if (k2.g() || k2.f()) continue;
            set.add(k2);
        }
        return;
    }

    private k a() {
        k k2 = this.b;
        if (k2 == null) {
            return null;
        }
        k k3 = k2.b;
        if (k3 == null) {
            this.b = null;
            this.c = null;
        } else {
            this.b = k3;
            k3.c = null;
        }
        k2.b = null;
        k2.c = null;
        k2.d = null;
        return k2;
    }

    /* synthetic */ j(i i2) {
        this();
    }

    static {
        a = !h.class.desiredAssertionStatus();
    }
}

