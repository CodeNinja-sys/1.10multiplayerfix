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
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.u.d.l;
import net.minecraft.w.a.g;

public class bj
extends aa {
    @Override
    public String a() {
        return "playsound";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.playsound.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        String string;
        bu bu2;
        if (arrstring.length < 2) {
            throw new ac(this.a(az2), new Object[0]);
        }
        int n2 = 0;
        String string2 = arrstring[n2++];
        if ((bu2 = bu.a(string = arrstring[n2++])) == null) {
            throw new o("commands.playsound.unknownSoundSource", string);
        }
        g g2 = bj.a(a2, az2, arrstring[n2++]);
        s s2 = az2.aD();
        double d2 = s2.b;
        if (arrstring.length > n2) {
            d2 = bj.b(d2, arrstring[n2++], true);
        }
        double d3 = s2.c;
        if (arrstring.length > n2) {
            d3 = bj.b(d3, arrstring[n2++], 0, 0, false);
        }
        double d4 = s2.d;
        if (arrstring.length > n2) {
            d4 = bj.b(d4, arrstring[n2++], true);
        }
        double d5 = 1.0;
        if (arrstring.length > n2) {
            d5 = bj.a(arrstring[n2++], 0.0, 3.4028234663852886E38);
        }
        double d6 = 1.0;
        if (arrstring.length > n2) {
            d6 = bj.a(arrstring[n2++], 0.0, 2.0);
        }
        double d7 = 0.0;
        if (arrstring.length > n2) {
            d7 = bj.a(arrstring[n2], 0.0, 1.0);
        }
        double d8 = d5 > 1.0 ? d5 * 16.0 : 16.0;
        double d9 = g2.i(d2, d3, d4);
        if (d9 > d8) {
            if (d7 <= 0.0) {
                throw new o("commands.playsound.playerTooFar", g2.X());
            }
            double d10 = d2 - g2.aU;
            double d11 = d3 - g2.aV;
            double d12 = d4 - g2.aW;
            double d13 = Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
            if (d13 > 0.0) {
                d2 = g2.aU + d10 / d13 * 2.0;
                d3 = g2.aV + d11 / d13 * 2.0;
                d4 = g2.aW + d12 / d13 * 2.0;
            }
            d5 = d7;
        }
        g2.a.a(new net.minecraft.x.d.b.o(string2, bu2, d2, d3, d4, (float)d5, (float)d6));
        bj.a(az2, (t)this, "commands.playsound.success", string2, g2.X());
    }

    public void b(a a2, az az2, String[] arrstring) {
        String string;
        bu bu2;
        if (arrstring.length < 2) {
            throw new ac(this.a(az2), new Object[0]);
        }
        int n2 = 0;
        String string2 = arrstring[n2++];
        if ((bu2 = bu.a(string = arrstring[n2++])) == null) {
            throw new o("commands.playsound.unknownSoundSource", string);
        }
        g g2 = bj.a(a2, az2, arrstring[n2++]);
        s s2 = az2.aD();
        double d2 = s2.b;
        if (arrstring.length > n2) {
            d2 = bj.b(d2, arrstring[n2++], true);
        }
        double d3 = s2.c;
        if (arrstring.length > n2) {
            d3 = bj.b(d3, arrstring[n2++], 0, 0, false);
        }
        double d4 = s2.d;
        if (arrstring.length > n2) {
            d4 = bj.b(d4, arrstring[n2++], true);
        }
        double d5 = 1.0;
        if (arrstring.length > n2) {
            d5 = bj.a(arrstring[n2++], 0.0, 3.4028234663852886E38);
        }
        double d6 = 1.0;
        if (arrstring.length > n2) {
            d6 = bj.a(arrstring[n2++], 0.0, 2.0);
        }
        double d7 = 0.0;
        if (arrstring.length > n2) {
            d7 = bj.a(arrstring[n2], 0.0, 1.0);
        }
        double d8 = d5 > 1.0 ? d5 * 16.0 : 16.0;
        double d9 = g2.i(d2, d3, d4);
        if (d9 > d8) {
            if (d7 <= 0.0) {
                throw new o("commands.playsound.playerTooFar", g2.X());
            }
            double d10 = d2 - g2.aU;
            double d11 = d3 - g2.aV;
            double d12 = d4 - g2.aW;
            double d13 = Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
            if (d13 > 0.0) {
                d2 = g2.aU + d10 / d13 * 2.0;
                d3 = g2.aV + d11 / d13 * 2.0;
                d4 = g2.aW + d12 / d13 * 2.0;
            }
            d5 = d7;
        }
        g2.a.a(new net.minecraft.x.d.b.o(string2, bu2, d2, d3, d4, (float)d5, (float)d6));
        az2.a(new l("\u00a77\u00a7o[vllr: Played sound 'minecraft:ambient.cave' to " + arrstring[2] + "]", new Object[0]));
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? bj.a(arrstring, bv.a.c()) : (arrstring.length == 2 ? bj.a(arrstring, bu.b()) : (arrstring.length == 3 ? bj.a(arrstring, a2.T()) : (arrstring.length > 3 && arrstring.length <= 6 ? bj.a(arrstring, 3, b2) : Collections.emptyList())));
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 2;
    }
}

