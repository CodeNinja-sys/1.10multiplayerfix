/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.c;

import com.a.a.d.bw;
import com.a.a.d.hy;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.u.ar;
import net.minecraft.u.az;
import net.minecraft.u.c.e;

public class c
extends e
implements ar {
    protected final az a = new az(256);
    protected final Map b = ((bw)this.c).aT_();

    public void a(int n2, Object object, Object object2) {
        this.a.a(object2, n2);
        this.a(object, object2);
    }

    @Override
    protected Map a() {
        return hy.a();
    }

    @Override
    public Object a(Object object) {
        return super.a(object);
    }

    public Object b(Object object) {
        return this.b.get(object);
    }

    @Override
    public boolean c(Object object) {
        return super.c(object);
    }

    public int d(Object object) {
        return this.a.a(object);
    }

    public Object a(int n2) {
        return this.a.a(n2);
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }
}

