/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.eu;

final class ao {
    final eu a;
    final boolean b;
    final Throwable c;

    ao(eu eu2) {
        this(eu2, false, null);
    }

    ao(eu eu2, boolean bl2, Throwable throwable) {
        cl.a(!bl2 || eu2 == eu.b, "shudownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", new Object[]{eu2});
        cl.a(!(throwable != null ^ eu2 == eu.f), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", new Object[]{eu2, throwable});
        this.a = eu2;
        this.b = bl2;
        this.c = throwable;
    }

    eu a() {
        if (this.b && this.a == eu.b) {
            return eu.d;
        }
        return this.a;
    }

    Throwable b() {
        cl.b(this.a == eu.f, "failureCause() is only valid if the service has failed, service is %s", new Object[]{this.a});
        return this.c;
    }
}

