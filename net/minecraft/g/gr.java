/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.g.by;
import net.minecraft.g.c.b;
import net.minecraft.g.dj;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;

public class gr {
    private final k b;
    private final net.minecraft.u.b.b c;
    private final dj d;
    private b e;
    private final boolean f;
    private final List g = ov.a();
    final /* synthetic */ dj a;
    private static /* synthetic */ int[] h;

    public gr(dj dj2, k k2, net.minecraft.u.b.b b2, b b3) {
        this.a = dj2;
        this.b = k2;
        this.c = b2;
        this.e = b3;
        this.d = (dj)b3.c();
        by by2 = (by)((Object)b3.a(this.d.h()));
        this.f = this.d.d;
        this.a(by2);
    }

    public List a() {
        return this.g;
    }

    private void a(by by2) {
        this.g.clear();
        switch (gr.d()[by2.ordinal()]) {
            case 1: {
                this.g.add(this.c.d());
                this.g.add(this.c.e());
                break;
            }
            case 2: {
                this.g.add(this.c.f());
                this.g.add(this.c.g());
                break;
            }
            case 3: {
                this.g.add(this.c.f());
                this.g.add(this.c.g().b());
                break;
            }
            case 4: {
                this.g.add(this.c.f().b());
                this.g.add(this.c.g());
                break;
            }
            case 5: {
                this.g.add(this.c.d().b());
                this.g.add(this.c.e());
                break;
            }
            case 6: {
                this.g.add(this.c.d());
                this.g.add(this.c.e().b());
                break;
            }
            case 7: {
                this.g.add(this.c.g());
                this.g.add(this.c.e());
                break;
            }
            case 8: {
                this.g.add(this.c.f());
                this.g.add(this.c.e());
                break;
            }
            case 9: {
                this.g.add(this.c.f());
                this.g.add(this.c.d());
                break;
            }
            case 10: {
                this.g.add(this.c.g());
                this.g.add(this.c.d());
            }
        }
    }

    private void e() {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            gr gr2 = this.b((net.minecraft.u.b.b)this.g.get(i2));
            if (gr2 != null && gr2.a(this)) {
                this.g.set(i2, gr2.c);
                continue;
            }
            this.g.remove(i2--);
        }
    }

    private boolean a(net.minecraft.u.b.b b2) {
        return dj.c(this.b, b2) || dj.c(this.b, b2.b()) || dj.c(this.b, b2.c());
    }

    private gr b(net.minecraft.u.b.b b2) {
        gr gr2;
        b b3 = this.b.n(b2);
        if (dj.l(b3)) {
            dj dj2 = this.a;
            dj2.getClass();
            return new gr(dj2, this.b, b2, b3);
        }
        net.minecraft.u.b.b b4 = b2.b();
        b3 = this.b.n(b4);
        if (dj.l(b3)) {
            dj dj3 = this.a;
            dj3.getClass();
            return new gr(dj3, this.b, b4, b3);
        }
        b4 = b2.c();
        b3 = this.b.n(b4);
        if (dj.l(b3)) {
            dj dj4 = this.a;
            dj4.getClass();
            gr2 = new gr(dj4, this.b, b4, b3);
        } else {
            gr2 = null;
        }
        return gr2;
    }

    private boolean a(gr gr2) {
        return this.c(gr2.c);
    }

    private boolean c(net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.u.b.b b3 = (net.minecraft.u.b.b)this.g.get(i2);
            if (b3.cy_() != b2.cy_() || b3.l() != b2.l()) continue;
            return true;
        }
        return false;
    }

    protected int b() {
        int n2 = 0;
        for (ad ad2 : ag.a) {
            if (!this.a(this.c.a(ad2))) continue;
            ++n2;
        }
        return n2;
    }

    private boolean b(gr gr2) {
        return this.a(gr2) || this.g.size() != 2;
    }

    private void c(gr gr2) {
        this.g.add(gr2.c);
        net.minecraft.u.b.b b2 = this.c.d();
        net.minecraft.u.b.b b3 = this.c.e();
        net.minecraft.u.b.b b4 = this.c.f();
        net.minecraft.u.b.b b5 = this.c.g();
        boolean bl2 = this.c(b2);
        boolean bl3 = this.c(b3);
        boolean bl4 = this.c(b4);
        boolean bl5 = this.c(b5);
        by by2 = null;
        if (bl2 || bl3) {
            by2 = by.a;
        }
        if (bl4 || bl5) {
            by2 = by.b;
        }
        if (!this.f) {
            if (bl3 && bl5 && !bl2 && !bl4) {
                by2 = by.g;
            }
            if (bl3 && bl4 && !bl2 && !bl5) {
                by2 = by.h;
            }
            if (bl2 && bl4 && !bl3 && !bl5) {
                by2 = by.i;
            }
            if (bl2 && bl5 && !bl3 && !bl4) {
                by2 = by.j;
            }
        }
        if (by2 == by.a) {
            if (dj.c(this.b, b2.b())) {
                by2 = by.e;
            }
            if (dj.c(this.b, b3.b())) {
                by2 = by.f;
            }
        }
        if (by2 == by.b) {
            if (dj.c(this.b, b5.b())) {
                by2 = by.c;
            }
            if (dj.c(this.b, b4.b())) {
                by2 = by.d;
            }
        }
        if (by2 == null) {
            by2 = by.a;
        }
        this.e = this.e.a(this.d.h(), (Comparable)((Object)by2));
        this.b.a(this.c, this.e, 3);
    }

    private boolean d(net.minecraft.u.b.b b2) {
        gr gr2 = this.b(b2);
        if (gr2 == null) {
            return false;
        }
        gr2.e();
        return gr2.b(this);
    }

    public gr a(boolean bl2, boolean bl3) {
        net.minecraft.u.b.b b2 = this.c.d();
        net.minecraft.u.b.b b3 = this.c.e();
        net.minecraft.u.b.b b4 = this.c.f();
        net.minecraft.u.b.b b5 = this.c.g();
        boolean bl4 = this.d(b2);
        boolean bl5 = this.d(b3);
        boolean bl6 = this.d(b4);
        boolean bl7 = this.d(b5);
        by by2 = null;
        if ((bl4 || bl5) && !bl6 && !bl7) {
            by2 = by.a;
        }
        if ((bl6 || bl7) && !bl4 && !bl5) {
            by2 = by.b;
        }
        if (!this.f) {
            if (bl5 && bl7 && !bl4 && !bl6) {
                by2 = by.g;
            }
            if (bl5 && bl6 && !bl4 && !bl7) {
                by2 = by.h;
            }
            if (bl4 && bl6 && !bl5 && !bl7) {
                by2 = by.i;
            }
            if (bl4 && bl7 && !bl5 && !bl6) {
                by2 = by.j;
            }
        }
        if (by2 == null) {
            if (bl4 || bl5) {
                by2 = by.a;
            }
            if (bl6 || bl7) {
                by2 = by.b;
            }
            if (!this.f) {
                if (bl2) {
                    if (bl5 && bl7) {
                        by2 = by.g;
                    }
                    if (bl6 && bl5) {
                        by2 = by.h;
                    }
                    if (bl7 && bl4) {
                        by2 = by.j;
                    }
                    if (bl4 && bl6) {
                        by2 = by.i;
                    }
                } else {
                    if (bl4 && bl6) {
                        by2 = by.i;
                    }
                    if (bl7 && bl4) {
                        by2 = by.j;
                    }
                    if (bl6 && bl5) {
                        by2 = by.h;
                    }
                    if (bl5 && bl7) {
                        by2 = by.g;
                    }
                }
            }
        }
        if (by2 == by.a) {
            if (dj.c(this.b, b2.b())) {
                by2 = by.e;
            }
            if (dj.c(this.b, b3.b())) {
                by2 = by.f;
            }
        }
        if (by2 == by.b) {
            if (dj.c(this.b, b5.b())) {
                by2 = by.c;
            }
            if (dj.c(this.b, b4.b())) {
                by2 = by.d;
            }
        }
        if (by2 == null) {
            by2 = by.a;
        }
        this.a(by2);
        this.e = this.e.a(this.d.h(), (Comparable)((Object)by2));
        if (bl3 || this.b.n(this.c) != this.e) {
            this.b.a(this.c, this.e, 3);
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                gr gr2 = this.b((net.minecraft.u.b.b)this.g.get(i2));
                if (gr2 == null) continue;
                gr2.e();
                if (!gr2.b(this)) continue;
                gr2.c(this);
            }
        }
        return this;
    }

    public b c() {
        return this.e;
    }

    static /* synthetic */ int[] d() {
        if (h != null) {
            return h;
        }
        int[] arrn = new int[by.values().length];
        try {
            arrn[by.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.j.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.i.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[by.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        h = arrn;
        return arrn;
    }
}

