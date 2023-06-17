/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

public class mh {
    private final bpx a;
    private final Map b;

    public mh(bpx bpx2, Map map) {
        this.a = bpx2;
        this.b = map;
    }

    public bpx a() {
        return this.a;
    }

    boolean a(bhl bhl2, iu iu2, bga bga2) {
        azg azg2 = bhl2.a();
        for (Map.Entry entry : this.b.entrySet()) {
            cak cak2 = azg2.a((bpx)entry.getKey());
            if (cak2 != null && !(cak2.a(bhl2, iu2, bga2) < ((Float)entry.getValue()).floatValue())) continue;
            return false;
        }
        return true;
    }
}

