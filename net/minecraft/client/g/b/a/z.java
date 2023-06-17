/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.at;
import net.minecraft.client.g.b.a.q;
import net.minecraft.g.c.b;
import net.minecraft.u.ad;

public class z
implements aq {
    private final q a;
    private final at b;

    public z(q q2, at at2) {
        this.a = q2;
        this.b = at2;
    }

    @Override
    public List a(b b2, ad ad2, long l2) {
        return Collections.emptyList();
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public d d() {
        return null;
    }

    @Override
    public q e() {
        return this.a;
    }

    @Override
    public at f() {
        return this.b;
    }
}

