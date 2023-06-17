/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class anv
implements ae,
v {
    public cse a(w w2, Type type, u u2) {
        z z2 = cwe.f(w2, "loot table");
        hz[] arrhz = (hz[])cwe.a(z2, "pools", new hz[0], u2, hz[].class);
        return new cse(arrhz);
    }

    public w a(cse cse2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("pools", ad2.a(cse.a(cse2)));
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((cse)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

