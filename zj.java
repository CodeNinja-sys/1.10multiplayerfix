/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.LinkedHashMap;

class zj
extends sy {
    final /* synthetic */ bax b;

    zj(bax bax2) {
        this.b = bax2;
    }

    @Override
    protected up a(dbk dbk2) {
        LinkedHashMap linkedHashMap = sz.c(dbk2.s());
        String string = clq.b.a((dgk)linkedHashMap.remove(clq.b));
        linkedHashMap.remove(jo.a);
        String string2 = (Boolean)dbk2.b(clq.a) != false ? "all" : "normal";
        return new up(string + "_double_slab", string2);
    }
}

