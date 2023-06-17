/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.LinkedHashMap;

class ada
extends sy {
    final /* synthetic */ bax b;

    ada(bax bax2) {
        this.b = bax2;
    }

    @Override
    protected up a(dbk dbk2) {
        LinkedHashMap linkedHashMap = sz.c(dbk2.s());
        String string = bwt.a.a((dgu)linkedHashMap.remove(bwt.a));
        if (dgu.c != dbk2.b(bwt.a)) {
            linkedHashMap.remove(bwt.b);
        }
        return new up(string, this.a(linkedHashMap));
    }
}

