/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;

public class pf {
    private final List a = ov.a();

    public pf a(bpi bpi2, int n2) {
        this.a.add(new bdd(bpi2, n2));
        return this;
    }

    public tu a() {
        Collections.sort(this.a);
        return new tu(this.a);
    }

    public bpi b() {
        return ((bdd)this.a.get((int)0)).a;
    }
}

