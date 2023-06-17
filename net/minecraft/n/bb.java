/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import java.util.Map;
import net.minecraft.j.j;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.n.az;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

class bb
implements cm {
    private final /* synthetic */ az a;
    private final /* synthetic */ Map b;

    bb(az az2, Map map) {
        this.a = az2;
        this.b = map;
    }

    public boolean a(n n2) {
        if (n2 == null) {
            return false;
        }
        r r2 = this.a.aS().a(0).Q();
        for (Map.Entry entry : this.b.entrySet()) {
            String string;
            j j2;
            String string2 = (String)entry.getKey();
            boolean bl2 = false;
            if (string2.endsWith("_min") && string2.length() > 4) {
                bl2 = true;
                string2 = string2.substring(0, string2.length() - 4);
            }
            if ((j2 = r2.b(string2)) == null) {
                return false;
            }
            String string3 = string = n2 instanceof g ? n2.X() : n2.cN();
            if (!r2.b(string, j2)) {
                return false;
            }
            p p2 = r2.c(string, j2);
            int n3 = p2.b();
            if (n3 < (Integer)entry.getValue() && bl2) {
                return false;
            }
            if (n3 <= (Integer)entry.getValue() || bl2) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

