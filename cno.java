/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.LinkedHashMap;

class cno
extends sy {
    final /* synthetic */ bax b;

    cno(bax bax2) {
        this.b = bax2;
    }

    @Override
    protected up a(dbk dbk2) {
        LinkedHashMap linkedHashMap = sz.c(dbk2.s());
        if (dbk2.b(cux.c) != bqk.b) {
            linkedHashMap.remove(cux.a);
        }
        return new up((bpx)bfa.v.b(dbk2.t()), this.a(linkedHashMap));
    }
}

