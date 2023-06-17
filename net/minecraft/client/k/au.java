/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.util.List;
import net.minecraft.client.f.ad;
import net.minecraft.client.g.ci;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.ca;
import net.minecraft.client.r;
import net.minecraft.u.d.o;

public abstract class au
extends ca {
    protected final r a;
    protected final List b;

    public au(r r2, int n2, int n3, List list) {
        super(r2, n2, n3, 32, n3 - 55 + 4, 36);
        this.a = r2;
        this.b = list;
        this.m = false;
        this.a(true, (int)((float)r2.m.a * 1.5f));
    }

    @Override
    protected void a(int n2, int n3, ci ci2) {
        String string = (Object)((Object)net.minecraft.u.d.o.t) + (Object)((Object)net.minecraft.u.d.o.r) + this.b();
        this.a.m.a(string, n2 + this.d / 2 - this.a.m.a(string) / 2, Math.min(this.f + 3, n3), 0xFFFFFF);
    }

    protected abstract String b();

    public List e() {
        return this.b;
    }

    @Override
    protected int a() {
        return this.e().size();
    }

    public ad b(int n2) {
        return (ad)this.e().get(n2);
    }

    @Override
    public int i() {
        return this.d;
    }

    @Override
    protected int j() {
        return this.h - 6;
    }

    @Override
    public /* synthetic */ bo e(int n2) {
        return this.b(n2);
    }
}

