/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.b;

import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.g.b.b.e;
import net.minecraft.g.b.b;

public class d {
    private b a;
    private String b;
    private final List c = ov.a();

    public d a(b b2) {
        this.a = b2;
        return this;
    }

    public d a(String string) {
        this.b = string;
        return this;
    }

    public d a(b ... arrb) {
        Collections.addAll(this.c, arrb);
        return this;
    }

    public e a() {
        return new e(this.a, this.b, this.c, null);
    }
}

