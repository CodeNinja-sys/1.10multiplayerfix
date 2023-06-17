/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.c.a;
import net.minecraft.j.d;
import net.minecraft.j.j;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.bq;
import net.minecraft.x.d.b.cd;
import net.minecraft.x.d.b.i;
import net.minecraft.x.d.b.v;

public class c
extends r {
    private final a a;
    private final Set b = aad.a();
    private Runnable[] c = new Runnable[0];

    public c(a a2) {
        this.a = a2;
    }

    @Override
    public void a(p p2) {
        super.a(p2);
        if (this.b.contains(p2.c())) {
            this.a.av().a(new v(p2));
        }
        this.a();
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.a.av().a(new v(string));
        this.a();
    }

    @Override
    public void a(String string, j j2) {
        super.a(string, j2);
        this.a.av().a(new v(string, j2));
        this.a();
    }

    @Override
    public void a(int n2, j j2) {
        j j3 = this.a(n2);
        super.a(n2, j2);
        if (j3 != j2 && j3 != null) {
            if (this.h(j3) > 0) {
                this.a.av().a(new i(n2, j2));
            } else {
                this.g(j3);
            }
        }
        if (j2 != null) {
            if (this.b.contains(j2)) {
                this.a.av().a(new i(n2, j2));
            } else {
                this.e(j2);
            }
        }
        this.a();
    }

    @Override
    public boolean a(String string, String string2) {
        if (super.a(string, string2)) {
            d d2 = this.d(string2);
            this.a.av().a(new cd(d2, Arrays.asList(string), 3));
            this.a();
            return true;
        }
        return false;
    }

    @Override
    public void a(String string, d d2) {
        super.a(string, d2);
        this.a.av().a(new cd(d2, Arrays.asList(string), 4));
        this.a();
    }

    @Override
    public void a(j j2) {
        super.a(j2);
        this.a();
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        if (this.b.contains(j2)) {
            this.a.av().a(new bq(j2, 2));
        }
        this.a();
    }

    @Override
    public void c(j j2) {
        super.c(j2);
        if (this.b.contains(j2)) {
            this.g(j2);
        }
        this.a();
    }

    @Override
    public void a(d d2) {
        super.a(d2);
        this.a.av().a(new cd(d2, 0));
        this.a();
    }

    @Override
    public void b(d d2) {
        super.b(d2);
        this.a.av().a(new cd(d2, 2));
        this.a();
    }

    @Override
    public void c(d d2) {
        super.c(d2);
        this.a.av().a(new cd(d2, 1));
        this.a();
    }

    public void a(Runnable runnable) {
        this.c = Arrays.copyOf(this.c, this.c.length + 1);
        this.c[this.c.length - 1] = runnable;
    }

    protected void a() {
        Runnable[] arrrunnable = this.c;
        int n2 = this.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Runnable runnable = arrrunnable[i2];
            runnable.run();
        }
    }

    public List d(j j2) {
        ArrayList arrayList = ov.a();
        arrayList.add(new bq(j2, 0));
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != j2) continue;
            arrayList.add(new i(i2, j2));
        }
        for (p p2 : this.i(j2)) {
            arrayList.add(new v(p2));
        }
        return arrayList;
    }

    public void e(j j2) {
        List list = this.d(j2);
        for (g g2 : this.a.av().u()) {
            for (net.minecraft.x.p p2 : list) {
                g2.a.a(p2);
            }
        }
        this.b.add(j2);
    }

    public List f(j j2) {
        ArrayList arrayList = ov.a();
        arrayList.add(new bq(j2, 1));
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != j2) continue;
            arrayList.add(new i(i2, j2));
        }
        return arrayList;
    }

    public void g(j j2) {
        List list = this.f(j2);
        for (g g2 : this.a.av().u()) {
            for (net.minecraft.x.p p2 : list) {
                g2.a.a(p2);
            }
        }
        this.b.remove(j2);
    }

    public int h(j j2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != j2) continue;
            ++n2;
        }
        return n2;
    }
}

