/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.gd;
import com.a.a.d.hi;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.m.ae;
import com.a.a.m.aj;
import com.a.a.m.ak;
import com.a.a.m.an;
import com.a.a.m.at;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public class aw
extends hi
implements Serializable {
    private transient lo a;
    private static final long c = 0L;
    final /* synthetic */ ae b;

    aw(ae ae2) {
        this.b = ae2;
    }

    public aw e() {
        return new ak(this.b, this);
    }

    public aw c() {
        return new aj(this.b, null);
    }

    @Override
    protected Set bI_() {
        lo lo2 = this.a;
        if (lo2 == null) {
            jl jl2 = an.a.a(this.b);
            this.a = gd.a(jl2).a(at.a).h();
            return this.a;
        }
        return lo2;
    }

    public Set d() {
        jl jl2 = an.b.a(ae.b(this.b));
        return lo.a(jl2);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }
}

