/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import net.minecraft.client.c.w;
import net.minecraft.client.r;
import net.minecraft.u.bp;

class c
extends URLConnection {
    final /* synthetic */ w a;
    private final /* synthetic */ bp b;

    c(w w2, URL uRL, bp bp2) {
        this.a = w2;
        this.b = bp2;
        super(uRL);
    }

    @Override
    public void connect() {
    }

    @Override
    public InputStream getInputStream() {
        return r.z().O().a(this.b).b();
    }
}

