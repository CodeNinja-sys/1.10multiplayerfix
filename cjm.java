/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public abstract class cjm {
    private final bpx a;
    private final Class b;

    protected cjm(bpx bpx2, Class class_) {
        this.a = bpx2;
        this.b = class_;
    }

    public bpx a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public abstract void a(z var1, cfv var2, ad var3);

    public abstract cfv b(z var1, u var2);
}

