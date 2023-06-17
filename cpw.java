/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class cpw
extends cwc {
    public crs a(w w2, Type type, u u2) {
        z z2 = w2.t();
        boolean bl2 = cwe.a(z2, "blur", false);
        boolean bl3 = cwe.a(z2, "clamp", false);
        return new crs(bl2, bl3);
    }

    @Override
    public String a() {
        return "texture";
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

