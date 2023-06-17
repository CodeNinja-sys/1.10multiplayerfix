/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.eclipse.jetty.npn.NextProtoNego$ClientProvider
 */
package io.netty.c.c;

import io.netty.c.c.d;
import java.util.List;
import org.eclipse.jetty.npn.NextProtoNego;

class f
implements NextProtoNego.ClientProvider {
    final /* synthetic */ String[] a;
    final /* synthetic */ String b;
    final /* synthetic */ d c;

    f(d d2, String[] arrstring, String string) {
        this.c = d2;
        this.a = arrstring;
        this.b = string;
    }

    public boolean a() {
        return true;
    }

    public void b() {
        d.a(this.c).a(null);
    }

    public String a(List list) {
        for (String string : this.a) {
            if (!list.contains(string)) continue;
            return string;
        }
        return this.b;
    }
}

