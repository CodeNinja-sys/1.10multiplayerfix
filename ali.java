/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ali
extends sy {
    private final bvs b;
    private final String c;
    private final List d;

    private ali(bvs bvs2, String string, List list) {
        this.b = bvs2;
        this.c = string;
        this.d = list;
    }

    @Override
    protected up a(dbk dbk2) {
        LinkedHashMap linkedHashMap = sz.c(dbk2.s());
        String string = this.b == null ? ((bpx)bfa.v.b(dbk2.t())).toString() : this.a(this.b, linkedHashMap);
        if (this.c != null) {
            string = string + this.c;
        }
        for (bvs bvs2 : this.d) {
            linkedHashMap.remove(bvs2);
        }
        return new up(string, this.a(linkedHashMap));
    }

    private String a(bvs bvs2, Map map) {
        return bvs2.a((Comparable)map.remove(this.b));
    }

    /* synthetic */ ali(bvs bvs2, String string, List list, rf rf2) {
        this(bvs2, string, list);
    }
}

