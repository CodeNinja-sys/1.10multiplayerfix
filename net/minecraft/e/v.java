/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.x;

class v
extends x {
    protected List a = ov.a();

    public v(String string) {
        this.b = string;
    }

    @Override
    public a a() {
        e e2 = new e();
        for (x x2 : this.a) {
            e2.a(x2.b, x2.a());
        }
        return e2;
    }
}

