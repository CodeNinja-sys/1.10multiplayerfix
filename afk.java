/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class afk
extends apr {
    public bul a;
    public mf b;
    public List c = ov.a();

    public afk() {
    }

    public afk(int n2, Random random, int n3, int n4) {
        super(0, random, n3, n4);
    }

    @Override
    public cmz d() {
        if (this.b != null) {
            return this.b.d();
        }
        return super.d();
    }
}

