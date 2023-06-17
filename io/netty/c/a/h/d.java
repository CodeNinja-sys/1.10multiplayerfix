/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.h;

import io.netty.b.g;
import io.netty.c.a.u;
import io.netty.channel.bd;
import io.netty.channel.g.f;
import java.util.List;

public class d
extends u {
    private final int a;
    private final int b;

    public d(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    protected void a(bd bd2, g g2, List list) {
        list.add(new f(this.a, this.b, g2.ab()));
    }
}

