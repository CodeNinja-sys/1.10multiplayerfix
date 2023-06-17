/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.dn;
import net.minecraft.client.r;
import net.minecraft.u.b.b;
import net.minecraft.u.b.p;
import net.minecraft.u.bx;
import net.minecraft.u.d.k;

public class bt
extends bx {
    private final r a = r.z();

    public bt(dn dn2) {
        super(dn2, false);
    }

    @Override
    public void a() {
        super.a();
        if (this.g.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : this.g) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string);
            }
            this.a.t.c().a(new k(stringBuilder.toString()), 1);
        }
    }

    @Override
    public b b() {
        b b2 = null;
        if (this.a.v != null && this.a.v.a == p.b) {
            b2 = this.a.v.a();
        }
        return b2;
    }
}

