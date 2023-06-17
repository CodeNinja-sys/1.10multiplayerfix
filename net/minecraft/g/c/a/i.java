/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c.a;

import com.a.a.b.cm;
import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.g.c.a.a;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;

public class i
implements cm {
    public static final cm a = new a();
    private final net.minecraft.g.c.i b;
    private final Map c = sz.c();

    private i(net.minecraft.g.c.i i2) {
        this.b = i2;
    }

    public static i a(cn cn2) {
        return new i(cn2.u());
    }

    public boolean a(b b2) {
        if (b2 != null && b2.c().equals(this.b.c())) {
            for (Map.Entry entry : this.c.entrySet()) {
                if (this.a(b2, (net.minecraft.g.b.b)entry.getKey(), (cm)entry.getValue())) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    protected boolean a(b b2, net.minecraft.g.b.b b3, cm cm2) {
        return cm2.a(b2.a(b3));
    }

    public i a(net.minecraft.g.b.b b2, cm cm2) {
        if (!this.b.d().contains(b2)) {
            throw new IllegalArgumentException(this.b + " cannot support property " + b2);
        }
        this.c.put(b2, cm2);
        return this;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((b)object);
    }
}

