/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b.a;

import com.a.a.d.io;
import com.a.a.d.sz;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Map;
import net.minecraft.u.bf;
import net.minecraft.w.b.a.f;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;

public abstract class b {
    protected final Map a = sz.c();
    protected final Map b = new bf();
    protected final vi c = io.v();

    public i a(f f2) {
        return (i)this.a.get(f2);
    }

    public i a(String string) {
        return (i)this.b.get(string);
    }

    public i b(f f2) {
        if (this.b.containsKey(f2.b())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        i i2 = this.c(f2);
        this.b.put(f2.b(), i2);
        this.a.put(f2, i2);
        for (f f3 = f2.e(); f3 != null; f3 = f3.e()) {
            this.c.a(f3, f2);
        }
        return i2;
    }

    protected abstract i c(f var1);

    public Collection a() {
        return this.b.values();
    }

    public void a(i i2) {
    }

    public void a(vi vi2) {
        for (Map.Entry entry : vi2.l()) {
            i i2 = this.a((String)entry.getKey());
            if (i2 == null) continue;
            i2.c((h)entry.getValue());
        }
    }

    public void b(vi vi2) {
        for (Map.Entry entry : vi2.l()) {
            i i2 = this.a((String)entry.getKey());
            if (i2 == null) continue;
            i2.c((h)entry.getValue());
            i2.b((h)entry.getValue());
        }
    }
}

