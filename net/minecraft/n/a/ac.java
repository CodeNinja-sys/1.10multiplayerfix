/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import com.a.a.d.ov;
import com.c.a.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;

public class ac
extends aa {
    @Override
    public String a() {
        return "op";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.op.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        e e2;
        if (arrstring.length == 1 && arrstring[0].length() > 0) {
            e2 = a2.aO().a(arrstring[0]);
            if (e2 == null) {
                throw new o("commands.op.failed", arrstring[0]);
            }
        } else {
            throw new net.minecraft.n.ac("commands.op.usage", new Object[0]);
        }
        a2.av().b(e2);
        ac.a(az2, (t)this, "commands.op.success", arrstring[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        if (arrstring.length == 1) {
            String string = arrstring[arrstring.length - 1];
            ArrayList arrayList = ov.a();
            for (e e2 : a2.U()) {
                if (a2.av().e(e2) || !ac.a(string, e2.b())) continue;
                arrayList.add(e2.b());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
}

