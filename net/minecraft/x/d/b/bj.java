/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.b.cc;
import com.c.a.e;
import net.minecraft.q.am;
import net.minecraft.u.d.a;
import net.minecraft.u.d.b;
import net.minecraft.x.d.b.bm;

public class bj {
    private final int b;
    private final am c;
    private final e d;
    private final a e;
    final /* synthetic */ bm a;

    public bj(bm bm2, e e2, int n2, am am2, a a2) {
        this.a = bm2;
        this.d = e2;
        this.b = n2;
        this.c = am2;
        this.e = a2;
    }

    public e a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public am c() {
        return this.c;
    }

    public a d() {
        return this.e;
    }

    public String toString() {
        return cc.a((Object)this).a("latency", this.b).a("gameMode", (Object)this.c).a("profile", this.d).a("displayName", this.e == null ? null : net.minecraft.u.d.b.a(this.e)).toString();
    }
}

