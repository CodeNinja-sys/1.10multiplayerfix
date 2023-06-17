/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import com.c.a.e;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;

public class ab
extends aa {
    @Override
    public String a() {
        return "deop";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.deop.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        e e2;
        if (arrstring.length == 1 && arrstring[0].length() > 0) {
            e2 = a2.av().m().a(arrstring[0]);
            if (e2 == null) {
                throw new o("commands.deop.failed", arrstring[0]);
            }
        } else {
            throw new ac("commands.deop.usage", new Object[0]);
        }
        a2.av().c(e2);
        ab.a(az2, (t)this, "commands.deop.success", arrstring[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? ab.a(arrstring, a2.av().n()) : Collections.emptyList();
    }
}

