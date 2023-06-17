/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.mq;
import net.minecraft.client.g.b.a.a.h;
import net.minecraft.client.g.b.a.a.m;
import net.minecraft.g.c.i;

public class g
implements h {
    private final Iterable c;

    public g(Iterable iterable) {
        this.c = iterable;
    }

    @Override
    public cm a(i i2) {
        return cn.a(mq.a(this.c, new m(this, i2)));
    }
}

