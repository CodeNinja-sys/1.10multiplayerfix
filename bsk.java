/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

class bsk
implements v {
    bsk() {
    }

    public cvf a(w w2, Type type, u u2) {
        z z2 = w2.t();
        bqk bqk2 = this.c(z2);
        int n2 = this.a(z2);
        String string = this.b(z2);
        bnx bnx2 = (bnx)u2.a(z2, (Type)((Object)bnx.class));
        return new cvf(bqk2, n2, string, bnx2);
    }

    protected int a(z z2) {
        return cwe.a(z2, "tintindex", -1);
    }

    private String b(z z2) {
        return cwe.f(z2, "texture");
    }

    private bqk c(z z2) {
        String string = cwe.a(z2, "cullface", "");
        return bqk.a(string);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

