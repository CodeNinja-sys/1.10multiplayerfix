/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class db
extends aoe {
    protected final bpx a;

    public db(bpx bpx2, int n2, int n3, cfv[] arrcfv) {
        super(n2, n3, arrcfv);
        this.a = bpx2;
    }

    @Override
    public void a(Collection collection, Random random, abe abe2) {
        cse cse2 = abe2.d().a(this.a);
        List list = cse2.a(random, abe2);
        collection.addAll(list);
    }

    @Override
    protected void a(z z2, ad ad2) {
        z2.a("name", this.a.toString());
    }

    public static db a(z z2, u u2, int n2, int n3, cfv[] arrcfv) {
        bpx bpx2 = new bpx(cwe.f(z2, "name"));
        return new db(bpx2, n2, n3, arrcfv);
    }
}

