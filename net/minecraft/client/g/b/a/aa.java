/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.b.cm;
import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.u;

public class aa {
    private final Map a = sz.d();

    public void a(cm cm2, aq aq2) {
        this.a.put(cm2, aq2);
    }

    public aq a() {
        return new u(this.a);
    }
}

