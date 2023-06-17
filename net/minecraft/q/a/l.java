/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.q.a.h;
import net.minecraft.q.f;

public class l
extends h {
    public l() {
        super(null);
    }

    @Override
    public f a(Class class_, String string) {
        return (f)this.a.get(string);
    }

    @Override
    public void a(String string, f f2) {
        this.a.put(string, f2);
    }

    @Override
    public void a() {
    }

    @Override
    public int a(String string) {
        return 0;
    }
}

