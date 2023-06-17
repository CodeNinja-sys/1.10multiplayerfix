/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cn;
import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.u.ar;

public class bn
implements ar {
    private final IdentityHashMap a;
    private final List b;

    public bn() {
        this(512);
    }

    public bn(int n2) {
        this.b = ov.c(n2);
        this.a = new IdentityHashMap(n2);
    }

    public void a(Object object, int n2) {
        this.a.put(object, n2);
        while (this.b.size() <= n2) {
            this.b.add(null);
        }
        this.b.set(n2, object);
    }

    public int a(Object object) {
        Integer n2 = (Integer)this.a.get(object);
        return n2 == null ? -1 : n2;
    }

    public final Object a(int n2) {
        return n2 >= 0 && n2 < this.b.size() ? this.b.get(n2) : null;
    }

    public Iterator iterator() {
        return nj.b(this.b.iterator(), cn.d());
    }

    public int a() {
        return this.a.size();
    }
}

