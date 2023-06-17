/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class bln
implements cbd,
cwo {
    private final List a = ov.a();

    public bln() {
        bxy bxy2 = bxy.B();
        for (ef ef2 : bxy2.f.P().f()) {
            this.a.add(new cbv(this, ef2));
        }
    }

    @Override
    public List c() {
        return this.a;
    }

    @Override
    public cbg d() {
        return new aym("Select a team to teleport to");
    }

    @Override
    public void a(bou bou2) {
        bou2.a(this);
    }

    @Override
    public cbg a() {
        return new aym("Teleport to team member");
    }

    @Override
    public void a(float f2, int n2) {
        bxy.B().P().a(czg.a);
        alo.a(0, 0, 16.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean b() {
        for (cbd cbd2 : this.a) {
            if (!cbd2.b()) continue;
            return true;
        }
        return false;
    }
}

