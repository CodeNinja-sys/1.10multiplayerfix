/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.c.a.c.g;
import com.c.a.c.h;
import java.util.Map;
import net.minecraft.client.f.f;
import net.minecraft.client.f.p;

class a
implements Runnable {
    final /* synthetic */ p a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ f c;

    a(p p2, Map map, f f2) {
        this.a = p2;
        this.b = map;
        this.c = f2;
    }

    @Override
    public void run() {
        if (this.b.containsKey((Object)h.a)) {
            p.a(this.a).a((g)this.b.get((Object)h.a), h.a, this.c);
        }
        if (this.b.containsKey((Object)h.b)) {
            p.a(this.a).a((g)this.b.get((Object)h.b), h.b, this.c);
        }
    }
}

