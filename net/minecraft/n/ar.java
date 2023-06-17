/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.d.b;
import net.minecraft.u.d.n;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.ai;
import net.minecraft.x.d.b.r;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ar
extends aa {
    private static final d a = c.c();

    @Override
    public String a() {
        return "title";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.title.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ac("commands.title.usage", new Object[0]);
        }
        if (arrstring.length < 3) {
            if ("title".equals(arrstring[1]) || "subtitle".equals(arrstring[1])) {
                throw new ac("commands.title.usage.title", new Object[0]);
            }
            if ("times".equals(arrstring[1])) {
                throw new ac("commands.title.usage.times", new Object[0]);
            }
        }
        g g2 = ar.a(a2, az2, arrstring[0]);
        r r2 = r.a(arrstring[1]);
        if (r2 != r.d && r2 != r.e) {
            if (r2 == r.c) {
                if (arrstring.length != 5) {
                    throw new ac("commands.title.usage", new Object[0]);
                }
                int n2 = ar.a(arrstring[2]);
                int n3 = ar.a(arrstring[3]);
                int n4 = ar.a(arrstring[4]);
                ai ai2 = new ai(n2, n3, n4);
                g2.a.a(ai2);
                ar.a(az2, (t)this, "commands.title.success", new Object[0]);
            } else {
                net.minecraft.u.d.a a3;
                if (arrstring.length < 3) {
                    throw new ac("commands.title.usage", new Object[0]);
                }
                String string = ar.b(arrstring, 2);
                try {
                    a3 = b.a(string);
                }
                catch (com.a.b.aa aa2) {
                    throw ar.a(aa2);
                }
                ai ai3 = new ai(r2, n.a(az2, a3, g2));
                g2.a.a(ai3);
                ar.a(az2, (t)this, "commands.title.success", new Object[0]);
            }
        } else {
            if (arrstring.length != 2) {
                throw new ac("commands.title.usage", new Object[0]);
            }
            ai ai4 = new ai(r2, null);
            g2.a.a(ai4);
            ar.a(az2, (t)this, "commands.title.success", new Object[0]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 1 ? ar.a(arrstring, a2.T()) : (arrstring.length == 2 ? ar.a(arrstring, r.a()) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

