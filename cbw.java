/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

public class cbw
extends aet {
    private double a = 0.004;

    public cbw() {
    }

    @Override
    public String a() {
        return "Mineshaft";
    }

    public cbw(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("chance")) continue;
            this.a = cmk.a((String)entry.getValue(), this.a);
        }
    }

    @Override
    protected boolean a(int n2, int n3) {
        return this.d.nextDouble() < this.a && this.d.nextInt(80) < Math.max(Math.abs(n2), Math.abs(n3));
    }

    @Override
    protected cv b(int n2, int n3) {
        anr anr2 = this.e.a(new cmz((n2 << 4) + 8, 64, (n3 << 4) + 8));
        cfn cfn2 = anr2 instanceof aex ? cfn.b : cfn.a;
        return new cun(this.e, this.d, n2, n3, cfn2);
    }
}

