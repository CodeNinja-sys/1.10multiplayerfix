/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.d.sz;
import com.c.a.c.c;
import java.util.HashMap;
import net.minecraft.client.f.a;
import net.minecraft.client.f.e;
import net.minecraft.client.f.f;
import net.minecraft.client.r;

class p
implements Runnable {
    final /* synthetic */ e a;
    private final /* synthetic */ com.c.a.e b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ f d;

    p(e e2, com.c.a.e e3, boolean bl2, f f2) {
        this.a = e2;
        this.b = e3;
        this.c = bl2;
        this.d = f2;
    }

    @Override
    public void run() {
        HashMap hashMap = sz.c();
        try {
            hashMap.putAll(e.a(this.a).a(this.b, this.c));
        }
        catch (c c2) {
            // empty catch block
        }
        if (hashMap.isEmpty() && this.b.a().equals(r.z().K().e().a())) {
            this.b.c().h();
            this.b.c().a(r.z().L());
            hashMap.putAll(e.a(this.a).a(this.b, false));
        }
        r.z().a(new a(this, hashMap, this.d));
    }

    static /* synthetic */ e a(p p2) {
        return p2.a;
    }
}

