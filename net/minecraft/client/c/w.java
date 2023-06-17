/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import net.minecraft.client.c.c;
import net.minecraft.u.bp;

class w
extends URLStreamHandler {
    private final /* synthetic */ bp a;

    w(bp bp2) {
        this.a = bp2;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new c(this, uRL, this.a);
    }
}

