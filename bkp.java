/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.lw;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class bkp {
    private static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
    private static final bl b = new cva();
    private final bfa c;
    private final lw d;
    private final jl e;

    public bkp(bfa bfa2, bvs ... arrbvs) {
        this.c = bfa2;
        HashMap hashMap = sz.c();
        for (bvs iterator : arrbvs) {
            bkp.a(bfa2, iterator);
            hashMap.put(iterator.b(), iterator);
        }
        this.d = lw.a(hashMap);
        LinkedHashMap linkedHashMap = sz.d();
        ArrayList arrayList = ov.a();
        Iterable iterable = atc.a(this.e());
        for (Object object : iterable) {
            Map map = cds.a(this.d.aU_(), (Iterable)object);
            dcs dcs2 = new dcs(bfa2, jt.b(map), null);
            linkedHashMap.put(map, dcs2);
            arrayList.add(dcs2);
        }
        for (Object object : arrayList) {
            ((dcs)object).a(linkedHashMap);
        }
        this.e = jl.a(arrayList);
    }

    public static String a(bfa bfa2, bvs bvs2) {
        String string = bvs2.b();
        if (!a.matcher(string).matches()) {
            throw new IllegalArgumentException("Block: " + bfa2.getClass() + " has invalidly named property: " + string);
        }
        for (Comparable comparable : bvs2.a()) {
            String string2 = bvs2.a(comparable);
            if (a.matcher(string2).matches()) continue;
            throw new IllegalArgumentException("Block: " + bfa2.getClass() + " has property: " + string + " with invalidly named value: " + string2);
        }
        return string;
    }

    public jl a() {
        return this.e;
    }

    private List e() {
        ArrayList arrayList = ov.a();
        iz iz2 = this.d.aU_();
        for (bvs bvs2 : iz2) {
            arrayList.add(bvs2.a());
        }
        return arrayList;
    }

    public dbk b() {
        return (dbk)this.e.get(0);
    }

    public bfa c() {
        return this.c;
    }

    public Collection d() {
        return this.d.aU_();
    }

    public String toString() {
        return cc.a((Object)this).a("block", bfa.v.b(this.c)).a("properties", mq.a((Iterable)this.d.aU_(), b)).toString();
    }

    public bvs a(String string) {
        return (bvs)this.d.get(string);
    }
}

