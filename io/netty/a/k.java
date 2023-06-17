/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.j;
import io.netty.a.l;
import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bg;
import io.netty.channel.ct;
import java.util.Map;

class k
extends bg {
    final /* synthetic */ ct a;
    final /* synthetic */ ba b;
    final /* synthetic */ Map.Entry[] c;
    final /* synthetic */ Map.Entry[] d;
    final /* synthetic */ j e;

    k(j j2, ct ct2, ba ba2, Map.Entry[] arrentry, Map.Entry[] arrentry2) {
        this.e = j2;
        this.a = ct2;
        this.b = ba2;
        this.c = arrentry;
        this.d = arrentry2;
    }

    @Override
    public void a(an an2) {
        an2.c().b(new ba[]{new l(this.a, this.b, this.c, this.d)});
    }
}

