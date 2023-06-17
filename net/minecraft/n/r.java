/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.cv;
import java.util.Comparator;
import net.minecraft.u.b.s;
import net.minecraft.w.n;

class r
implements Comparator {
    private final /* synthetic */ s a;

    r(s s2) {
        this.a = s2;
    }

    public int a(n n2, n n3) {
        return cv.a().a(n2.h(this.a.b, this.a.c, this.a.d), n3.h(this.a.b, this.a.c, this.a.d)).b();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((n)object, (n)object2);
    }
}

