/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import net.minecraft.j.j;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.n.az;
import net.minecraft.u.bw;
import net.minecraft.u.d.a;
import net.minecraft.u.d.f;

public class i
extends f {
    private final String b;
    private final String c;
    private String d = "";

    public i(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.c;
    }

    public void b(String string) {
        this.d = string;
    }

    @Override
    public String b() {
        return this.d;
    }

    public void a(az az2) {
        j j2;
        r r2;
        net.minecraft.c.a a2 = az2.aS();
        if (a2 != null && a2.W() && bw.b(this.d) && (r2 = a2.a(0).Q()).b(this.b, j2 = r2.b(this.c))) {
            p p2 = r2.c(this.b, j2);
            this.b(String.format("%d", p2.b()));
            return;
        }
        this.d = "";
    }

    public i i() {
        i i2 = new i(this.b, this.c);
        i2.b(this.d);
        i2.a(this.a().l());
        for (a a2 : this.e()) {
            i2.a(a2.f());
        }
        return i2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        i i2 = (i)object;
        return this.b.equals(i2.b) && this.c.equals(i2.c) && super.equals(object);
    }

    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.b + '\'' + "objective='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + this.a() + '}';
    }

    @Override
    public /* synthetic */ a f() {
        return this.i();
    }
}

