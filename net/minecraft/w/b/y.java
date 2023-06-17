/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import java.util.Collections;
import java.util.List;
import net.minecraft.u.b.a;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.b.f;
import net.minecraft.w.b.i;
import net.minecraft.w.b.s;
import net.minecraft.w.b.w;
import net.minecraft.w.l;
import net.minecraft.w.t;

public class y
extends s {
    protected final Class a;
    private final int i;
    protected final w b;
    protected final cm g;
    protected l h;

    public y(t t2, Class class_, boolean bl2) {
        this(t2, class_, bl2, false);
    }

    public y(t t2, Class class_, boolean bl2, boolean bl3) {
        this(t2, class_, 10, bl2, bl3, null);
    }

    public y(t t2, Class class_, int n2, boolean bl2, boolean bl3, cm cm2) {
        super(t2, bl2, bl3);
        this.a = class_;
        this.i = n2;
        this.b = new w(t2);
        this.b(1);
        this.g = new f(this, cm2);
    }

    @Override
    public boolean e() {
        if (this.i > 0 && this.c.bd().nextInt(this.i) != 0) {
            return false;
        }
        if (this.a != b.class && this.a != g.class) {
            List list = this.c.aQ.a(this.a, this.a(this.f()), this.g);
            if (list.isEmpty()) {
                return false;
            }
            Collections.sort(list, this.b);
            this.h = (l)list.get(0);
            return true;
        }
        this.h = this.c.aQ.a(this.c.aU, this.c.aV + (double)this.c.ce_(), this.c.aW, this.f(), this.f(), new i(this), this.g);
        return this.h != null;
    }

    protected a a(double d2) {
        return this.c.cT().b(d2, 4.0, d2);
    }

    @Override
    public void b() {
        this.c.c(this.h);
        super.b();
    }
}

