/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.ar;
import net.minecraft.client.g.b.a.n;

public class ap {
    private final List a = ov.a();

    public ap a(aq aq2, int n2) {
        this.a.add(new n(aq2, n2));
        return this;
    }

    public ar a() {
        Collections.sort(this.a);
        return new ar(this.a);
    }

    public aq b() {
        return ((n)this.a.get((int)0)).a;
    }
}

