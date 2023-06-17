/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cm;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;
import net.minecraft.w.f;
import net.minecraft.w.f.j;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class aa
implements cm {
    private final cu a;

    public aa(cu cu2) {
        this.a = cu2;
    }

    public boolean a(n n2) {
        if (!n2.br()) {
            return false;
        }
        if (!(n2 instanceof l)) {
            return false;
        }
        l l2 = (l)n2;
        return l2.a(f.c(this.a)) != null ? false : (l2 instanceof f ? ((f)l2).aL() : (l2 instanceof j ? true : l2 instanceof b));
    }
}

