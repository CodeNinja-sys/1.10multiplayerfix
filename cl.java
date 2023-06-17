/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class cl
implements ds {
    private int a;
    private final List b = ov.a();

    public cl() {
    }

    public cl(int n2, Collection collection) {
        this.a = n2;
        for (cp cp2 : collection) {
            this.b.add(new bdb(this, cp2.a().b(), cp2.b(), cp2.c()));
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        int n2 = si2.K();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = si2.e(64);
            double d2 = si2.P();
            ArrayList arrayList = ov.a();
            int n3 = si2.e();
            for (int i3 = 0; i3 < n3; ++i3) {
                UUID uUID = si2.g();
                arrayList.add(new cs(uUID, "Unknown synced attribute modifier", si2.P(), si2.E()));
            }
            this.b.add(new bdb(this, string, d2, arrayList));
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.E(this.b.size());
        for (bdb bdb2 : this.b) {
            si2.a(bdb2.a());
            si2.a(bdb2.b());
            si2.d(bdb2.c().size());
            for (cs cs2 : bdb2.c()) {
                si2.a(cs2.a());
                si2.a(cs2.d());
                si2.B(cs2.c());
            }
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }
}

