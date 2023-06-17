/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.c;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.w;
import net.minecraft.q.a.a.c.e;
import net.minecraft.u.bp;

public abstract class d {
    private final bp a;
    private final Class b;

    protected d(bp bp2, Class class_) {
        this.a = bp2;
        this.b = class_;
    }

    public bp a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public abstract w a(e var1, ad var2);

    public abstract e b(w var1, u var2);
}

