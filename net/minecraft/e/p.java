/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.e.a;
import net.minecraft.e.q;
import net.minecraft.e.x;

class p
extends x {
    protected List a = ov.a();

    public p(String string) {
        this.b = string;
    }

    @Override
    public a a() {
        q q2 = new q();
        for (x x2 : this.a) {
            q2.a(x2.a());
        }
        return q2;
    }
}

