/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import net.minecraft.u.d.a;
import net.minecraft.u.d.c;
import net.minecraft.u.d.g;
import net.minecraft.u.d.h;
import net.minecraft.u.d.k;
import net.minecraft.u.d.o;

public abstract class f
implements a {
    protected List a = ov.a();
    private c b;

    @Override
    public a a(a a2) {
        a2.a().a(this.a());
        this.a.add(a2);
        return this;
    }

    @Override
    public List e() {
        return this.a;
    }

    @Override
    public a a(String string) {
        return this.a(new k(string));
    }

    @Override
    public a a(c c2) {
        this.b = c2;
        for (a a2 : this.a) {
            a2.a().a(this.a());
        }
        return this;
    }

    @Override
    public c a() {
        if (this.b == null) {
            this.b = new c();
            for (a a2 : this.a) {
                a2.a().a(this.b);
            }
        }
        return this.b;
    }

    public Iterator iterator() {
        return nj.b((Iterator)nj.b(this), f.a(this.a));
    }

    @Override
    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        for (a a2 : this) {
            stringBuilder.append(a2.b());
        }
        return stringBuilder.toString();
    }

    @Override
    public final String d() {
        StringBuilder stringBuilder = new StringBuilder();
        for (a a2 : this) {
            stringBuilder.append(a2.a().k());
            stringBuilder.append(a2.b());
            stringBuilder.append((Object)o.v);
        }
        return stringBuilder.toString();
    }

    public static Iterator a(Iterable iterable) {
        Iterator iterator = nj.e(nj.a(iterable.iterator(), new g()));
        iterator = nj.a(iterator, new h());
        return iterator;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        return this.a.equals(f2.a) && this.a().equals(f2.a());
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + this.a.hashCode();
    }

    public String toString() {
        return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
    }
}

