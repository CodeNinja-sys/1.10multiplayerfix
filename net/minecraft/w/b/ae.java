/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import java.util.Collections;
import java.util.List;
import net.minecraft.w.a.g;
import net.minecraft.w.b.a.i;
import net.minecraft.w.b.bm;
import net.minecraft.w.b.o;
import net.minecraft.w.b.w;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.t;
import org.apache.logging.log4j.c;

public class ae
extends bm {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final f b;
    private final cm c;
    private final w d;
    private l e;
    private final Class f;

    public ae(f f2, Class class_) {
        this.b = f2;
        this.f = class_;
        if (f2 instanceof t) {
            a.f("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.c = new o(this);
        this.d = new w(f2);
    }

    @Override
    public boolean e() {
        double d2 = this.f();
        List list = this.b.aQ.a(this.f, this.b.cT().b(d2, 4.0, d2), this.c);
        Collections.sort(list, this.d);
        if (list.isEmpty()) {
            return false;
        }
        this.e = (l)list.get(0);
        return true;
    }

    @Override
    public boolean a() {
        l l2 = this.b.W();
        if (l2 == null) {
            return false;
        }
        if (!l2.br()) {
            return false;
        }
        double d2 = this.f();
        return this.b.n(l2) > d2 * d2 ? false : !(l2 instanceof g) || !((g)l2).c.c();
    }

    @Override
    public void b() {
        this.b.c(this.e);
        super.b();
    }

    @Override
    public void c() {
        this.b.c((l)null);
        super.b();
    }

    protected double f() {
        i i2 = this.b.a(net.minecraft.w.d.b);
        return i2 == null ? 16.0 : i2.f();
    }

    static /* synthetic */ f a(ae ae2) {
        return ae2.b;
    }
}

