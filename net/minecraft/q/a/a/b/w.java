/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.u.bp;

public abstract class w {
    private final bp a;
    private final Class b;

    protected w(bp bp2, Class class_) {
        this.a = bp2;
        this.b = class_;
    }

    public bp a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public abstract void a(z var1, o var2, ad var3);

    public abstract o b(z var1, u var2, a[] var3);
}

