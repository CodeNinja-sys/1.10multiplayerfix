/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.c.a;
import net.minecraft.n.a.z;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.as;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;

public class k
extends aa {
    @Override
    public String a() {
        return "pardon-ip";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(a a2, az az2) {
        return a2.av().i().a() && super.a(a2, az2);
    }

    @Override
    public String a(az az2) {
        return "commands.unbanip.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length == 1 && arrstring[0].length() > 1) {
            Matcher matcher = z.a.matcher(arrstring[0]);
            if (!matcher.matches()) {
                throw new as("commands.unbanip.invalid", new Object[0]);
            }
        } else {
            throw new ac("commands.unbanip.usage", new Object[0]);
        }
        a2.av().i().b(arrstring[0]);
        k.a(az2, (t)this, "commands.unbanip.success", arrstring[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? k.a(arrstring, a2.av().i().b()) : Collections.emptyList();
    }
}

