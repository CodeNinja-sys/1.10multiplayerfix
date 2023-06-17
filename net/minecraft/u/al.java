/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.Map;
import net.minecraft.u.ak;

class al
extends an {
    final /* synthetic */ ak a;
    private final /* synthetic */ Map b;

    al(ak ak2, Map map) {
        this.a = ak2;
        this.b = map;
    }

    @Override
    public void a(e e2, Object object) {
        if (object == null) {
            e2.f();
        } else {
            e2.b(ak.a(this.a, object));
        }
    }

    @Override
    public Object a(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        return this.b.get(a2.h());
    }
}

