/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.m.cg;
import net.minecraft.u.b.n;
import net.minecraft.u.k;

public class j {
    private final Map a = sz.c();
    private int b;

    public boolean a(cg cg2) {
        return this.a(cg2, 0.0f) > 0.0f;
    }

    public float a(cg cg2, float f2) {
        k k2 = (k)this.a.get(cg2);
        if (k2 != null) {
            float f3 = k2.b - k2.a;
            float f4 = (float)k2.b - ((float)this.b + f2);
            return n.a(f4 / f3, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public void a() {
        ++this.b;
        if (!this.a.isEmpty()) {
            Iterator iterator = this.a.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                if (((k)entry.getValue()).b > this.b) continue;
                iterator.remove();
                this.c((cg)entry.getKey());
            }
        }
    }

    public void a(cg cg2, int n2) {
        this.a.put(cg2, new k(this, this.b, this.b + n2, null));
        this.b(cg2, n2);
    }

    public void b(cg cg2) {
        this.a.remove(cg2);
        this.c(cg2);
    }

    protected void b(cg cg2, int n2) {
    }

    protected void c(cg cg2) {
    }
}

