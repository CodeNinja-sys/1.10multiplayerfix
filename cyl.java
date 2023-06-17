/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.LinkedHashMap;

class cyl
extends sy {
    final /* synthetic */ bax b;

    cyl(bax bax2) {
        this.b = bax2;
    }

    @Override
    protected up a(dbk dbk2) {
        LinkedHashMap linkedHashMap = sz.c(dbk2.s());
        String string = jo.b.a((cev)linkedHashMap.remove(jo.b));
        linkedHashMap.remove(jo.a);
        String string2 = (Boolean)dbk2.b(jo.a) != false ? "all" : "normal";
        return new up(string + "_double_slab", string2);
    }
}

