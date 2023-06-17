/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.k.c.a.d;
import net.minecraft.client.k.c.h;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;

public class b
implements h {
    private final List a = ov.a();

    public b() {
        this.a.add(new net.minecraft.client.k.c.a.b());
        this.a.add(new d());
    }

    @Override
    public List a() {
        return this.a;
    }

    @Override
    public a b() {
        return new k("Press a key to select a command, and again to use it.");
    }
}

