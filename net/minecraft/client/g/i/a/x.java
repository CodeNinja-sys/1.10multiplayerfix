/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.i.a.h;
import net.minecraft.client.g.i.al;
import net.minecraft.client.j.b;
import net.minecraft.h.k;

public class x
extends h {
    public x(al al2) {
        super(al2);
    }

    @Override
    protected void a() {
        this.c = new b(0.5f);
        this.d = new b(1.0f);
    }

    protected void a(b b2, k k2) {
        this.a(b2);
        switch (k2) {
            case f: {
                b2.a.j = true;
                b2.b.j = true;
                break;
            }
            case e: {
                b2.c.j = true;
                b2.d.j = true;
                b2.e.j = true;
                break;
            }
            case d: {
                b2.c.j = true;
                b2.f.j = true;
                b2.g.j = true;
                break;
            }
            case c: {
                b2.f.j = true;
                b2.g.j = true;
            }
        }
    }

    protected void a(b b2) {
        b2.a(false);
    }
}

