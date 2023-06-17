/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b.a;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.w.b.a.b;
import net.minecraft.w.b.a.f;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;

public class a
implements i {
    private final b a;
    private final f b;
    private final Map c = sz.c();
    private final Map d = sz.c();
    private final Map e = sz.c();
    private double f;
    private boolean g = true;
    private double h;

    public a(b b2, f f2) {
        this.a = b2;
        this.b = f2;
        this.f = f2.c();
        for (int i2 = 0; i2 < 3; ++i2) {
            this.c.put(i2, aad.a());
        }
    }

    @Override
    public f a() {
        return this.b;
    }

    @Override
    public double b() {
        return this.f;
    }

    @Override
    public void a(double d2) {
        if (d2 != this.b()) {
            this.f = d2;
            this.d();
        }
    }

    @Override
    public Collection a(int n2) {
        return (Collection)this.c.get(n2);
    }

    @Override
    public Collection c() {
        HashSet hashSet = aad.a();
        for (int i2 = 0; i2 < 3; ++i2) {
            hashSet.addAll(this.a(i2));
        }
        return hashSet;
    }

    @Override
    public h a(UUID uUID) {
        return (h)this.e.get(uUID);
    }

    @Override
    public boolean a(h h2) {
        return this.e.get(h2.a()) != null;
    }

    @Override
    public void b(h h2) {
        if (this.a(h2.a()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        Set set = (Set)this.d.get(h2.b());
        if (set == null) {
            set = aad.a();
            this.d.put(h2.b(), set);
        }
        ((Set)this.c.get(h2.c())).add(h2);
        set.add(h2);
        this.e.put(h2.a(), h2);
        this.d();
    }

    protected void d() {
        this.g = true;
        this.a.a(this);
    }

    @Override
    public void c(h h2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            Set set = (Set)this.c.get(i2);
            set.remove(h2);
        }
        Set set = (Set)this.d.get(h2.b());
        if (set != null) {
            set.remove(h2);
            if (set.isEmpty()) {
                this.d.remove(h2.b());
            }
        }
        this.e.remove(h2.a());
        this.d();
    }

    @Override
    public void b(UUID uUID) {
        h h2 = this.a(uUID);
        if (h2 != null) {
            this.c(h2);
        }
    }

    @Override
    public void e() {
        Collection collection = this.c();
        if (collection != null) {
            for (h h2 : ov.a(collection)) {
                this.c(h2);
            }
        }
    }

    @Override
    public double f() {
        if (this.g) {
            this.h = this.g();
            this.g = false;
        }
        return this.h;
    }

    private double g() {
        double d2 = this.b();
        for (h h2 : this.b(0)) {
            d2 += h2.d();
        }
        double d3 = d2;
        for (h h3 : this.b(1)) {
            d3 += d2 * h3.d();
        }
        for (h h3 : this.b(2)) {
            d3 *= 1.0 + h3.d();
        }
        return this.b.a(d3);
    }

    private Collection b(int n2) {
        HashSet hashSet = aad.b(this.a(n2));
        for (f f2 = this.b.e(); f2 != null; f2 = f2.e()) {
            i i2 = this.a.a(f2);
            if (i2 == null) continue;
            hashSet.addAll(i2.a(n2));
        }
        return hashSet;
    }
}

