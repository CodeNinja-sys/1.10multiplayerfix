/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.eclipse.jetty.npn.NextProtoNego$ServerProvider
 */
package io.netty.c.c;

import io.netty.c.c.d;
import java.util.List;
import org.eclipse.jetty.npn.NextProtoNego;

class e
implements NextProtoNego.ServerProvider {
    final /* synthetic */ List a;
    final /* synthetic */ d b;

    e(d d2, List list) {
        this.b = d2;
        this.a = list;
    }

    public void a() {
        this.b.b().a((String)this.a.get(this.a.size() - 1));
    }

    public List b() {
        return this.a;
    }

    public void a(String string) {
        this.b.b().a(string);
    }
}

