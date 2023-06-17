/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import net.minecraft.s.f;

public class m
extends f {
    boolean a = true;

    public m(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
    }

    @Override
    public void a(int n2, int n3) {
        if (!this.a) {
            return;
        }
        super.a(n2, n3);
    }

    @Override
    public void b(int n2, int n3) {
        if (!this.a) {
            return;
        }
        super.b(n2, n3);
    }

    @Override
    public void c(int n2, int n3) {
        if (!this.a) {
            return;
        }
        super.c(n2, n3);
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean a() {
        return this.a;
    }
}

