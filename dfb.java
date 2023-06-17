/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class dfb
extends azg {
    public dfb() {
        this.a(true);
        this.e(0);
        this.a(zm.l);
    }

    @Override
    public String b(bhl bhl2) {
        if (bhl2.h() == 1) {
            return "item.charcoal";
        }
        return "item.coal";
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2, 1, 0));
        list.add(new bhl(azg2, 1, 1));
    }
}

