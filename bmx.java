/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

class bmx
extends cyx {
    final /* synthetic */ cmg a;

    public bmx(cmg cmg2) {
        this.a = cmg2;
        super(cmg2, bdl.class, 20, true, true, null);
    }

    @Override
    public boolean b() {
        if (this.a.R_()) {
            return false;
        }
        if (super.b()) {
            List list = this.a.aQ.a(cmg.class, this.a.cD().b(8.0, 4.0, 8.0));
            for (cmg cmg2 : list) {
                if (!cmg2.R_()) continue;
                return true;
            }
        }
        this.a.b((bga)null);
        return false;
    }

    @Override
    protected double aK_() {
        return super.aK_() * 0.5;
    }
}

