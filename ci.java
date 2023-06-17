/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class ci
implements ds {
    private UUID a;

    public ci() {
    }

    public ci(UUID uUID) {
        this.a = uUID;
    }

    @Override
    public void a(si si2) {
        this.a = si2.g();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public cpk a(alj alj2) {
        return alj2.b(this.a);
    }
}

