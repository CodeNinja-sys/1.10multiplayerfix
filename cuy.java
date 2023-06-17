/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class cuy {
    xy a;
    List b = ov.a();
    List c = ov.a();

    public cuy(xy xy2) {
        this.a = xy2;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public boolean a(cpk cpk2) {
        if (this.b.contains(cpk2)) {
            return true;
        }
        if (this.c.contains(cpk2)) {
            return false;
        }
        this.a.aQ.A.a("canSee");
        boolean bl2 = this.a.j(cpk2);
        this.a.aQ.A.b();
        if (bl2) {
            this.b.add(cpk2);
        } else {
            this.c.add(cpk2);
        }
        return bl2;
    }
}

