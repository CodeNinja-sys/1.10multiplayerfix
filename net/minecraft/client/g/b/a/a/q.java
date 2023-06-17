/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.mq;
import net.minecraft.client.g.b.a.a.h;
import net.minecraft.client.g.b.a.a.p;
import net.minecraft.g.c.i;

public class q
implements h {
    final Iterable c;

    public q(Iterable iterable) {
        this.c = iterable;
    }

    @Override
    public cm a(i i2) {
        return cn.b(mq.a(this.c, new p(this, i2)));
    }
}

