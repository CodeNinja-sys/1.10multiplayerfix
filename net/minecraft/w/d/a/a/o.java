/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.u.b.s;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class o
extends k {
    private static final d b = org.apache.logging.log4j.c.c();
    private s c;
    private int d;

    public o(a a2) {
        super(a2);
    }

    @Override
    public void b() {
        if (this.c == null) {
            b.f("Aborting charge player as no target was set.");
            this.a.p().a(j.a);
        } else if (this.d > 0 && this.d++ >= 10) {
            this.a.p().a(j.a);
        } else {
            double d2 = this.c.c(this.a.aU, this.a.aV, this.a.aW);
            if (d2 < 100.0 || d2 > 22500.0 || this.a.bf || this.a.bg) {
                ++this.d;
            }
        }
    }

    @Override
    public void e() {
        this.c = null;
        this.d = 0;
    }

    public void a(s s2) {
        this.c = s2;
    }

    @Override
    public float c() {
        return 3.0f;
    }

    @Override
    public s f() {
        return this.c;
    }

    @Override
    public j g() {
        return j.i;
    }
}

