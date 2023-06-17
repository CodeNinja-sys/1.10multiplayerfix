/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.a.c;
import net.minecraft.client.k.bn;
import net.minecraft.q.a.y;
import net.minecraft.u.bp;

public class bc {
    private static final bp a = new bp("textures/map/map_icons.png");
    private final c b;
    private final Map c = sz.c();

    public bc(c c2) {
        this.b = c2;
    }

    public void a(y y2) {
        bn.a(this.b(y2));
    }

    public void a(y y2, boolean bl2) {
        bn.a(this.b(y2), bl2);
    }

    private bn b(y y2) {
        bn bn2 = (bn)this.c.get(y2.i);
        if (bn2 == null) {
            bn2 = new bn(this, y2, null);
            this.c.put(y2.i, bn2);
        }
        return bn2;
    }

    public void a() {
        for (bn bn2 : this.c.values()) {
            this.b.c(bn.b(bn2));
        }
        this.c.clear();
    }

    static /* synthetic */ c a(bc bc2) {
        return bc2.b;
    }

    static /* synthetic */ bp b() {
        return a;
    }
}

