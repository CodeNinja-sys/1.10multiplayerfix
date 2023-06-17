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
import net.minecraft.n.br;
import net.minecraft.n.t;
import net.minecraft.q.c.d;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.d.l;

public class bs
extends aa {
    @Override
    public String a() {
        return "worldborder";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.worldborder.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 1) {
            throw new ac("commands.worldborder.usage", new Object[0]);
        }
        d d2 = this.a(a2);
        if ("set".equals(arrstring[0])) {
            long l2;
            if (arrstring.length != 2 && arrstring.length != 3) {
                throw new ac("commands.worldborder.set.usage", new Object[0]);
            }
            double d3 = d2.j();
            double d4 = bs.a(arrstring[1], 1.0, 6.0E7);
            long l3 = l2 = arrstring.length > 2 ? bs.a(arrstring[2], 0L, 9223372036854775L) * 1000L : 0L;
            if (l2 > 0L) {
                d2.a(d3, d4, l2);
                if (d3 > d4) {
                    bs.a(az2, (t)this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", d4), String.format("%.1f", d3), Long.toString(l2 / 1000L));
                } else {
                    bs.a(az2, (t)this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", d4), String.format("%.1f", d3), Long.toString(l2 / 1000L));
                }
            } else {
                d2.a(d4);
                bs.a(az2, (t)this, "commands.worldborder.set.success", String.format("%.1f", d4), String.format("%.1f", d3));
            }
        } else if ("add".equals(arrstring[0])) {
            if (arrstring.length != 2 && arrstring.length != 3) {
                throw new ac("commands.worldborder.add.usage", new Object[0]);
            }
            double d5 = d2.h();
            double d6 = d5 + bs.a(arrstring[1], -d5, 6.0E7 - d5);
            long l4 = d2.i() + (arrstring.length > 2 ? bs.a(arrstring[2], 0L, 9223372036854775L) * 1000L : 0L);
            if (l4 > 0L) {
                d2.a(d5, d6, l4);
                if (d5 > d6) {
                    bs.a(az2, (t)this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", d6), String.format("%.1f", d5), Long.toString(l4 / 1000L));
                } else {
                    bs.a(az2, (t)this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", d6), String.format("%.1f", d5), Long.toString(l4 / 1000L));
                }
            } else {
                d2.a(d6);
                bs.a(az2, (t)this, "commands.worldborder.set.success", String.format("%.1f", d6), String.format("%.1f", d5));
            }
        } else if ("center".equals(arrstring[0])) {
            if (arrstring.length != 3) {
                throw new ac("commands.worldborder.center.usage", new Object[0]);
            }
            b b2 = az2.aC();
            double d7 = bs.b((double)b2.cy_() + 0.5, arrstring[1], true);
            double d8 = bs.b((double)b2.l() + 0.5, arrstring[2], true);
            d2.b(d7, d8);
            bs.a(az2, (t)this, "commands.worldborder.center.success", d7, d8);
        } else if ("damage".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ac("commands.worldborder.damage.usage", new Object[0]);
            }
            if ("buffer".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ac("commands.worldborder.damage.buffer.usage", new Object[0]);
                }
                double d9 = bs.a(arrstring[2], 0.0);
                double d10 = d2.m();
                d2.b(d9);
                bs.a(az2, (t)this, "commands.worldborder.damage.buffer.success", String.format("%.1f", d9), String.format("%.1f", d10));
            } else if ("amount".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ac("commands.worldborder.damage.amount.usage", new Object[0]);
                }
                double d11 = bs.a(arrstring[2], 0.0);
                double d12 = d2.n();
                d2.c(d11);
                bs.a(az2, (t)this, "commands.worldborder.damage.amount.success", String.format("%.2f", d11), String.format("%.2f", d12));
            }
        } else if ("warning".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ac("commands.worldborder.warning.usage", new Object[0]);
            }
            if ("time".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ac("commands.worldborder.warning.time.usage", new Object[0]);
                }
                int n2 = bs.a(arrstring[2], 0);
                int n3 = d2.p();
                d2.b(n2);
                bs.a(az2, (t)this, "commands.worldborder.warning.time.success", n2, n3);
            } else if ("distance".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ac("commands.worldborder.warning.distance.usage", new Object[0]);
                }
                int n4 = bs.a(arrstring[2], 0);
                int n5 = d2.q();
                d2.c(n4);
                bs.a(az2, (t)this, "commands.worldborder.warning.distance.success", n4, n5);
            }
        } else {
            if (!"get".equals(arrstring[0])) {
                throw new ac("commands.worldborder.usage", new Object[0]);
            }
            double d13 = d2.h();
            az2.a(br.e, n.c(d13 + 0.5));
            az2.a(new l("commands.worldborder.get.success", String.format("%.0f", d13)));
        }
    }

    protected d a(a a2) {
        return a2.d[0].V();
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? bs.a(arrstring, "set", "center", "damage", "warning", "add", "get") : (arrstring.length == 2 && "damage".equals(arrstring[0]) ? bs.a(arrstring, "buffer", "amount") : (arrstring.length >= 2 && arrstring.length <= 3 && "center".equals(arrstring[0]) ? bs.b(arrstring, 1, b2) : (arrstring.length == 2 && "warning".equals(arrstring[0]) ? bs.a(arrstring, "time", "distance") : Collections.emptyList())));
    }
}

