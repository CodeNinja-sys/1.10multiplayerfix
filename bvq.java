/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import java.util.List;

public class bvq {
    private final cwo a;
    private final List b;
    private final int c;

    public bvq(cwo cwo2, List list, int n2) {
        this.a = cwo2;
        this.b = list;
        this.c = n2;
    }

    public cbd a(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return bou.a;
        }
        return (cbd)cc.b(this.b.get(n2), bou.a);
    }

    public int a() {
        return this.c;
    }
}

