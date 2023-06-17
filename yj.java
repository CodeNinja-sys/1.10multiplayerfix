/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class yj
extends dgn {
    public ey a;
    public int b;
    public del c;
    public List d;
    public List e = ov.a();
    public List f = ov.a();

    public yj() {
    }

    public yj(ey ey2, int n2, Random random, int n3, int n4, List list, int n5) {
        super(null, 0, random, n3, n4);
        this.a = ey2;
        this.d = list;
        this.b = n5;
        anr anr2 = ey2.a(new cmz(n3, 0, n4), cff.b);
        if (anr2 instanceof bwu) {
            this.h = 1;
        } else if (anr2 instanceof cxx) {
            this.h = 2;
        } else if (anr2 instanceof bco) {
            this.h = 3;
        }
        this.b(this.h);
        this.i = random.nextInt(50) == 0;
    }
}

