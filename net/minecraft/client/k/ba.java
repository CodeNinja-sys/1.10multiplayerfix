/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.cv;
import java.util.Comparator;
import net.minecraft.client.l.r;
import net.minecraft.j.d;
import net.minecraft.q.am;

class ba
implements Comparator {
    private ba() {
    }

    public int a(r r2, r r3) {
        d d2 = r2.i();
        d d3 = r3.i();
        return cv.a().a(r2.b() != am.e, r3.b() != am.e).a((Comparable)((Object)(d2 != null ? d2.a() : "")), (Comparable)((Object)(d3 != null ? d3.a() : ""))).a((Comparable)((Object)r2.a().b()), (Comparable)((Object)r3.a().b())).b();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((r)object, (r)object2);
    }

    /* synthetic */ ba(ba ba2) {
        this();
    }
}

