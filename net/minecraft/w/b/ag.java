/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import java.util.Collections;
import java.util.List;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.b.a.i;
import net.minecraft.w.b.bm;
import net.minecraft.w.b.l;
import net.minecraft.w.b.w;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.t;
import org.apache.logging.log4j.c;

public class ag
extends bm {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final f b;
    private final cm c;
    private final w d;
    private net.minecraft.w.l e;

    public ag(f f2) {
        this.b = f2;
        if (f2 instanceof t) {
            a.f("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.c = new l(this);
        this.d = new w(f2);
    }

    @Override
    public boolean e() {
        double d2 = this.f();
        List list = this.b.aQ.a(b.class, this.b.cT().b(d2, 4.0, d2), this.c);
        Collections.sort(list, this.d);
        if (list.isEmpty()) {
            return false;
        }
        this.e = (net.minecraft.w.l)list.get(0);
        return true;
    }

    @Override
    public boolean a() {
        net.minecraft.w.l l2 = this.b.W();
        if (l2 == null) {
            return false;
        }
        if (!l2.br()) {
            return false;
        }
        if (l2 instanceof b && ((b)l2).J.a) {
            return false;
        }
        net.minecraft.j.i i2 = this.b.aA();
        net.minecraft.j.i i3 = l2.aA();
        if (i2 != null && i3 == i2) {
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
        this.b.c((net.minecraft.w.l)null);
        super.b();
    }

    protected double f() {
        i i2 = this.b.a(net.minecraft.w.d.b);
        return i2 == null ? 16.0 : i2.f();
    }

    static /* synthetic */ f a(ag ag2) {
        return ag2.b;
    }
}

