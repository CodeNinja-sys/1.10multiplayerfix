/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class bya
implements cwo {
    private final List a = ov.a();

    public bya() {
        this.a.add(new czw());
        this.a.add(new bln());
    }

    @Override
    public List c() {
        return this.a;
    }

    @Override
    public cbg d() {
        return new aym("Press a key to select a command, and again to use it.");
    }
}

