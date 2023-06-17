/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.an;
import io.netty.b.au;
import io.netty.util.b.z;
import java.util.concurrent.atomic.AtomicInteger;

final class av
extends z {
    private final AtomicInteger b = new AtomicInteger();
    final /* synthetic */ au a;

    av(au au2) {
        this.a = au2;
    }

    protected an a() {
        int n2 = this.b.getAndIncrement();
        ah ah2 = au.a(this.a) != null ? au.a(this.a)[Math.abs(n2 % au.a(this.a).length)] : null;
        ah ah3 = au.b(this.a) != null ? au.b(this.a)[Math.abs(n2 % au.b(this.a).length)] : null;
        return new an(ah2, ah3, au.c(this.a), au.d(this.a), au.e(this.a), au.k(), au.l());
    }

    protected void a(an an2) {
        an2.a();
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}

