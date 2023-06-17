/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.b.cm;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.at;
import net.minecraft.client.g.b.a.q;
import net.minecraft.g.c.b;
import net.minecraft.u.ad;

public class u
implements aq {
    private final Map f;
    protected final boolean a;
    protected final boolean b;
    protected final d c;
    protected final q d;
    protected final at e;

    public u(Map map) {
        this.f = map;
        aq aq2 = (aq)map.values().iterator().next();
        this.a = aq2.a();
        this.b = aq2.b();
        this.c = aq2.d();
        this.d = aq2.e();
        this.e = aq2.f();
    }

    @Override
    public List a(b b2, ad ad2, long l2) {
        ArrayList arrayList = ov.a();
        if (b2 != null) {
            for (Map.Entry entry : this.f.entrySet()) {
                if (!((cm)entry.getKey()).a(b2)) continue;
                arrayList.addAll(((aq)entry.getValue()).a(b2, ad2, l2++));
            }
        }
        return arrayList;
    }

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return this.b;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public d d() {
        return this.c;
    }

    @Override
    public q e() {
        return this.d;
    }

    @Override
    public at f() {
        return this.e;
    }
}

