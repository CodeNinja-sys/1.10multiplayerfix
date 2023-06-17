/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.r.k;
import net.minecraft.r.o;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class be
implements p {
    private Map a;

    public be() {
    }

    public be(Map map) {
        this.a = map;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        int n2 = a2.e();
        this.a = sz.c();
        for (int i2 = 0; i2 < n2; ++i2) {
            k k2 = o.a(a2.e(32767));
            int n3 = a2.e();
            if (k2 == null) continue;
            this.a.put(k2, n3);
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            a2.a(((k)entry.getKey()).e);
            a2.d((Integer)entry.getValue());
        }
    }

    public Map a() {
        return this.a;
    }
}

