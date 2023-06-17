/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;
import java.util.Random;

public class bn
implements cfv {
    private final Map a;
    private final bak b;

    public bn(Map map, bak bak2) {
        this.a = map;
        this.b = bak2;
    }

    @Override
    public boolean a(Random random, abe abe2) {
        cpk cpk2 = abe2.a(this.b);
        if (cpk2 == null) {
            return false;
        }
        bzt bzt2 = cpk2.aQ.P();
        for (Map.Entry entry : this.a.entrySet()) {
            if (this.a(cpk2, bzt2, (String)entry.getKey(), (bom)entry.getValue())) continue;
            return false;
        }
        return true;
    }

    protected boolean a(cpk cpk2, bzt bzt2, String string, bom bom2) {
        String string2;
        bhi bhi2 = bzt2.b(string);
        if (bhi2 == null) {
            return false;
        }
        String string3 = string2 = cpk2 instanceof czt ? cpk2.i_() : cpk2.cy();
        if (!bzt2.b(string2, bhi2)) {
            return false;
        }
        return bom2.a(bzt2.c(string2, bhi2).b());
    }

    static /* synthetic */ Map a(bn bn2) {
        return bn2.a;
    }

    static /* synthetic */ bak b(bn bn2) {
        return bn2.b;
    }
}

