/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.c.u;
import net.minecraft.u.c.e;

public class f
extends e {
    private Map a;

    @Override
    protected Map a() {
        this.a = sz.c();
        return this.a;
    }

    public void a(u u2) {
        this.a(u2.b(), u2);
    }

    public void b() {
        this.a.clear();
    }
}

