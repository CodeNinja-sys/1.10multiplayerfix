/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c;

import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.lw;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.g.c.b;
import net.minecraft.g.c.h;
import net.minecraft.g.c.k;
import net.minecraft.g.cn;
import net.minecraft.u.bg;

public class i {
    private static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
    private static final bl b = new h();
    private final cn c;
    private final lw d;
    private final jl e;

    public i(cn cn2, net.minecraft.g.b.b ... arrb) {
        Object object;
        this.c = cn2;
        HashMap hashMap = sz.c();
        net.minecraft.g.b.b[] arrb2 = arrb;
        int n2 = arrb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = arrb2[i2];
            i.a(cn2, (net.minecraft.g.b.b)object);
            hashMap.put(object.a(), object);
        }
        this.d = lw.a(hashMap);
        object = sz.d();
        ArrayList arrayList = ov.a();
        for (List list : net.minecraft.u.b.i.a(this.e())) {
            Map map = bg.a(this.d.aU_(), list);
            k k2 = new k(cn2, jt.b(map), null);
            object.put(map, k2);
            arrayList.add(k2);
        }
        for (k k3 : arrayList) {
            k3.a((Map)object);
        }
        this.e = jl.a(arrayList);
    }

    public static String a(cn cn2, net.minecraft.g.b.b b2) {
        String string = b2.a();
        if (!a.matcher(string).matches()) {
            throw new IllegalArgumentException("Block: " + cn2.getClass() + " has invalidly named property: " + string);
        }
        for (Comparable comparable : b2.b()) {
            String string2 = b2.a(comparable);
            if (a.matcher(string2).matches()) continue;
            throw new IllegalArgumentException("Block: " + cn2.getClass() + " has property: " + string + " with invalidly named value: " + string2);
        }
        return string;
    }

    public jl a() {
        return this.e;
    }

    private List e() {
        ArrayList arrayList = ov.a();
        for (net.minecraft.g.b.b b2 : this.d.aU_()) {
            arrayList.add(b2.b());
        }
        return arrayList;
    }

    public b b() {
        return (b)this.e.get(0);
    }

    public cn c() {
        return this.c;
    }

    public Collection d() {
        return this.d.aU_();
    }

    public String toString() {
        return cc.a((Object)this).a("block", cn.v.b(this.c)).a("properties", mq.a((Iterable)this.d.aU_(), b)).toString();
    }

    public net.minecraft.g.b.b a(String string) {
        return (net.minecraft.g.b.b)this.d.get(string);
    }
}

