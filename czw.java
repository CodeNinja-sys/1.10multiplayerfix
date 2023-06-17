/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.List;

public class czw
implements cbd,
cwo {
    private static final yd a = yd.a(new azf());
    private final List b = ov.a();

    public czw() {
        this(a.a(bxy.B().x().c()));
    }

    public czw(Collection collection) {
        for (bae bae2 : a.a(collection)) {
            if (bae2.b() == bvh.e) continue;
            this.b.add(new cuh(bae2.a()));
        }
    }

    @Override
    public List c() {
        return this.b;
    }

    @Override
    public cbg d() {
        return new aym("Select a player to teleport to");
    }

    @Override
    public void a(bou bou2) {
        bou2.a(this);
    }

    @Override
    public cbg a() {
        return new aym("Teleport to player");
    }

    @Override
    public void a(float f2, int n2) {
        bxy.B().P().a(czg.a);
        alo.a(0, 0, 0.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean b() {
        return !this.b.isEmpty();
    }
}

