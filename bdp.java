/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

class bdp
extends baj {
    protected List a = ov.a();

    public bdp(String string) {
        this.b = string;
    }

    @Override
    public azt a() {
        bmh bmh2 = new bmh();
        for (baj baj2 : this.a) {
            bmh2.a(baj2.a());
        }
        return bmh2;
    }
}

