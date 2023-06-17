/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b.a;

import com.a.a.d.aad;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.u.bf;
import net.minecraft.w.b.a.a;
import net.minecraft.w.b.a.b;
import net.minecraft.w.b.a.c;
import net.minecraft.w.b.a.f;
import net.minecraft.w.b.a.i;

public class e
extends b {
    private final Set e = aad.a();
    protected final Map d = new bf();

    public a d(f f2) {
        return (a)super.a(f2);
    }

    public a b(String string) {
        i i2 = super.a(string);
        if (i2 == null) {
            i2 = (i)this.d.get(string);
        }
        return (a)i2;
    }

    @Override
    public i b(f f2) {
        i i2 = super.b(f2);
        if (f2 instanceof c && ((c)f2).a() != null) {
            this.d.put(((c)f2).a(), i2);
        }
        return i2;
    }

    @Override
    protected i c(f f2) {
        return new a(this, f2);
    }

    @Override
    public void a(i i2) {
        if (i2.a().d()) {
            this.e.add(i2);
        }
        for (f f2 : this.c.c(i2.a())) {
            a a2 = this.d(f2);
            if (a2 == null) continue;
            a2.d();
        }
    }

    public Set b() {
        return this.e;
    }

    public Collection c() {
        HashSet hashSet = aad.a();
        for (i i2 : this.a()) {
            if (!i2.a().d()) continue;
            hashSet.add(i2);
        }
        return hashSet;
    }

    @Override
    public /* synthetic */ i a(String string) {
        return this.b(string);
    }

    @Override
    public /* synthetic */ i a(f f2) {
        return this.d(f2);
    }
}

