/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

public class bqa
implements cm {
    private final bfa a;

    private bqa(bfa bfa2) {
        this.a = bfa2;
    }

    public static bqa a(bfa bfa2) {
        return new bqa(bfa2);
    }

    public boolean a(dbk dbk2) {
        return dbk2 != null && dbk2.t() == this.a;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((dbk)object);
    }
}

