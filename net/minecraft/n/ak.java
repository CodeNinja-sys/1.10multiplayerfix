/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.q.a.d;
import net.minecraft.q.v;
import net.minecraft.u.b.b;

public class ak
extends aa {
    @Override
    public String a() {
        return "weather";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.weather.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring.length <= 2) {
            int n2 = (300 + new Random().nextInt(600)) * 20;
            if (arrstring.length >= 2) {
                n2 = ak.a(arrstring[1], 1, 1000000) * 20;
            }
            v v2 = a2.d[0];
            d d2 = v2.F();
            if ("clear".equalsIgnoreCase(arrstring[0])) {
                d2.e(n2);
                d2.g(0);
                d2.f(0);
                d2.b(false);
                d2.a(false);
                ak.a(az2, (t)this, "commands.weather.clear", new Object[0]);
            } else if ("rain".equalsIgnoreCase(arrstring[0])) {
                d2.e(0);
                d2.g(n2);
                d2.f(n2);
                d2.b(true);
                d2.a(false);
                ak.a(az2, (t)this, "commands.weather.rain", new Object[0]);
            } else {
                if (!"thunder".equalsIgnoreCase(arrstring[0])) {
                    throw new ac("commands.weather.usage", new Object[0]);
                }
                d2.e(0);
                d2.g(n2);
                d2.f(n2);
                d2.b(true);
                d2.a(true);
                ak.a(az2, (t)this, "commands.weather.thunder", new Object[0]);
            }
        } else {
            throw new ac("commands.weather.usage", new Object[0]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? ak.a(arrstring, "clear", "rain", "thunder") : Collections.emptyList();
    }
}

