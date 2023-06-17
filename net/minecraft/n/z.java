/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import io.netty.b.bi;
import java.util.Collections;
import java.util.List;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.g;
import net.minecraft.x.a;
import net.minecraft.x.d.b.as;

public class z
extends aa {
    @Override
    public String a() {
        return "stopsound";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.stopsound.usage";
    }

    @Override
    public void a(net.minecraft.c.a a2, az az2, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring.length <= 3) {
            Object object;
            int n2 = 0;
            g g2 = z.a(a2, az2, arrstring[n2++]);
            String string = "";
            String string2 = "";
            if (arrstring.length >= 2) {
                bu bu2;
                if ((bu2 = bu.a((String)(object = arrstring[n2++]))) == null) {
                    throw new o("commands.stopsound.unknownSoundSource", object);
                }
                string = bu2.a();
            }
            if (arrstring.length == 3) {
                string2 = arrstring[n2++];
            }
            object = new a(bi.a());
            ((a)object).a(string);
            ((a)object).a(string2);
            g2.a.a(new as("MC|StopSound", (a)object));
            if (string.isEmpty() && string2.isEmpty()) {
                z.a(az2, (t)this, "commands.stopsound.success.all", g2.X());
            } else if (string2.isEmpty()) {
                z.a(az2, (t)this, "commands.stopsound.success.soundSource", string, g2.X());
            } else {
                z.a(az2, (t)this, "commands.stopsound.success.individualSound", string2, string, g2.X());
            }
        } else {
            throw new ac(this.a(az2), new Object[0]);
        }
    }

    @Override
    public List a(net.minecraft.c.a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? z.a(arrstring, a2.T()) : (arrstring.length == 2 ? z.a(arrstring, bu.b()) : (arrstring.length == 3 ? z.a(arrstring, bv.a.c()) : Collections.emptyList()));
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

