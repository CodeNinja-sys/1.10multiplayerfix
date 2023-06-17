/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.util.UUID;

public class bxz
implements ds {
    private e a;

    public bxz() {
    }

    public bxz(e e2) {
        this.a = e2;
    }

    @Override
    public void a(si si2) {
        String string = si2.e(36);
        String string2 = si2.e(16);
        UUID uUID = UUID.fromString(string);
        this.a = new e(uUID, string2);
    }

    @Override
    public void b(si si2) {
        UUID uUID = this.a.a();
        si2.a(uUID == null ? "" : uUID.toString());
        si2.a(this.a.b());
    }

    public void a(su su2) {
        su2.a(this);
    }

    public e a() {
        return this.a;
    }
}

