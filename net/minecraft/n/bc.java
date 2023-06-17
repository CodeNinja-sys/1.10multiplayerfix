/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.c.a;
import net.minecraft.f.q;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.bl;
import net.minecraft.n.t;
import net.minecraft.n.v;
import net.minecraft.u.b.n;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;

public class bc
extends aa {
    private static final String[] a = new String[]{"Yolo", "/achievement take achievement.understandCommands @p", "Ask for help on twitter", "/deop @p", "Scoreboard deleted, commands blocked", "Contact helpdesk for help", "/testfornoob @p", "/trigger warning", "Oh my god, it's full of stats", "/kill @p[name=!Searge]", "Have you tried turning it off and on again?", "Sorry, no help today"};
    private final Random b = new Random();

    @Override
    public String a() {
        return "help";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(az az2) {
        return "commands.help.usage";
    }

    @Override
    public List c() {
        return Arrays.asList("?");
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (az2 instanceof q) {
            az2.a(new k("Searge says: ").a(a[this.b.nextInt(a.length) % a.length]));
        } else {
            List list = this.a(az2, a2);
            int n2 = 7;
            int n3 = (list.size() - 1) / 7;
            int n4 = 0;
            try {
                n4 = arrstring.length == 0 ? 0 : bc.a(arrstring[0], 1, n3 + 1) - 1;
            }
            catch (v v2) {
                Map map = this.a(a2);
                t t2 = (t)map.get(arrstring[0]);
                if (t2 != null) {
                    throw new ac(t2.a(az2), new Object[0]);
                }
                if (n.a(arrstring[0], -1) != -1) {
                    throw v2;
                }
                throw new bl();
            }
            int n5 = Math.min((n4 + 1) * 7, list.size());
            l l2 = new l("commands.help.header", n4 + 1, n3 + 1);
            l2.a().a(o.c);
            az2.a(l2);
            for (int i2 = n4 * 7; i2 < n5; ++i2) {
                t t3 = (t)list.get(i2);
                l l3 = new l(t3.a(az2), new Object[0]);
                l3.a().a(new net.minecraft.u.d.a.a(net.minecraft.u.d.a.b.d, "/" + t3.a() + " "));
                az2.a(l3);
            }
            if (n4 == 0 && az2 instanceof b) {
                l l4 = new l("commands.help.footer", new Object[0]);
                l4.a().a(o.k);
                az2.a(l4);
            }
        }
    }

    protected List a(az az2, a a2) {
        List list = a2.Y().a(az2);
        Collections.sort(list);
        return list;
    }

    protected Map a(a a2) {
        return a2.Y().b();
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        if (arrstring.length == 1) {
            Set set = this.a(a2).keySet();
            return bc.a(arrstring, set.toArray(new String[set.size()]));
        }
        return Collections.emptyList();
    }
}

