/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ae;
import net.minecraft.n.ao;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.d.l;
import net.minecraft.w.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class av
implements ae {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Map b = sz.c();
    private final Set c = aad.a();

    @Override
    public int a(az az2, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] arrstring = string.split(" ");
        String string2 = arrstring[0];
        arrstring = av.a(arrstring);
        t t2 = (t)this.b.get(string2);
        int n2 = this.a(t2, arrstring);
        int n3 = 0;
        if (t2 == null) {
            l l2 = new l("commands.generic.notFound", new Object[0]);
            l2.a().a(net.minecraft.u.d.o.m);
            az2.a(l2);
        } else if (t2.a(this.a(), az2)) {
            if (n2 > -1) {
                List list = ao.b(az2, arrstring[n2], n.class);
                String string3 = arrstring[n2];
                az2.a(br.c, list.size());
                for (n n4 : list) {
                    arrstring[n2] = n4.cN();
                    if (!this.a(az2, arrstring, t2, string)) continue;
                    ++n3;
                }
                arrstring[n2] = string3;
            } else {
                az2.a(br.c, 1);
                if (this.a(az2, arrstring, t2, string)) {
                    ++n3;
                }
            }
        } else {
            l l3 = new l("commands.generic.permission", new Object[0]);
            l3.a().a(net.minecraft.u.d.o.m);
            az2.a(l3);
        }
        az2.a(br.a, n3);
        return n3;
    }

    protected boolean a(az az2, String[] arrstring, t t2, String string) {
        try {
            t2.a(this.a(), az2, arrstring);
            return true;
        }
        catch (ac ac2) {
            l l2 = new l("commands.generic.usage", new l(ac2.getMessage(), ac2.a()));
            l2.a().a(net.minecraft.u.d.o.m);
            az2.a(l2);
        }
        catch (o o2) {
            l l3 = new l(o2.getMessage(), o2.a());
            l3.a().a(net.minecraft.u.d.o.m);
            az2.a(l3);
        }
        catch (Throwable throwable) {
            l l4 = new l("commands.generic.exception", new Object[0]);
            l4.a().a(net.minecraft.u.d.o.m);
            az2.a(l4);
            a.f("Couldn't process command: '{}'", string);
        }
        return false;
    }

    protected abstract a a();

    public t a(t t2) {
        this.b.put(t2.a(), t2);
        this.c.add(t2);
        for (String string : t2.c()) {
            t t3 = (t)this.b.get(string);
            if (t3 != null && t3.a().equals(string)) continue;
            this.b.put(string, t2);
        }
        return t2;
    }

    private static String[] a(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length - 1];
        System.arraycopy(arrstring, 1, arrstring2, 0, arrstring.length - 1);
        return arrstring2;
    }

    @Override
    public List a(az az2, String string, b b2) {
        t t2;
        String[] arrstring = string.split(" ", -1);
        String string2 = arrstring[0];
        if (arrstring.length == 1) {
            ArrayList arrayList = ov.a();
            for (Map.Entry entry : this.b.entrySet()) {
                if (!aa.a(string2, (String)entry.getKey()) || !((t)entry.getValue()).a(this.a(), az2)) continue;
                arrayList.add((String)entry.getKey());
            }
            return arrayList;
        }
        if (arrstring.length > 1 && (t2 = (t)this.b.get(string2)) != null && t2.a(this.a(), az2)) {
            return t2.a(this.a(), az2, av.a(arrstring), b2);
        }
        return Collections.emptyList();
    }

    @Override
    public List a(az az2) {
        ArrayList arrayList = ov.a();
        for (t t2 : this.c) {
            if (!t2.a(this.a(), az2)) continue;
            arrayList.add(t2);
        }
        return arrayList;
    }

    @Override
    public Map b() {
        return this.b;
    }

    private int a(t t2, String[] arrstring) {
        if (t2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!t2.a(arrstring, i2) || !ao.a(arrstring[i2])) continue;
            return i2;
        }
        return -1;
    }
}

